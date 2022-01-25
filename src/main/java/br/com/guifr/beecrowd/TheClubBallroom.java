package br.com.guifr.beecrowd;

import java.util.*;
import java.util.stream.Collectors;

public class TheClubBallroom {

    private final int INVALID_RETURN_WHEN_CALCULATE_COVERED_FLOOR = -1;
    private int width;
    private int length;
    private int widthPlanks;
    private int minimumPlanks = Integer.MAX_VALUE;
    private List<Integer> planks;

    private TheClubBallroom() {
    }

    public TheClubBallroom(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String widthLength = sc.nextLine();
        while(!widthLength.equals("0 0 ")){
            int widthPlanks = Integer.valueOf(sc.nextLine());
            int amountPlanks = Integer.valueOf(sc.nextLine());
            String planks = sc.nextLine();
//            int[] aPlanks = new int[amountPlanks];
//            for(int i = 0;i< amountPlanks;i++){
//                aPlanks[i] = sc.nextInt();
//            }
            int[]aPlanks = Arrays.stream(planks.split(" ")).mapToInt(p -> Integer.valueOf(p)).toArray();

            String[] s = widthLength.split(" ");
            int width = Integer.valueOf(s[0]);
            int length = Integer.valueOf(s[1]);

            try {
                System.out.println(of(width,length).widthPlanks(widthPlanks).withPlanks(aPlanks).howManyMinimumPlanksCoverFloor());
            } catch (TheClubBallroomException e) {
                System.out.println(e.getMessage());
            }
            widthLength = sc.nextLine();
        }

    }

    public static TheClubBallroom of(int width, int length) {
        return new TheClubBallroom(width, length);
    }

    public TheClubBallroom widthPlanks(int width) {
        widthPlanks = width;
        return this;
    }

    public TheClubBallroom withPlanks(int ...planks) {

        this.planks = Arrays.stream(planks)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

//        Collections.sort(planks);
//        this.planks = planks;

        return this;
    }

    public int howManyMinimumPlanksCoverFloor() throws TheClubBallroomException {
        int op1 = calculateUsingingLength();
        int op2 = calculateUsingingWidth();
        if(op1 == -1 && op2 == -1){
            throw new TheClubBallroomException("impossivel");
        }

        if(op1 == -1){
            return op2;
        }

        if(op2 == -1){
            return op1;
        }

        return Math.min(op1,op2);

//
//        return Arrays.asList(calculateUsingingLength(), calculateUsingingWidth())
//                .stream()
//                .filter(i -> i != INVALID_RETURN_WHEN_CALCULATE_COVERED_FLOOR)
//                .min(Integer::compare)
//                .orElseThrow(() -> new TheClubBallroomException("impossivel"));
    }


    private int calculateBy(int line, int cover){
        int howManyLines = line * 100 / widthPlanks;
        List<Integer> listPlanks = new ArrayList<>(planks);
        int planksUsinged = 0;
//        int planksUsinged = (int) listPlanks
//                .stream()
//                .filter(p -> p == cover)
//                .count();
//
//        listPlanks = listPlanks
//                .stream()
//                .filter(p -> p < cover)
//                .collect(Collectors.toList());

        List<Integer> newPlanks = new ArrayList<>();
        for(Integer plank : listPlanks){
            if(plank == cover){
                planksUsinged++;
            }
            if(plank < cover){
                newPlanks.add(plank);
            }

        }
        listPlanks = newPlanks;


//        int planksUsinged = 0;

        howManyLines -= planksUsinged;
        for (int i = 0; i < howManyLines;) {
//            int covered = cover;

            if(listPlanks.size() == 0){
                return INVALID_RETURN_WHEN_CALCULATE_COVERED_FLOOR;
            }

            int covered = 0;
            try {
                covered = coverOneLine(listPlanks,cover);
            } catch (TheClubBallroomException e) {
                return INVALID_RETURN_WHEN_CALCULATE_COVERED_FLOOR;
            } catch (TheClubBallroomNoneException e){
                continue;
            }
//            for (int w = listPlanks.size() - 1; w >= 0; w--) {
//                if (listPlanks.get(w) <= covered) {
//                    plankstried++;
//                    covered -= listPlanks.remove(w);
//                    if(covered == 0){
//                        break;
//                    }
//                }else{
//                    if (plankstried == 0){
//                        listPlanks.remove(w);
//                    }
//                }
//            }
//            if(covered == 0){
                planksUsinged += covered;
                i++;
                if(planksUsinged >= minimumPlanks){
                    return minimumPlanks;
                }
//            }

        }

        if(planksUsinged < minimumPlanks){
            minimumPlanks = planksUsinged;
        }

        return planksUsinged;
    }

    private int coverOneLine(List<Integer> listPlanks, int covered) throws TheClubBallroomException, TheClubBallroomNoneException {
        int plankstried = 0;
        for (int w = listPlanks.size() - 1; w >= 0; w--) {
            if (listPlanks.get(w) <= covered) {
                plankstried++;
                covered -= listPlanks.remove(w);
                if(covered == 0){
                    break;
                }
            }
        }
        if(covered != 0 ){
            throw new TheClubBallroomNoneException("Not Covered Line.");
        }
        if(plankstried == 0 ){
            throw new TheClubBallroomException("impossivel");
        }
        return plankstried;
    }

    public int calculateUsingingWidth() {
        return calculateBy(width,length);
    }

    public int calculateUsingingLength() {
        return calculateBy(length,width);
    }

    public class TheClubBallroomException extends Exception {
        public TheClubBallroomException(String message) {
            super(message);
        }
    }

    private class TheClubBallroomNoneException extends Throwable {
        public TheClubBallroomNoneException(String message) {
        }
    }
}
