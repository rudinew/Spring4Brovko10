package com.example.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.impls.robot.ModelT1000;
/**
 * https://www.youtube.com/watch?v=-hOj-xnPBCY&index=11&list=PLhRVxdTBcpdu1mjcJgVfARKjpLzE9dLnL
 * @author Rudoman
 *
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		System.out.println(t1000);
		/*t1000.action();*/
		System.out.println("***************");
		/*ModelT1000 t1000Empty = (ModelT1000) context.getBean("t1000Empty");
		t1000Empty.action();*/
		t1000 = (ModelT1000) context.getBean("t1000");
		System.out.println(t1000);
	}

}
