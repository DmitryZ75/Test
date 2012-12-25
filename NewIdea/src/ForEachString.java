package Test.NewIdea.src;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 25.12.12
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
public class ForEachString {
    public static void main(String[] args) {
        for(char c : "An African Swallow".toCharArray() )
            System.out.print(c + " ");
    }
}