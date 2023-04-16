package pl.pjatk.ska;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MyRestController {

    @GetMapping("/model")
    ResponseEntity<Car> hello() {
        return ResponseEntity.ok(new Car("Toyota", "Corolla", "2358704", 20.0));
    }
}
