package br.com.guifr.hackerrank.preparationkit.threemonth.weektwelve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



class MergingCommunitiesTest {

    MergingCommunities mergingCommunities;

    @Test
    @DisplayName("Return '1\n2\n3\n3' When process merging Given 'n=3 q=6' and q's = 'Q 1...'")
    void test1() {

        int q = 6;
        int n = 3;
        List<String> queries = new ArrayList<>();
        queries.add("Q 1");
        queries.add("M 1 2");
        queries.add("Q 2");
        queries.add("M 2 3");
        queries.add("Q 3");
        queries.add("Q 2");

        String result = MergingCommunities.process(n,q,queries);
        Assertions.assertEquals("1\n2\n3\n3",result);

    }

    @Test
    @DisplayName("Return '1\n2\n3\n3\n1' When process merging Given 'n=4 q=7' and q's = 'Q 1...'")
    void test2() {

        int q = 7;
        int n = 4;
        List<String> queries = new ArrayList<>();
        queries.add("Q 1");
        queries.add("M 1 2");
        queries.add("Q 2");
        queries.add("M 2 3");
        queries.add("Q 3");
        queries.add("Q 2");
        queries.add("Q 4");

        String result = MergingCommunities.process(n,q,queries);
        Assertions.assertEquals("1\n2\n3\n3\n1",result);

    }

    @Test
    @DisplayName("Return amount=1 connections that person has When getConnections Given person=1 and person doesn't have connection")
    void testGetConnectionsQ() {

        int person = 1;
        MergingCommunities mergingCommunities = new MergingCommunities(1);
        int result = mergingCommunities.getConnections(person);
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Return amount=2 connections that person has When getConnections Given person=2 and person have 1 connection")
    void testGetConnectionsQ2() {
        int person = 2;
        MergingCommunities mergingCommunities = new MergingCommunities(2);
        mergingCommunities.connections.get(person).add(1);
        mergingCommunities.connections.get(1).add(2);
        int result = mergingCommunities.getConnections(person);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return '1' When breakQ Given 'Q 1'")
    void testBreakQ() {
        mergingCommunities = new MergingCommunities(1);
        int result = mergingCommunities.breakQ("Q 1");
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Return '1' When getPersonInM Given 'M 1 2'")
    void testPersonInMQ() {
        mergingCommunities = new MergingCommunities(2);
        int result = mergingCommunities.getPersonInM("M 1 2",1);
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Return '2' When getPersonInM Given 'M 1 2'")
    void testPersonInMQ2() {
        mergingCommunities = new MergingCommunities(2);
        int result = mergingCommunities.getPersonInM("M 1 2",2);
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("Return '1' When processQ Given 'Q 1'")
    void testProcessQ() {
        mergingCommunities = new MergingCommunities(1);
        int result = mergingCommunities.processQ("Q 1");
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Should connections.get(1) e get(2).size=2 When processM Given 'M 1 2'")
    void testProcessM() {
        mergingCommunities = new MergingCommunities(2);
        mergingCommunities.processM("M 1 2");
        Assertions.assertEquals(2,mergingCommunities.connections.get(1).size());
        Assertions.assertEquals(2,mergingCommunities.connections.get(2).size());
    }

}