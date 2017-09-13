package ng;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CCixtest {
	
	WebDriver t;
	//HtmlUnitDriver t=new HtmlUnitDriver();
	/*@Test(priority=1,dataProvider = "replace value", dataProviderClass = Dataprovidercalss.class)
	public void f(String replace1) throws InterruptedException, FileNotFoundException {
		WebDriverWait o = new WebDriverWait(t, 50);
		// Start Transaction
		// file Reading
			modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","007d0294c6db55a34",replace1);
			o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_call']/div[1]/div[2]/label")));
		
		String check = t.findElement(By.xpath("//*[@id='start_call']/div[1]/div[2]/label")).getText();
		System.out.println(check);

		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\1111.txt")));
		} catch (IOException e0) {
			e0.printStackTrace();
		}
		System.out.println("Text file as String in Java");
		System.out.println(data);
		String text = data;
		o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_call_value']")));
		WebElement value = t.findElement(By.xpath("//*[@id='start_call_value']"));
		((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value, text);

		WebElement button = t.findElement(By.xpath("//*[@id='start_call']/div[2]/div[2]/input"));
		button.click();
		
		modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",replace1,"007d0294c6db55a34");
		Thread.sleep(1000);
		
		// Transaction
		
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","007d0294c6db55a34",replace1);
		
		String check1 = t.findElement(By.xpath("//*[@id='call_trasaction']/div[1]/div[2]/label")).getText();
		System.out.println(check1);

		String data1 = "";
		try {
			data1 = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\2222.txt")));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Text file as String in Java");
		System.out.println(data1);
		String text1 = data1;
		o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transaction_call_value']")));
		WebElement value1 = t.findElement(By.xpath("//*[@id='transaction_call_value']"));
		((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value1, text1);
		WebElement button1 = t.findElement(By.xpath("//*[@id='call_trasaction']/div[2]/div[2]/input"));
		button1.click();

		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",replace1,"007d0294c6db55a34");
		Thread.sleep(1000);
		
		// end transaction
		
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt","007d0294c6db55a34",replace1);
		
		String check2 = t.findElement(By.xpath("//*[@id='end_call']/div[1]/div/div[2]/label")).getText();
		System.out.println(check2);

		String data2 = "";
		try {
			data2 = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\3333.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Text file as String in Java");
		System.out.println(data2);
		String text2 = data2;
		o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='end_call_value']")));
		WebElement value2 = t.findElement(By.xpath("//*[@id='end_call_value']"));
		((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value2, text2);
		WebElement button2 = t.findElement(By.xpath("//*[@id='end_call']/div[2]/div[2]/input"));
		button2.click();
		
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt", replace1,"007d0294c6db55a34");
		Thread.sleep(1000);
		}*/
	
	@Test
	public void anianddnis() throws FileNotFoundException, InterruptedException
	{
		WebDriverWait o = new WebDriverWait(t, 50);
		//Start Transaction
		int ani=789-456-1597;
		int dnis=12256;
		int ssn=3571;
		for(int i=1;i<10;i++){
        	UUID id = UUID.randomUUID();
        	String in=id.toString();
        	System.out.println("Generated activity id is:"+in);
		//modify activity id
		modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","007d0294c6db55a34",in);
		
    		ani=ani+000-000-0001;
			
			String k=String.valueOf(ani);
			String a=("123-123")+(k);
			System.out.println("Generated ani is :"+a);
		// modify ani check
		modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","123-123-1234",a);
		

			dnis=dnis+1;
			String k1=String.valueOf(dnis);
			System.out.println("Genearted dnis is:"+dnis);
		//modify dnis check
			modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","12345",k1);
					
					o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_call']/div[1]/div[2]/label")));
					String check = t.findElement(By.xpath("//*[@id='start_call']/div[1]/div[2]/label")).getText();
					System.out.println(check);

					String data = "";
					try {
						data = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\1111.txt")));
					} catch (IOException e0) {
						e0.printStackTrace();
					}
					System.out.println("Text file as String in Java");
					System.out.println(data);
					String text = data;
					o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_call_value']")));
					WebElement value = t.findElement(By.xpath("//*[@id='start_call_value']"));
					((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value, text);
					WebElement button = t.findElement(By.xpath("//*[@id='start_call']/div[2]/div[2]/input"));
					button.click();
					//re-modify activityid
					modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",in,"007d0294c6db55a34");
					//re-modify ani
					modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",a,"123-123-1234");
					//re-modify dnis
					modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",k1,"12345");
	Thread.sleep(1000);
		
    //transaction
	//modify activity id		
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","007d0294c6db55a34",in);
	//modify ani
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","123-123-1234",a);
	//modify upfrontani
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","123-123-7894",a);
	//modify Streetlightani
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","123-123-0125",a);
	//modify dnis
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","12345",k1);
	//modify upfrontdnis
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","65412",k1);
	//modify Streetlightdnis
	modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","78945",k1);
	ssn=ssn+1;
	String m=String.valueOf(ssn);
	System.out.println("Genearted ssn is:"+ssn);
	//modify ssn
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","1234",m);
	
		String check1 = t.findElement(By.xpath("//*[@id='call_trasaction']/div[1]/div[2]/label")).getText();
		System.out.println(check1);

		String data1 = "";
		try {
			data1 = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\2222.txt")));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Text file as String in Java");
		System.out.println(data1);
		String text1 = data1;
		o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transaction_call_value']")));
		WebElement value1 = t.findElement(By.xpath("//*[@id='transaction_call_value']"));
		((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value1, text1);
		WebElement button1 = t.findElement(By.xpath("//*[@id='call_trasaction']/div[2]/div[2]/input"));
		button1.click();
		//re-modify activity id
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",in,"007d0294c6db55a34");
		//re-modify ani
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",a,"123-123-1234");
		//modify upfrontani
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",a,"123-123-7894");
		//modify Streetlightani
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",a,"123-123-0125");
		//re-modify dnis
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",k1,"12345");
		//modify upfrontdnis
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",k1,"65412");
		//modify Streetlightdnis
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",k1,"78945");
		//re-modify ssn
		modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",m,"1234");
		Thread.sleep(1000);
		
		//end transaction
		//modify activity id		
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt","007d0294c6db55a34",in);
		//modify ani
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt","123-123-1234",a);
		//modify dnis
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt","12345",k1);
		
		String check2 = t.findElement(By.xpath("//*[@id='end_call']/div[1]/div/div[2]/label")).getText();
		System.out.println(check2);

		String data2 = "";
		try {
			data2 = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\3333.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Text file as String in Java");
		System.out.println(data2);
		String text2 = data2;
		o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='end_call_value']")));
		WebElement value2 = t.findElement(By.xpath("//*[@id='end_call_value']"));
		((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value2, text2);
		WebElement button2 = t.findElement(By.xpath("//*[@id='end_call']/div[2]/div[2]/input"));
		button2.click();
		//re-modify activityid
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt",in,"007d0294c6db55a34");
		//re-modify ani
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt",a,"123-123-1234");
		//re-modify dnis
		modifyFile("D:\\github\\Ng\\src\\sources\\3333.txt",k1,"12345");
		Thread.sleep(1000);
		
		
	}
	}
	
	@Test
	public void halftransaction() throws InterruptedException
	{
		WebDriverWait o = new WebDriverWait(t, 50);
		
		
		//Start Transaction
				int ani=789-654-7951;
				int dnis=78945;
				int ssn=5713;
				for(int i=1;i<10;i++){
		        	UUID id = UUID.randomUUID();
		        	String in=id.toString();
		        	System.out.println("Generated activity id is:"+in);
				//modify activity id
				modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","007d0294c6db55a34",in);
				
		    		ani=ani+000-000-0001;
					
					String k=String.valueOf(ani);
					String a=("123-123")+(k);
					System.out.println("Generated ani is :"+a);
				// modify ani check
				modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","123-123-1234",a);
				

					dnis=dnis+1;
					String k1=String.valueOf(dnis);
					System.out.println("Genearted dnis is:"+dnis);
				//modify dnis check
					modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt","12345",k1);
							
							o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_call']/div[1]/div[2]/label")));
							String check = t.findElement(By.xpath("//*[@id='start_call']/div[1]/div[2]/label")).getText();
							System.out.println(check);

							String data = "";
							try {
								data = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\1111.txt")));
							} catch (IOException e0) {
								e0.printStackTrace();
							}
							System.out.println("Text file as String in Java");
							System.out.println(data);
							String text = data;
							o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='start_call_value']")));
							WebElement value = t.findElement(By.xpath("//*[@id='start_call_value']"));
							((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value, text);
							WebElement button = t.findElement(By.xpath("//*[@id='start_call']/div[2]/div[2]/input"));
							button.click();
							//re-modify activityid
							modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",in,"007d0294c6db55a34");
							//re-modify ani
							modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",a,"123-123-1234");
							//re-modify dnis
							modifyFile("D:\\github\\Ng\\src\\sources\\1111.txt",k1,"12345");
			Thread.sleep(1000);
			
			//transaction
			//modify activity id		
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","007d0294c6db55a34",in);
			//modify ani
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","123-123-1234",a);
			//modify upfrontani
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","123-123-7894",a);
			//modify Streetlightani
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","123-123-0125",a);
			//modify dnis
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","12345",k1);
			//modify upfrontdnis
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","65412",k1);
			//modify Streetlightdnis
			modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","78945",k1);
			ssn=ssn+1;
			String m=String.valueOf(ssn);
			System.out.println("Genearted ssn is:"+ssn);
			//modify ssn
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt","1234",m);
			
				String check1 = t.findElement(By.xpath("//*[@id='call_trasaction']/div[1]/div[2]/label")).getText();
				System.out.println(check1);

				String data1 = "";
				try {
					data1 = new String(Files.readAllBytes(Paths.get("D:\\github\\Ng\\src\\sources\\2222.txt")));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.out.println("Text file as String in Java");
				System.out.println(data1);
				String text1 = data1;
				o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transaction_call_value']")));
				WebElement value1 = t.findElement(By.xpath("//*[@id='transaction_call_value']"));
				((JavascriptExecutor) t).executeScript("arguments[0].value = arguments[1];", value1, text1);
				WebElement button1 = t.findElement(By.xpath("//*[@id='call_trasaction']/div[2]/div[2]/input"));
				button1.click();
				//re-modify activity id
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",in,"007d0294c6db55a34");
				//re-modify ani
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",a,"123-123-1234");
				//modify upfrontani
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",a,"123-123-7894");
				//modify Streetlightani
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",a,"123-123-0125");
				//re-modify dnis
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",k1,"12345");
				//modify upfrontdnis
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",k1,"65412");
				//modify Streetlightdnis
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",k1,"78945");
				//re-modify ssn
				modifyFile("D:\\github\\Ng\\src\\sources\\2222.txt",m,"1234");
				Thread.sleep(1000);
				
				t.get("http://192.168.1.40:8080/CXiReport/Report.jsp");
				}
		
	}
	@Before
	public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\github\\Ng\\src\\sources\\chromedriver.exe");
		//System.setProperty("phantomjs.binary.path", "D:\\github\\Ng\\src\\sources\\phantomjs.exe");		
         t=new ChromeDriver();
         //t = new PhantomJSDriver();
		t.manage().window().maximize();
		t.get("http://192.168.1.40:8080/CXiReport_v1.2/");
		Thread.sleep(2000);
	}
	@After
	public void afterTest() {
    t.close();
	}
	
	
 static void modifyFile(String filePath, String oldString, String newString) {
	 
		File fileToBeModified = new File(filePath);

		String oldContent = "";

		BufferedReader reader = null;

		FileWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));

			// Reading all the lines of input text file into oldContent

			String line = reader.readLine();

			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();

				line = reader.readLine();
			}

			// Replacing oldString with newString in the oldContent

			String newContent = oldContent.replaceAll(oldString, newString);

			// Rewriting the input text file with newContent

			writer = new FileWriter(fileToBeModified);

			writer.write(newContent);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Closing the resources

				reader.close();

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	
 }
}
