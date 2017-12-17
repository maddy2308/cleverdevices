package com.cleverdevices.test;

import com.cleverdevices.utility.datastructures.MyStackImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStackImplTest {

    // We could create different type of stacks to test.
    private MyStackImpl<String> myStringStack;
    private final String ONE_ELEMENT = "test";
    private final String SECOND_ELEMENT = "test2";

    @Before
    public void runBeforeTestMethod() {
        myStringStack = new MyStackImpl<>();
    }

    @Test
    public void testEmptyStringStack() {
        assertTrue("Check Empty Stack", myStringStack.isEmpty());
    }

    @Test
    public void testPushOneStringElementStack() {
        myStringStack.push(ONE_ELEMENT);
        assertEquals(myStringStack.size(), 1);
    }

    @Test
    public void testPushMultiStringElementStack() {
        myStringStack.push(ONE_ELEMENT);
        myStringStack.push(SECOND_ELEMENT);
        assertEquals(myStringStack.size(), 2);
    }

    @Test
    public void testPopOneStringElementStack() {
        myStringStack.push(ONE_ELEMENT);
        String data = myStringStack.pop();
        assertEquals(data, ONE_ELEMENT);
    }

    @Test
    public void testPopMultiStringElementStack() {
        myStringStack.push(ONE_ELEMENT);
        myStringStack.push(SECOND_ELEMENT);
        String data = myStringStack.pop();
        assertEquals(data, SECOND_ELEMENT);
        data = myStringStack.pop();
        assertEquals(data, ONE_ELEMENT);
    }

    @Test
    public void testSizeOfMultiStringElementStack() {
        myStringStack.push(ONE_ELEMENT);
        myStringStack.push(SECOND_ELEMENT);
        assertEquals(myStringStack.size(), 2);
        myStringStack.pop();
        assertEquals(myStringStack.size(), 1);
    }

}