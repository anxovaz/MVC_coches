/**
 * Clase coche que define un coche
 *
 * @author Anxo Vázquez
 * @version examen
 */
public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    public int gasolina;

    /**
     * Constructor
     * @param modelo
     * @param matricula
     */
    public Coche(String modelo, String matricula) { //para simplioficar no pido gasolina a la hora de instanciar Coche y la inicializo a 0
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 0; //inicializa gasolina a 0
    }

    /**
     * Métod0 aumentarVelocidad que aumenta la velocidad del coche
     * @param vel nueva int
     * @return velocidad int
     */
    public int aumentarVel(int vel){
        this.velocidad+=vel;
        return this.velocidad;
    }

    public int aumentarGas(int gas){
        this.gasolina += gas;
        return this.gasolina;
    }
}
