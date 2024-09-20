package modelo.vo;

import java.util.ArrayList;

import controlador.Controlador;

public class ModeloDatos {

	private Controlador miControlador;
	private ArrayList<EstudianteVO> estudiantesArray;
	
	public ModeloDatos() {
		estudiantesArray = new ArrayList<EstudianteVO>();
		
	}
	
	public String registrarEstudiante(EstudianteVO miEstudianteVO) {
		for (EstudianteVO estudiante : estudiantesArray) {
			if (estudiante.getDocumento().equals(miEstudianteVO.getDocumento())) {
				return "Error, la persona ya se encuentra registrada";
				
			}
			
		}		
		estudiantesArray.add(miEstudianteVO);
		return "El registro ha sido exitoso";
		
	}
	
	public EstudianteVO consultarEstudiante(String documento) {
		for (EstudianteVO est : estudiantesArray) {
			if (est.getDocumento().equals(documento)) {
				return est;
			}
			
		}
		return null;
		
	}
	
	public ArrayList<EstudianteVO> consultarEstudiantes() {
		return estudiantesArray;
	}
	
	public String actualizarEstudiante(String documento, EstudianteVO estudianteActualizado) {
		for (int i = 0; i < estudiantesArray.size(); i++) {
			if (estudiantesArray.get(i).getDocumento().equals(documento)) {
				estudiantesArray.set(i, estudianteActualizado);
				return "El estudiante ha sido actualizado correctamente";
			}
		}
		return "El estudiante no se encuentra en la base de datos";
		
	}
	
	public String eliminarEstudiante (String documento) {
		for (int i = 0; i < estudiantesArray.size(); i++) {
			if (estudiantesArray.get(i).getDocumento().equals(documento)) {
				estudiantesArray.remove(i);
				return "El estudiante ha sido eliminado correctamente";
			}
		}
		return "El estudiante no se encuentra en la base de datos";
		
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
		
	}
	
	/* public String registrarDatos() {
		
	} */

}
