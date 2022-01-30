/* Project: Online Grocery Store
 * File: Electronic.java
 * Author: Matthew Hui
 * Description: This is the Electronic class of the grocery store, this is one of type of product that user can choose from.
 * Date: Nov. 24, 2021
*/


public class Electronic extends Item{
  private boolean charger;
  private int warranty;
  private int dayAfterPurchase;
  private String material;

  public Electronic(String product, double salePrice, double buyPrice, boolean charger,  int warranty, int dayAfterPurchase, String material){
    super(product, salePrice, buyPrice);
    this.charger = charger;
    this.warranty = warranty;
    this.dayAfterPurchase = dayAfterPurchase;
    this.material = material;
  }

  /*
  Method: 
  Return: 
  Input Parameter: 
  Description: 
 */
  public void recycle(){

    //If statment that check is material recycable or not
    if ((this.material).equals("mental")){
        System.out.println("This is recycleable.");
    }else{
      System.out.println("This is not recycleable.");
    }
  }


  /*
  Method: void warrantyCheck()
  Return: void
  Input Parameter: void
  Description: This method check is the warranty still avilable
 */
  public void warrantyCheck(int dayAfterPurchase, int warranty){
    this.dayAfterPurchase = dayAfterPurchase;
    this.warranty = warranty;
    //Check is day after purchase bigger than warranty
    if(this.dayAfterPurchase <= this.warranty){
        System.out.println("The warranty is still useable.");
    }else{
      System.out.println("The warranty is not useable.");
    }
  }

  //Getters
  public boolean getCharger(){
    return this.charger;
  }


  public int getWarranty(){
    return this.warranty;
  }

  public int getDayAfterPurchase(){
    return this.dayAfterPurchase;
  }

  public String getMaterial(){
    return this.material;
  }

  //setters
  public void setCharger(boolean charger){
    this.charger = charger;
  }

  public void setWarranty(int warranty){
    this.warranty = warranty;
  }

  public void setDayAfterPurchase(int dayAfterPurchase){
    this.dayAfterPurchase = dayAfterPurchase;
  }

  public void setMaterial(String material){
    this.material = material;
  }

  /*
  *Method: String toString()
  *Return: String ret -  the data of the food
  *Input Parameter: void
  *Description: This method will return the data for Electronic
 */
  public String toString(){
    
    String ret = "\nProuct: "+ this.getProduct() + "\nSale Price: "+ this.getSalePrice() + "\nBuy Price: "+ this.getBuyPrice() + "\nCharger: "+ this.charger + "\nWarranty: "  + this.warranty + "\nDay After Purchase: " + this.dayAfterPurchase + "\nMaterial: " + this.material;
    return ret;
  }
}

