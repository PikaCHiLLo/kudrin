import exseption.DuplicateModelNameException;
import exseption.NoSuchModelNameException;

public class main {
    public static void main(String[] args) throws DuplicateModelNameException, NoSuchModelNameException {
        Car car = new Car("Lada", 5);
        car.printAllModel();
        car.printAllPrice();
//        car.addModel("model10" , -2);
//        car.deleteModel("model1");
//        car.setModel("model1", "model0");
        car.setPrice(-99999, "model1");
        car.printAllModel();
        car.printAllPrice();
    }
}
