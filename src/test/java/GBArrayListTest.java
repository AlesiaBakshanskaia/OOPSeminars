import gb.list.GBArrayList;
import gb.list.GBList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GBArrayListTest {
    @Test
    public void addTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(5);
        Assertions.assertEquals(5, list.get(0));
    }
    @Test
    public void addNegativeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(5);
        Assertions.assertNotEquals(7, list.get(0));
    }
    @Test
    public void getTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.add(3);
        Assertions.assertEquals(3, list.get(1));
    }
    @Test
    public void getNegativeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.add(3);
        Assertions.assertNotEquals(2, list.get(1));
    }
    @Test
    public void updateTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.update(0, 7);
        Assertions.assertEquals(7, list.get(0));
    }
    @Test
    public void updatetNegativeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.update(0, 7);
        Assertions.assertNotEquals(8, list.get(0));
    }
    @Test
    public void sizeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.add(5);
        list.add(1);
        Assertions.assertEquals(3, list.size());
    }
    @Test
    public void sizeNegativeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.add(5);
        list.add(1);
        Assertions.assertNotEquals(4, list.size());
    }
    @Test
    public void removeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.add(5);
        list.add(1);
        list.remove(1);
        Assertions.assertEquals(1, list.get(1));
    }
    @Test
    public void removeNegativeTest() {
        GBList<Integer> list = new GBArrayList();
        list.add(10);
        list.add(5);
        list.add(1);
        list.remove(1);
        Assertions.assertNotEquals(5, list.get(1));
    }
}
