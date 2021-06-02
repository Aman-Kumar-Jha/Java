package B;

import java.util.Scanner;
public class Stack {
	static int m=-1;
	static int a[]=new int[100];

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
push(10);
push(20);
pop();
pop();

push(30);
push(40);
push(50);

pop();
pop();
peek();
peek();}
	
static void  push(int data)

{m++;
if(m>100)System.out.println("Stack Overflow");
	a[m]=data;
}
static void pop()
{	if(m==-1)
	System.out.println("Stack Underflow");
else {
	System.out.println("Popped Item->"+a[m]);

	m--;
}
}
static void peek()
{	if(m==-1)
	System.out.println("Stack Underflow");
else {
	System.out.println("Peek Item->"+a[m]);
}

	
}
}