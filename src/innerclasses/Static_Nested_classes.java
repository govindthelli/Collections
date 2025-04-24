package innerclasses;

class Mother
{
//	private String s="hello";
	static class Child
	{
		static void show()
		{
			System.out.println("hello");
		}
	}
} 
public class Static_Nested_classes {

	public static void main(String[] args) {
		Mother.Child.show();

	}

}
