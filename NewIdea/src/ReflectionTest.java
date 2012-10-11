/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 11.10.12
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String name;
        if (args.length > 0) name = args[0];
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Ââåäèòå èìÿ êëàññà (íàïðèìåð java.util.Date:");
            name = in.next();
        }
        try
        {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class) System.out.print(" extends " + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }
    public static void printConstructors(Class cl)
    {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors)
        {
            String name = c.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();

            for (int j=0; j < paramTypes.length; j++)
            {
                if (j > 0) System.out.print(",  ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.print(");");

        }
    }

    public static void printMethods(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("   ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + "  " + name + "(");

            Class[] paramTypes = m.getParameterTypes();

            for (int j=0; j < paramTypes.length; j++)
            {
                if (j > 0) System.out.print(",  ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.print(");");

        }
    }

    public static void printFields(Class cl)
    {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();

            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(type.getName() + "  " + name + "(");
        }
    }
}
