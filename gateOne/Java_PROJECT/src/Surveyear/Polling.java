package Surveyear;

public class Polling {
    private static final int[][] RESPONSES = new int [5][10] ;
    private String [] TOPICS;

    public static void RateIsues(int issue, int rating) {
        issue = issue -1 ;
        int [] issueToRate = RESPONSES[issue];
        rating = rating -1 ;
        issueToRate[issue] = issueToRate[issue] + 1;
    }

    public void polling (){
        TOPICS = new String[]{"Paternality", "Maternity", "Miracle", "Mystery"};
    };

    public String[] getTopic() {
        String [] arrays = new String[5];
        return getTopics();
    }
    public String[] getTopics() {
        return TOPICS;
    }

    public int[][] getResponses() {
        return RESPONSES   ;
    }

}
