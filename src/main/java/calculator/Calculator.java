package calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double square_root(int x){
        logger.info("Square root of "+x+"\t"+ Math.sqrt(x));
        return Math.sqrt(x);
    }

    public double factorial(int x){
        double res = 1;
        for(int i =2;i<=x;i++)
        {
            res = res*i;
        }
        logger.info("Factorial of "+x+"\t"+ res);
        return res;
    }

    public double log(int x){
        logger.info("Logarithm of "+x+"\t"+ Math.log(x));
        return Math.log(x);
    }

    public double power(int x, int y){
        logger.info("Power of " + x +"raised to" + y + " is: " + Math.pow(x, y));
        return Math.pow(x,y);
    }
}
