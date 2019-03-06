package ejemplo_builder_pizza;

/**
 * Clase donde se hará el Builder
 *
 * @author lvaqueiroperez
 */
public class PizzaBuilder {

    //inicializar los atributos opcionales con un valor arbitrario
    private float grHarina;
    private float mlAgua;
    private float grSal = 0;
    private float mlAceite = 0;
    private String tipoAceite = "";
    private float grTomate = 0;
    private float grQueso = 0;
    private String tipoQueso = "";
    private float grPinha = 0;

    /**
     * Constructor de la clase Builder donde solo se pondran los atributos
     * obligatorios como parámetros y con "final"
     *
     * @param grHarina
     * @param mlAgua
     */
    public PizzaBuilder(final float grHarina, final float mlAgua) {

        this.grHarina = grHarina;
        this.mlAgua = mlAgua;

    }

    //PONER SETTERS MODIFICADOS DE LOS ATRIBUTOS OPCIONALES:
    //DEVUELVEN UNA VARIABLE DEL TIPO DE LA CLASE Y SE LE PONE UN "RETURN THIS"
    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;

    }

    /**
     * Método que finalmente devuelve un objeto de tipo Pìzza con los parámetros
     * puestos
     *
     * @return objeto Pizza
     */
    public Pizza createPizzaManual() {

        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);

    }

}
