
public class MyGradesTester
{
	public static void main(String args[])
	{
		System.out.println("Homework 2 test case results by Daniel Leach");

		// test cases for default constructor
		int testCount = 1;  // used to track test numbers
		MyGrades a = new MyGrades();
		boolean result;
		result = isSame(0, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		// test cases for setMidtermExam()
		a.setMidtermExam(80);
		result = isSame(20, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		// test cases for setFinalExam()
		a.setFinalExam(81);
		result = isSame(40.25, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		// test cases for setHomework()
		a.setHomework(80);
		result = isSame(80.25, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		a.setHomework(90);
		result = isSame(82.75, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		a.setHomework(100);
		result = isSame(85.25, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		a.setHomework(100);
		result = isSame(86.5, a.getFinalGrade());
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		// test the equality operator
		if (a.equals(a) == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		MyGrades b = new MyGrades();
		if (b.equals(a) == false)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;


		MyGrades c = new MyGrades();
		if (b.equals(c) == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		c.setHomework(84);
		if (b.equals(c) == false)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		result = isSame(0.25, MyGrades.FINAL_EXAM_WEIGHT);
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		result = isSame(0.25, MyGrades.MIDTERM_EXAM_WEIGHT);
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		result = isSame(0.5, MyGrades.HW_WEIGHT);
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		int[] hw = {90, 80, 85, 85};
		result = isSame(88.75, MyGrades.getFinalGrade(90, 95, hw));
		if (result == true)
			System.out.println("Test Case " + testCount + " Passed");
		else
			System.out.println("Test Case " + testCount + " Failed");
		testCount++;

		System.out.println(a.toString());
	}

	private static boolean isSame(double x, double y)
	{
		double error = .00001;
		boolean rv = false;
		if (((x + error) >= y) && ((x - error) <= y))
		{
			rv = true;
		}
		return rv;
	}

}