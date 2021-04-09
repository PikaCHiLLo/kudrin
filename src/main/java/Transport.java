import exseption.DuplicateModelNameException;
import exseption.NoSuchModelNameException;

public interface Transport {

    public String getMark();

    public void setMark(String modifiedMark);

    public void setModel(String pastModel, String modifiedModel) throws DuplicateModelNameException, NoSuchModelNameException;

    public void printAllModel();

    public double getPrice(String pastModel) throws NoSuchModelNameException;

    public void setPrice(double modifiedPrice, String pastModel) throws NoSuchModelNameException;

    public void printAllPrice();

    public void addModel(String modifiedModel, double modifiedPrice) throws DuplicateModelNameException;

    public void deleteModel(String pastModel) throws NoSuchModelNameException;

    public int getLenghtModel();
}
