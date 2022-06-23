import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author:Abner
 * Created at:2022/6/24
 * Updated at:
 **/
public class MyDemo {

    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        personList=Person.createRoster();
        personList.stream().forEach(person -> System.out.println(person.getName()));

    }





}
