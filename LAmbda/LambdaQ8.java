
import java.util.*;
import java.util.function.Consumer;

public class LambdaQ8 implements Runnable{
	public static void main(String[] Args) {
		LambdaQ8 ob = LambdaQ8(); 
		List<String> lst = new ArrayList<>();
        lst.add("Ram");
        lst.add("Shyam");
        lst.add("Ghanshyam");
        Thread t1= new Thread(ob);  
        t1.start();   
        ob.print.accept(lst);
	}
	
	Consumer<List<String>> print = list -> {
		for (String s : list)
			 System.out.println(s);
	};

	@Override
	public void run() {
	}
}
