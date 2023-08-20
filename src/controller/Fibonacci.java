package controller;

public class Fibonacci {

	public Fibonacci() {
		super();
	}

	public int fib(int a) {
		if (a <= 1) {
			/* Se o valor de a for um inteiro menor ou igual a 1, a posição em fibonacci de
			 * a(0) e a(1) é sempre 1.
			 */
			return 1;
		} else {
			/*A chamada é sempre a posição anterior a solicitada somando a posição anterior
			 * da anterior. Então se eu quiser a 3ª posição, a fórmula é: F(3) = F(2) + F(1).
			 */
			return fib(a-1) + fib(a-2);
		}
	}
}
