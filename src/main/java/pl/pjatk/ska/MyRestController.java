package pl.pjatk.ska;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MyRestController {

    @GetMapping("/someValue")
    ResponseEntity<String> someValue() {
        return ResponseEntity.ok("someValue");
    }

    @GetMapping("/model")
    ResponseEntity<Car> model() {
        return ResponseEntity.ok(new Car("Toyota", "Corolla", "2358704", 20.0));
    }

    @GetMapping("/hello")
    ResponseEntity<String> print(@RequestParam String message) {
        return ResponseEntity.ok(message);
    }

    @PostMapping("/create")
    ResponseEntity<Car> modelPost(@RequestBody String message) throws JSONException {
        String make = new JSONObject(message).getString("make");
        return ResponseEntity.ok(new Car(make, "Corolla", "2358704", 20.0));
    }
}
