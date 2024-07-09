package ch.bbw.backend.restApi;

import ch.bbw.backend.task.Task;
import ch.bbw.backend.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable long id) {
        return taskService.getTaskById(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Task> updateTaskWithId(@PathVariable("id") int id, @RequestBody Task updatedTask) {
        Optional<Task> updated = taskService.updateTaskWithId(id, updatedTask);
        return updated.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable("id") int id) {
        taskService.deleteTaskById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task addTask(@RequestBody Task newTask) {
        return taskService.addTask(newTask);
    }
}