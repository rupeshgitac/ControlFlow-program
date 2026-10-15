class Account{

int balance = 100; // instance variable
static int intRate = 5; // static variable

public static void main(String args[]){

// Creating an object of Account class
Account acc = new Account();

System.out.println("Balance is : " + acc.balance); // dot(.) operator
System.out.println("Balance is : " + Account.intRate); // dot(.) operator

}
}

