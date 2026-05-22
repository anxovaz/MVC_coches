import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {
        // Instanciamos la vista y el modelo
        View miView = new View();
        Model miModel = new Model();

        // Crear tres coches
        miModel.crearCoche("LaFerrari", "SBC 1234");
        miModel.crearCoche("Alpine", "HYU 4567");
        miModel.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModel.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("[LOG] Correcto");
        } else {
            System.out.println("[LOG] Error");
        } ;

        System.out.println("================");
        while(true) {
            String[] respuesta = View.menu();
            if (respuesta[0].compareTo("s") == 0) {
                System.out.println("Saliendo...");
                break;
            }
            if (respuesta.length == 2) {
                if (respuesta[0].compareTo("c") == 0) { //coche
                    miModel.crearCoche("LaFerrari", "SBC 1234");
                } else if (respuesta[0].compareTo("v") == 0) { //ver velociad
                    boolean confirmacion = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));
                    if (confirmacion) {
                        System.out.println("[LOG] Correcto");
                    } else {
                        System.out.println("[LOG] Error");
                    }

                }

            }
        }

    }

}
