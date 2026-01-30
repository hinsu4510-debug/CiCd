package Automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automate1 {

	public static void main(String[] args) {
		
		// vtiger automation
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		By x=By.name("user_name");
		WebElement y=driver.findElement(x);
		y.sendKeys("admin");
		By z=By.name("user_password");
		WebElement a=driver.findElement(z);
		a.sendKeys("0000");
		
		By v=By.id("submitButton");
		WebElement c=driver.findElement(v);
		c.click();
		By bycontact=By.linkText("Contacts");
		WebElement wecont=driver.findElement(bycontact);
		wecont.click();
		By oppo=By.xpath("//a[text()='Opportunities']");
		WebElement weop=driver.findElement(oppo);
		weop.click();
		/*By bylead=By.linkText("Leads");
		WebElement welead=driver.findElement(bylead);
		welead.click();
		By byname=By.name("search_text");
		WebElement wename=driver.findElement(byname);
		wename.sendKeys("LEA12");
		//By idby=By.xpath("//select[name='search_field']");
		//WebElement weid=driver.findElement(idby);
		//weid.click();
	   By vsub= By.name("submit");
		WebElement wesub=driver.findElement(vsub);
		wesub.click();
		By Eby=By.id("alpha_5");
		WebElement Ewe=driver.findElement(Eby);
		Ewe.click();
		By plus=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement weplus=driver.findElement(plus);
		weplus.click();
		By bynamee=By.name("firstname");
		WebElement wenaame=driver.findElement(bynamee);
		wenaame.sendKeys("Shivansh");
		By bylstname=By.name("lastname");
		WebElement welastname=driver.findElement(bylstname);
		welastname.sendKeys("Pal");
		By mob=By.id("mobile");
		WebElement wemob=driver.findElement(mob);
		wemob.sendKeys("8932016545");
		By compname=By.name("company");
		WebElement wecomp=driver.findElement(compname);
		wecomp.sendKeys("terrain ");
		By savebutt= By.name("button");
		WebElement webutt=driver.findElement(savebutt);
		webutt.click();
		By aplus=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement wweplus=driver.findElement(aplus);
		wweplus.click();
		By bynlead=By.linkText("Leads");
		WebElement wenlead=driver.findElement(bynlead);
		wenlead.click();
		By del=By.linkText("edit");
		WebElement wedel=driver.findElement(del);
		wedel.click();
		By bynnlead=By.linkText("Leads");
		WebElement wennlead=driver.findElement(bynnlead);
		wennlead.click();
		By arrw=By.name("viewname");
		WebElement wearrw=driver.findElement(arrw);
		wearrw.click();
		By byn1lead=By.linkText("This MonthsLeads");
		WebElement wen1lead=driver.findElement(byn1lead);
		wen1lead.click(); */
		/*By atti=By.xpath("//input[@name='submit']");
		WebElement weatti=driver.findElement(atti);
		String aaa=weatti.getAttribute("onclick");
		System.out.println(aaa);
		By nan=By.xpath("//b[text()='Search for']");
		WebElement wenan=driver.findElement(nan);
		String nameee=wenan.getText();
		System.out.println(nameee);
		By pro=By.xpath("//a[text()='Products']");
		WebElement wepro=driver.findElement(pro);
		String textprod=wepro.getText();
		System.out.println(textprod);
		String att=wepro.getAttribute("href");
		System.out.println(att);
		wepro.click();
		
		
		//facebook automation
       /* System.out.println("hii");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		By h=By.name("email");
		WebElement u=driver.findElement(h);
		u.sendKeys("8960244890");
		By ps=By.name("pass");
		WebElement wepss=driver.findElement(ps);
		wepss.sendKeys("dfg");
		By lg=By.name("login");
		WebElement lgg=driver.findElement(lg);
		lgg.click();*/
		
	   // By t=By.linkText("Forgotten password?");
		//WebElement tt=driver.findElement(t);
		//tt.click();
		/*By b=By.linkText("Create new account");
		WebElement bb=driver.findElement(b);
		bb.click();  */ 
		
		
	

	}

}
