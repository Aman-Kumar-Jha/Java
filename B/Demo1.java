package B;

//public class Demo1 {
//
//}
	 import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
class Demo1 extends Frame{
	Button b[];
	Demo1(){
		super("Flow Layout");
		b = new Button[11]; // components and add
		for(int i=0; i<11;i++){
			b[i] = new Button("Name = " + (i+1));
			add(b[i]); } // specify the size of frame and make it visible 
		setSize(500, 400);
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20)); 
		setVisible(true);
		}
	public static void main(String args[])
	{ 
		new Demo1();
		}
	
	}
