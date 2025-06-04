public class variable {

    // tipos de numeros
    // byte - 1byte -128 -127
    // short - 2bytes
    // int - 4bytes
    // long - 8bytes
    // float -decimal 4bytes
    // double-decimal 8bytes

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte age; // declaracion
        age = 22;// asignacion

        short birthyear;
        birthyear = 1990; // inicializacion
        int cityPopulation = 4_000_000;
        long countryPopulation = 40_000_0000;

        float height = 1.78f;
        double weight = 65.65;
        boolean hasPet= true ;
        char type ='A' ;
        String name = "pepe" ;

        System.out.println("Edad"+ age) ;
        System.out.println("fecha"+ birthyear) ;
        System.out.println("poblacion de mi cuidad "+ cityPopulation); 
        System.out.println("poblacion de mi pais "+ countryPopulation);
        
        System.out.println("""
                Altura %s mts
                peso % kgs 
                ¿tienes mascota ? %s
                tipo %s
                nombre %s
                """.formatted(height,weight,hasPet,type,name));

                

        

    }

}
