package ch.bbw.backend.repos;

import ch.bbw.backend.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
