package models;

import java.util.Date;

public class Task {

    private final String title;
    private final String description;
    private final Date dateOfEntry;

    public Task(String title, String description, Date dateOfEntry) {
        this.title = title;
        this.description = description;
        this.dateOfEntry = dateOfEntry;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public Date getDateOfEntry(){
        return this.dateOfEntry;
    }

    @Override
    public boolean equals(Object o){
        Task otherTask = (Task)o;
        if(this.getClass() != otherTask.getClass()){
            return false;
        }

        if(this.title.equals(otherTask.title) &&
           this.description.equals(otherTask.getDescription()) &&
           this.dateOfEntry.equals(otherTask.getDateOfEntry())){
           return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return title +" " + description + " " + dateOfEntry;
    }
}
