import java.util.*;


public class HospitalDataBase {
    private ArrayList<Hospital> allHospitals;

    public HospitalDataBase(ArrayList<Hospital> hospitalList) {
        this.allHospitals = hospitalList;
    }

    public ArrayList<Hospital> getAllHospitals() {
        return allHospitals;
    }

    public void setAllHospitals(ArrayList<Hospital> allHospitals) {
        this.allHospitals = allHospitals;
    }
}
