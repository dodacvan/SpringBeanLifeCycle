package service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {
    @PostConstruct
    public void init() {
        System.out.println("MyService init method called");
    }
    
    public MyService() {
        System.out.println("Constructor Myservice no-agr called");
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("MyService destroy method called");
    }
}
