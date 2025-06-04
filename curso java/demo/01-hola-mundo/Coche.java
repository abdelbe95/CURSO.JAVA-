public class Coche {
    public static void main(String[] args) {
        byte age= 25;
        short registration =2000;
        boolean isFamilair = true ;
        int kilometers = 250000;
        float height = 1.85f;
        double BROAD = 30.05;
        char type = 'b';
        String name = "Fiat";


        System.out.println("""
                nombre %s
                tipo %s
                año %s
                recorridodelcoche %s
                ¿como es el coche?
                vida de coche 
                """.formatted(name,type, registration,kilometers,isFamilair,age));

    }
}
