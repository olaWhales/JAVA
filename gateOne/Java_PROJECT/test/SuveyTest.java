//package gateOne.Java_PROJECT.test;
//
//import Surveyear.Polling;
//import org.junit.Test;
//import org.junit.jupiter.api.DisplayName;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//public class SuveyTest {
//    private final Polling polling = new Polling();
//
//
//    @Test
//    public void testIfPolingClassExist() {
//        assertNotNull(polling);
//    }
//
//    @Test
//    public void test_If_Problem_Applications_Has_Five_Issues() {
//        String[] topic = polling.getTopic();
//        assertEquals(5, topic.length);
//    }
//    @Test
//    public void test_If_Problem_Applications_Has_Four_Issues() {
//        String[] topics = polling.getTopic();
//        for (String topic : topics) {
//            assertNotNull(topic);
//        }
//    }
//    @Test
//    @DisplayName("Polling app has 5 by 10 table for responses")
//    public void testThatPollingApplicationHasFiveByTenTableForStoringPolingIssuesResponses() {
//        int [][] responses = polling.getResponses();
//        assertEquals(5, responses.length);
//        for(int[] response: responses){
//            assertEquals(10, responses.length);
//        }
//    }
//    @Test
//    public void tesTtHAT() {
//        Polling.RateIsues(5, 8);
//        Polling.RateIsues(3, 2);
//        Polling.RateIsues(4, 1);
//        int[][] responses = polling.getResponses();
//        int fifthIssuesResponses = responses[4][7];
//        int fifthIssueResponses;
//        assertEquals(1, fifthIssuesResponses);
//        int thirdIssuesResponses = responses[2][1];
//        assertEquals(1, thirdIssuesResponses);
//        int fourthIssuesResponses = responses[3][0];
//       // assertEquals(1, secondIssuesResponses);
//       // polling.RateIssue(5, 8);
//    }
//}

