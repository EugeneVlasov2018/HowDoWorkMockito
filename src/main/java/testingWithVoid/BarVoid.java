package testingWithVoid;

public class BarVoid {
    private FooVoid foo;

    public BarVoid(FooVoid foo) {
        this.foo = foo;
    }

    public void barWork(String parameter){
        foo.foo(parameter);
    }
}
