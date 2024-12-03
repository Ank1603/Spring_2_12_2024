package example.spring.core;

public class EducationInfo {
private  String highestDegree;
private String Grade;
	public EducationInfo() {
	
	}
	public EducationInfo(String highestDegree, String grade) {
		super();
		this.highestDegree = highestDegree;
		Grade = grade;
	}
	public String getHighestDegree() {
		return highestDegree;
	}
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "[highestDegree=" + highestDegree + ", Grade=" + Grade + "]";
	}

}
