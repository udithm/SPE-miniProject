package calculator;
import java.lang.Math;

public class Calculator {
    public double square_root(int x){
        return Math.sqrt(x);
    }

    public double factorial(int x){
        if (x == 0)
            return 1;
        return x*factorial(x-1);
    }

    public double log(int x){
        return Math.log(x);
    }

    public double power(int x, int y){
        return Math.pow(x,y);
    }
}
