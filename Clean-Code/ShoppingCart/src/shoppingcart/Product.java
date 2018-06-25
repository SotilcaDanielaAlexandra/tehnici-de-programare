package shoppingcart;

public class Product {
 
    private String universalProductCode;
    private String productName; 
    private int productPrice;

    public Product(String universalProductCode, String productName,int price){
        this.universalProductCode=universalProductCode;
        this.productName=productName;
        this.productPrice=price;
    }

    
    public String getUniversalProductCode() {
        return universalProductCode;
    }

    public String getProductName() {
        return productName;
    }
    
    public int getPrice() {
        return productPrice;
    }
    
    public String toString() {
    	return "Universal Product Code: " + universalProductCode + " Product: " + productName + " Price: " + productPrice;
    }

}
