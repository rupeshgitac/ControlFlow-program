class Account2{

int balance = 1500; // instance variable
static int intRate = 10; // static variable

public static void main(String args[]){

// Creating an object of Account2 class
Account2 acc = new Account2();

System.out.println("Balance is : " + acc.balance); // dot(.) operator
System.out.println("Balance is : " + Account2.intRate); // dot(.) operator

}
}

