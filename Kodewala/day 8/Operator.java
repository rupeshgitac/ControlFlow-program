class Operator{

public static void main(String args[]){

int minAge = 18; // asignment operator used
int maxAge = 60;
int userAge = Integer.parseInt(args[1]); // "22" --> 22
String name = args[0];

System.out.println("Applying DL for :"+ name);
System.out.println(" Condition1 :" + (minAge < userAge));
System.out.println(" Condition1 :" + (maxAge > userAge));

System.out.println("Allow to apply for DL :"+ (minAge < userAge) && (maxAge > userAge) ); // true

}
}

