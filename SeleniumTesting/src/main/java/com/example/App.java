package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
 
{
	public static void main(String arg[])
	{
	
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.google.com");
		ch.manage().window().maximize();
		ch.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("ajio");
		ch.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		ch.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div[1]/span")).click();
		ch.findElement(By.xpath("//*[@id=\"loginAjio\"]")).click();
		
	    ch.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")).sendKeys("8106611096");
	    
		ch.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input")).click();
		}
}
