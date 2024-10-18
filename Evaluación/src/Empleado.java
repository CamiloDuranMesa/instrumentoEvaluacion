import javax.swing.JOptionPane;

public class Empleado {

	String nombreEmpleado;
	double pago;
	int sueldoActual;
	int categoria;
	
	public void ingresarDatos() {

	nombreEmpleado= JOptionPane.showInputDialog("Ingrese el nombre del empleado");
	sueldoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo actual"));
	categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoria"));
	
	}
	
	public void categoria() {
		double bonificación;
		double descuento;
		switch (categoria) {
		case 1: {
			bonificación=0.15;
			descuento=0.02;
			pago= sueldoActual+(sueldoActual*bonificación)-(sueldoActual*descuento);
			break;
		}
		case 2: {
			bonificación=0.1;
			descuento=0.015;
			pago= sueldoActual+(sueldoActual*bonificación)-(sueldoActual*descuento);
			break;
		}
		case 3: {
			bonificación=0.08;
			descuento=0.01;
			pago= sueldoActual+(sueldoActual*bonificación)-(sueldoActual*descuento);
			break;
		}
		case 4: {
			bonificación=0.0;
			descuento=0.0;
			pago= sueldoActual+(sueldoActual*bonificación)-(sueldoActual*descuento);
			break;
		}
		default:
			System.out.println("La opción no es validad");
			break;
		}
	}
	
	public void imprimirDatos() {
		System.out.println("El empleado "+nombreEmpleado+" se le va pagar "+pago);
		
	}
	

}

