import models.Task;
import org.junit.Test;
import services.TaskManager;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by User on 3/22/2014.
 */
public class TaskManagerTest {
    private final Date dateOfEntry = new Date();

    @Test
    public void testTaskManagerReturnsTaskList(){
        Task fakeTask1 = createFakeTask("Task 1", "Task 1 description", dateOfEntry);
        Task fakeTask2 = createFakeTask("Task 2", "Task 2 description", dateOfEntry);
        TaskManager taskManager = new TaskManager();
        taskManager.addNewTask(fakeTask1);
        taskManager.addNewTask(fakeTask2);
        assertThat(taskManager.returnEntireTaskList().size(), is(2));
    }

    @Test
    public void testAddNewTaskToTaskManager(){
        Task fakeTask1 = createFakeTask("Task 1", "Task 1 description", dateOfEntry);
        TaskManager taskManager = new TaskManager();
        taskManager.addNewTask(fakeTask1);
        assertThat(taskManager.returnEntireTaskList().size(), is(1));
    }

    private Task createFakeTask(String title, String description, Date dateOfEntry){
        return new Task(title, description, dateOfEntry);
    }

}
