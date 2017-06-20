import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by LiXuan on 2017/6/19.
 */
public class TestHelloWorld {
    @Test()
    @Parameters("test1")
    public void method(String test1){
     System.out.println("Hello"+test1);
    }
}
