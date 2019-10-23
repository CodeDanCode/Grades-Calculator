/* 
 * Created By Daniel Leach
 */


public class MyGrades {
	
	// private variables
	private final int DEFAULT_NUM_HW = 3; 
	private int[] hw;   
	private	int finalExam;  
	private int midtermExam; 
	private int numberOfHomeworks; 

	// public constant variables
	public static final double FINAL_EXAM_WEIGHT = 0.25;  
	public static final double MIDTERM_EXAM_WEIGHT = 0.25; 
	public static final double HW_WEIGHT = 0.5; 
	
	// Default Constructor
	public MyGrades(){
		hw = new int[DEFAULT_NUM_HW];
		finalExam = 0;
		midtermExam = 0;
		numberOfHomeworks = 0;
	}
	
	// setter method sets grade
	public void setFinalExam(int grade) {
		this.finalExam = grade;
	}
	
	public void setMidtermExam(int grade) {
		this.midtermExam = grade;
		
	}
	public void setHomework(int grade) {
		
		if(numberOfHomeworks < DEFAULT_NUM_HW) {
				this.hw[numberOfHomeworks++] = grade;
		}else {
			int[] temp = new int[hw.length+1];
			for (int i = 0; i < numberOfHomeworks; i++) {
				temp[i] = hw[i];
				}
			hw = temp;
			this.hw[numberOfHomeworks++] = grade;
			}
		}
	
	// getter method returns final Grade
	public double getFinalGrade() {
		double sum = 0;
		double Hw_Avg=0;
		if(numberOfHomeworks >0) {
			for(int i=0;i<hw.length;i++) {
				sum = sum + hw[i];
			}
			Hw_Avg = sum/numberOfHomeworks;
		}else
			Hw_Avg = 0;
			
		return (FINAL_EXAM_WEIGHT* finalExam)+
				(MIDTERM_EXAM_WEIGHT*midtermExam)+
				(HW_WEIGHT*Hw_Avg);
		}
	
	// equals method
	public boolean equals(MyGrades g) {
		for(int i = 0;i <g.numberOfHomeworks;i++) {
			if(g.hw[i] != hw[i]) {
				return false;
			}
		}
		if((midtermExam==g.midtermExam) && (finalExam == g.finalExam) && (numberOfHomeworks == g.numberOfHomeworks )) {
			return true;
		}
		return false;
	}
	
	// toString method
	public String toString() {
		return "Final Exam = "+finalExam+" Midterm Exam = "+midtermExam+" Final Grade = "+getFinalGrade();
	}
	
	//method overloading
	public static double getFinalGrade(int finalTest,int midtermTest,int[] hwGrades) {
		MyGrades g = new MyGrades();
		g.setFinalExam(finalTest);
		g.setMidtermExam(midtermTest);
		for(int i = 0; i<hwGrades.length;i++) {
			g.setHomework(hwGrades[i]);
		}
		return g.getFinalGrade();	
	}	
}
