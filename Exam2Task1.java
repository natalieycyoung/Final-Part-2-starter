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
}

class Exam2Task1Examples
{
	double averageBeforeValue(double[] doubles, double stopAt)
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

		average = sum / count;

		return average;
	}
	
	double[] doubles = {2, 4, 6, 8, 10};
	double value = 6;

	void testAverageBeforeValue (Tester t)
	{
		t.checkExpect(averageBeforeValue(doubles, value), 3.0);
	}
}
/*
class AverageBeforeTest
{
	Exam2Task1Examples ex1 = new Exam2Task1Examples();


}
*/
