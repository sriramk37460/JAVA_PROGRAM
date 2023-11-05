package OOP;

public class InsufficientFundException extends Exception{
    double diff;
    InsufficientFundException(double res){
        diff=res;
    }
}
