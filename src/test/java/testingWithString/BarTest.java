package testingWithString;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class BarTest {
    private FooInterface foo;
    private Bar bar;

    @Before
    public void setUp() throws Exception {
        foo = mock(FooInterface.class);
        bar = new Bar(foo);
    }

    //запускаем barWork("qwe")и проверяем, запустился ли foo.foo с этими же параметрами
    @Test
    public void barWork() {
        bar.barWork("qwe");
        verify(foo).foo("qwe");
    }

    //то же, только с подменой возврата
    @Test
    public void barWork1(){
        when(foo.foo("abc")).thenReturn("подмена!!!");
        bar.barWork("abc");
        assertEquals("подмена!!!",bar.barWork("abc"));
    }
}