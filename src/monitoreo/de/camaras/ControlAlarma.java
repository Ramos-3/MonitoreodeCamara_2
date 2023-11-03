
package monitoreo.de.camaras;

public class ControlAlarma {

    /**
     * activa una alarma en la cámara específica (simulado).
     *
     * @param cameraId el ID de la cámara en la que se simulará la activación de la alarma.
     * @return un mensaje que indica que la alarma ha sido activada (simulado).
     */
    public String alarmaActivada(String cameraId) {
        // Implementa la lógica simulada para activar una alarma en la cámara específica.
        return "Alarma activada en la cámara " + cameraId + " (simulado)";
    }

    /**
     * desactiva una alarma en la cámara específica (simulado).
     *
     * @param cameraId el ID de la cámara en la que se simulará la desactivación de la alarma.
     * @return un mensaje que indica que la alarma ha sido desactivada (simulado).
     */
    public String alarmaDesactivada(String cameraId) {
        // implementa la lógica simulada para desactivar una alarma en la cámara específica.
        return "Alarma desactivada en la cámara " + cameraId + " (simulado)";
    }
}
