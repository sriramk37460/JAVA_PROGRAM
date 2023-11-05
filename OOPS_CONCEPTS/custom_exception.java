package OOP;

import javax.naming.InsufficientResourcesException;

public class custom_exception {
    public static void main(String[] args) {
        double d=10;
        double e=3;
        try {
            if (d > e) {
                throw new InsufficientFundException(d-e);
            }
        } catch (InsufficientFundException ex) {
            System.out.println(ex);
        }
    }
}
