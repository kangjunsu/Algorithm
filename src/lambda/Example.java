package lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface MyFunction<T>{
//	public int calc(int a, int b);
	public void print(T t);
}

public class Example {
	
	public static void main(String[] args) {
		
//		MyFunction f = (x, y) -> { return x + y; };
//		System.out.println(f.calc(2, 3));
//		addition(5, 6, f);
	
		MyFunction<String> f = x -> System.out.println(x.toString());
		f.print("ABC");
	
		Consumer<String> c = x -> System.out.println(x.toString());
		c.accept("가나다");
	}
	  
	static void addition(int x, int y, MyFunction f) {
		
//		System.out.println(f.calc(x, y));
	}

}
