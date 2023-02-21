package model;

import java.util.Date;

public interface ISchedulable {

	void schedule(String date, String time);

	void schedule(Date date, String time); 
	
}