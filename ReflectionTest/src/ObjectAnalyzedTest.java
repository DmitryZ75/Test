import java.lang.reflect.*;
import java.util.*;

public class ObjectAnalyzedTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> squares = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++)
			squares.add(i * i);
			System.out.println(new ObjectAnalizer().toString(squares));
	}

}
	
class ObjectAnalizer
{
	public String toString(Object obj)
	{
		if (obj == null) return "null";
		if (visited.contains (obj)) return "...";
		visited.add(obj);
		Class cl = obj.getClass();
		if (cl == String.class) return (String) obj;
		if (cl.isArray())
		{
			String r = cl.getComponentType() + "[]{";
			for (int i = 0; i < Array.getLength(obj); i++)
			{
				if (i > 0) r += ",\n";
				Object val = Array.get(obj, i);
				if (cl.getComponentType().isPrimitive()) r +=val; else r += toString(val);
			}
			return r + "}";
		}
		String r = cl.getName();
		
		do
		{
			r += "[";
			Field[] fields = cl.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			for (Field f : fields)
			{
				if (!Modifier.isStatic(f.getModifiers()))
				{
					if (!r.endsWith("[")) r += ",";
					r += f.getName() + "=";
					try
					{
						Class t = f.getType();
						Object val = f.get(obj);
						if (t.isPrimitive()) r += val;
						else r += toString(val);
						
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					
				}
				
			}
			r += "]";
			cl = cl.getSuperclass();
		}
		while (cl != null);
		return r;
	}
	
	private ArrayList<Object> visited = new ArrayList<Object>();
}


