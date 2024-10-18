import java.util.ArrayList;

import javax.swing.JOptionPane;

public class principalEstudiantes {

	public static void main(String[] args) {
		comprobanteEstudiante miEs;
		ArrayList<comprobanteEstudiante> listaEstudiantes = new ArrayList<comprobanteEstudiante>();
		int menu;
		do {
		menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que desea hacer\n1.Ingresar ganador\n2.Consultar ganadores\n3.Salir"));
		
		if(menu == 1) {
		int cantidadEstudiantes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes que ganaron: "));
		for (int i = 0; i < cantidadEstudiantes; i++) {
		miEs= new comprobanteEstudiante();
		
		miEs.ingresarDatosEstudiante();
		miEs.premio();
		listaEstudiantes.add(miEs);
		
			
		}	
		}else if(menu == 2) {
			System.out.println("Lista estudiantes: ");
			for (comprobanteEstudiante emp : listaEstudiantes) {
				emp.imprimirComprobante();
			}
		
		} else if(menu == 3) {
			System.out.println("Usted salio del sistema :");
		}
	}while (menu != 3);
	}
}
