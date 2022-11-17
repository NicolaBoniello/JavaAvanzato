public class Main{

    public static void main(String[] args) throws Exception {

       Main score = new Main();
        try {
            score.checkScore(2.15);
            score.checkScore(50);
            score.checkScore(95.02);
            score.checkScore(100.01);
        } catch (Exception e) {

            System.out.println("Score is out of scale!");
        }

    }

    double score;

    public void checkScore (double score) throws Exception{
        this.score=score;
        if (0<score&&score<=50.00){
            System.out.println("Average score");
        } else if (50.00<score && score<= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new Exception("Score is out of scale");
        }
    }

}