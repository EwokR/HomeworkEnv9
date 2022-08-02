package com.example.homeworkenv9;

import com.example.homeworkenv9.IntegerList;
import com.example.homeworkenv9.IntegerListImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class IntegerListTest {

    private final IntegerListImpl integerList = new IntegerListImpl();

    @Test
    public void addItemTest() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThat(integerList.add(1));
    }

    @Test
    public void addNullItemTest() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(null));

    }

    @Test
    public void addItemCapacityTest() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);
        integerList.add(15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(16));
    }

    @Test
    public void addIndexTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThat(integerList.add(0, 1));
    }

    @Test
    public void addIndexTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(-1, 1));
    }

    @Test
    public void addNullIndexTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(3, null));
    }

    @Test
    public void addNullIndexTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThat(integerList.add(0, 1));
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(0, null));
    }

    @Test
    public void addIndexItemCapacityTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(15, 16));
    }

    @Test
    public void addIndexItemCapacityTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.add(14, 16));
    }

    @Test
    public void setTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> integerList.set(0,null));
    }

    @Test
    public void setTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> integerList.set(-1, 0));
    }

    @Test
    public void setTest3() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.set(16,8));
    }

    @Test
    public void removeItemTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.remove(16));
    }

    @Test
    public void removeItemTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.remove(null));
    }

    @Test
    public void removeIndexTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.remove(-1));
    }

    @Test
    public void removeIndexTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.remove(16));
    }

    @Test
    public void containsTest() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.contains(null));
    }

    @Test
    public void indexOfTest() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.indexOf(null));
    }

    @Test
    public void lastIndexOf() {
        IntegerListImpl integerList = new IntegerListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.indexOf(null));
    }

    @Test
    public void getTest1() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.get(-1));
    }

    @Test
    public void getTest2() {
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2,3);
        integerList.add(3, 4);
        integerList.add(4, 5);
        integerList.add(5, 6);
        integerList.add(6, 7);
        integerList.add(7, 8);
        integerList.add(8, 9);
        integerList.add(9, 10);
        integerList.add(10, 11);
        integerList.add(11, 12);
        integerList.add(12, 13);
        integerList.add(13, 14);
        integerList.add(14, 15);
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->integerList.get(16));
    }
}

