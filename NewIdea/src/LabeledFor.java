/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 29.12.12
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
import static net.mindview.util.Print.*;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer: // Другие команды недопустимы
        for(; true ;) { // infinite loop
            inner: // Другие команды недопустимы
            for(; i < 10; i++) {
                print("i = " + i);
                if(i == 2) {
                    print("continue");
                    continue;
                }
                if(i == 3) {
                    print("break");
                    i++; // В противном случае значение і
                    // не увеличивается.
                    break;
                }
                if(i == 7) {
                    print("continue outer");
                    i++; // В противном случае значение і
                    // не увеличивается.
                    continue outer;
                }
                if(i == 8) {
                    print("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++) {
                    if(k == 3) {
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Использовать break или continue
        // с метками, здесь не разрешается
    }
}
