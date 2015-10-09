import java.net.*;
public class URLstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL imooc = new URL("http://www.imooc.com");
			URL url = new URL(imooc,"/index.html?username = tom#test");
			//?后边表示参数，#后边表示锚点
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
