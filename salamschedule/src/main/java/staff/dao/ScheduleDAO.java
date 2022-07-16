package staff.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import staff.db.*;
import staff.model.*;

public class ScheduleDAO {

	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement st = null;
	static ResultSet rs = null;
	
	private int scheduleID;
	private String scheduleDate;
	private int prayerID;
	private String staffID;
	
	//add Schedule
			public void addSchedule(Schedule bean) {
				scheduleID = bean.getScheduleID();
				scheduleDate = bean.getScheduleDate();
				prayerID = bean.getPrayerID();
				staffID = bean.getStaffID();
				
				
				try {
					//call getConnection() method
					con = ConnectionManager.getConnection();
					
					//create statement
					ps = con.prepareStatement("INSERT INTO schedule(scheduleid, scheduledate, prayerid, staffid)VALUES(?,?,?,?)");
					ps.setInt(1,scheduleID);
					ps.setString(2,scheduleDate);
					ps.setInt(3, prayerID);
					ps.setString(4,staffID);
				

					//execute query
					ps.executeUpdate();
					System.out.println("Successfully inserted");
					
					//close connection
					con.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//get all Schedules
			public static List<Schedule> getAllScheduless() {
				List<Schedule> schedules = new ArrayList<Schedule>();
				
				try {
					//call getConnection() method
					con = ConnectionManager.getConnection();
					
					//create statement
					st = con.createStatement();
					String sql = "SELECT * FROM schedule ORDER BY scheduleid";
					
					//execute query
					rs = st.executeQuery(sql);
					
					while(rs.next()) {		//process result
						Schedule s = new Schedule();
						s.setScheduleID(rs.getInt("scheduleid"));
						s.setScheduleDate(rs.getString("scheduledate"));
						s.setPrayerID(rs.getInt("prayerid"));
						s.setStaffID(rs.getString("staffid"));
					
						schedules.add(s);
					}
					
					//close connection
					con.close();
					
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				return schedules;
			}
			
			//get Schedule by id
			public static Schedule getScheduleById(int scheduleid) {
				Schedule s = new Schedule();
				try {
					//call getConnection method
					con = ConnectionManager.getConnection();
					
					//create statement
					ps= con.prepareStatement("SELECT * FROM schedule WHERE scheduleid=?");
					ps.setInt(1, scheduleid);
					
					//execute query
					rs = ps.executeQuery();
					if(rs.next()) {
						
						s.setScheduleID(rs.getInt("scheduleid"));
						s.setScheduleDate(rs.getString("scheduledate"));
						s.setPrayerID(rs.getInt("prayerid"));
						s.setStaffID(rs.getString("staffid"));
					}
					
					//close connection
					con.close();
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				return s;
			}
			
			//delete Schedule
			public void deleteSchedule(int scheduleid) {
				try {
					//call getConnection method
					con = ConnectionManager.getConnection();
					
					//create statement
					ps = con.prepareStatement("DELETE FROM schedule WHERE scheduleid=?");
					ps.setInt(1, scheduleid);
					
					//execute query
					ps.executeUpdate();
					
					//close connection
					con.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//update Schedule
			public void updateSchedule(Schedule bean) {
				scheduleID = bean.getScheduleID();
				scheduleDate = bean.getScheduleDate();
				prayerID = bean.getPrayerID();
				staffID = bean.getStaffID();
				
				try {
					//call getConnection method
					con = ConnectionManager.getConnection();
					
					//create statement
					ps = con.prepareStatement("UPDATE Schedule SET scheduleid=?, scheduledate=?, prayerid=?, staffid=?,  WHERE scheduleid=?");
					ps.setInt(1,scheduleID);
					ps.setString(2,scheduleDate);
					ps.setInt(3, prayerID);
					ps.setString(4,staffID);
					
					//execute query
					ps.executeUpdate();
					
					System.out.println("Successfully updated");
					
					//close connection
					con.close();
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			
	
}
