package pl.pjatk.ska;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfiguration {

    @Bean
    public Car exampleCar() {
        return new Car();
    }

    @Bean
    public CarGarage exampleCarGarage() {
        return new CarGarage();
    }
}
