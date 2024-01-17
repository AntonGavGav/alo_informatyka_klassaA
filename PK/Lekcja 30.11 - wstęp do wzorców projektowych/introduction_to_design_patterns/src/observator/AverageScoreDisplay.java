package observator;

public class AverageScoreDisplay implements Observer {


    private int predictedScore;
    private float runRate;
    @Override
    public void update(Event event) {

        EventType eventType = event.eventType;

        switch (eventType) {
            case RUNS -> predictedScore += (int) event.value; //does it really matter?
        }
    }

    public void display(){
        System.out.println(predictedScore + " " + runRate);
    }
}
