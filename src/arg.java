import java.io.InputStream;


public class arg {
	public static void main(String[] args){
		
		InputStream modelIn = arg.class.getResourceAsStream("/en-sent.bin");
		System.out.println(modelIn == null);
	}
}
