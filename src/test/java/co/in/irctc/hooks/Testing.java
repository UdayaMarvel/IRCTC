package co.in.irctc.hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testing {

	public static void main(String[] args) {
		File file = new File("D:\\Workspace\\IRCTC\\src\\test\\resources\\GlobalSettings.properties");
		try {
			FileOutputStream fo = new FileOutputStream(file);
			Properties prop = new Properties();
			prop.setProperty("default", "edge");
			prop.save(fo, "Updated default");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
