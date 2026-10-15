class AddTwoNumbersEx{
	
public static void main(String[]args){

String firstNumber = args[0];
String secNumber = args[1];

int firstNumberInt = Integer.parseInt(firstNumber);
int secNumberInt = Integer.parseInt(secNumber);

AddTwoNumbersEx add = new AddTwoNumbersEx();


int result = add.sumOfTwoNumbers( firstNumberInt, secNumberInt );

System.out.println("sum is : "+result);
}
public int sumOfTwoNumbers(int firstNumberInt, int secNumberInt ){  // non-static method

int sum = firstNumberInt + secNumberInt;

return sum;

}
}
