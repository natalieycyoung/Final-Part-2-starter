/**
 * Final Exam: Exam 2 Task 2
 *
 * @author Natalie Young
 * @since 2021-12-05
 */

class WordQuery
{
	public static void main(String[] args)
	{
//		double condition;
		double[] doubles;
		double[] trueArgs;
		String operator;


		if (validInput(args))
		{
			if (args.length > 2)
			{
//				doubles = new double [args.length - 2];
//				trueArgs = compareInputs(args);
				operator = args[0];
	//		System.out.println(operator);	
				doubles = toDoubles(args);

/*				condition = doubles[0];

				System.out.println("condition: " + condition);

				for (double doub : doubles)
				{
					System.out.println(doub);
				}
*/
				comparePrintInputs(operator, doubles);
/*
				for (int i = 1; i < doubles.length; i++)
				{
					if (doubles[])
				}
				*/
			}
		}
		else
		{
			System.out.println("Use \"less\" or \"greater\" as the first argument.");
		}
	}

	/**
	 * Checks if operators are valid
	 *
	 * @param args
	 * @return boolean
	 */
	static boolean validInput(String[] args)
	{
		if ((args.length > 0) && (args[0].equals("greater") || args[0].equals("less")))
		{
			return true;
		}

		return false;
	}

	/**
	 * Converts array of String to array of double
	 *
	 * @param args
	 * @return doubles
	 */
	static double[] toDoubles(String[] args)
	{
		double[] doubles = new double [args.length - 1];

		for (int i = 0; i < doubles.length; i++)
		{
			doubles[i] = Double.parseDouble(args[i + 1]);
		}

		return doubles;
	}

	/**
	 * Compares array of double against condition according to
	 * operator.
	 *
	 * @param operator
	 * @param doubles
	 */
	static void comparePrintInputs(String operator, double[] doubles)
	{
		double condition = doubles[0];

		if (operator.equals("greater"))
		{
			for (int i = 1; i < doubles.length; i++)
			{
				if (doubles[i] > condition)
				{
					System.out.println(doubles[i]);
				}
			}
		}
		else if (operator.equals("less"))
		{
			for (int i = 1; i < doubles.length; i++)
			{
				if (doubles[i] < condition)
				{
					System.out.println(doubles[i]);
				}
			}
		}
	}
}
