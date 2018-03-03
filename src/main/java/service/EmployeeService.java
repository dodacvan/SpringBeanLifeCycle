package service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import bean.Employee;
/**
 * 
 * @author vandd
 *
 */
// InitializingBean, DisposableBean
public class EmployeeService implements InitializingBean, DisposableBean {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("EmployeeService Closing resources");
    }

    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("EmployeeService initializing to dummy value");
        if (employee.getName() == null) {
            employee.setName("Pankaj");
        }
    }

}
