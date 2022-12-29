package br.com.guifr.hackerrank.preparationkit.threemonth.weekeleven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonChildTest {

    @Test
    @DisplayName("Return 3 When commonChild Given s1='ABCD' s2='ABDC'")
    void test1() {
        String s1 = "ABCD";
        String s2 = "ABDC";
        int result = CommonChild.with(s1,s2);
        assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 2 When commonChild Given s1='HARRY' s2='SALLY'")
    void test2() {
        String s1 = "HARRY";
        String s2 = "SALLY";
        int result = CommonChild.with(s1,s2);
        assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 0 When commonChild Given s1='AA' s2='BB'")
    void test3() {
        String s1 = "AA";
        String s2 = "BB";
        int result = CommonChild.with(s1,s2);
        assertEquals(0,result);
    }

    @Test
    @DisplayName("Return 2 When commonChild Given s1='OUDFRMYMAW' s2='AWHYFCCMQX'")
    void test4() {
        String s1 = "OUDFRMYMAW";
        String s2 = "AWHYFCCMQX";
        int result = CommonChild.with(s1,s2);
        assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 3 When commonChild Given s1='SHINCHAN' s2='NOHARAAA'")
    void test5() {
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        int result = CommonChild.with(s1,s2);
        assertEquals(3,result);
    }

    @Test
    @DisplayName("Return 15 When commonChild Given s1='WEWO...' s2='FDA...'")
    void test6() {
        String s1 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
        String s2 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";
        int result = CommonChild.with(s1,s2);
        assertEquals(15,result);
    }

    @Test
    @DisplayName("Return 15 When commonChild strings changed Given s1='WEWO...' s2='FDA...'")
    void test7() {
        String s2 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
        String s1 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";
        int result = CommonChild.with(s1,s2);
        assertEquals(15,result);
    }

    @Test
    @DisplayName("Return 2 When commonChild Given s1='ABCDEF' s2='FBDAMN'")
    void test8() {
        String s1 = "ABCDEF";
        String s2 = "FBDAMN";
        int result = CommonChild.with(s1,s2);
        assertEquals(2,result);
    }

    @Test
    @DisplayName("Return 27 When commonChild Given s1='ELGG...' s2='FRVI...'")
    void test9() {
        String s1 = "ELGGYJWKTDHLXJRBJLRYEJWVSUFZKYHOIKBGTVUTTOCGMLEXWDSXEBKRZTQUVCJNGKKRMUUBACVOEQKBFFYBUQEMYNENKYYGUZSP";
        String s2 = "FRVIFOVJYQLVZMFBNRUTIYFBMFFFRZVBYINXLDDSVMPWSQGJZYTKMZIPEGMVOUQBKYEWEYVOLSHCMHPAZYTENRNONTJWDANAMFRX";
        int result = CommonChild.commonChild(s1,s2);
        assertEquals(27,result);
    }

    @Test
    @DisplayName("Return 3 When commonChild Given s1='ADBC' s2='ABC'")
    void test10() {
        String s1 = "ADBC";
        String s2 = "ABC";
        int result = CommonChild.commonChild(s1,s2);
        assertEquals(3,result);
    }


    @Test
    @DisplayName("Return 'ABC' When cleanString Given s1='ABCDEFUIP' s2='OQMNTGABC'")
    void testCleanString1() {
        String s1 = "ABCDEFUIP";
        String s2 = "OQMNTGABC";
        String result = CommonChild.cleanString(s1,s2);
        assertEquals("ABC",result);
    }

    @Test
    @DisplayName("Return 'AC' When cleanString Given s1='AWCDEF' s2='CAMNTG'")
    void testCleanString2() {
        String s1 = "AWCDEF";
        String s2 = "CAMNTG";
        String result = CommonChild.cleanString(s1,s2);
        assertEquals("AC",result);
    }

    @Test
    @DisplayName("Return 'ABCDA' When cleanString Given s1='ABCDEFAVBN' s2='ODMNTGTBCA'")
    void testCleanString3() {
        String s1 = "ABCDEFAVPU";
        String s2 = "ODMNTGTBCA";
        String result = CommonChild.cleanString(s1,s2);
        assertEquals("ABCDA",result);
    }

}