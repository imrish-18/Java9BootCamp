package privateMethod;

interface A
{
	void m1();
	void m2();
	static void m() {
		System.out.println("hello static method");
	}
	default void m3()
	{
		System.out.println("hello m3 method");
		// without affecting the implementation class we add methods by using default methods
		// implementation class can ignore or implements or can provide implementation
		//System.out.println("common code");
		m5();
	}
	default void m4()
	{
		System.out.println("hello m4 method");
		//System.out.println("common code");
		m5();
	}
	private void m5()
	{
		System.out.println("common code");
		// to overcome the problem of common code we use private method
	}
}

class AImpl implements A
{
	public void m3()
	{
		// can override default methods
		System.out.println("overridden method");
	}
	@Override
	public void m1() {
		
		
	}

	@Override
	public void m2() {
	
		
	}
	
}
public class PrivateMethod {

	public static void main(String[] args) {
		
         AImpl a=new AImpl();
         a.m3();
         a.m4();
        // a.m();// compile time error The method m() is undefined for the type AImpl
         A.m();// static method can accessed only by interface
	}

}
