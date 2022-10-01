import com.dao.StudentDAO;
import com.util.SpringTool;
import org.junit.Test;

public class StudentDAOTest {
    //@Test
    //public void addTest(){
    //    StudentDAO dao= (StudentDAO)SpringTool.getBean("stuDAO");
    //    dao.add(5);
    //}
    @Test
    public void daoTest(){
        StudentDAO dao= (StudentDAO)SpringTool.getBean("stuDAO");
    }
}
