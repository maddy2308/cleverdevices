package com.cleverdevices.test;

import com.cleverdevices.utility.StringUtility;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReverseWordsUtilityTest {

    private StringUtility stringUtility;

    @Before
    public void runBeforeTestMethod() {
        stringUtility = new StringUtility();
    }

    @Test
    public void testReversalOfMultiString() {
        String TEST_STRING_MULTI_WORDS = "This is a test String";
        String reverse = stringUtility.reverseOrderOfWords(TEST_STRING_MULTI_WORDS);
        assertEquals(reverse, "String test a is This");
    }

    @Test
    public void testReversalOfSingleWordString() {
        String TEST_STRING_SINGLE_WORD = "This";
        String reverse = stringUtility.reverseOrderOfWords(TEST_STRING_SINGLE_WORD);
        assertEquals(reverse, "This");
    }

    @Test
    public void testReversalOfEmptyAndNullString() {
        String EMPTY = "";
        String reverse = stringUtility.reverseOrderOfWords(EMPTY);
        assertEquals(reverse, "");

        String NULL_STRING= null;
        reverse = stringUtility.reverseOrderOfWords(NULL_STRING);
        assertNull(reverse);
    }


}