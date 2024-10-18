import javax.swing.JOptionPane;

public class comprobanteEstudiante {
	
	String nombre;
	int documento;
	int telefono;
	int codigo;
	String ciudadViaje;
	String fechaHoraViaje;
	
	
	
	public void premio() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo referente al premio que desea\n1.Medellín - Fecha y Hora: 6 de octubre - 8 am\n2. Bogotá - Fecha y Hora: 10 de noviembre -6pm\n3 Cartagena - Fecha y Hora: 5 de abril 2pm\n4 Barranquilla 4 de mayo 4am"));
		
		switch (codigo) {
		case 1:{
			ciudadViaje = "Medellín";
			fechaHoraViaje = "6 de octubre 8am";
			break;
		}
		
		case 2:{
			ciudadViaje = "Bogotá";
			fechaHoraViaje = "10 de noviembre 6m";
			break;
		}
		
		case 3:{
			ciudadViaje = "Cartagena";
			fechaHoraViaje = "5 de abril 2pm";
			break;
		}
		
		case 4:{
			ciudadViaje = "Barranquilla";
			fechaHoraViaje = "4 de mayo 8am";
			break;
		}
			
		
		default:{
			System.out.println("Ninguna opción es valida intente otra opción");
			break;
		}
			
		}
		
	}
	
	public void ingresarDatosEstudiante() {
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
		documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su documento"));
		telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su telefono")); 

	}
	
	public void imprimirComprobante() {
		System.out.println("El estudiante "+nombre+" con documento: "+documento+", telefono: "+telefono+" selecciono el codigo: "+codigo+"\nSu premio seleccionado fue: "+ciudadViaje+" Fecha y Hora: "+fechaHoraViaje);
	}
}
