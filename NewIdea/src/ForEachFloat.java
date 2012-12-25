package Test.NewIdea.src;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitry
 * Date: 25.12.12
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for(float x : f)
            System.out.println(x);

    }
}
