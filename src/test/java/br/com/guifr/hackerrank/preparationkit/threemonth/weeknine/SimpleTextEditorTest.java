package br.com.guifr.hackerrank.preparationkit.threemonth.weeknine;

import br.com.guifr.hackerrank.preparationkit.threemonth.weeknine.SimpleTextEditor.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTextEditorTest {


    @Test
    @DisplayName("Return ['f','g','d'] When operate in string Given ops=['1 abcde','1 fg',...]")
    void test1() {

        List<String> ops = List.of("1 abcde","1 fg","3 6","2 5","4","3 7","4","3 4");

        List<String> result = SimpleTextEditor.with(ops);

        assertEquals(3,result.size(),"Result has 3 elements");
        assertEquals("f",result.get(0),"First element is 'f'");
        assertEquals("g",result.get(1),"First element is 'g'");
        assertEquals("d",result.get(2),"First element is 'd'");

    }

    @Test
    @DisplayName("Return ['c','y','a'] When operate in string Given ops=['1 abc','3 3',...]")
    void test2() {

        List<String> ops = List.of("1 abc","3 3","2 3","1 xy","3 2","4","4","3 1");

        List<String> result = SimpleTextEditor.with(ops);

        assertEquals(3,result.size(),"Result has 3 elements");
        assertEquals("c",result.get(0),"First element is 'c'");
        assertEquals("y",result.get(1),"First element is 'y'");
        assertEquals("a",result.get(2),"First element is 'a'");

    }

    @Test
    @DisplayName("Return ProcessTypeAppend When choiceProcess Given type='1'")
    void choiceProcess() {
        ProcessText result = SimpleTextEditor.choiceProcess("1");
        assertEquals(ProcessTypeAppend.class,result.getClass());
    }

    @Test
    @DisplayName("Return ProcessTypeDelete When choiceProcess Given type='2'")
    void choiceProcess2() {
        ProcessText result = SimpleTextEditor.choiceProcess("2");
        assertEquals(ProcessTypeDelete.class,result.getClass());
    }

    @Test
    @DisplayName("Return ProcessTypePrint When choiceProcess Given type='3'")
    void choiceProcess3() {
        ProcessText result = SimpleTextEditor.choiceProcess("3");
        assertEquals(ProcessTypePrint.class,result.getClass());
    }

    @Test
    @DisplayName("Return ProcessTypeUndo When choiceProcess Given type='4'")
    void choiceProcess4() {
        ProcessText result = SimpleTextEditor.choiceProcess("4");
        assertEquals(ProcessTypeUndo.class,result.getClass());
    }

    @Test
    @DisplayName("Return 'de' stack=[''] When process '1 de' with ProcessTypeAppend Given result=new")
    void processTypeAppend1() {
        ProcessText process = SimpleTextEditor.choiceProcess("1");

        ResultSimpleTextEditor result = new ResultSimpleTextEditor();
        process.execute("1 de",result);

        Assertions.assertEquals(1,result.lengthStack(),"Length stack is 1");
        Assertions.assertEquals("de",result.getString(),"S is 'de'");
    }

    @Test
    @DisplayName("Return 'ab' stack=['','abcde'] When process '2 3' with ProcessTypeDelete Given result s='abcde'")
    void ProcessTypeDelete1() {
        ProcessText process = SimpleTextEditor.choiceProcess("2");

        ResultSimpleTextEditor result = new ResultSimpleTextEditor();
        result.appendText("abcde");
        process.execute("2 3",result);

        Assertions.assertEquals(2,result.lengthStack(),"Length stack is 2");
        Assertions.assertEquals("ab",result.getString(),"S is 'ab'");
    }

    @Test
    @DisplayName("Return 'c' stack=['','abcde'] When process '3 3' with ProcessTypePrint Given result s='abcde'")
    void processTypePrint1() {
        ProcessText process = SimpleTextEditor.choiceProcess("3");

        ResultSimpleTextEditor result = new ResultSimpleTextEditor();
        result.appendText("abcde");
        process.execute("3 3",result);

        Assertions.assertEquals(1,result.lengthStack(),"Length stack is 1");
        Assertions.assertEquals("abcde",result.getString(),"S is 'abcde'");
        Assertions.assertEquals(1,result.getPrints().size(),"List has 1 size");
        Assertions.assertEquals("c",result.getPrints().get(0),"First print is 'c'");
    }

    @Test
    @DisplayName("Return stack=['abc'] When process '4' with ProcessTypeUndo Given result stack='abc'")
    void processTypeUndo1() {
        ProcessText process = SimpleTextEditor.choiceProcess("4");

        ResultSimpleTextEditor result = new ResultSimpleTextEditor();
        result.addInStack("abc");
        process.execute("4",result);

        Assertions.assertEquals(0,result.lengthStack(),"Length stack is 0");
        Assertions.assertEquals("abc",result.getString(),"S is 'abc'");
        Assertions.assertEquals(0,result.getPrints().size(),"List has 0 size");
    }

}