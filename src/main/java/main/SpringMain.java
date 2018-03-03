package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.EmployeeService;
import service.MyEmployeeService;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("Spring context initialized");
        MyEmployeeService myEmployeeService = context.getBean(MyEmployeeService.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        
        System.out.println("Bean retrieved form Spring context");
        
        System.out.println("Name " + employeeService.getEmployee().getName());
        
        context.close();
        System.out.println("Context is closing...");
        
    }
}
