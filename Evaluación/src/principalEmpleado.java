import java.util.ArrayList;

import javax.swing.JOptionPane;

public class principalEmpleado {

	public static void main(String[] args) {
	Empleado miEm;
	ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	int menu;
	do {
	menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que desea hacer\n1.Ingresar empleados\n2.Consultar empleados\n3.Salir"));
	
	if(menu == 1) {
	int cantidadEmpleados= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empelados que desea registrar: "));
	for (int i = 0; i < cantidadEmpleados; i++) {
	miEm= new Empleado();
	
	miEm.ingresarDatos();
	miEm.categoria();
	listaEmpleados.add(miEm);
	
		
	}	
	}else if(menu == 2) {
		System.out.println("Lista empleados: ");
		for (Empleado emp : listaEmpleados) {
			
			emp.imprimirDatos();
		}
	
	}else if(menu == 3) {
		System.out.println("Usted salio del sistema: ");
	}
}while (menu != 3);
	
	
	
	
		

	}
}
