package ch.bbw.backend.restApi;

import ch.bbw.backend.services.Person;
import ch.bbw.backend.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ExampleController {
    @Autowired
    private ExampleService exampleService;
    @GetMapping
    public String example() {
        return "hello API";
    }
    @GetMapping("/persons")
    public List<Person> examples() {
        return exampleService.getAllExamples();
    }
}
