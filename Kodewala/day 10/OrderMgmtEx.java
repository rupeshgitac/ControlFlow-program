class OrderMgmtEx {

    private int orderValue = 1000;

    public void placeOrder(String itemName) {

        System.out.println("Order value is : " + orderValue);

        System.out.println("Placing an order for : " + itemName);
    }

    public static void main(String[] args) {

        OrderMgmt objMgmt = new OrderMgmt();

        objMgmt.placeOrder("iPhone");
		System.out.println("Order value is : " + objMgmt.orderValue);
    }
}