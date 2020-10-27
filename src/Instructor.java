
public class Instructor {
	
	private String fName;
	private String lName;
	private String pNum;
	private int exYear;
	
	public Instructor(String fName, String lName, String pNum, int exYear) {
		
		setFName(fName);
		setLName(lName);
		setPNum(pNum);
		setExYear(exYear);
		
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String getPNum() {
		return pNum;
	}
	
	public int getExYear() {
		return exYear;
	}
	
	
	public void setFName(String fName) {
		if(!fName.isEmpty() && !fName.equalsIgnoreCase(null)) {
			this.fName = fName;
		} else {
			this.fName = "Unknown";
		}
	}
	
	public void setLName(String lName) {
		if(!lName.isEmpty() && !lName.equalsIgnoreCase(null)) {
			this.lName = lName;
		} else {
			this.lName = "Unknown";
		}
	}
	
	public void setPNum(String pNum) {
		if(!pNum.isEmpty() && !pNum.equalsIgnoreCase(null)) {
			this.pNum = pNum;
		} else {
			this.pNum = "Unknown";
		}
	}
	
	public void setExYear(int exYear) {
		if(exYear > 1) {
			this.exYear = exYear;
		} 
	}
	
//	public void getStatus() {
//		
//		int e = this.exYear;
//		switch (e) {
//		case 1:
//			System.out.println("Junior Instructor");						
//			break;
//		case 2 : case 3: case 4: 
//			System.out.println("Intermediate Instructor");
//			break;
//		case 5:
//			System.out.println("Senior Instructor");
//			break;
//		default:
//			break;
//		}
//		
//	}
	
	public String getStatus() {
		
		switch (this.exYear) {
		case 1:
			return "Junior Instructor";						
		case 2 : case 3: case 4: 
			return "Intermediate Instructor";
		default:
			return "Senior Instructor";
		}
		
	}

}
