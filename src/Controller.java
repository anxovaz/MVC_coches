/**
 * Clase Controller
 * @author Anxo Vázquez
 * @version 1.0
 */
public class Controller {
    /**
     * Mét0do main que lanza el menu de la view
     * @param args
     */
    public static void main(String[] args) {
        // Instanciamos la vista y el modelo
        View miView = new View();
        Model miModel = new Model();
/*
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
        }

        System.out.println("================");
 */
        while(true) {
            String[] respuesta = View.menu();

            //SALIR
            if (respuesta[0].compareTo("s") == 0) {
                miView.mostrar("Saliendo...");
                break;
            }

            //CREAR COCHE
            if (respuesta[0].compareTo("c") == 0) { //coche
                miModel.crearCoche(respuesta[1], respuesta[2]);
            } else if (respuesta[0].compareTo("v") == 0) { //VER VELOCIDAD
                boolean confirmacion = miView.muestraVelocidad(respuesta[1], miModel.getVelocidad(respuesta[1]));
                if (confirmacion) {
                    miView.mostrar("[LOG] Correcto");
                } else {
                    miView.mostrar("[LOG] Error");
                }
            } else if (respuesta[0].compareTo("a")==0) {
                int nuevaVel = miModel.acelerar(respuesta[1], Integer.parseInt(respuesta[2])); //le pasa la matricula y la nueva velocidad convertida a integer
                if(nuevaVel == -1){
                    miView.mostrar("[LOG] Error, coche no encontrado");
                }else{
                    miView.mostrar("[LOG] Correcto");
                }
            }else{
                miView.mostrar("[LOG] ERROR opción incorrecta");
            }





        }
    }

}
