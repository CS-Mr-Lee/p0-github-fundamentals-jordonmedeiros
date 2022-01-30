/* Project: Online Grocery Store
 * File: Account.java
 * Author: Matthew Hui
 * Description: This is the account class. where the info of user is stored at.
 * Date: Nov. 24, 2021
*/

import java.util.*; 
public class Account{
  
  //attributes
  private String accountName;
  private String postalCode;
  private String address;
  private int creditCardNum;
  private String password;
  private Cart cart;
  private Profit profit;
  private Employee[] employees;
  Scanner sc = new Scanner(System.in);
  
  //cunstructor
  public Account(String accountName, String postalCode, String address, int creditCardNum, String password, Cart cart, Profit profit){
    
    this.accountName = accountName;
    this.postalCode = postalCode;
    this.address = address;
    this.creditCardNum = creditCardNum;
    this.password = password;
    this.cart = cart;
    this.profit = profit;
  }

  //getters
  public String getAccountName(){
    return this.accountName;
  }

  public String getPostalCode(){
    return this.postalCode;
  }

  public String getAddress(){
    return this.address;
  }

  public int getCreditCardNum(){
    return this.creditCardNum;
  }

  public String getPassword(){
    return this.password;
  }

   public ArrayList<Double> getItemBuyCost(){
    return this.cart.getItemBuyCost();
  }

  public ArrayList<Double> getItemSellCost(){
    return this.cart.getItemSellCost();
  }

  public int getNumberOfItems(){
    return this.cart.getNumberOfItems();
  }


  //setters
  public void setAccountName(String accountName){
    this.accountName = accountName;
  }

  public void setPostalCode(String postalCode){
    this.postalCode = postalCode;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public void setCreditCardNum(int creditCardNum){
    this.creditCardNum = creditCardNum;
  }

  public void setPassword(String password){
    this.password = password;
  }

  //Methods

  /*
  Method: boolean password(String password)
  Return: boolean - return is password correct;
  Input Parameter: String password - password that is input by the user.
  Description: This method will input a password and check does the password equals to the password store
 */

  public boolean password(String password){

    if(password.equals(this.password)){
        System.out.println("Login succesful");
        return true;
    }else{
        System.out.println("wrong password");
        return false;
    }

  }

  /*
  Method: void addOrder()
  Return: void
  Input Parameter: void
  Description: This method call the add order method in cart
 */
  public void addOrder(){
    this.cart.addOrder();
  }

/*
  Method: void cancelOrder()
  Return: void
  Input Parameter: void
  Description: This method call the cancel order in cart
 */  
 public void cancelOrder(){
    this.cart.cancelOrder();
  }
  
/*
  Method: void status()
  Return: void
  Input Parameter: void
  Description: This method call the status in cart
 */  
 public void status(){
    this.cart.status();
  }

/*
  Method: String toString()
  Return: String ret -  the information of the user
  Input Parameter: void
  Description: This return all the information of the user
 */  
 public String toString(){
    String ret = "Username: " + this.accountName + "\nPostalCode: " + this.postalCode + "\nAddress: " + this.address + "\nCreditCardNum: " + this.creditCardNum + "\npassword: " + this.password;
    
    return ret;
  }

/*
  Method: double getAsset()
  Return: double asset - the amount of asset
  Input Parameter: void
  Description: This method call for getAsset method in profit and return asset
 */  
 public double getAsset(){
    return this.profit.getAsset();
  }

  /*
  Method: void setAsset(double asset)
  Return: void
  Input Parameter: double asset - the amount of asset
  Description: This method call for setAsset method in profit and change asset
 */  
 public void setAsset(double asset){
    this.profit.setAsset(asset);
  }

/*
  Method: void cStatus()
  Return: void
  Input Parameter: void
  Description: This method call for customer status in profit
 */  
 public void cStatus(){
    this.profit.status();
  }

/*
  Method: void procuctFind()
  Return: void
  Input Parameter: void
  Description: This method call for procuctFind in Cart
 */  
 public void productFind(){
    this.cart.productFind();
  }


  
/*
  Method: void setRevenue(ArrayList<Double> revenue)
  Return: void
  Input Parameter: ArrayList<Double> revenue - revenue gain from user
  Description: This method change the revenue in the profit class
 */  
 public void setRevenue(ArrayList<Double> revenue){
    this.profit.setRevenue(revenue);
  }

/*
  Method: void setCostOfGoods(ArrayList<Double> costOfGoods)
  Return: void
  Input Parameter:  ArrayList<Double> costOfGoods - costOfGoods from user purchase
  Description: This method change the costOfGoods in the profit class
 */  
 public void setCostOfGoods(ArrayList<Double> costOfGoods){
    this.profit.setCostOfGoods(costOfGoods);
  }

/*
  Method: void setNumOfCOG(int numOfCOG)
  Return: void
  Input Parameter: int numOfCOG - number of item purchase
  Description: This method change the value of the numOfCOG in profit class
 */  
 public void setNumOfCOG(int numOfCOG){
    this.profit.setNumOfCOG(numOfCOG);
  }

/*
  Method: void oStatus(Employee[] employees, int employeeAmount)
  Return: void
  Input Parameter: 
                  Employee[] employees - list of employeeAmount
                  int employeeAmount - the amount of employee in the grocery store
  Description: This method call the owner status in the profit class
 */  
 public void oStatus(Employee[] employees, int employeeAmount){
    this.profit.oStatus(employees, employeeAmount);
  }

  /*
  Method: void changeUserProfile()
  Return: void
  Input Parameter: void
  Description: This method update the user profile
 */
   public void changeUserProfile(){
          System.out.println("Enter new username:");
          this.setAccountName(sc.nextLine());
          System.out.println("Enter postal code:");
          this.setPostalCode(sc.nextLine());
          System.out.println("Enter address:");
          this.setAddress(sc.nextLine());
          System.out.println("Enter credit card number:");
          this.setCreditCardNum(sc.nextInt());
          System.out.println("Enter password:");
          this.setPassword(sc.nextLine());
          this.setPassword(sc.nextLine());
          System.out.println("Enter budget:");
          this.setAsset (sc.nextDouble());
  } 


/*
  Method: void d()
  Return: void
  Input Parameter: void
  Description: Unknow
 */
   public void d(){
    System.out.println("Deez Nut");
  }
}

