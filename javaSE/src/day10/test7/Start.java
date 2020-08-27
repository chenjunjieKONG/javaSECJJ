package day10.test7;

public class Start {
    private Task task;

    public Start(Task task){
        this.task=task;
    }

    public void run(){
        task.work();
    }
}
