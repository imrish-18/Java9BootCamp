package trywtresources;

class MyResources implements AutoCloseable
{

	public MyResources() {
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

public class TryWithResources {

	public static void main(String[] args) throws Exception 
	{
		
         MyResources re=null;
         try
         {
        	 re=new MyResources();
        	 re.doProcess();
         }
         catch(Exception ex)
         {
        	 System.out.println(ex.getMessage());
         }
         finally{
        	 if(re!=null)
        	 re.close();
         }
	}

}
