import java.util.InputMismatchException;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = new int[args.length];
try {
	int sum=0;
	for(int i=0;i<args.length;i++) {
		if(args[i].charAt(args[i].length()-1)==',')
			array[i]=Integer.parseInt(args[i].substring(0,args[i].length()-1));
		else
			array[i]=Integer.parseInt(args[i]);
		sum+=array[i];
	}
	int avg=sum/args.length;
	System.out.println("sum of array is:"+sum+"and avg is:"+avg);
}catch(ArithmeticException e)
{
	System.out.println("ArithmeticException");
}catch(InputMismatchException e)
{
	System.out.println("InputMismatchException");
}catch(NumberFormatException e)
{
	System.out.println("NumberFormatException");
}
	}

}
