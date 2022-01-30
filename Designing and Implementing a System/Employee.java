

/* Project: Online Grocery Store
 * File: Employee.java
 * Author: Jordon Mederios
 * Description: This is the Employee class of the grocery store. Thiw will send employee that is specify in each field to help user on different of the grocery store
 * Date: Nov. 24, 2021
*/


public class Employee{
  
  private String name;
  private String id;
  private String role;
  private double wage;
  private int hoursWorked;
  private String employeeStatus;

  public Employee(String name, String id, String role, double wage, int hoursWorked, String employeeStatus){
    this.name = name;
    this.id = id;
    this.role = role;
    this.wage = wage;
    this.hoursWorked = hoursWorked;
    this.employeeStatus = employeeStatus;
  }

  

  //getters
  public String getName(){
    return this.name;
  }

  public String getId(){
    return this.id;
  }

  public String getRole(){
    return this.role;
  }

  public double getWage(){
    return this.wage;
  }

  public int getHoursWorked(){
    return this.hoursWorked;
  }

  public String getEmployeeStatus(){
    return this.employeeStatus;
  }
  
  public void setName(String name){
    this.name = name;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setRole(String role){
    this.role = role;
  }


  public void setWage(double wage){
    this.wage = wage;
  }

  public void setHoursWork(int hoursWorked){
    this.hoursWorked = hoursWorked;
  }

  public void setEmployeeStatus(String employeeStatus){
    this.employeeStatus = employeeStatus;
  }


  /*
  Method: double wageCalculator(int hoursWorked, double wage)
  Return: double payment - the amount of payment need to pay to the employee
  Input Parameter: 
                  int hoursWorked - the amount of hours the employee have worked
                  double wage -  the amount of wage the employee get per hour
  Description: This method will cacukate the wage of the employee
 */
  public double wageCalculator(int hoursWorked, double wage){
    double payment = hoursWorked * wage;
    return payment;
  }


  /*
  Method: void hire(Employee employees[], String name, String id, String role, double wage, int hoursWorked, String employeeStatus)
  Return: void
  Input Parameter: 
                  Employee employees - the list of employee
                  String name - the name of the employee
                  String id - the id of the employee
                  String role - the role of the employee
                  double wage - the wage of the employee per hour
                  int hoursWorked - the amount of hours the employee have worked
                  String employee status - is the employee hire, break, or fire

  Description: This method add the new employee to the list of employee
 */
  public void hire(Employee employees[], String name, String id, String role, double wage, int hoursWorked, String employeeStatus){
    boolean exists = false;
    for(int i = 0; i < employees.length && !exists; i++){
      if(employees[i].id.equals("")){
        employees[i].name= name;
        employees[i].id= id;
        employees[i].role= role;
        employees[i].wage= wage;
        employees[i].hoursWorked= hoursWorked;
        employees[i].employeeStatus= employeeStatus;
        exists = true;
      }
    }
  }

  /*
  Method: void fire(Employee employees[], String id)
  Return: void 
  Input Parameter: 
                  Employee employees[] - the list of employee
                  String id - the id of the employee
  Description: 
 */
  public void fire(Employee employees[], String id){
    boolean exists = false;
    for(int i = 0; i < employees.length && !exists; i++){
      if(employees[i].id.equalsIgnoreCase(id)){
        employees[i].name= "";
        employees[i].id= "";
        employees[i].role= "";
        employees[i].wage= 0;
        employees[i].hoursWorked= 0;
        employees[i].employeeStatus= "";
        exists = true;
      }
    } 
  }


  /*
  Method: boolean findEmployee(Employee employees[], String id)
  Return: boolean exists - does the user exist or not
  Input Parameter: 
                  Employee employees[] -  the list of employee
                  String id - the id of the employee
  Description: This method will find and tell the user does employee exist
 */
  public boolean findEmployee(Employee employees[], String id){
    boolean exists = false;
    for(int i = 0; i < employees.length && !exists; i++){
      if(employees[i].id.equals(id)){
        exists = true;
      }
    }
    return exists; 
  }


  /*
  Method: void listEmployees(Employee employees[])
  Return: void 
  Input Parameter: Employee employees[] -  the list of employee
  Description: This method will list all the employee in the list
 */
  public void listEmployees(Employee employees[]){
    for(int i = 0; i < employees.length; i++){
      if(!employees[i].id.equals("")){
        System.out.println("\nEmployee number "  + (i+1));
        System.out.println("name of employee: " + employees[i].name);
        System.out.println("id: " + employees[i].id);
        System.out.println("role: " + employees[i].role);
        System.out.println("wage: "+ employees[i].wage);
        System.out.println("hoursWorked: " + employees[i].hoursWorked);
        System.out.println("employeeStatus: " +  employees[i].employeeStatus + "\n");
      }
    }
  }
}

