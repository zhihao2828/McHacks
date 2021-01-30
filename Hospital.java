
//as of now, this class only has getters and setter methods

public class Hospital {

    private String name;
    private boolean hasSpots;
    private String[] numSpots; //String of length 2, numAvailableSpots[0] = number of beds currently in use, numAvailableSpots[1] = total number of beds in a hospital
    private String[] location; //TODO update so it uses class Location or something that google understands

    public Hospital(String name, boolean hasSpots, String[] numSpots, String[] location) {
        this.name = name;
        this.hasSpots = hasSpots;
        this.numSpots = numSpots;
        this.location = location;
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
    //setters and getters end
}
