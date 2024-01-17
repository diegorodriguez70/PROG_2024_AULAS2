package ejercicio2;

import java.util.Arrays;

public class Aula {

	private Alumnos capacidad[];
	private int cuantosHay;

	public Aula(int cantidad) {
		this.capacidad = new Alumnos[cantidad];
		cuantosHay = 0;
	}

	public void AddAllumno(Alumnos alumno) {
		if (cuantosHay < capacidad.length) {
			capacidad[cuantosHay] = alumno;
			cuantosHay++;
		}
		System.out.println(this);
	}

	public String toString() {
		return Arrays.toString(capacidad);
	}
}
