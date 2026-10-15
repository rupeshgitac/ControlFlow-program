class AddTwoNumbersExByMethod{
	
public static void main(String[]args){

int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);

int result = AddTwoNumbersExByMethod.sumOfTwoNumbers( num1, num2 );
//int result = sumOfTwoNumbers( num1, num2 );


System.out.println("sum is : "+result);
}
public static int sumOfTwoNumbers(int num1, int num2 ){  // static method

return num1 + num2;

}
}
