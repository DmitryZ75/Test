/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 24.12.12
 * Time: 19:27
 * To change this template use File | Settings | File Templates.
 */
public class CommaOperator {
    public static void main(String[] args) {
        for(int i = 1, j = i+10; i < 5; i++, j = i *2) {
            System.out.println();
        }
    }
}
