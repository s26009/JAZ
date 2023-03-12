package pl.pjatk.ska;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InfoTable {

    private ApplicationContext context;

    public InfoTable(ApplicationContext context) {
        this.context = context;
    }

    public void createAndPrintComponents() {
        Car car = context.getBean("Car", Car.class);
        CarGarage carGarage = context.getBean("CarGarage", CarGarage.class);
        car.printComponentInfo();
        carGarage.printComponentInfo();
    }

}
