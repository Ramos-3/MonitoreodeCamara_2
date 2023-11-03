package monitoreo.de.camaras;

import java.util.List;

public class MonitoreoDeCamaras {

    public static void main(String[] args) {
        SistemaMonitoreoCamara sistemaMonitoreo = new SistemaMonitoreoCamara();

        // Agregar cámaras al sistema
        sistemaMonitoreo.addCamera(new Camara("cam001", "Entrada Principal"));
        sistemaMonitoreo.addCamera(new Camara("cam002", "Pasillo Interior"));

        // Acceder a la lista de cámaras
        List<Camara> cameras = sistemaMonitoreo.getCameras();

        for (Camara camera : cameras) {
            System.out.println("Cámara ID: " + camera.getId());
            System.out.println("Ubicación: " + camera.getLocation());
        }

        // Ver una imagen de una cámara específica
        String cameraIdToView = "cam001";
        byte[] image = sistemaMonitoreo.viewCameraImage(cameraIdToView);
        if (image != null) {
            System.out.println("Vista previa de la cámara " + cameraIdToView);
            // Aquí puedes mejorar la visualización de la imagen
            // En lugar de imprimir el array de bytes, considera convertirlo en una representación de imagen.
        } else {
            System.out.println("Cámara no encontrada");
        }
    }
}
    
    

