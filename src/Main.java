import practicaHarry.PersonajesHarry;

public class Main {
    public static void main(String[] args) {
        PersonajesHarry newt = new PersonajesHarry("Newton \"Newt\" Artemis Fido Scamander","Hufflepuff","escritorio de oficina","Kelpie");
        PersonajesHarry potter = new PersonajesHarry("Harry Potter","Gryffindor","Dementor","Stag");
        PersonajesHarry goyle = new PersonajesHarry("Gregory Goyle", "Slytherin","Lord Voldemort", "None");
        PersonajesHarry voldemort = new PersonajesHarry("Tom Marvolo Riddle", "Slytherin", "Muerte","None");
        PersonajesHarry dumbledore = new PersonajesHarry("Albus Percival Wulfric Brian Dumbledore","Gryffindor"," Muerte de su hermana", "Fenix");



        System.out.println("Nombre : " +newt.getNombre() + " \n" + "Casa :" + newt.getCasa() + " \n Boggart:" + newt.getBoggart() + " \n Patronus :" + newt.getPatronus());
        System.out.println("Nombre : " +potter.getNombre() + " \n" + "Casa :" + potter.getCasa() + " \n Boggart:" + potter.getBoggart() + " \n Patronus :" + potter.getPatronus());
        System.out.println("Nombre : " +goyle.getNombre() + " \n" + "Casa :" + goyle.getCasa() + " \n Boggart:" + goyle.getBoggart() + " \n Patronus :" + goyle.getPatronus());
        System.out.println("Nombre : " +voldemort.getNombre() + " \n" + "Casa :" + voldemort.getCasa() + " \n Boggart:" + voldemort.getBoggart() + " \n Patronus :" + voldemort.getPatronus());
        System.out.println("Nombre : " +dumbledore.getNombre() + " \n" + "Casa :" + dumbledore.getCasa() + " \n Boggart:" + dumbledore.getBoggart() + " \n Patronus :" + dumbledore.getPatronus());


    }
}
