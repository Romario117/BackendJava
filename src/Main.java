import practicaHarry.PersonajesHarry;

public class Main {
    public static void main(String[] args) {
        PersonajesHarry pH = new PersonajesHarry("Newton \"Newt\" Artemis Fido Scamander","Hufflepuff","escritorio de oficina","Kelpie");

        System.out.println("Nombre : " +pH.getNombre() + " \n" + "Casa :" + pH.getCasa() + " \n Boggart:" + pH.getBoggart() + " \n Patronus :" + pH.getPatronus());

    }
}
