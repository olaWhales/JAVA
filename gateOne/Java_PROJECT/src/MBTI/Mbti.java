package MBTI;

import java.util.Scanner;

public class Mbti {
    public static <index> void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pick either A or B: ");
        int[] questionEI = {1, 5, 9, 13, 17};
        int[] questionSN = {2, 6, 10, 14, 18};
        int[] questionTF = {3, 7, 11, 15, 19};
        int[] questionJP = {4, 8, 12, 16, 20};

        String[] serveQuestionEI = new String[]{
                "1:(A) Expand energy,enjoy group	(B) Conserve energy, enjoy one on one.",
                "5:(A) Active,initiate	(B) Reflection,deliberate",
                "9:(A) Interpret literally	(B) Look for meaning and possibility",
                "13:(A) Firm,tend to critisize,hold the line	(B) Gentle,tent to appreciate,conciliate",
                "17:(A) Schedule,plan	(B) Unplanned,spontaneous",
        };
        String[] serveQuestionSN = new String[]{
                "2:(A) More ongoing,think out loud	(B) More reserve,think to yourself",
                "6:(A) Interpret literally	(B) Look for meaning and possibility",
                "10:(A) Fact,thing,what is	(B) Ideas,dreams,what could be,philosophical",
                "14:(A) Tough minded,just	(B) Tender hearted,merciful.",
                "18:(A) Regulated,structured	(B) Easy going,live and let live",
        };
        String[] serveQuestionTF = new String[]{
                "3:(A) Seek many task,public activity,interraction with other	(B) Seek private,acrivity with quiet to concentrate",
                "7:(A) Practical,realistic,experiential	(B) Imagination,innovation,theoretical",
                "11:(A) logical,thinking,questionaing	(B) Empathetic,feeling,accomodation",
                "15:(A) Matter of fact,issue-orieted	(B) Sensitive,people-oriented,compassionate",
                "19:(A) Preparation,plan ahead	(B) Go with the flow,adapt as you go",
        };
        String[] serveQuestionJP = new String[]{
                "4:(A) Externsal,communicative,express yourself	(B) Internal,reticent,keep to yourself",
                "8:(A) Standard,ussual,conventional	(B) Different,novel,unique",
                "12:(A) Candid,straigh forward	(B) Tactful kind,encouraging",
                "16:(A) Organization,orderly	(B) Flexible,adaptaion",
                "20:(A) Control,govern	(B) Latitude,freedom",
        };

        String[] elementEI = new String[serveQuestionEI.length];
        String[] elementSN = new String[serveQuestionSN.length];
        String[] elementTF = new String[serveQuestionTF.length];
        String[] elementJP = new String[serveQuestionJP.length];
//        int numberOfElementAPicked = 0;
//        int numberOfElementBPicked = 0;
//

        for (int index = 0; index < serveQuestionEI.length; index++) {
            System.out.print("Pick either A or B: ");
            String selection = input.nextLine();
            if (selection.equals("A") || selection.equals("a")){
                elementEI[index] = selection;
            }
        }
        for (int index = 0; index < serveQuestionEI.length; index++) {
            System.out.print("Pick either A or B: ");
            String selection = input.nextLine();
            if (selection.equals("A") || selection.equals("a") || selection.equals("B") || selection.equals("b")) {
                elementSN[index] = selection;
            }
        }
        for (int index = 0; index < serveQuestionEI.length; index++) {
            System.out.print("Pick either A or B: ");
            String selection = input.nextLine();
            if (selection.equals("A") || selection.equals("a") || selection.equals("B") || selection.equals("b")) {
                elementTF[index] = selection;
            }
        }
        for (int index = 0; index < serveQuestionEI.length; index++) {
            System.out.print("Pick either A or B: ");
            String selection = input.nextLine();
            if (selection.equals("A") || selection.equals("a") || selection.equals("B") || selection.equals("b")) {
                elementJP[index] = selection;
            } else System.out.println("Invalid selection");
        }

        for (String elementExtrovertedAndIntroverted : elementEI) {
            System.out.println("This are your choices selected for \n Extrover and Introverted: "+ elementExtrovertedAndIntroverted  );
        }
        System.out.println();
        for (String sensingAndIntuitive : elementSN) {
            System.out.println("This are your choices selected for \n Sensing And Intuitive: " + sensingAndIntuitive);
        }
        System.out.println();
        for (String thinkingAndFeeling : elementTF) {
            System.out.println("This are your choices selected for \n thinking And Feeling: " + thinkingAndFeeling);
        }
        System.out.println();
        for (String judgingAndPerceptive : elementJP) {
            System.out.println("This are your choices selected for \n judging And Perceptive: " + judgingAndPerceptive);
        }
    }
}