import javax.swing.JOptionPane;

public class ecuaciónX {

	public static void main(String[] args) {
		int cantidadEcuación = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea realizar la ecuación:"));
		int resultadoX;
		for (int i = 0; i < cantidadEcuación; i++) {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b"));
			
			resultadoX = a+(b*2*a);
			
			System.out.println("El valor de x en la ecuación en la cual a es "+a+" y b es "+b+" da como resultado: "+resultadoX);
		}
	}
}
