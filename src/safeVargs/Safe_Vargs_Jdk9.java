package safeVargs;

import java.util.Arrays;
import java.util.List;

public class Safe_Vargs_Jdk9 {
	
	 public Safe_Vargs_Jdk9(List<String> list) {
		
	}
	 
	@SafeVarargs
	// to separate compile time warnings
	public static void m2(List<String>...list)
	{
		for(List<String>l1:list)
			System.out.println(l1);
	}
	@SafeVarargs
	// to separate compile time warnings
	// in 1.7 version
	public final void m3(List<String>...list)
	{
		m4();
	}
	
	@SafeVarargs
	// to separate compile time warnings
	// in 1.9 version it is applicable to use  @SafeVarargs annotations with private methods
	// before 1.9 it says invalid @SafeVarags annotation for private method
	private void m4(List<String>...list)
	{
		for(List<String>l1:list)
			System.out.println(l1);
	}
	
	public static void m1(int... x)
	{
		System.out.println("this is vargs method");
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
	}

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("a","b");
		List<String> l2=Arrays.asList("c","d");
		m2(l1,l2);
		m1();
		m1(10,11);
		m1(10,11,20);

	}

}
