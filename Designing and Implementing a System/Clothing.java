  /* Project: Online Grocery Store
 * File: Clothing.java
 * Author: Ryan Luo
 * Description: This is the Clothing class of the grocery store, this is one of type of product that user can choose from.
 * Date: Nov. 24, 2021
*/


public class Clothing extends Item{
// YOOOOOOOOOO^^^^^^ REMMEBER THIS
    // Variables
    private String season;
    private String gender;
    private int age;
    private String brand;
    private String material;  //cloth, plastic and leather  use if((this.material).equalTo("cloth"); ) 

    // General constructor
    public Clothing(String product, double salePrice, double buyPrice, String season, String gender, int age, String brand, String material) {
        super (product, salePrice, buyPrice);
        this.season = season;
        this.gender = gender;
        this.age = age;
        this.brand = brand;
        this.material = material;
    }

    
    //===================================================ACCESSORS=================================================================
    
    public String getSeason() {
        return this.season;
    }
    
    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getMaterial() {
        return this.material;
    }

    //===================================================MUTATORS=================================================================


    public void setSeason(String season) {
        this.season = season;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    // Methods
    /*
    Method: boolean recycle(String material)
    Return: boolean - state is the product recycleable or not
    Input Parameter: String material - the material of the product
    Description: This method will determine is the product recycleable or not
    */
    public boolean recycle(String material) {
        if (this.material.equals("cloth") || this.material.equals("plastic") || this.material.equals("textile") ) {
            return true;
        } else {
            return false;
        }

    }

    /*
  *Method: String toString()
  *Return: String ret -  the data of the clothing
  *Input Parameter: void
  *Description: This method will return the data for clothing
 */
  public String toString(){
    
    String ret = "\nProuct: "+ this.getProduct() + "\nSale Price: "+ this.getSalePrice() + "\nBuy Price: "+ this.getBuyPrice() + "\nSeason: " + this.season + "\nGender: "+ this.gender + "\nAge: " + this.age + "\nBrand: " + this.brand + "\nMaterial: "+ this.material;
    return ret;
  }
}