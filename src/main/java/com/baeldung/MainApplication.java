package com.baeldung;

import com.baeldung.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hossaindoula on 4/18/2017.
 */
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "app-beans.xml");

        UserController controller = (UserController)context.getBean("userController");
        Map<String, Object> authority = new HashMap<>();
        authority.put("id", 1);
        authority.put("authorityName", "admin");
        try{
            Map<String, Object> authorityMap = controller.saveAuthority(authority);
            System.out.println("authorityMap = " + authorityMap);
        } catch (Exception ex){
            //log exception
        }
    }
}
