package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import net.bytebuddy.jar.asm.ByteVector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {

    @Test
    @DisplayName("Return [2,0] When processOpetarions Given ['add hack', 'add hackerrank', 'find hac', 'find hak']")
    void test1() {
        List<List<String>> operations = new ArrayList<>();
        operations.add(List.of("add","hack"));
        operations.add(List.of("add","hackerrank"));
        operations.add(List.of("find","hac"));
        operations.add(List.of("find","hak"));
        List<Integer> result = Contacts.process(operations);
        Assertions.assertEquals(2,result.size());
        Assertions.assertEquals(2,result.get(0));
        Assertions.assertEquals(0,result.get(1));
    }

    @Test
    @DisplayName("Return [2,0] When processOpetarions Given ['add hack', 'add hackerrank', 'find hac', 'find hak']")
    void test2() {
        List<List<String>> operations = new ArrayList<>();
        operations.add(List.of("add","hack"));
        operations.add(List.of("add","hackerrank"));
        operations.add(List.of("find","hac"));
        operations.add(List.of("find","hak"));
        List<Integer> result = Contacts2.process(operations);
        Assertions.assertEquals(2,result.size());
        Assertions.assertEquals(2,result.get(0));
        Assertions.assertEquals(0,result.get(1));
    }
}