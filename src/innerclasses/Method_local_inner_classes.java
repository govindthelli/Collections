package innerclasses;

class Father
{
	void display()
	{
		System.out.println("This is Outer class method");
		class Son
		{
			void show()
			{
				System.out.println("This is inner class method");
			}
		}
		Son s=new Son();
		s.show();
	}
}
public class Method_local_inner_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Father();
		f.display();
	}

}
