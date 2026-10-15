package p3;
// switch depends upon case value here case type is integer  in  case 1:  1 is integer thats why switch(int value)
// note=> switch will not accept boolean ad decimal value. numeric char and string value accepted in switch case
// case type should be same
public class Test {
	
	public static void main(String[] args) {

		int day = 3;

		switch (2) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		default:
			System.out.println("Invalid day");
		}
	}
}
