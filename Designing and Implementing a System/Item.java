/* Project: Online Grocery Store
 * File: Item.java
 * Author: Ryan Luo
 * Description: This is the Item class of the grocery store. This is the parent class of all product
 * Date: Nov. 24, 2021
*/

public class Item{

    // Attributes
    private String product;
    private int itemId;
    private double salePrice;
    private double buyPrice;

    // Contrusctors
    public Item(String product, double salePrice, double buyPrice) {
        this.product = product;
        this.salePrice = salePrice;
        this.buyPrice = buyPrice;
    }
    
    // Accessors
    public String getProduct() {
        return this.product;
    }


    public int getItemId() {
        return this.itemId;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public double getBuyPrice(){
        return this.buyPrice;
    }


    // Mutators
    public void setProduct(String product) {
        this.product = product;
    }


    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}