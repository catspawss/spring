import com.dao.TeacherDAO;
import com.entity.Teacher;
import com.util.SpringTool;
import org.junit.Test;

import java.util.List;

public class TeacherDAOTest {
    //动态生成的实现类，获取时根据接口名字首字母小写
    private TeacherDAO dao = (TeacherDAO)SpringTool.getBean("teacherDAO");

    @Test
    public void getAllTest() {
        List<Teacher> teacherList = dao.getAll();
        for (Teacher tea : teacherList) {
            System.out.println(tea);
        }
    }
}
