/* Project: Online Grocery Store
 * File: Cart.java
 * Author: Jordon Medeiros
 * Description: This is the Cart class of grocery store, this store the order of the user
 * Date: Nov. 24, 2021
*/

import java.util.*; 
 
 public class Cart{
   public Cart(){
     this.numberOfItems = 0;
   }

  //attributes
  private final int MAX_ITEM = 1000;
  private int numberOfItems = 0;
  private ArrayList<String> itemInCart = new ArrayList<String>();
  private ArrayList<Double> itemSellCost = new ArrayList<Double>();
  private ArrayList<Double> itemBuyCost = new ArrayList<Double>();
  private double discount;
  private int foodNum = 0;
  private int electronicNum = 0;
  private int clothingNum = 0;
  private String order;
  private Food[] food = new Food[MAX_ITEM];
  private Clothing[] clothing = new Clothing[MAX_ITEM];
  private Electronic[] electronic = new Electronic[MAX_ITEM];
  String errorCollector;

  Scanner sc = new Scanner(System.in);

  //getters 
  public int getNumberOfItems(){
    return this.numberOfItems;
  }

  public ArrayList<String> getItemsInCart(){
    return (this.itemInCart);
  }

  public ArrayList<Double> getItemBuyCost(){
    return (this.itemBuyCost);
  }

  public ArrayList<Double> getItemSellCost(){
    return (this.itemSellCost);
  }

  public Food[] getFood(){
    return this.food;
  }

  public Clothing[] getClothing(){
    return this.clothing;
  }

  public Electronic[] getElectronic(){
    return this.electronic;
  }
  //setters
  public void setFood(Food[] food){
    this.food = food;
  }

  public void setClothing(Clothing[] clothing){
    this.clothing = clothing;
  }

  public void setElectronic(Electronic[] electronic){
    this.electronic = electronic;
  }

  //mutator

  /*
  Method: void addOrder()
  Return: void
  Input Parameter: void
  Description: This method will ask user choice of purchase and add the product to cart depend on the item purchase by the user. (The item can be food, clothing or electronic)
 */
  public void addOrder(){

    //prompt the user for order info
    System.out.println("Press e to add electronic to cart.");
    System.out.println("Press c to add clothing to cart");
    System.out.println("Press f to see food to cart");
    String key = sc.nextLine();


    boolean validInput = false;
    while(!validInput){
    //Promt for order name
      System.out.println("Enter the type of the Order:");
      order = sc.nextLine();
      if(key.equals("e") || key.equals("c") || key.equals("f")){
        validInput = true;
      }
    }

    //promt for Cost
    System.out.println("Enter the orginal cost of the Order:");
    double buyCost = sc.nextDouble();
    System.out.println("Enter the sell cost of the Order:");
    double sellCost = sc.nextDouble();
    System.out.println("Enter the percent off of the Order:");
    this.discount = sc.nextDouble();


    //If statement that chekc the user item type is electronic or not
    if(key.equals("e")){
      //String product, double salePrice, double buyPrice, boolean charger,  int warranty, int dayAfterPurchase, String material
      System.out.println("Enter order has a charger(true or false):");
      boolean charger = sc.nextBoolean();
      System.out.println("Enter the warranty of the Order:");
      int warranty = sc.nextInt();
      System.out.println("Enter the dayAfterPurchase of the Order:");
      int dayAfterPurchase = sc.nextInt();
      System.out.println("Enter the material of the Order:");
      errorCollector = sc.nextLine();
      String material = sc.nextLine();
      
      electronic[electronicNum] = new Electronic(order, sellCost, buyCost, charger, warranty, dayAfterPurchase, material);
      electronicNum++;


    //If statement that chekc the user item type is Clothing or not
    }else if(key.equals("c")){
      //String product, double salePrice, double buyPrice, String season, char gender, int age, String brand, String material
      System.out.println("Enter the orginal season of the Order:");
      errorCollector = sc.nextLine();
      String season = sc.nextLine();
      System.out.println("Enter the sell gender of the Order:");
      String gender = sc.nextLine();
      System.out.println("Enter the age of the Order:");
      int age = sc.nextInt();
      System.out.println("Enter the brand of the Order:");
      errorCollector = sc.nextLine();
      String brand = sc.nextLine();
      System.out.println("Enter the material of the Order:");
      String material = sc.nextLine();

      //create a new clothing array
      clothing[clothingNum] = new Clothing(order, sellCost, buyCost, season, gender, age, brand, material);
      clothingNum++;


    //If statement that chekc the user item type is Food or not
    }else if(key.equals("f")){
      //String product, double salePrice, double buyPrice, String ingredient, String type, String rating, String expireDate, String currentDate
      System.out.println("Enter the ingredient of the Order:");
      errorCollector = sc.nextLine();
      String ingredient = sc.nextLine();
      System.out.println("Enter the type of the Order:");
      String type = sc.nextLine();
      System.out.println("Enter the rating of the Order:");
      String rating = sc.nextLine();
      System.out.println("Enter the expire date of the Order:");
      int expireDate = sc.nextInt();
      System.out.println("Enter the day after purchase of the Order:");
      int currentDate = sc.nextInt();
      
      //create a new food array
      food[foodNum] = new Food(order, sellCost, buyCost, ingredient, type, rating, expireDate, currentDate);
      foodNum++;

    //Else tell user that no such type exist
    }else{
      System.out.println("No such food exist");
    }

    //Caclucate the sell cost of the order
    sellCost = sellCost * (100 - this.discount)/100;

    //Update the cart with new order
    this.itemInCart.add(order);
    this.itemBuyCost.add(buyCost);
    this.itemSellCost.add(sellCost);
    this.itemInCart.set(numberOfItems, order);
    this.itemBuyCost.set(numberOfItems, buyCost);
    this.itemSellCost.set(numberOfItems, sellCost);
    this.numberOfItems++;
  }

/*
  Method: void cancelOrder()
  Return: void
  Input Parameter: void
  Description: This method will erase all product in cart
 */
   public void cancelOrder(){
    //remove eveything in the array list
    for(int i = 0; numberOfItems > i;i++){
        this.itemInCart.set(i, null);
        this.itemBuyCost.set(i, null);
        this.itemSellCost.set(i, null);
    }

    System.out.println("\nAll orders have been removed.\n");

    //reset the amount of item
    this.numberOfItems = 0;
  }


  /*
  Method: void status()
  Return: void
  Input Parameter: void
  Description: This method will all the item in the cart
 */
  public void status(){
    //To print out the stuff in the array list
    System.out.println(toString());
    System.out.printf("%s %15s %15s\n", "Item:", "SellCost:", "Cost to Produce:");
    for(int i = 0; i < numberOfItems; i++){
      System.out.println(this.itemInCart.get(i) + "     $" + this.itemSellCost.get(i) + "     $" + this.itemBuyCost.get(i));
    }

  }

  /*
  Method: void procuctFind()
  Return: void
  Input Parameter: void
  Description: This method will display info of the product
 */
  public void productFind(){
    boolean productFound = false;
    String type = "";
    System.out.println("Enter the the product name:");
    String product = sc.nextLine();
    System.out.println("The type of product:");
    type = sc.nextLine();

    //Check for the type of product
    if(type.equalsIgnoreCase("Food")){
      //For loop that will search throught the cart to find product
      for(int i = 0; foodNum > i; i++){
        //If statment that check does the product match
        String foodName = food[i].getProduct();
        if(foodName.equalsIgnoreCase(product)){
          System.out.println(food[i].toString());
        }
      }
    }else if(type.equalsIgnoreCase("Clothing")){
      //For loop that will search throught the cart to find product
      for(int i = 0; clothingNum > i; i++){
        String clothingName = clothing[i].getProduct();
        //If statment that check does the product match
        if(clothingName.equalsIgnoreCase(product)){
            System.out.println(clothing[i].toString());
        }

      }

    }else if(type.equalsIgnoreCase("Electronic")){
      //For loop that will search throught the cart to find product
      for(int i = 0; electronicNum > i; i++){
        String electronicName = electronic[i].getProduct();
        //If statment that check does the product match
        if(electronicName.equalsIgnoreCase(product)){
            System.out.println(electronic[i].toString());
        }
      }
    }
  }

  /*
  Method: String toString()
  Return: String ret - the amount of item in cart
  Input Parameter: void
  Description: This method return the amount of item in cart
 */
  public String toString(){
    String ret = "Number Of item(s) in Cart: " + this.numberOfItems + "\nNumber of food items: " + foodNum + "\nNumber of electronic items: " + electronicNum + "\nNumber of closthing num: " + clothingNum +  "\ndiscount: " + discount + "\nOrder: " + order;

    return ret;
    
  }

}
