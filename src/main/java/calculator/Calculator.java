package calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double square_root(int x){
        logger.info("Computing Square root");
        return Math.sqrt(x);
    }

    public double factorial(int x){
        double res = 1;
        int i = 2;
        while(i<=x){
            res = res*i;
            i++;
        }
        logger.info("Computing factorial");
        return res;
    }

    public double log(int x){
        logger.info("Computing log");
        return Math.log(x);
    }

    public double power(int x, int y){
        logger.info("Computing power");
        return Math.pow(x,y);
    }
}
