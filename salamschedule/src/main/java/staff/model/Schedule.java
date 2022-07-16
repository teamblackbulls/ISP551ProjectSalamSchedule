package staff.model;

public class Schedule {

	private int scheduleID;
	private String scheduleDate;
	private int prayerID;
	private String imamID;
	private String bilalID;
	
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

	public String getImamID() {
		return imamID;
	}

	public void setImamID(String imamID) {
		this.imamID = imamID;
	}

	public String getBilalID() {
		return bilalID;
	}

	public void setBilalID(String bilalID) {
		this.bilalID = bilalID;
	}
}
