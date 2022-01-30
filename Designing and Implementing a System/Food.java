/* Project: Online Grocery Store
 * File: Food.java
 * Author: Jordon Medeiros
 * Description: This is the Electronic class of the grocery store, this is one of type of product that user can choose from.
 * Date: Nov. 24, 2021
*/


public class Food extends Item{
  
  //arttributes
  private String ingredient;
  private String type;
  private String rating;
  private int expireDate;
  private int currentDate;

  public Food(String product, double salePrice, double buyPrice, String ingredient, String type, String rating, int expireDate, int currentDate){
    super (product, salePrice, buyPrice);
    this.ingredient = ingredient;
    this.type = type;
    this.rating = rating;
    this.expireDate = expireDate;
    this.currentDate = currentDate;
  }

  //getters

  public String getIngredient(){
    return this.ingredient;
  }

  public String getType(){
    return this.type;
  }

  public String getRating(){
    return this.rating;
  }

  public int getExpireDate(){
    return this.expireDate;
  }

  public int getCurrentDate(){
    return this.currentDate;
  }

  //setters

  public void setIngredient(String ingredient){
    this.ingredient = ingredient;
  }

  public void setType(String type){
    this.type = type;
  }

  public void setRating(String rating){
    this.rating = rating;
  }

  public void setExpireDate(int expireDate){
    this.expireDate = expireDate;
  }

  public void setCurrentDate(int currentDate){
    this.currentDate = currentDate;
  }


  /*
  *Method: boolean expired(int expireDate, int  currentDate)
  *Return: void
  *Input Parameter: 
  *               int expireDate - the expire date of the product
  *               int currentDate - the curent date
  *Description: This method will determine is the product expired *or not
 */
  public boolean expired(int expireDate, int  currentDate){
    boolean expire = false;
    if(expireDate >= currentDate){
      System.out.println("It is expired");
      expire = true;
    }else{
      System.out.println("It is not expired");
      expire = false;
    }

    return expire;
  }
  

  /*
  *Method: String toString()
  *Return: String ret -  the data of the food
  *Input Parameter: void
  *Description: This method will return the data for food
 */
  public String toString(){
    
    String ret = "\nProuct: "+ this.getProduct() + "\nSale Price: "+ this.getSalePrice() + "\nBuy Price: "+ this.getBuyPrice() + "\nType: "+ this.type + "\nRating: "+ this.rating + "\nExpireDate: "+ this.expireDate + "\nCurrentDate: "+ this.currentDate + "\nExpired: "  + expired(this.expireDate, this.currentDate);
    return ret;
  }
  
}


