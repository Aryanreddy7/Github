package com.xworkz.Object.toString;

public class SpaceMission {
    private String missionName;
    private String agency;
    private int durationDays;

    public SpaceMission(String missionName, String agency, int durationDays) {
        this.missionName = missionName;
        this.agency = agency;
        this.durationDays = durationDays;
    }

    @Override
    public String toString() {
        return "SpaceMission{missionName='" + missionName + "', agency='" + agency + "', durationDays=" + durationDays + "}";
    }
    @Override
    public int hashCode() {
        return 67;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SpaceMission) {
                System.out.println("Comparing!!!!!!");
                SpaceMission spaceMission = this;
                SpaceMission spaceMission1 = (SpaceMission) obj;
                if (spaceMission.missionName.equals(spaceMission1.missionName) && spaceMission.agency.equals(spaceMission1.agency) && spaceMission.durationDays == spaceMission1.durationDays) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
