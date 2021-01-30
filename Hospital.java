
//as of now, this class only has getters and setter methods

public class Hospital {

    private String name;
    private boolean hasSpots;
    private String[] numSpots; //String of length 2, numAvailableSpots[0] = number of beds currently in use, numAvailableSpots[1] = total number of beds in a hospital
    private String[] location; //TODO update so it uses class Location or something that google understands
    private int minutesToArrive; //how far away is the hospital in minutes
    private double distance; //how far away the user is from the hospital

    public Hospital(String name, boolean hasSpots, String[] numSpots, String[] location, int min, double distance) {
        this.name = name;
        this.hasSpots = hasSpots;
        this.numSpots = numSpots;
        this.location = location;
        this.minutesToArrive = min;
        this.distance = distance;
    }

    //setters and getters start
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(boolean hasSpots) {
        this.hasSpots = hasSpots;
    }

    public String[] getNumSpots() {
        return numSpots;
    }

    public void setNumSpots(String[] numSpots) {
        this.numSpots = numSpots;
    }


    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }
    public int getMinutesToArrive() {
        return minutesToArrive;
    }

    public void setMinutesToArrive(int minutesToArrive) {
        this.minutesToArrive = minutesToArrive;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    //setters and getters end
}
