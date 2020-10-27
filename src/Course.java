
public class Course {
	
	private String cName;
	private int duration;
	private Instructor instructor;
	
	public Course(String cName, int duration, Instructor instructor) {
		
		setCName(cName);
		setDuration(duration);
		setInstructor(instructor);
		
	}
	
	public String getCName() {
		return cName;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setCName(String cName) {
		if(!cName.isEmpty() && !cName.equalsIgnoreCase(null)) {
			this.cName = cName;
		} else {
			this.cName = "UnKnown";
		}
	}
	
	public void setDuration(int duration) {
		if(duration > 4) {
			this.duration = duration;
		} else {
			this.duration = 1;
		}
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	

}
