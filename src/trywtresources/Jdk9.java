package trywtresources;

class MyResources2 implements AutoCloseable
{

	public MyResources2() {
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
public class Jdk9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyResources2 re=new MyResources2();
		MyResources2 re1=new MyResources2();
		MyResources2 re2=new MyResources2();
		MyResources2 re3=new MyResources2();
		try(re;re1;re2;re3)
		{
			re.doProcess();
			re1.doProcess();
			re2.doProcess();
			re3.doProcess();
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
            // no need to be local to try block it is enhancement in jdk9 and no need to close they are
		// automatically closed
	}

}
