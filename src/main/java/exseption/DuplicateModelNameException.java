package exseption;

public class DuplicateModelNameException extends Exception {
    public DuplicateModelNameException(String s){
        System.out.println(s);
    }
}
