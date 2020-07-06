public class Weekendex2{

public static void main (String[] args) {

	byte x = 1;
        byte y = (byte)(-x); // Y = -1 , X = 1
        byte z = (x++); // Z = 1 , X = 2
        byte f = (--x); // F = 1 , X = 1
        byte a =(byte)(y+z-f+x); // A = -1 + 1 -1 + 1
	System.out.println("-x + x++ - --x + x = " +a);
	

}
}