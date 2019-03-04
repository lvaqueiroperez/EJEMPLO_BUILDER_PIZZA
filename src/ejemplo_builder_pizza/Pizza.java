package ejemplo_builder_pizza;

/**
 *Clase donde se crearán los atributos de los objetos y el constructor inicial
 * @author lvaqueiroperez
 */
public class Pizza {
    
    //atributos
    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private String tipoAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;

    
    /**
     * Constructor donde pondremos todos los atributos de la clase y
     * como "final" aquellos que serán obligatorios
     * @param grHarina
     * @param mlAgua
     * @param grSal
     * @param mlAceite
     * @param tipoAceite
     * @param grTomate
     * @param grQueso
     * @param tipoQueso
     * @param grPinha 
     */
    public Pizza(final float grHarina, final float mlAgua, float grSal, float mlAceite, String tipoAceite, float grTomate, float grQueso, String tipoQueso, float grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

}
