package hiber.model;

import javax.persistence.*;

@Embeddable
public class Car {
    @Column(name = "car_model")
    private String model;

    @Column(name = "car_series")
    private Integer series;

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
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

    public Car() {

    }

}
