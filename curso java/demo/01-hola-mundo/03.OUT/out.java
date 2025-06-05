// 
public class out {

    public static void main(String[] args) {
        
    String name = "pepe" ; 
    String surname= "perez " ;
     int age  = 33;

    // println - expresion 
    System.out.println("hola"+name + " ¿ como estast? ");

    System.out.printf("hola %s %s \n como estas " )

    System.out.println(""" 
    Hola %s %s
    ¿ como estas a tus %s año0s ?    
     """.formatted(name,surname,age));
    }
} 
