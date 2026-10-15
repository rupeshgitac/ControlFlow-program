class AddTwoNumbersByMethod{
	
public static void main(String[]args){

String firstNumber = args[0];
String secNumber = args[1];

int firstNumberInt = Integer.parseInt(firstNumber);
int secNumberInt = Integer.parseInt(secNumber);

int result = AddTwoNumbersByMethod.sumOfTwoNumbers( firstNumberInt, secNumberInt );

System.out.println("sum is : "+result);
}
public static int sumOfTwoNumbers(int firstNumberInt, int secNumberInt ){  // static method

int sum = firstNumberInt + secNumberInt;

return sum;

}
}
