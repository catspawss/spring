import com.entity.Person;
import com.util.SpringTool;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test(){
        Person person = (Person)SpringTool.getBean("person");
        System.out.println(person);
    }
}
