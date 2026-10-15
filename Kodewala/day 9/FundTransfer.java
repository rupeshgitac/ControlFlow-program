class FundTransfer{

public static void main(String args[]){
	
	System.out.println("Starting main()");
	
	// Calling the method and passing the value(arguments)
	boolean result = FundTransfer.doTransaction(10, "96324587219", "12345054321");
	
	System.out.println("is txn successful ? "+result);

	
	System.out.println("Ending main()");

}
static boolean doTransaction(int amountToBeTxn, String senderAccNo, String recAccNo){

System.out.println("Entered doTransaction()");

System.out.println(" Input Received "+ amountToBeTxn +" "+ senderAccNo +" "+recAccNo );

System.out.println("Exit doTransaction()");

return true;

}
}

// SOLID Principle