/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 01.01.13
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
import static net.mindview.util.Print.*;

public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {
        print("int: " + i + ", String: " + s);
    }
    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
