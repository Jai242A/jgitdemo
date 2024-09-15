import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		
		System.out.println("Iam here");

	}
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run before");
	}

}
