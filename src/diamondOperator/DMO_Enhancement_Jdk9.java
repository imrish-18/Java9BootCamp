package diamondOperator;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MyGen<T>{
	T obj;
	public MyGen(T obj)
	{
		this.obj=obj;
	}
	public T getObj()
	{
		return obj;
	}
	public void doProcess()
	{
		System.out.println("processing....");
	}
}
public class DMO_Enhancement_Jdk9 {

	public static void main(String[] args) {
		
		// in 1.8 v
		MyGen<String> c1=new MyGen<String>("rish")
				{
			         public void doProcess()
			         {
			        	 System.out.println("processing..."+" "+getObj());
			         }
				};
		c1.doProcess();
		// in 1.9 v
		MyGen<Integer> c2=new MyGen<>(10)
		{
	         public void doProcess()
	         {
	        	 System.out.println("processing..."+" "+getObj());
	         }
		};
c2.doProcess();
		
            String [] animals= {"cat","rat","lion","tiger","elephatn"};
            Iterator<String> it=new Iterator<String>() {
				
            	int i=0;
				@Override
				public String next() {
				if(!hasNext()) {
				throw new NoSuchElementException();
				}
				return animals[i++];
				}
				
				@Override
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return i<animals.length;
				}
			};
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}

	}

}
