package innerclasses;

////using class as subtype
//class Hello{
//	void show()
//	{
//		System.out.println("This is show method in hello class");
//	}
//}

//using interface
interface Hello{
	void show();
}

public class Anonymous_inner_classes {
	static Hello h=new Hello() {
		public void show() {
			
			System.out.println("This is show method in Main class");
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h.show();

	}

}
