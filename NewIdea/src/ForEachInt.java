package Test.NewIdea.src;
import java.io.*;
/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 25.12.12
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */

import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;


public class ForEachInt {
    public static void main(String[] args) {
        for(int i : range(10)) // 0..9
            printnb(i + " ");
        print();
        for(int i : range(5, 10)) // 5..9
            printnb(i + " ");
        print();
        for(int i : range(5, 20, 3)) // 5..20 step 3
            printnb(i + " ");
        print();
    }
}
