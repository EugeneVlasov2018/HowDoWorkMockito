package testingWithVoid;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class BarVoidTest {
    private BarVoid bar;
    private FooVoid foo;

    @Before
    public void setUp() throws Exception {
        foo = mock(FooVoid.class);
        bar = new BarVoid(foo);
    }

    @Test
    public void barWork() {
        doNothing().when(foo).foo("qwe");
        bar.barWork("qwe");
        verify(foo).foo("qwe");
    }



    //работа с выбросом екзепшена
    @Test(expected = Exception.class)
    public void barWorkWithException(){
        doThrow(new Exception()).when(foo).foo("abc");
        doNothing().when(foo).foo(anyString());

        bar.barWork("qwe");
        verify(foo).foo("qwe");

        bar.barWork("abc");
    }
}