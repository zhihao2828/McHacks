import java.util.ArrayList;
import java.util.HashMap;

public class HospitalDataBase {

	private ArrayList<Hospital> allHospitals;
	private ArrayList<Hospital> allValidHospitals;


	public HospitalDataBase(ArrayList<Hospital> allHospitals, String[] currentLocation) {

		this.allHospitals = allHospitals;
		allValidHospitals = new ArrayList<Hospital>();

		for (Hospital h : allHospitals) {
			if (h.isHasSpots()) {
				allValidHospitals.add(h);
			}
		}

		// sort the valid hospitals according to their times
		// insertion sort
		for (int i = 0; i < allValidHospitals.size(); i++) {

			Hospital tmpHospital = allValidHospitals.get(i);
			int k = i;
			while (k > 0 && tmpHospital.getMinutesToArrive() < allValidHospitals.get(k - 1).getMinutesToArrive()) {
				allValidHospitals.set(k, allValidHospitals.get(k-1));
				k--;
			}
			allValidHospitals.set(k, tmpHospital);
		}
	}

	public ArrayList<Hospital> getAllHospitals() {
		return allHospitals;
	}

	public void setAllHospitals(ArrayList<Hospital> allHospitals) {
		this.allHospitals = allHospitals;
	}
	
	public ArrayList<Hospital> getSortedHospitals(){
		return allValidHospitals;
	}
	
	
	

	private class Hospital {
		private String name;
		private boolean hasSpots;
		private String[] numSpots; // String of length 2, numAvailableSpots[0] = number of beds currently in use,
									// numAvailableSpots[1] = total number of beds in a hospital
		private String[] location; // TODO update so it uses class Location or something that google understands
		private int minutesToArrive; // how far away is the hospital in minutes

		public Hospital(String name, boolean hasSpots, String[] numSpots, String[] location, int min) {
			this.name = name;
			this.hasSpots = hasSpots;
			this.numSpots = numSpots;
			this.location = location;
			this.minutesToArrive = min;
		}

		// setters and getters start
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

		// setters and getters end
	}

}
