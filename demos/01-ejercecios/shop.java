
public class shop {
    
    public static void main(String[] args) {
        
    
 
    Scanner scanner = new Scanner (System.in);
    System.out.println(" ¿dime cuantos pedidos quieres ?");
    int paquets = scanner.nextInt();

    double precioOriginal = 10; 
     
    if (paquets>5) {
        System.out.println("no se puede hacer la venta");
    }
    // else  if (paquets>10) {
    //     double porcentajeDescuento = 20.0;
    //    double descuento = (precioOriginal *porcentajeDescuento ) / 100;
    //     double precioFinal = precioOriginal - descuento;
    //       System.out.println(" el coste del envía es del 10€ por paquete.");
    // }
    
    
}
