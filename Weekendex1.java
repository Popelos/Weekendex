public class Weekendex1 {

public static void main (String[] args){

	short montly_sal = 900;
	short taxes = (short) (0.09 * montly_sal);
	short annual_sal =(short) (14*montly_sal);
	short annual_taxes= (short)(0.09*annual_sal);
	System.out.println(taxes);
	System.out.println(annual_sal);
	System.out.println(annual_taxes); 

}
}
