package com.stackextend.unittestjsonassertexample;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class AssertJsonExampleTests {

    @Test
    public void should_be_equals_when_is_same_objects_and_strict_mode_test() throws JSONException {

        final String expected =
                "{" +
                        "'id' : '123456'," +
                        "'name' : 'Toto'" +
                "}";
        final  String actual =
                "{" +
                        "'id' : '123456'," +
                        "'name' : 'Toto'" +
                "}";
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.STRICT);
    }

    @Test
    public void should_not_be_equals_when_is_not_same_objects_and_strict_mode_test() throws JSONException {

        final String expected =
                "{" +
                        "'id' : '123456'," +
                        "'name' : 'Toto'" +
                "}";
        final  String actual =
                "{" +
                        "'id' : '456789'," +
                        "'name' : 'Tata'" +
                "}";
        JSONAssert.assertNotEquals(expected, actual, JSONCompareMode.STRICT);
    }

    @Test
    public void should_be_equals_when_is_different_fields_order_and_strict_mode_test() throws JSONException {

        final String expected =
                "{" +
                        "'name' : 'Toto'," +
                        "'id' : '123456'" +
                "}";
        final  String actual =
                "{" +
                        "'id' : '123456'," +
                        "'name' : 'Toto'" +
                "}";
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.STRICT);
    }

    @Test
    public void should_be_equals_when_adding_other_fields_and_lenient_mode_test() throws JSONException {

        final String expected =
                "{" +
                        "'id' : '123456'," +
                        "'name' : 'Toto'" +
                "}";
        final  String actual =
                "{" +
                        "'id' : '123456'," +
                        "'name' : 'Toto'," +
                        "'age': 27" +
                "}";
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.LENIENT);
    }

    @Test
    public void should_be_equals_when_is_different_array_order_and_lenient_mode_test() throws JSONException {

        final String expected =
                "{" +
                        "'array' : [1, 2, 3, 4]" +
                "}";
        final  String actual =
                "{" +
                        "'array' : [4, 3, 2, 1]" +
                "}";
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.LENIENT);
    }

    @Test
    public void should_not_be_equals_when_is_different_array_order_and_strict_mode_test() throws JSONException {

        final String expected =
                "{" +
                        "'array' : [1, 2, 3, 4]" +
                "}";
        final  String actual =
                "{" +
                        "'array' : [4, 3, 2, 1]" +
                "}";
        JSONAssert.assertNotEquals(expected, actual, JSONCompareMode.STRICT);
    }
}
