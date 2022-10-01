import com.entity.Student;
import com.util.SpringTool;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void createBeanBySpringTest(){
        //1。加载spring核心配置文件,ctx为核心对象
        //String conf_file = "applicationContext.xml";
        //ApplicationContext ctx=new ClassPathXmlApplicationContext(conf_file);
        //2。向spring容器索要对象通过id
        Student stu = (Student) SpringTool.getBean("stu");
        //上面方法通过id，下面通过类名，效果相同
        //Student stu = (Student)ctx.getBean(Student.class);
        System.out.println(stu);
    }
    @Test
    public void test(){
        Student stu = (Student)SpringTool.getBean("stu");
        System.out.println(stu);
    }
}
