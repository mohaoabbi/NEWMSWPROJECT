package WedClass.com.mcalculator;

import org.testng.annotations.Test;

public class testHome extends Home{

	@Test()
	
	public void testposhomeval() {
		
		homeval("600000");	
	}
    @Test()
	
	public void testneghomeval() {
		
		homeval("alt");	
	}
	
}
