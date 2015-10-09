
public class TestBox {
	Integer j = 0;
	int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBox t = new TestBox();
		t.go();
	}
	
	public void go(){
		i = j;
		System.out.println(j);
		System.out.println(i);
	}

}
