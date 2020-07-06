public class Weekendex6{

public static void main (String[] args){

	int seconds = Integer.parseInt(args[0]);
	int hours = seconds/3600;
	int minutes = (seconds %3600)/60;
	int sec = seconds%60;
	System.out.print (seconds+" seconds converted to hours "+ hours+":"+minutes+":"+sec);

}
}