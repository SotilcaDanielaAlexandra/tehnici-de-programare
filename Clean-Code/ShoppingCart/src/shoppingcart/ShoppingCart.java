package shoppingcart;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
	List<Product> products;

	    public ShoppingCart(){
	        this.products=new ArrayList<Product>();
	    }

	    public void addItem(Product product){
	        this.products.add(product);
	    }

	    public void removeItem(Product product){
	        this.products.remove(product);
	    }

	    public int calculateTotal(){
	        int totalProductsPricesSum = 0;
	        for(Product product : products){
	            totalProductsPricesSum += product.getPrice();
	        }
	        return totalProductsPricesSum;
	    }

	    public void payForProducts(PaymentMethod paymentMethod){
	        int amount = calculateTotal();
	        paymentMethod.paymentMethod(amount);
	    }		    
	    

	    public List<Product> getProducts() {
	        return products;
	    }	    

	    public void printProducts() {
	        StringBuilder cartStringBuilder = new StringBuilder();
	        for (Product product : products) {
	            cartStringBuilder.append(product).append("\n");
	        }
	        System.out.println("\nCart products\n" + cartStringBuilder);
	    }

	}
