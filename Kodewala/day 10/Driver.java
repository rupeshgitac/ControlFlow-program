class Driver{

public static void main(String args[]){

System.out.println("Driver.main() Start");

// calling placeOrder() method of OrderMgmt class
OrderMgmt objMgmt = new OrderMgmt();

// calling method
objMgmt.placeOrder("iPhone 18");

System.out.println("Order value is : "+objMgmt.orderValue);

System.out.println("Driver.main() End");

}
}
