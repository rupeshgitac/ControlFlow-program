class SubstractionOfTwoNumbers{
	
public static void main(String[]args){


int firstNumberInt = Integer.parseInt(args[0]);
int secNumberInt = Integer.parseInt(args[1]);

int result = SubstractionOfTwoNumbers.substraction( firstNumberInt, secNumberInt );

System.out.println("substraction is : "+result);
}
public static int substraction(int firstNumberInt, int secNumberInt ){  // static method

return firstNumberInt - secNumberInt;

}
}
