package observator;

public class Event {
    public final EventType eventType;

    public final Object value;

    public Event(EventType eventType, Object value) {
        this.eventType = eventType;
        this.value = value;
    }
}
