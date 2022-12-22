package ro.digitalnation.mircea.clase;

public class camera {
	
 Long idCamera;
 Long nrCamera;
public Long getIdCamera() {
	return idCamera;
}
public void setIdCamera(Long idCamera) {
	this.idCamera = idCamera;
}
public Long getNrCamera() {
	return nrCamera;
}
public void setNrCamera(Long nrCamera) {
	this.nrCamera = nrCamera;
}
public camera(Long idCamera, Long nrCamera) {
	super();
	this.idCamera = idCamera;
	this.nrCamera = nrCamera;
}
 
}
