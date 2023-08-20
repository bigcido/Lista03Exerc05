package view;
import controller.Fibonacci;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição fibonacci: "));
		if (n > 20) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			System.exit(0);
		}
		int posicao = fb.fib(n);
		System.out.println(posicao);
	}

}
