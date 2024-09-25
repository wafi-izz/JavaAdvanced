package excersice;

public class checkScoreTester {
    public static void main(String[] args) {
        double[] testScores = {2.15, 50, 95.02, 100.01};

        for (double score : testScores) {
            try {
                System.out.print("Score " + score + ": ");
                checkScore(score);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void checkScore(double score){
        if(0 < score && score <= 50){
            System.out.println("Average score");
        }
        else if(50 < score && score <= 100){
            System.out.println("Very good score");
        }
        else{
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}
