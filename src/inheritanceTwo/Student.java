package inheritanceTwo;

public class Student {
	
	String name;
	int age;
	String location;
	String grade;
	
	public void study(String course) {
		System.out.println("Student studying " + course);
	}

	public void takeExam(int score) {
		if(score >= 90) {
			this.grade = "A";
		}else if(score < 90 && score >= 80) {
			this.grade = "AB";
		}else if(score < 80 && score >= 70) {
			this.grade = "B";
		}else if(score < 70 && score >= 60) {
			this.grade = "C";
		}else {
			this.grade = "F";
		}
	}
}
