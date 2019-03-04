package ejemplo_builder_pizza;

/**
 * Clase cliente donde se crearán los objetos Pizza a través del Builder
 *
 * @author lvaqueiroperez
 */
public class Ejemplo_Builder_Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pizza hawaiana = new PizzaBuilderAUTO(100, 150).setGrSal(5).setMlAceite(90)
                .setTipoAceite("Virger").setGrPinha(10).createPizza();
        //COMPROBAR QUE ESTÁ BIEN CON UN DEBUG

        Pizza pizzaMiBuilder = new PizzaBuilder(500, 450)
                .setTipoAceite("Extra")
                .setGrSal(100)
                .createPizzaManual();

    }

}
