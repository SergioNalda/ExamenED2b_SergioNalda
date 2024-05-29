package examen;

/**
 * Esta clase pretende comprobar que la hora que se da es valida y correcta
 * @author Sergio Nalda
 * 
 */

public class Hora {
	public static boolean horaValida;
	
	/**
	 * Este metodo nos devuelve si la hora proporcionada es valida mediante condiciones impuestas a las variables ademas de que deben cumplir todas ellas
	 * @param segundos variable que indica los segundos
	 * @param minutos variable que indica los minutos
	 * @param horas variable que indica las horas
	 * @return devuelve si la hora proporcionada es valida 
	 */

	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}
