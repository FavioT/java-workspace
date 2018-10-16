package ejercicios;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import ejercicios.Persona.TipoDoc;

class Persona {

  int NroDocumento;
  String Nombre;
  String Apellido;
  java.util.Date FechaNacimiento;
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

  String getNombre()
  {
    return Nombre;
  }

  String getApellido()
  {
    return Apellido;
  }

  int getDNI()
  {
    return NroDocumento;
  }

  java.util.Date getNacimiento()
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

  void setNacimiento(java.util.Date _FechaNacimiento)
  {
    FechaNacimiento = _FechaNacimiento;
  }

}

public class Ejercicio2 {
	static String nombre;
	static String apellido;
	static Integer dni;
	static TipoDoc tipo;
	static java.util.Date birthday;

	/**
	 * @throws ParseException 
	 * 
	 */
	public Ejercicio2() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = format.parse("1989-04-16"); 
		nombre = "Favio";
		apellido = "Tschanz";
		dni = 34141657;
		birthday = date;
	}

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
    Persona persona = new Persona();
    Ejercicio2 ejercicio = new Ejercicio2();
    persona.setNombre(nombre);
    persona.setApellido(apellido);
    persona.setDNI(dni);
    persona.setNacimiento(birthday);
    persona.setTipo(tipo);
    ejercicio.print(persona);
	}

  void print(Persona persona)
  {
    System.out.println("Persona values");
    System.out.println(persona);
  }
}