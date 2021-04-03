import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class TestCase {
    @BeforeSuite
    public void methodBefore() {
        System.out.println("TestCase.methodBefore");
    }

    @AfterSuite
    public void methodAfter() {
        System.out.println("TestCase.methodAfter");
    }

    @Test(priority = 3)
    public void methodTest1() {
        System.out.println("TestCase.methodTest1 priority 3 ");
    }

    @Test(priority = 7)
    public void methodTest2() {
        System.out.println("TestCase.methodTest2 priority 7 ");
    }

    @Test(priority = 5)
    public void methodTest3() {
        System.out.println("TestCase.methodTest3 priority 5 ");
    }

    @Test(priority = 2)
    public void methodTest4() {
        System.out.println("TestCase.methodTest4 priority 2 ");
    }

}
