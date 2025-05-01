package com.prajwal.Springhello;

//import org.springframework.beans.factory.BeanFactory;
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
        System.out.println( "Hello World!" );
        Vehicle c1=new Car();
        c1.drive();
        
        //BeanFactory
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle v1 = (Vehicle)context.getBean("vehicle");
        v1.drive();
    }
}
