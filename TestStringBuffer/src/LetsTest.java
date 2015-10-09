
public class LetsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("My name ");
		s.append("is ").append("Nidaye");
		s.insert(3, "fucking ");
		char a;
		a = s.charAt(0);
		s.append(a);
		System.out.print(s);
		System.out.print(" " + a);
		
	}

}
