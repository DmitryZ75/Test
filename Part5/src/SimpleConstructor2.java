/**
 * Created with IntelliJ IDEA.
 * User: DmitryZ
 * Date: 10.01.13
 * Time: 8:11
 * To change this template use File | Settings | File Templates.
 */
//: initialization/SimpleConstructor2.java
// Constructors can have arguments.
// Конструкторы могут получать аргументы
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for(int i = 3; i < 12; i++)
            new Rock2(i);
    }
}
