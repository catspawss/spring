package servlet;

import com.entity.Student;
import com.service.StudentService;
import com.servlet.StudentServlet;
import com.util.SpringTool;
import org.junit.Test;

public class StudentServletTest {

    @Test
    public void serviceTest(){
        StudentServlet servlet = new StudentServlet();
        servlet.service();
    }

    @Test
    public void test(){
        StudentService stuser = (StudentService)SpringTool.getBean("studentServiceimpl");
        Integer sum = stuser.sum(1, 2);
        System.out.println(sum);
    }
}
