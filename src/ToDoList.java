import java.util.Deque;
import java.util.LinkedList;

public class ToDoList {
    private Deque<Task> kolejka = new LinkedList<Task>();

    public void addLast(Task task){
        if(task.getPriority().equals(Priority.HIGH)){
            kolejka.addFirst(task);
        } else {
            kolejka.addLast(task);
        }
    }

    public Task getFromStart(){
        return kolejka.getFirst();
    }

    public Task check(){
        return kolejka.peekFirst();
    }

    public Deque<Task> getAll(){
        return kolejka;
    }
}
