package pl.pjatk.ska;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    @GetMapping("/get/{value}")
    ResponseEntity<String> getPathVariable(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }

    @GetMapping("/get")
    ResponseEntity<Car> getRequestParam(@RequestParam String make) {
        return ResponseEntity.ok(new Car(make, "Corolla", "2358704", 20.0));
    }

    @PutMapping("/put/{value1}")
    ResponseEntity<Car> put(@PathVariable String value1, @RequestParam String value2) {
        return ResponseEntity.ok(new Car(value1, value2, "2358704", 20.0));
    }

    @PostMapping("/post")
    ResponseEntity<Car> post(@RequestBody String message) throws JSONException {
        String make = new JSONObject(message).getString("make");
        return ResponseEntity.ok(new Car(make, "Corolla", "2358704", 20.0));
    }

    @DeleteMapping("/delete/{value}")
    ResponseEntity<String> delete(@PathVariable String value) {
        System.out.println(value);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
