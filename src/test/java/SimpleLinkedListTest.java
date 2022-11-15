import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.*;


public class SimpleLinkedListTest {

    @Test
    public void testInitialization() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    public void testAdd() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
            assertThat(list.size()).isEqualTo(i+1);
        }
    }

    @Test
    public void testIterator() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        int counter = 0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            assertThat(iterator.next()).isEqualTo(counter);
            counter++;
        }

        assertThat(counter).isEqualTo(10);
    }

    @Test
    public void testEmptyIterator() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        assertThat(list.iterator().hasNext()).isEqualTo(false);
    }

    @Test
    public void testRemove() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        ThrowableAssert.ThrowingCallable callable = () -> list.iterator().remove();
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(callable);
    }
}
