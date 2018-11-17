import java.time.LocalDate;
import java.time.Month;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Dodaj", "Na bogato", Priority.LOW, LocalDate.now(), LocalDate.of(2020, Month.AUGUST, 26));
        Task task2 = new Task("Odejmij", "Bieda", Priority.HIGH, LocalDate.now(), LocalDate.of(2021, Month.JANUARY, 13));
        Task task3 = new Task("Pomnoz", "Bajabaongo", Priority.NORMAL, LocalDate.now(), LocalDate.of(2017, Month.JANUARY, 13));
        Task task4 = new Task("Dziel", "I rządź!", Priority.NORMAL, LocalDate.now(), LocalDate.of(2019, Month.JANUARY, 24));

        ToDoList toDoList = new ToDoList();

        toDoList.addLast(task1);
        toDoList.addLast(task2);
        toDoList.addLast(task3);
        toDoList.addLast(task4);

        System.out.println("Pierwsze zadanie w kolejce: " + toDoList.check());

        System.out.println("\nPobieranie zadań nieprzeterminowanych:");

        Deque<Task> nowaKolejka = toDoList.getAll();

        for (Task o : nowaKolejka) {
            if (!(o.getDeadline().isBefore(LocalDate.now()))) {
                System.out.println(o);
            }
        }
    }
}
