class PaymentByInstanceVariable {

int totalBalance = 500; // instance Variable(Non-static variable) -->belongs to object
public static void main(String[]args){

PaymentByInstanceVariable ins = new PaymentByInstanceVariable();

System.out.println(ins.totalBalance);

}


}