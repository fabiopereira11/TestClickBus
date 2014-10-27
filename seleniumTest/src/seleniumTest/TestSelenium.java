package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.clickbus.com.br");
		
		WebElement origem = driver.findElement(By.id("originPlace"));
		WebElement destino = driver.findElement(By.id("destinationPlace"));
		WebElement dataPartida = driver.findElement(By.id("departureDate"));
		WebElement dataRetorno = driver.findElement(By.id("returnDate"));
		WebElement search = driver.findElement(By.id("btn-search"));
		
		
		origem.sendKeys("Sao Paulo, SP - TODOS");
		destino.sendKeys("Campinas, SP");
		dataPartida.sendKeys("31/10/2014");
		dataRetorno.sendKeys("20/11/2014");
		
		search.submit();
		
//		driver.close();
		
	}

}
