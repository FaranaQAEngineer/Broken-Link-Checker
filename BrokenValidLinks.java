package training;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenValidLinks {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
WebDriver d=new ChromeDriver();
HttpURLConnection htp=null;
String homeurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
String testurl="";
int res;
d.get(homeurl);
Thread.sleep(2000);
List<WebElement> sel=d.findElements(By.tagName("a"));
Iterator<WebElement>iter=sel.iterator();
while(iter.hasNext()) {
	testurl=iter.next().getAttribute("href");
	
	if(testurl==null || testurl.isEmpty()) {
		System.out.println(testurl+" anchor tag is not been specified");
		continue;
	}
	if(!testurl.startsWith(homeurl)) {
		System.out.println(testurl+" domain is incorrect");
	}
	htp=(HttpURLConnection)(new URL(testurl)).openConnection();
	htp.setRequestMethod("HEAD");
	htp.connect();
	
	res=htp.getResponseCode();
	
	if(res>=400) {
		System.out.println(testurl+" is broken link bcz response code is:-"+res);		
	}
	else {
		System.out.println(testurl+" is valid link");
	}
}
	}
}
