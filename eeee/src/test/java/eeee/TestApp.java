package eeee;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestApp
{


    @BeforeClass
    public void AppTest( )
    {
        System.out.println("00000000000000000");
    }

    @Test
    public void one()
    {
        System.out.println("111111111111111");
    }

    @Test
    public void two()
    {
        System.out.println("2222222222222222");
    }
}
