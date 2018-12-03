package testingWithString;

public class Bar {
    private FooInterface foo;

    public Bar(FooInterface foo) {
        this.foo = foo;
    }

    public String barWork(String parameter){
        return foo.foo(parameter);
    }
}
