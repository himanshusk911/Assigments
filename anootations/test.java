mport static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Retention(RUNTIME)
@Target(METHOD)

@interface Test{
	
}

class testAn{
	@Test
	void run() {
	System.out.println("run the test");
	
	}
}


public class TestAnnotation {

	public static void main(String[] args) {
		testAn a=new testAn();
		a.run();
	

	}

}