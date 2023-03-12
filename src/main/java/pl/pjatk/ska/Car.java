package pl.pjatk.ska;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String make;
    private String model;
    private String vin;
    private double priceForOneDay;

    public Car() {
        System.out.println("autem jestem");
    }

    public Car(String make, String model, String vin, double priceForOneDay) {
        super();
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.priceForOneDay = priceForOneDay;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getPriceForOneDay() {
        return priceForOneDay;
    }

    public void setPriceForOneDay(double priceForOneDay) {
        this.priceForOneDay = priceForOneDay;
    }

    void printComponentInfo() {
        System.out.println("Car::printComponentInfo()");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", priceForOneDay=" + priceForOneDay +
                '}';
    }
}
