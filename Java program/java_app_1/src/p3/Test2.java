package p3;
// switch depends upon case value here case type is character  in  case 'a': 'a'  is character thats why switch(char value)
public class Test2 {
	
	public static void main(String[] args) {

		//int day = 3;

		switch ('b') {
		case 'a':
			System.out.println("Monday");
			break;

		case 'b':
			System.out.println("Tuesday");
			break;

		case 'c':
			System.out.println("Wednesday");
			break;

		case 'd':
			System.out.println("Thursday");
			break;

		case 'e':
			System.out.println("Friday");
			break;

		default:
			System.out.println("Invalid day");
		}
	}
}
