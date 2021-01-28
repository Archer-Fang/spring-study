import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：fzj
 * @date ：2021/1/14
 */
public class MyTest {


    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("getUser");
        System.out.println(user.getName());
        System.out.println(user==user2);
    }
}
