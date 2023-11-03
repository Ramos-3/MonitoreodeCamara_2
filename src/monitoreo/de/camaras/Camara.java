/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

public class Camara {
    private String id;
    private String location;

    public Camara(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    /**
     * Captura una imagen desde la cámara (simulación).
     *
     * @return Una cadena que representa la imagen capturada.
     */
    public String captureImage() {
        // Simulación de la captura de una imagen
        return "Imagen capturada desde la cámara " + id;
    }
}

