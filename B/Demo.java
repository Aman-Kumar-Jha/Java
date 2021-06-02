package B;

//public class Demo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
 import java.awt.Button;
 import java.awt.Checkbox; 
 import java.awt.CheckboxGroup;
 import java.awt.Choice;
 import java.awt.FlowLayout;
 import java.awt.Frame;
 import java.awt.Label;
 import java.awt.TextArea;
 import java.awt.TextField; 
 class Demo extends Frame{ 
	 Demo(){
		 super("Flow Layout");
		 Button b = new Button("Test Button"); 
		 add(b); 
		 Checkbox cb = new Checkbox("Test Checkbox"); 
		 add(cb); 
		 // radio Buttons 
		 CheckboxGroup cbg = new CheckboxGroup(); 
		 add(new Checkbox("CB Item 1", cbg, false));
		 add(new Checkbox("CB Item 2", cbg, false)); 
		 add(new Checkbox("CB Item 3", cbg, true));
		 Choice choice = new Choice(); 
		 choice.addItem("Choice Item 1");
		 choice.addItem("Choice Item 2");
		 choice.addItem("Choice Item 3"); 
		 add(choice);
		 Label l = new Label("Test Label"); 
		 add(l); 
		 TextField t = new TextField("Test TextField",30); 
		 add(t);
		 TextArea ta = new TextArea("Test TextArea"); 
		 add(ta); // specify the size of frame and make it visible 
		 setSize(500, 400); 
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 setVisible(true);
		 } 
	 public static void main(String args[])
	 {
		 new Demo(); 
		 }
	 
	 }
 