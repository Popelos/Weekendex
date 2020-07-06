import static java.lang.Integer.parseInt;
public class Weekendex3{

public static void main (String[] args){

	int x = parseInt(args[0]);
		
		if(x % 3 == 0) System.out.print(x+" can be deviced by 3");
		else System.out.print (x+" cannot be deviced by 3");
	
}
}