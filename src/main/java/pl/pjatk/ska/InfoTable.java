package pl.pjatk.ska;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InfoTable {

    public void createAndPrintComponents(ApplicationContext context) {
        Car car = context.getBean("car", Car.class);
        CarGarage carGarage = context.getBean("carGarage", CarGarage.class);
        System.out.println("\nAnnotation configuration: ");
        car.printComponentInfo();
        carGarage.printComponentInfo();

        String PATH = "D:\\JAZ\\src\\main\\resources\\user-bean-config.xml";
        ApplicationContext xmlContext = new FileSystemXmlApplicationContext(PATH);

        Car xmlCar = xmlContext.getBean("xmlCar", Car.class);
        CarGarage xmlCarGarage = xmlContext.getBean("xmlCarGarage", CarGarage.class);

        System.out.println("\nXML configuration: ");
        xmlCar.printComponentInfo();
        xmlCarGarage.printComponentInfo();
    }
}
