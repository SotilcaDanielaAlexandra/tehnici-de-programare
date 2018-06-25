package shoppingcart;

public class TestShoppingCart {

	public static void main(String[] args) {

		        ShoppingCart cartFirstCustomer = new ShoppingCart();

		        Product product1 = new Product("1234478900", "Tricou de jerseu", 80);
		        Product product2 = new Product("5678123457","Pantaloni cu pliuri in talie" ,39);
		        Product product3 = new Product("4278012345","Rochie din tesatura texturata" ,170);

		        cartFirstCustomer.addItem(product1);
		        cartFirstCustomer.addItem(product2);
		        cartFirstCustomer.addItem(product3);

		        cartFirstCustomer.printProducts();
		        cartFirstCustomer.payForProducts(new Paypal("ionela.popescu@yahoo.com.com", "password2344!"));
		        cartFirstCustomer.payForProducts(new CreditCard("Ionela Popescu", "1234567890123456", "786", "12/12/2019")); 

		        ShoppingCart cartSecondCustomer = new ShoppingCart();
		        
		        Product product4 = new Product("1234478900", "Camasa de denim", 180);
		        Product product5 = new Product("5678123457","Pantaloni din bumbac" ,139);

		        cartSecondCustomer.addItem(product4);
		        cartSecondCustomer.addItem(product5);

		        cartSecondCustomer.printProducts();
		        cartSecondCustomer.payForProducts(new Paypal("marin.ionescu@yahoo.com.com", "password2344!"));
		        cartSecondCustomer.payForProducts(new CreditCard("Marin Ionescu", "1234567890123456", "786", "12/12/2019")); 
		    }
		}
