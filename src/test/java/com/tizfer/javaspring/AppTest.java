package com.tizfer.javaspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tizfer.computer.MyComputer;
import com.tizfer.entity.Printer;
import com.tizfer.entity.User;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
   public void test1() {
	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//	   User user=(User)context.getBean("user");
//	   System.out.println(user.getName());
//	   Printer p=(Printer)context.getBean("printer");
//	   p.helloPrinter();
	   
	   MyComputer m=(MyComputer)context.getBean("mycomputer");
	   m.myComputer();
   }
}
