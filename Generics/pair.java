import java.util.HashMap;

public class Pair1 {
	public static void main(String[] args) {
		HashMap<String,String> hashmap1 = new HashMap<String,String>();
		hashmap1.put("1", "hello");
		System.out.println(hashmap1);
	}
}

public class Pair2 {
		HashMap<String,Date> hashmap2 = new HashMap<String,Date>();
		hashmap2.put("Date", new java.util.Date());
		System.out.println(hashmap2);
	}
