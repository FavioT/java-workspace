package ejercicios;

public class Persona {

  int NroDocumento;
  string Nombre;
  string Apellido;
  date FechaNacimiento;
  TipoDoc TipoDocumento;

  public enum TipoDoc {
    DNI, LIBRETACIVICA;
  }

  TipoDoc getTipo()
  {
    return TipoDocumento;
  }

  void setTipo(TipoDoc _TipoDocumento)
  {
    TipoDocumento = _TipoDocumento;
  }

  string getNombre()
  {
    return Nombre;
  }

  string getApellido()
  {
    return Apellido;
  }

  int getDNI()
  {
    return NroDocumento;
  }

  date getNacimiento()
  {
    return FechaNacimiento;
  }

  void setNombre(String _Nombre)
  {
    Nombre = _Nombre;
  }

  void setApellido(String _Apellido)
  {
    Apellido = _Apellido;
  }

  void setDNI(int _NroDocumento)
  {
    NroDocumento = _NroDocumento;
  }

  void setNacimiento(date _FechaNacimiento)
  {
    FechaNacimiento = _FechaNacimiento;
  }

}

public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    persona = new Persona();
    ejercicio = new Ejercicio2();
    persona.setNombre(Favio);
    persona.setApellido(Tschanz);
    persona.setDNI(34141657);
    persona.setNacimiento(160489);
    persona.setTipo(DNI);
    ejercicio.print();
	}

  void print()
  {
    System.out.println("Persona values");
  }
}