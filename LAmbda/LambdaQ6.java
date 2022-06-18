import java.util.*;
import java.util.function.UnaryOperator;

public class LambdaQ6 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Ram");
		lst.add("Shyam");
		lst.add("Ghanshyam");
		lst.add("Om Prakash");
		lst.add("op");
		LambdaQ6 ob = new LambdaQ6();
		
		System.out.println(ob.convertToUpperCase(lst));
	}

	public List<String> convertToUpperCase(List<String> list) {

		UnaryOperator<String> toUpper = str -> str.toUpperCase();
		list.replaceAll(toUpper);
		return list;
	}

}