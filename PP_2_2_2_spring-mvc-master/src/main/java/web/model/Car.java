package web.model;

public class Car {
    private Long id;
    private String model;
    private int horsePower;
    private int series;

    public Long getId() {
        return id;
    }

    public Car() {
    }

    public Car(String model, int horsePower, int series) {
        this.model = model;
        this.horsePower = horsePower;
        this.series = series;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car: " +
                "\nModel = " + model +
                "\n;Horsepower = " + horsePower + " hp" +
                "\n;Series = " + series;
    }
}
