import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import models.Task;
import org.junit.Test;

public class TaskTest {
    private final Date dateOfEntry = new Date();
    @Test
    public void testTaskShouldHaveAllDetails(){
        Task fakeTask = createFakeTask("Task 1", "Task 1 Content", dateOfEntry);
        assertThat(fakeTask.getTitle(), is("Task 1"));
        assertThat(fakeTask.getDescription(), is("Task 1 Content"));
        assertThat(fakeTask.getDateOfEntry(), is(dateOfEntry));
    }

    @Test
    public void testTaskIsEqualToAnotherTask(){
         Task fakeTask1 = createFakeTask("Task 1", "Task 1 Content", dateOfEntry);
         Task fakeTask2 = createFakeTask("Task 1", "Task 1 Content", dateOfEntry);
         assertThat(fakeTask1.equals(fakeTask2), is(true));
    }

    @Test
    public void tesTaskIsNotEqualToAnotherTask(){
        Task fakeTask1 = createFakeTask("Task 1", "Task 1 Content", dateOfEntry);
        Task fakeTask2 = createFakeTask("Task 2", "Task 2 has different content", dateOfEntry);
        assertThat(fakeTask1.equals(fakeTask2), is(false));
    }

    private Task createFakeTask(String taskTitle, String taskDescription, Date taskDateOfEntry){
           return new Task(taskTitle, taskDescription, taskDateOfEntry);
    }
}
