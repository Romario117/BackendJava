package practicaMona.modelos;

public class MainMona {

    public static void main(String[] args) {

        MonaCatModelo aviadora = new MonaAviador();
        MonaCatModelo actor = new MonaActor();
        MonaCatModelo bicker = new MonaBicker(1.2,"Negro","Femenino","Artemia","Pista",120.5,"Yamaha","Mexicali","Tulum");
        MonaCatModelo chef = new MonaChef();
        MonaCatModelo dev = new MonaDev();
        MonaCatModelo student = new MonaStudent();

        //agregando algunas propiedades

        aviadora.setAltura(1.2);
        actor.setColor("Verde");
        bicker.getNombre();
        chef.setAltura(1.23);
        dev.setNombre("Fernanda");
        student.setNombre("Romario");

        System.out.println(aviadora.getAltura());
        System.out.println(actor.getColor());
        System.out.println(bicker.getNombre());
        System.out.println(chef.getAltura());
        System.out.println(dev.getNombre());
        System.out.println(student.getNombre());


    }
}
