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
}
