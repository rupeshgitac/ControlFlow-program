class ATM {

    public static void main(String[] args) {

        int withdrawAmount = Integer.parseInt(args[0]);
        int minAmount = 100;
        int maxAmount = 10000;

        System.out.println("Condition1 : " + (withdrawAmount < minAmount));
        System.out.println("Condition2 : " + (withdrawAmount > maxAmount));

        System.out.println("Invalid Amount : " +
                (withdrawAmount < minAmount || withdrawAmount > maxAmount));
    }
}