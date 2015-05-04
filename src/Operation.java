public class Operation {

	private double var1;
	private double var2;
	private char operator;
	private String exp;

	public Operation(String expression) {

		exp = expression;
		int indexOfOperator = 0;
		operator = '%';
		int i = 0;
		for (i = 1; i < expression.length(); i++) {
			if (expression.charAt(i) == '+') {
				indexOfOperator = i;
				operator = '+';
				i = expression.length();
			} else if (expression.charAt(i) == '-') {
				indexOfOperator = i;
				operator = '-';
				i = expression.length();
			} else if (expression.charAt(i) == '*') {
				indexOfOperator = i;
				operator = '*';
				i = expression.length();
			} else if (expression.charAt(i) == '/') {
				indexOfOperator = i;
				operator = '/';
				i = expression.length();
			}
		}

		String varStr1 = "";
		String varStr2 = "";

		if (operator == '%') {
			operator = '+';

			var1 = Double.parseDouble(expression);
			var2 = 0;
		} else {
			for (int k = 0; k < indexOfOperator; k++) {
				varStr1 += (expression.charAt(k));
			}
			for (int z = indexOfOperator + 1; z < expression.length(); z++) {
				varStr2 += (expression.charAt(z));
			}
			
			var1 = Double.parseDouble(varStr1);
			var2 = Double.parseDouble(varStr2);
		}

		

	}

	public double evaluate() {
		double result = 0;
		if (operator == '+') {
			result = var1 + var2;
		}
		if (operator == '-') {
			result = var1 - var2;
		}
		if (operator == '*') {
			result = var1 * var2;
		}
		if (operator == '/') {
			if (var2 == 0) {
				System.out.println("cannot divide by zero");

			}
			result = var1 / var2;
		}
		return result;
	}

	public String getExp() {
		return exp;
	}

}
