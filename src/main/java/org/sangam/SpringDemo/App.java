package org.sangam.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = beanFactory.getBean("alien", Alien.class);
        obj1.code();
        System.out.println(obj1.getAge());



    }
}
