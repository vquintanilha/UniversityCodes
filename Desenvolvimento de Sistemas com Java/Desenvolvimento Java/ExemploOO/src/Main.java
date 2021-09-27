import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		Object object = new PacienteSUS();
		
		
		Paciente paciente = new Paciente();
		paciente.setCodigo("123");
		paciente.setNome("João");
		
				
		PacienteSUS pacienteSUS = new PacienteSUS();
		pacienteSUS.setCodigo("987");
		pacienteSUS.setNome("Andre");
		pacienteSUS.setCodigoSUS("Aj78");
		
		ArrayList<Paciente> pacientes = new ArrayList<>();
		
		pacientes.add(paciente);
		pacientes.add(pacienteSUS);

		for (Paciente aux : pacientes) {
			System.out.println(aux);
		}
		
	}

}
