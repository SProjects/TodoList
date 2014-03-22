package controllers;

import play.*;
import play.mvc.*;

import models.Task;
import services.TaskManager;
import views.html.*;

import java.util.ArrayList;
import java.util.Date;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready. Haha!!"));
    }

    public static Result taskListDisplay(){
        TaskManager taskManager = new TaskManager();
        taskManager.addNewTask(new Task("Task 1", "Task 1 Content", new Date()));
        taskManager.addNewTask(new Task("Task 2", "Task 2 Content", new Date()));
        ArrayList<Task> allTasks = taskManager.returnEntireTaskList();
        return ok(tasks.render(allTasks));
    }

}
