/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 01.01.13
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */
class Rock {
    Rock() { // This is the constructor
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            new Rock();
    }
}