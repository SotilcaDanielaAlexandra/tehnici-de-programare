package shoppingcart;

public class CreditCard implements PaymentMethod {

	    private String cardOwnerName;
	    private String cardNumber;
	    private String cardVerificationValue;
	    private String cardExpirationDate;
	    
	    
	    public CreditCard(String cardOwnerName, String cardNumber, String cardVerificationValue, String cardExpirationDate){
	    	        this.cardOwnerName=cardOwnerName;
	    	        this.cardNumber=cardNumber;
	    	        this.cardVerificationValue=cardVerificationValue;
	    	        this.cardExpirationDate=cardExpirationDate;	    	        
	    	    }
	    
	    @Override
	        public void paymentMethod(int cashAmount) {
	            System.out.println("The following cash amount " + cashAmount +" was paid by credit card");
	        }


}
	   
