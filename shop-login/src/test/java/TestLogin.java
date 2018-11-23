import com.ssm.api.common.Resultful;
import com.ssm.api.common.request.LoginRequest;
import com.ssm.shop.login.serviceImpl.UserServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
//默认资源是在webapp下的，通过下面注解改变资源解析路径，解析spring-mvc.xml
@WebAppConfiguration("src/main/resources")
public class TestLogin  {

    @Resource
    UserServiceImpl userService;

    @Test
    public void testLogin (){
        String username="ppf";
        String password="123";
        LoginRequest loginRequest=new LoginRequest();
        loginRequest.setPassword(password);
        loginRequest.setUsername(username);
        Resultful ss=userService.loginVerify(loginRequest);
        System.out.println(ss);
    }
}
