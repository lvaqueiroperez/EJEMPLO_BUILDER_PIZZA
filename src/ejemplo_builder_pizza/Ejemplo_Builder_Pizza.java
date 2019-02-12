/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_builder_pizza;

/**
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

    }

}
