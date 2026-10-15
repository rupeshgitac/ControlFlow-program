class OperatorsExTwo{

public static void main(String args[]){

int minAge = 18; // asignment operator used

int userAge = Integer.parseInt(args[1]); // "22" --> 22
String name = args[0];

System.out.println("Applying DL for :"+ name);
System.out.println("Allowed to apply for DL :" + (minAge < 20)); // true

}
}

