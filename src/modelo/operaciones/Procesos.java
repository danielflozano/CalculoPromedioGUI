package modelo.operaciones;

import java.awt.Color;
import java.util.ArrayList;

import controlador.Controlador;
import modelo.vo.EstudianteVO;

public class Procesos {
	
	private Controlador miControlador;

	public double calcularPromedio(double n1,double n2,double n3) {		
		double promedio = (n1 + n2 + n3) / 3;
		
		return promedio;
		
	}

	public String calcularDefinitiva(double promedio) {
		if (promedio < 3.6) {
			return "Reprobado";
		}
		
		return "Aprobado";
	}

	
	/*	public void registrarEnBD(EstudianteVO estudiante) {
	
	} */


	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
		
	}
	
}
