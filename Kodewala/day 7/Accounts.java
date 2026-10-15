class Accounts{

int balance = 100; // instance variable(non-static variable)
static int intRate = 5; // static variable
public static void main(String[]args){

// Creating an object of Accounts class

Accounts acc = new Accounts();

System.out.println("Balance is : " + acc.balance); // dot(.) operator

System.out.println("Interest rate is : " + Accounts.intRate); // dot(.) operator

Accounts.doSomething(); // calling doSomething() method which is static method

acc.doNothing(); // calling doNothing() method which is non-static method

}
public static void doSomething(){
	System.out.println("This is doSomething method..... ");
}
public void doNothing(){
	System.out.println("This is doNothing method..... ");
}
}