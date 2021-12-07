/**
 * Final Part 2-1 (Exam 2 Task 1)
 *
 * @author Natalie Young
 * @since 2021-12-06
 */

import java.util.*;
import tester.*;

class Exam2Task1
{
	/*
	public static void main(String[] args)
	{
		double[] doubles = {2, 4, 6, 8, 10};
	
		double avgBeforeValue = Exam2Task1Examples.averageBeforeValue(doubles, 7);
		System.out.println("averageBeforeValue: " + avgBeforeValue);
	}
	*/


	public static void main(String[] args)
	{
		double[] videoTaskArray = {1, 2, 3, 4, 5};
		double videoStopAt = 4;

		System.out.println("Video Task Array:");

		for (double doub : videoTaskArray)
		{
			System.out.print(doub + " ");
		}

		System.out.println("\nStop at: " + videoStopAt);

		System.out.println("Average before value: " + Exam2Task1Examples.averageBeforeValue(videoTaskArray, videoStopAt));
	}
}

class Exam2Task1Examples
{
	static double averageBeforeValue(double[] doubles, double stopAt)
	{
		double sum = 0;
		int count;
		double average = 0;

		if (doubles.length == 0 || doubles[0] == stopAt)
		{
			return average;
		}

		for (count = 0; (count < doubles.length) && (doubles[count] != stopAt); count += 1)
		{
			sum += doubles[count];
		}

/*
count start   count end   sum start   sum end
*/

		average = sum / count;

		return average;
	}
	
	double[] doubles1 = {2, 4, 6, 8, 10};
	double[] emptyArray = {};
	double valInArray = 6;
	double valNotInArray = 5;

	void testAverageBeforeValue (Tester t)
	{
		t.checkExpect(averageBeforeValue(doubles1, valInArray), 3.0);
		t.checkExpect(averageBeforeValue(doubles1, valNotInArray), 6.0);
		t.checkExpect(averageBeforeValue(emptyArray, 7), 0.0);
		t.checkExpect(averageBeforeValue(doubles1, 2), 0.0);
	}

}
