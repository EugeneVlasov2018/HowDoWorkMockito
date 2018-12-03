import testingWithString.FooInterface;
import testingWithVoid.FooVoid;

public class GeneralBar {
    private FooInterface fooString;
    private FooVoid fooVoid;

    public GeneralBar(FooInterface fooString, FooVoid fooVoid) {
        this.fooString = fooString;
        this.fooVoid = fooVoid;
    }

    public void barWork(String parameter){
        fooString.foo(parameter);
        fooVoid.foo(parameter);
    }
}
