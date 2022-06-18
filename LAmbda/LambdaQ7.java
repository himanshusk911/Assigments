import java.util.*;

public class LambdaQ7 {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Ram", 1);
		hashMap.put("Shyam", 2);
		hashMap.put("Ghanshyam", 3);
		hashMap.put("op", 4);

		LambdaQ7 assign = new LambdaQ7();

		System.out.println(assign.convertKeyValueToString(hashMap));

	}

	public String convertKeyValueToString(HashMap<String, Integer> map) {
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<String, Integer> mp : map.entrySet()) {
			sb.append(mp.getKey());
			sb.append(mp.getValue());
		}
		String s=sb.toString();
		return s;

	}
}
