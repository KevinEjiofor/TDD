package stringBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UndoStringBuilderTest {
    UndoStringBuilder builder;

    @BeforeEach
    public void startWith(){
        builder = new UndoStringBuilder("WelcomeGeeks");
    }
    @Test
    public void testAppendMethod(){

        builder.append(" to be or not to be");
        assertEquals("WelcomeGeeks to be or not to be", builder.toString());

    }

    @Test
    public void testDeleteMethod() {

        builder.delete(2, 8);

        String result = builder.toString();

        assertEquals("Weeeks", result);


    }
    @Test
    public void testDeleteException(){
        assertThrows(IllegalArgumentException.class,()->builder.delete(-2,14));

        String result = builder.toString();

        assertEquals("WelcomeGeeks", result);


    }

    @Test
    public void testInsertMethod(){

        builder.insert(1, " ");

        String result = builder.toString();

        assertEquals("W elcomeGeeks", result);

    }

    @Test
    public void testInsertMethodException(){

        assertThrows(IllegalArgumentException.class,()->builder.insert(-2,"e"));

        String result = builder.toString();

        assertEquals("WelcomeGeeks", result);

    }

    @Test
    public void testReplaceMethod() {

        builder.replace(1,7, "e are ");

        String result = builder.toString();

        String expected = "We are Geeks";

        assertEquals(expected, result);

    }
    @Test
    public void testReplaceMethodException() {

       assertThrows(IllegalArgumentException.class,()-> builder.replace(12, 15, "e are "));
        String result = builder.toString();

        String expected = "WelcomeGeeks";

        assertEquals(expected, result);
    }

    @Test
    public void testReverse(){
        builder.reverse();

        String result = builder.toString();

        String expected = "skeeGemocleW";

        assertEquals(result, expected);


    }
    @Test
    public void testAppendUndoMethod(){

        builder.append(" to be or not to be");
        assertEquals("WelcomeGeeks to be or not to be", builder.toString());

         builder.undo();

        String expected  = "WelcomeGeeks";

        assertEquals(expected,builder.toString());

    }
    @Test
    public void testUndoReplace() {
//        UndoStringBuilder builder = new UndoStringBuilder("apple");
        builder.replace(1, 3, "ear");
        assertEquals("WearcomeGeeks", builder.toString());

        builder.undo();
        assertEquals("WelcomeGeeks", builder.toString());
    }

    @Test
    public void testUndoDelete()  {

        builder.delete(2, 8);

        String result = builder.toString();
        assertEquals("Weeeks", result);

        builder.undo();

        String expected = "WelcomeGeeks";
        assertEquals(expected,builder.toString());

    }

    @Test
    public void testUndo(){
        builder.delete(2, 8);

        String result = builder.toString();
        assertEquals("Weeeks", result);

        builder.delete(1, 3);

        String excepted = builder.toString();
        assertEquals("Weks", excepted);

        builder.undo();

        String expected = "Weeeks";
        assertEquals(expected,builder.toString());

    }

    @Test
    public void testUndoReverseMethod(){
        builder.reverse();

        String result = builder.toString();

        String expected = "skeeGemocleW";
        assertEquals(result, expected);

        builder.undo();
        String actual = "WelcomeGeeks";

        assertEquals(actual, builder.toString());


    }

@Test
    public void testAllMethodsAndUndo(){
    UndoStringBuilder usb = new UndoStringBuilder();

    usb.append("to be or not to be");
    assertEquals("to be or not to be", usb.toString());
    usb.replace(3, 5, "eat");
    assertEquals("to eat or not to be", usb.toString());
    usb.replace(17, 19, "eat");
    assertEquals("to eat or not to eat", usb.toString());
    usb.reverse();
    assertEquals("tae ot ton ro tae ot", usb.toString());




    usb.undo();
   assertEquals("to eat or not to eat",usb.toString());
    usb.undo();
   assertEquals("to eat or not to be",usb.toString());
    usb.undo();
    assertEquals("to be or not to be",usb.toString());



}




}