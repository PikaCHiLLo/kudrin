import exseption.*;


import java.util.Arrays;

public class Car implements Transport{
    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String modifiedMark) {
        this.mark = modifiedMark;
    }

    private class Model {
        private String model;
        private double price;

        public Model(String model, double price) {
            this.model = model;
            this.price = price;
        }
    }

    private Model[] models;

    public void setModel(String pastModel, String modifiedModel) throws DuplicateModelNameException, NoSuchModelNameException {
        int i = 0;
        for (int o = 0; o < models.length; o++) {
            if (models[o].model.equals(modifiedModel))
                throw new DuplicateModelNameException("элемент " + modifiedModel + " уже есть");
        }
        while ((i < models.length) && !(models[i].model.equals(pastModel)))
            i++;
        if(i == models.length)
            throw new NoSuchModelNameException("элемент " + pastModel + " не найден");
        else {
            models[i].model = modifiedModel;
        }
    }

    public void printAllModel() {
        for (int i = 0; i < models.length; i++) {
            System.out.println(models[i].model);
        }
    }

    public double getPrice(String pastModel) throws NoSuchModelNameException {
        int i = 0;
        while ((i < models.length) && !(models[i].model.equals(pastModel)))
            i++;
        if(i == models.length)
            throw new NoSuchModelNameException("элемент " + pastModel + " не найден");
        else {
            return models[i].price;
        }
    }

    public void setPrice(double modifiedPrice, String pastModel) throws NoSuchModelNameException {
        if (modifiedPrice < 0)
            throw new ModelPriceOutOfBoundsException("цена отрицательна");
        int i = 0;
        while ((i < models.length) && !(models[i].model.equals(pastModel)))
            i++;
        if(i == models.length)
            throw new NoSuchModelNameException("элемент " + pastModel + " не найден");
        else {
            models[i].price = modifiedPrice;
        }
    }

    public void printAllPrice() {
        for (int i = 0; i < models.length; i++) {
            System.out.println(models[i].price);
        }
    }

    public void addModel(String modifiedModel, double modifiedPrice) throws DuplicateModelNameException {
        if (modifiedPrice < 0)
            throw new ModelPriceOutOfBoundsException("цена отрицательна");
        for (int o = 0; o < models.length; o++) {
            if (models[o].model.equals(modifiedModel))
                throw new DuplicateModelNameException("элемент " + modifiedModel + " уже есть");
        }
        models = Arrays.copyOf(models, models.length + 1);
        models[models.length - 1] = new Model(modifiedModel, modifiedPrice);
    }

    public void deleteModel(String pastModel) throws NoSuchModelNameException {
        int i = 0;
        while ((i < models.length) && !(models[i].model.equals(pastModel)))
            i++;
        if(i == models.length)
            throw new NoSuchModelNameException("элемент " + pastModel + " не найден");
        else {
            System.arraycopy(models, i + 1, models, i, models.length - i - 1);
            models = Arrays.copyOf(models, models.length - 1);
        }
    }

    public int getLenghtModel() {
        return models.length;
    }

    public Car (String markName, int size) {
        mark = markName;
        models = new Model[size];
        for (int i = 0;i < size;i++)
            models[i] = new Model("model"+i, 1000*i);
    }
}
