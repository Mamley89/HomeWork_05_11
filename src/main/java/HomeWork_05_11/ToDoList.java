package HomeWork_05_11;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) {

        List<String> todoname = new ArrayList<>();
        todoname.add("Проснуться");
        todoname.add("Позавтрокать");
        todoname.add("Принять душ");
        todoname.add("Собраться");
        todoname.add("Идти на работу");

        String todo = "Задача ";
        int i = 1;

        for (String todolist1 : todoname)
        {
            System.out.println(todo + (i++) + ": " + todolist1);
        }
    }
}
