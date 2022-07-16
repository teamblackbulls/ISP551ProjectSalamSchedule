package staff.model;

public class Schedule {

	private int scheduleID;
	private String scheduleDate;
	private int prayerID;
	private String staffID;
	
	public Schedule() {
		
	}
	
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	
	public int getScheduleID() {
		return scheduleID;
	}
	
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	
	public String getScheduleDate() {
		return scheduleDate;
	}

	public int getPrayerID() {
		return prayerID;
	}

	public void setPrayerID(int prayerID) {
		this.prayerID = prayerID;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
}
