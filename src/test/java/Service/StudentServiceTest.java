package Service;

import com.entity.Student;
import com.service.StudentService;
import com.util.SpringTool;
import org.junit.Test;

public class StudentServiceTest {
    @Test
    public void test() {
        StudentService stuSer= (StudentService)SpringTool.getBean("studentServiceimpl");
        stuSer.doAdd();
    }
}
