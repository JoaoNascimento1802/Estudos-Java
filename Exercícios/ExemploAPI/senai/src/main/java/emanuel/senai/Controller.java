package emanuel.senai;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("Hello")
public class Controller {
    @GetMapping
    public String hello() {
        return "Hello Atila";
    }
}
