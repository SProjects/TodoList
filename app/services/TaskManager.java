package services;

import models.Task;

import java.util.ArrayList;

public class TaskManager {
    private static ArrayList<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<Task>();
    }

    public void addNewTask(Task newTask) {
        taskList.add(newTask);
    }

    public ArrayList<Task> returnEntireTaskList() {
        return taskList;
    }
}
