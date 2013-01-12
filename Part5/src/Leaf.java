/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 01.01.13
 * Time: 19:27
 * To change this template use File | Settings | File Templates.
 */
public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().increment().print();
    }
}
