package B;
import java.util.Scanner;
	

public class Array {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of elements in the array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements in the array");
	try {
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index element you want to access:");
		int j=sc.nextInt();
		System.out.println("The array element at the index"+j+":"+a[j]);
		System.out.println("Ther array element successfully accessed");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
