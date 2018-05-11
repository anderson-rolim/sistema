package sistema;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sistema.estudo;
public class estudoTests {

	
	@Test(priority=1)
	public void estudoTestandoClassMainTest(){
		
		Assert.assertEquals(sistema.estudo.CreateMessage(),"Teste de conexão");
		System.out.println(sistema.estudo.CreateMessage());
	}

	
	
}
