class AddTwoNumbersExm{
	
public static void main(String[]args){


int firstNumberInt = Integer.parseInt(args[0]);
int secNumberInt = Integer.parseInt(args[1]);

int result = AddTwoNumbers.sumOfTwoNumbers( firstNumberInt, secNumberInt );

System.out.println("sum is : "+result);
}
public static int sumOfTwoNumbers(int firstNumberInt, int secNumberInt ){  // static method

int sum = firstNumberInt + secNumberInt;

return sum;

}
}
