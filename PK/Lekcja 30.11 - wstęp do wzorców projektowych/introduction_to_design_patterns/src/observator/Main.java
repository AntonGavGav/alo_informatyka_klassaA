package observator;

public class Main {
    public static void main(String[] args) {
        //
        CricketData cricketData = new CricketData();
        CurrentScore currentScore = new CurrentScore();
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();

        cricketData.registerObserver(currentScore);
        cricketData.registerObserver(averageScoreDisplay);

        cricketData.setRuns(6);
        cricketData.setWickets(10);
        cricketData.setOvers(19);
        cricketData.setRuns(2);

        currentScore.display();
        averageScoreDisplay.display();


    }
}

