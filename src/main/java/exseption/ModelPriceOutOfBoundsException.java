package exseption;

public class ModelPriceOutOfBoundsException extends RuntimeException {
    public ModelPriceOutOfBoundsException (String s){
        System.out.println(s);
    }
}
