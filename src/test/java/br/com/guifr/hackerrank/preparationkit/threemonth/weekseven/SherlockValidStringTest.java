package br.com.guifr.hackerrank.preparationkit.threemonth.weekseven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SherlockValidStringTest {

    @Test
    @DisplayName("Return 'YES' When string is valid With 'abc'")
    public void test1() {
        String isValid = SherlockValidString.printIsValid("abc");
        Assertions.assertEquals("YES",isValid);
    }

    @Test
    @DisplayName("Return 'YES' When string is valid With 'abcc'")
    public void test2() {
        String isValid = SherlockValidString.printIsValid("abcc");
        Assertions.assertEquals("YES",isValid);
    }

    @Test
    @DisplayName("Return 'NO' When string is valid With 'abccc'")
    public void test3() {
        String isValid = SherlockValidString.printIsValid("abccc");
        Assertions.assertEquals("NO",isValid);
    }

    @Test
    @DisplayName("Return 'NO' When string is valid With 'aabbcd'")
    public void test4() {
        String isValid = SherlockValidString.printIsValid("aabbcd");
        Assertions.assertEquals("NO",isValid);
    }

    @Test
    @DisplayName("Return 'NO' When string is valid With 'aabbcccddd'")
    public void test5() {
        String isValid = SherlockValidString.printIsValid("aabbcccddd");
        Assertions.assertEquals("NO",isValid);
    }

    @Test
    @DisplayName("Return 'YES' When string is valid With 'ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcg'")
    public void test6() {
        String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        String isValid = SherlockValidString.printIsValid(s);
        Assertions.assertEquals("YES",isValid);
    }

}