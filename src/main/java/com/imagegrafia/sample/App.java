package com.imagegrafia.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.imagegrafia.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/imagegrafia/cfgs/applicationContext.xml");

       Student std=context.getBean(Student.class);
       System.out.println(std);
 
    }
}
