package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The Id of the student is "+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The Id of the student is "+id+". The name of the student is "+name);

	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("The email of the student is "+email+". The phone number of the student is "+phoneNumber);

	}
	public static void main(String[] args) {
	 Students student=new Students();
	 student.getStudentInfo(972079);
	 student.getStudentInfo(972079,"Selvapriyanka");
	 student.getStudentInfo("Selvapriyanka@gmail.com", 1234567890l);
	}

}
