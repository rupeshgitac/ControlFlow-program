class DriverEx {

    public static void main(String args[]) {

        System.out.println("Driver.main() START");

        // Creating OrderMgmt object
        OrderMgmt objMgmt = new OrderMgmt();

        // Calling the method
        objMgmt.placeOrder("iPhone 15");

        System.out.println("Driver.main() END");
    }
}