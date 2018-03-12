package part_10;

// An enumeration of the colors of a traffic light

public enum TrafficLightColor {
    RED(1200), GREEN(1000), YELLOW(200);
    private long duration;

    TrafficLightColor(long duration) {
        this.duration = duration;
    }

    long getDuration() {
        return duration;
    }
}
