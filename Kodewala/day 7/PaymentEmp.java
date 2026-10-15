class PaymentEmp {

    int amount = 50000;       // non-static
    static int fee = 20;    // static

    public static void main(String[] args) {

        PaymentEmp p = new PaymentEmp();

        p.showAmount();
        PaymentEmp.showFee();
    }

    public void showAmount() {
        System.out.println("Amount : " + amount);
    }

    public static void showFee() {
        System.out.println("Fee : " + fee);
    }
}