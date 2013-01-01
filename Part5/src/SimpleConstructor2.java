/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 01.01.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for(int i = 0; i < 8; i++)
            new Rock2(i);
    }
}
