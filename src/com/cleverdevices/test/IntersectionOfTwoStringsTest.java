package com.cleverdevices.test;

import com.cleverdevices.utility.StringUtility;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoStringsTest {

    private StringUtility stringUtility;

    @Before
    public void runBeforeTestMethod() {
        stringUtility = new StringUtility();
    }

    @Test
    public void testIntersectionOfMultiWordString() {
        String TEST_STRING_1 = "This is a test String";
        String TEST_STRING_2 = "This is ";
        String reverse = stringUtility.findIntersectionOfTwoStrings(TEST_STRING_1, TEST_STRING_2);
        assertEquals(reverse, "This is ");
    }

    @Test
    public void testIntersectionOfStringWithNoMatches() {
        String TEST_STRING_1 = "This is a test String";
        String TEST_STRING_2 = "ABCDDD";
        String reverse = stringUtility.findIntersectionOfTwoStrings(TEST_STRING_1, TEST_STRING_2);
        assertEquals(reverse, "");
    }

    @Test
    public void testIntersectionOfNullAndEmptyString() {
        String TEST_STRING_1 = "This is a test String";
        String reverse = stringUtility.findIntersectionOfTwoStrings(TEST_STRING_1, null);
        assertEquals(reverse, "");
        reverse = stringUtility.findIntersectionOfTwoStrings(TEST_STRING_1, "");
        assertEquals(reverse, "");
    }

}