    /**
 * Clase deposito
 * @author Jon San Roman
 * @author Jorge Peris
 * @version 1.0.0
 * @since 1.0.0
 *
 */

public class JavaApplication70 {
    //Campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;

    //Constructor sin parámetros auxiliar
    public JavaApplication70 () { //Lo que hace es llamar al constructor con parámetros pasándole valores vacíos
        this(0,0,"");            } //Cierre del constructor
    /**
     * LLama al constructor con los parámetros iniciales
     * @since 1.0.0
     */

    //Constructor de la clase que pide los parámetros necesarios
    public JavaApplication70 (float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado depósito con valores por defecto diametro 10 metros altura 5 metros id 000" );
        }   } //Cierre del constructor
    /**
     * Método de acceso
     * @param valor_diametro to diametro
     * @param valor_altura to altura
     * @param valor_idDeposito idDeposito
     * @since 1.0.0
     */
    public void setValoresDeposito (String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println ("Valores no admisibles. No se han establecido valores para el depósito");
            //Deposito (0.0f, 0.0f, ""); Esto no es posible. Un constructor no es un método y por tanto no podemos llamarlo
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     } //Cierre del método
    /**
     * Setter de valores
     * @param valor_diametro to diametro
     * @param valor_altura to altura
     * @param valor_idDeposito idDeposito
     * @since 1.0.0
     */
    public float getDiametro () { return diametro; } 
    /**
     * Getter diametro
     * @return diametro
     * @since 1.0.0
     */
    public float getAltura () { return altura; } //Método de acceso
    /**
     * Getter altura
     * @return altura
     * @since 1.0.0
     */
    public String getIdDeposito () { return idDeposito; } //Método de acceso
    /**
     * Getter IdDeposito
     * @return IdDeposito
     * @since 1.0.0
     */
    public float valorCapacidad () { //Método tipo función
        float capacidad;
        float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    
    /**
     * Método que calcula la capacidad mediante una función
     * @return capacidad
     * @since 1.0.0
     */
    
}
