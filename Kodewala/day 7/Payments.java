class Payments {

int totalBalance = 2100; // instance variable(non-static variable) -->belongs to object
static int maxAmount = 10000; // static variable -->belongs to class

public static void main(String[]args){

// created local varaible

int balance; // local varaible -->belongs to method or Block
balance = 200;
int amountToBeTxn = 12; // local varaible -->belongs to method or Block

System.out.println("Balance is : " + balance);
System.out.println("Transaction amount : " + amountToBeTxn);
System.out.println("Max amount is : " + Payments.maxAmount); // using the static variable


}
public void doSomething(){


}

}
