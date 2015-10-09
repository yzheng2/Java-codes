package outInner;

public class HelloWorld {
	
	public class inner{
		public void show(){
			System.out.println("Show me");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello = new HelloWorld();
		inner i = hello.new inner();
		i.show();
	}

}
