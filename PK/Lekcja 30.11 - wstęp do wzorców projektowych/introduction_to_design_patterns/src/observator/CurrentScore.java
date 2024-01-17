package observator;

public class CurrentScore implements Observer {
    private int runs;
    private int wickets;
    private float overs;

    @Override
    public void update(Event event) {

        EventType eventType = event.eventType;

        switch (eventType) {
            case RUNS -> runs = (int) event.value;
            case WICKETS -> wickets = (int) event.value;
            case OVERS -> overs = (float) event.value;
        }

    }
    public void display(){
        System.out.println(runs + " " + wickets + " " + overs);
    }
}
