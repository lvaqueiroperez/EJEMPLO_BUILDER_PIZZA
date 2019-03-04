package ejemplo_builder_pizza;

public class PizzaBuilderAUTO {

    private float grHarina;
    private float mlAgua;
    private float grSal = 0;
    private float mlAceite = 0;
    private String tipoAceite = "";
    private float grTomate = 0;
    private float grQueso = 0;
    private String tipoQueso = "";
    private float grPinha = 0;

    public PizzaBuilderAUTO(final float grHarina, final float mlAgua) {

        this.grHarina = grHarina;
        this.mlAgua = mlAgua;

    }

    public PizzaBuilderAUTO setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilderAUTO setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilderAUTO setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilderAUTO setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilderAUTO setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilderAUTO setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilderAUTO setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);
    }

}
