package iterators;
import java.util.ArrayList;
import java.util.Iterator;

public class student_task {
	private int pin;
	private String name;
	private boolean gender;
	private String branch;
	private String add;
	
	public String toString()
	{
		return "Pin no:"+pin+"\nname:"+name+"\nG:"+gender+"\nbranch:"+branch+"\naddress:"+add;
		
	}
	public static void main(String[] args) 
	{
		ArrayList<student_task> al=new ArrayList<>();
		student_task s1=new student_task();
		s1.setPin(1);
		s1.setName("govind");
		s1.setGender(true);
		s1.setBranch("cse");
		s1.setAdd("abc");
		al.add(s1);
		Iterator<student_task> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public student_task(int pin, String name, boolean gender, String branch, String add) {
		super();
		this.pin = pin;
		this.name = name;
		this.gender = gender;
		this.branch = branch;
		this.add = add;
	}
	
	public student_task() {
		super();
		// TODO Auto-generated constructor stub
	}
}