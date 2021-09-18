package collections;

public class Students {
	int id;
	String name;
	String grade;
	double marks;
	Students(){
	
	

}
	public Students(int id, String name, String grade, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}

