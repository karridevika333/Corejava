package collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsData {
	
	static List<Students> getStudents(){
		
		return Stream.of(
				new Students(100,"vijay","A",60),
				new Students(101,"jay","B",70),
				new Students(102,"ajay","A",80),
				new Students(103,"sujay","A",50)
				
				
				).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
	
	List<Students> list = StudentsData.getStudents();
	
	Double average = list.stream().filter(student -> student.getGrade().
			equalsIgnoreCase("A")).map(stu-> stu.getMarks())
            .mapToDouble(i -> i).
            average().getAsDouble();
	
	
	
	System.out.println(average);
	

	}


}
