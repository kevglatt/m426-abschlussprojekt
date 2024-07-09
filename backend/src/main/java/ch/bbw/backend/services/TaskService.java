package ch.bbw.backend.services;

import ch.bbw.backend.task.Task;
import ch.bbw.backend.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(long id) {
        Optional<Task> task = repository.findById(id);
        if (task.isPresent()) {
            return task.get();
        } else {
            // Hier kann eine benutzerdefinierte Exception geworfen werden
            throw new IllegalArgumentException("Task with id " + id + " not found");
        }
    }


    public Optional<Task> updateTaskWithId(long id, Task updatedTask) {
        return repository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            task.setPriority(updatedTask.getPriority());
            task.setDue(updatedTask.getDue());
            task.setCreatedAt(new Date()); // Aktualisiert das Erstellungsdatum

            return repository.save(task);
        });
    }

    public void deleteTaskById(long id) {
        repository.deleteById(id);
    }

    public Task addTask(Task newTask) {
        newTask.setCreatedAt(new Date());
        return repository.save(newTask);
    }
}