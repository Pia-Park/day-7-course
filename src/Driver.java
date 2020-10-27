import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printCourse(ArrayList<Course> cList) {
		for(Course c : cList) {
			System.out.println("The course name is " + c.getCName()
			+ " which takes " + c.getDuration() + " weeks.\n"
			+ "The Instructor is " + c.getInstructor().getFName() + " " + c.getInstructor().getLName()
			+ " who is " + c.getInstructor().getStatus() + " with " + c.getInstructor().getExYear() + " year of experience.\n" 
			+ "The phone number of instructor is " + c.getInstructor().getPNum()+"\n");			
		}
	}

	
	public static String findCourse(ArrayList<Course> cList, String name) {
		for(Course c : cList) {
			
			if(c.getInstructor().getLName().equalsIgnoreCase(name)) {
				return c.getInstructor().getLName() + "'s course is " +c.getCName() + ".";
			
			}
			
		}
		return "This Instructor does not teach any courses.";
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Course> coursList = new ArrayList<Course>();
		
		Instructor i1 = new Instructor("Inae", "Park", "235-881-0000", 4);
		Instructor i2 = new Instructor("Cuchi", "Kim", "235-881-1234", 1);
		Instructor i3 = new Instructor("Momo", "Yoo", "235-881-1222", 2);
		Instructor i4 = new Instructor("Nana", "Lee", "235-881-1333", 5);
		
		
		Course c1 = new Course("Java", 5, i1);
		Course c2 = new Course("Java2", 4, i2);
		Course c3 = new Course("Java3", 10, i3);
		Course c4 = new Course("Java4", 8, i4);
		
		coursList.add(c1);
		coursList.add(c2);
		coursList.add(c3);
		coursList.add(c4);

		
		printCourse(coursList);
		
		System.out.println("Enter the instructors last name: ");
		String name = input.next();
		
		System.out.println(findCourse(coursList, name));
		
		

		

	}

}
