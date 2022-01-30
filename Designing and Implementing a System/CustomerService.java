/* Project: Online Grocery Store
 * File: CustomerService.java
 * Author: Ryan Luo
 * Description: This is the Customer Service class of the grocery store where the user could request for help on certain things
 * Date: Nov. 24, 2021
*/

import java.util.*;

public class CustomerService {

  // Declaring variables
  private int numComplaints;
  private int numReturns;
  private String complaints;
  private double costRefun;
  private Employee employee;
  private Account account;
  private Clothing clothing;
  private Food food;
  private Electronic electronic;
  Scanner sc = new Scanner(System.in);

  // ========================ACCESSOR===========================
  public int getNumComplaints() {
    return this.numComplaints;
  }

  public int getNumReturns() {
    return this.numReturns;
  }

  public String getComplaints() {
    return this.complaints;
  }

  public double getCostRefun() {
    return this.costRefun;
  }

  // ========================GETTERS============================
  public void setNumComplaints(int numComplaints) {
    this.numComplaints = numComplaints;
  }

  public void setNumReturns(int numReturns) {
    this.numReturns = numReturns;
  }

  public void setComplaints(String complaints) {
    this.complaints = complaints;
  }

  public void setCostRefun(double costRefun) {
    this.costRefun = costRefun;
  }

  // Methods
  /*
   * Method: void returnItem() Return: void Input Parameter: void Description:
   * This method will tell the user can the item be return or not
   */
  public void returnItem() {
    System.out.println("What is the type of item you're returning?: ");
    System.out.println("Press e for electronic");
    System.out.println("Press a for other");
    String cmd = sc.nextLine();

    //Prompt user for product info
    System.out.println("What is the name of the item you're returning?");
    String name = sc.nextLine();
    System.out.println("How many days does the return length last for " + name);
      int warranty = sc.nextInt();

      System.out.println("How many days since you bought this item");
    int dayAfterPurchase = sc.nextInt();

    //if statement that check the type of item being return
    if (cmd.equals("e")) {
      this.electronic.warrantyCheck(dayAfterPurchase, warranty);
    } else {

      // If statement that check is day after purchase bigger than warranty
      if (dayAfterPurchase > warranty) {
        System.out.println("Unfortunately your refund time has expired, we can not return or refund your item.");

      } else {
        System.out.println("Thank you, your item has been returned and refunded.");
      }
    }

  }

  /*
   * Method: String fileComplaint Return: String complaints - the complaints user
   * have about the store Input Parameter: void Description: This method will
   * prompt user for complaint and return the complaint
   */
  public String fileComplaint() {
    System.out.println("Please write down your complaint: ");
    String complaints = sc.nextLine();
    return complaints;
  }

  /*
   * Method: recycle()
    Return: void
     Input Parameter: void 
     Description: This method will tell the user is item recycleable
   */
  public void recycle() {
    System.out.println("Please enter the material of the clothing that will be recycle: ");
    Clothing clothes = new Clothing("", 0, 0, "", "", 0, "", "");
    clothes.recycle(sc.nextLine());
  }

  /*
   * Method: void expired()
   * Return: void
   * Input Parameter: void 
   * Description: This method will
   * prompt user for complaint and return the complaint
   */
  public void expired() {
    int expireDate;
    int  currentDate;
    System.out.println("Please enter the expire date of the food: ");
    expireDate = sc.nextInt();
    System.out.println("Please enter current date: ");
    currentDate = sc.nextInt();
    Food food = new Food("", 0, 0, "", "", "", 0, 0);
    food.expired(expireDate, currentDate);
  }

  /*
   * Method: void reportEmployee(Employee[] employees) Return: void Input
   * Parameter: Employee[] employees - the list of employee that is hire
   * Description: This method will find the employee that was being reported and
   * give a decision to fire the employee or not
   */
  public void reportEmployee(Employee[] employees) {
    boolean exists = false;
    String fireOption = " ";
    String id = " ";
    boolean validInput = false;
    do {
      System.out.println("What is the id of the employee u want to report");
      id = sc.nextLine();
      exists = employees[0].findEmployee(employees, id);
      if (!exists) {
        System.out.println("That id doesnt exists. Enter another one");
      }
    } while (!exists);

    do {
      System.out.println("Would u like to fire this employee (Yes/No)");
      fireOption = sc.nextLine();
      if (fireOption.equalsIgnoreCase("Yes") || fireOption.equalsIgnoreCase("No")) {
        validInput = true;
      } else {
        validInput = false;
      }

    } while (!validInput);
    if (fireOption.equalsIgnoreCase("yes")) {
      employee.fire(employees, id);
      System.out.println("employee been fired");
    } else {
      System.out.println("Employee has not been fired");
    }

  }

  public void changeUserProfile(Account[] account, int i) {
    account[i].changeUserProfile();
  }
}
