package com.tizfer.javaspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tizfer.computer.MyComputer;
import com.tizfer.di.Student;
import com.tizfer.di.service.UserService;
import com.tizfer.entity.Printer;
import com.tizfer.entity.User;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
   public void test1() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//	   User user=(User)context.getBean("user");
//	   System.out.println(user.getName());
//	   Printer p=(Printer)context.getBean("printer");
//	   p.helloPrinter();
	   
	   MyComputer m=(MyComputer)context.getBean("mycomputer");
	   m.myComputer();
   }
   //依赖注入测试
   public void testDi1() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("spring-di.xml");
	   Student stu=(Student) context.getBean("stu");
	   stu.helloDi();
   }
 //依赖注入测试
   public void testDi2() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("spring-di.xml");
	   Student stu=(Student) context.getBean("student");
	   stu.helloDi();
   }
 //多例测试scope="prototype"//控制多例   默认单例
   public void testDi3() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("spring-di.xml");
	   Student stu1=(Student) context.getBean("student");
	   Student stu2=(Student) context.getBean("student");
	   System.out.println("地址比较"+(stu1==stu2));
   }
   
   //自动装配autowire="byType"通过类的属性类型注入    autowire="byName"  通过属性名注入
   public void testDi4() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("spring-di.xml");
	   UserService us=(UserService) context.getBean("userService");
	   us.addUser();
   }
   
   //测试注解
   public void testDi5() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("spring-auto.xml");
	   UserService us=(UserService) context.getBean("userService");
	   us.addUser();
   }
}
