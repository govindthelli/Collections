package innerclasses;

class Parent
{
//	private String s="hello";
	class Child
	{
		void show()
		{
			System.out.println("hello");
		}
	}
}
public class Nested_Inner_class {
	public static void main(String[] args) {
//		Parent p=new Parent();
//		Parent.Child c=p.new Child();
//		c.show();
		Parent.Child c=new Parent().new Child();
		c.show();
	}
}
