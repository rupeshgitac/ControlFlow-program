class SubstractionOfTwoNumbersEx{
	
public static void main(String[]args){


int firstNumberInt = Integer.parseInt(args[0]);
int secNumberInt = Integer.parseInt(args[1]);

SubstractionOfTwoNumbersEx sub = new SubstractionOfTwoNumbersEx();

int result = sub.substraction( firstNumberInt, secNumberInt );

System.out.println("substraction is : "+result);
}
int substraction(int firstNumberInt, int secNumberInt ){  // static method

return firstNumberInt - secNumberInt;

}
}
