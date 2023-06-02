package web.model;

public class Car {
    private String model;
    private int horsepower;
    private String color;

    public Car(String model, int horsepower, String color) {
        this.model = model;
        this.horsepower = horsepower;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
