package exseption;

public class NoSuchModelNameException extends Exception {
    public NoSuchModelNameException(String s){
        System.out.println(s);
    }
}
