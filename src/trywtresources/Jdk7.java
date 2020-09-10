package trywtresources;
class MyResources1 implements AutoCloseable
{

	public MyResources1() {
		// TODO Auto-generated constructor stub
          System.out.println("Resoucres creation");
	}
	public void doProcess()
	{
		System.out.println("Resource processing...");
	}
	
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("resouce closing...");
		
	}
	
}
public class Jdk7 {
	public static void main(String args[])
	{
		try(MyResources1 r=new MyResources1())
		{
			r.doProcess();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		 // resources are closed automatically in jdk7 and they should be local to try block
	}

}
