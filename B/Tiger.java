package B;
import java.util.Stack; 
public class Tiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Stack<String> STACK = new Stack<String>(); 
STACK.push("Tiger"); 
STACK.push("Zinda"); 
STACK.push("Hai"); 


// Displaying the Stack 
System.out.println("Initial Stack: " + STACK); 

// Removing elements using pop() method 
System.out.println("Popped element: " +  
                                 STACK.pop()); 
System.out.println("Popped element: " +  
                                 STACK.pop()); 

// Displaying the Stack after pop operation 
System.out.println("Stack after pop peration "
                                     + STACK); 
} 

	}


