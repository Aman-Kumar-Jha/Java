import java.io.*;
import java.util.*;
class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	private String designation;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ",  designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	
}
class Assignment{

	  public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Student emp = new Student();
		
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student emp2 = (Student) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();
	}
}