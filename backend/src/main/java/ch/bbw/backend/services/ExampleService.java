package ch.bbw.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {
    @Autowired
    private PersonRepository repository;

    public List<Person> getAllExamples() {
        return repository.findAll();
    }
}
