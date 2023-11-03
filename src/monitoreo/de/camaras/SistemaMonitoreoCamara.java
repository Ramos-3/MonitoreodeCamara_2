/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SistemaMonitoreoCamara {
    private final List<Camara> camaras;

    public SistemaMonitoreoCamara() {
        camaras = new ArrayList<>();
    }

    /**
     * Agrega una cámara al sistema.
     *
     * @param camara La cámara a agregar.
     */
    public void addCamera(Camara camara) {
        camaras.add(camara);
    }

    /**
     * Elimina una cámara del sistema por su ID.
     *
     * @param cameraId El ID de la cámara a eliminar.
     */
    public void removeCamera(String cameraId) {
        camaras.removeIf(camera -> camera.getId().equals(cameraId));
    }

    /**
     * Obtiene la lista de cámaras en el sistema.
     *
     * @return Una lista de cámaras.
     */
    public List<Camara> getCameras() {
        return camaras;
    }

    /**
     * Obtiene una imagen de una cámara específica por su ID.
     *
     * @param cameraId El ID de la cámara de la que se desea obtener la imagen.
     * @return Un array de bytes que representa la imagen capturada, o null si la cámara no se encuentra.
     */
    public byte[] viewCameraImage(String cameraId) {
        Optional<Camara> camaraOptional = camaras.stream().filter(camara -> camara.getId().equals(cameraId)).findFirst();
        if (camaraOptional.isPresent()) {
            return ("Imagen capturada desde la cámara " + cameraId).getBytes();
        } else {
            return null; // Cámara no encontrada
        }
    }
}

