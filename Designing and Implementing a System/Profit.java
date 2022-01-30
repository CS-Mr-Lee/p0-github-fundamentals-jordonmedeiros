/* Project: Online Grocery Store
 * File: Profit.java
 * Author: Matthew Hui
 * Description: This is the Profit class of the grocery store. This is used to caculate the asset of the user after they order
 * Date: Nov. 24, 2021
*/

import java.util.*;
public class Profit{

  //variable and arraylist
  private ArrayList<Double> revenue = new ArrayList<Double>();
  private ArrayList<Double> costOfGoods = new ArrayList<Double>();
  private ArrayList<Double> profit = new ArrayList<Double>();
  private double totalProfit;
  private double asset;
  private int numOfCOG;
  private double totalCost;
  private Employee[] employees;

  //Constructor
  public Profit(ArrayList<Double> revenue, ArrayList<Double> costOfGoods, double asset, int numOfCOG){
    this.revenue = revenue;
    this.costOfGoods = costOfGoods;
    this.asset = asset;
    this.numOfCOG = numOfCOG;
  }

  //getters
  public ArrayList<Double> getRevenue(){
      return this.revenue;
  }

  public ArrayList<Double> getCostOfGoods(){
    return this.costOfGoods;
  }

  public ArrayList<Double> getProfit(){
    return this.profit;
  }

  public double getAsset(){
    return this.asset;
  }

  public double getTotalProfit(){
    return this.totalProfit;
  }


  //Setters
  public void setRevenue(ArrayList<Double> revenue){
    this.revenue = revenue;
  }

  public void setCostOfGoods(ArrayList<Double> costOfGoods){
    this.costOfGoods = costOfGoods;
  }

  public void setProfit(ArrayList<Double> profit){
    this.profit = profit;
  }

  public void setAsset(double asset){
    this.asset = asset;
  }

  public void setNumOfCOG(int numOfCOG){
    this.numOfCOG = numOfCOG;
  }


  //Caculation for manager

  /*
  Method: void oprofitCalculation()
  Return: void 
  Input Parameter: void
  Description: This method will caculate the amount of profit thet owner have gain from purcahse of other account
 */
  public void oprofitCalculation(){
  double profit1;
    for(int i = 0; i < this.numOfCOG; i++){
      profit1 = this.revenue.get(i) - this.costOfGoods.get(i);
      this.profit.add(profit1);  
    }
  }

  /*
  Method: void ototalProfitCalculation()
  Return: void 
  Input Parameter: void 
  Description: This method will caculate the total profit gain from getting the sum of all profit
 */
  public void ototalProfitCalculation(){
    this.oprofitCalculation();
    //Caculate profit total
    for(int i = 0; i < this.numOfCOG; i++){
      this.totalProfit += this.profit.get(i);
    }
  }

  /*
  Method: void ototalProfitCalculation()
  Return: void 
  Input Parameter: void 
  Description: This method will caculate the total profit gain from getting the sum of all profit
 */
  public void oAssetCalculation(Employee[] employees, int employeeAmount){
    this.ototalProfitCalculation();
    //Caculate asset 
    this.asset += this.totalProfit;
    this.asset -= this.wagePay(employees, employeeAmount);
  }

  /*
  Method: void oStatus()
  Return: void 
  Input Parameter: void
  Description: This method will display all the owner status
 */
  public void oStatus(Employee[] employees, int employeeAmount){
    this.oAssetCalculation(employees, employeeAmount);
    System.out.println("Revenue list:");
    for(int i = 0; i < numOfCOG; i++){
      System.out.println("Revenue" + i+1 + ": $" + this.revenue.get(i));
    }
    System.out.println("\nCost Of Goods list:");
    for(int i = 0; i < numOfCOG; i++){
      System.out.println("Cost Of Goods" + i+1 + ": $" + this.costOfGoods.get(i));
    }
    System.out.println("\nProfit list:");
    for(int i = 0; i < numOfCOG; i++){
      System.out.println("Profit" + i+1 + ": $" + this.profit.get(i));
    }
    System.out.println("Total Profit: $" + this.totalProfit);
    System.out.println("Wage payed: $" + this.wagePay(employees, employeeAmount));
    System.out.println("Asset: $" + this.asset);
  }

  //Caculation for customer
  
  
  /*
  Method: void assetChange()
  Return: void
  Input Parameter: void
  Description: This method will caculate the asset change of the customer after day purcahse an item
 */
  public void assetChange(){
    this.costCalculation();
    this.asset -= this.totalCost;
  }

  /*
  Method: void costCalculation()
  Return: void 
  Input Parameter: void
  Description: This method will caculate the total cost for all product
 */
  public void costCalculation(){
  double cost;
    for(int i = 0; i < this.numOfCOG; i++){
      cost = this.revenue.get(i);
      this.totalCost += cost;  
    }
  }


  /*
  Method: void status()
  Return: void 
  Input Parameter: void 
  Description: This method will print all the status of the customer
 */
  public void status(){
    this.assetChange();
    System.out.println("Purchase list:");
    for(int i = 0; i < numOfCOG; i++){
      System.out.println("Purchase" + i+1 + ": $" + this.revenue.get(i));
    }
    System.out.println("Total Cost: $" + this.totalCost);
    System.out.println("Asset: $" + this.asset);
  }


  /*
  Method: void wagePay(Employee[] employees, int employeeAmount)
  Return: void
  Input Parameter: 
                  Employee[] employees - list of employeeAmount
                  int employeeAmount - the amount of employee in the grocery store
  Description: This method call the owner status in the profit class
 */  
  public double wagePay(Employee[] employees, int employeeAmount){
    double wagePay = 0;
    this.employees = employees;
    for(int i = 0; i < employeeAmount; i++){
      wagePay += employees[0].wageCalculator(employees[i].getHoursWorked(), employees[i].getWage());
    }
    return wagePay;
  }
}
