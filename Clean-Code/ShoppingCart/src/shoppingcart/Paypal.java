package shoppingcart;

public class Paypal implements PaymentMethod {

	private String paypalEmail;
	private String paypalPassword;
	
	public Paypal(String paypalEmail, String paypalPassword){
		        this.paypalEmail=paypalEmail;
		        this.paypalPassword=paypalPassword;
		    }

	@Override
	    public void paymentMethod(int cashAmount) {
	        System.out.println("The following cash amount " + cashAmount + " was paid using Paypal.");
	    }

}
