package com.Spring.ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.ORM.dao.StudentDao;
import com.Spring.ORM.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/ORM/config.xml");
  System.out.println("Okay");     
       StudentDao studentDao= context.getBean("studentDao", StudentDao.class);

       
       Student student = new Student(6,"Vikas","Pune");
       
       int r = studentDao.insert(student);
       System.out.println(r);
    }
}
