import java.util.Scanner;
public class VentasBatch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int meta, nroVtas, cantVta, cantVtaProd, cantProdMasVen=0, precio, prod0Vtas=0, prodSupMeta=0, totalProd;
        int mayorMonto=0, montoTotalVentas=0;
        String nomProd, prodMasVen="";
        float porcMonProd;

        //System.out.println("Ingresa la meta de ventas: ");
        meta = sc.nextInt();
        
        //System.out.println("Ingresa el nombre del producto: ");
        nomProd = sc.next();

        while(!(nomProd.equals("-1"))){

            cantVtaProd = 0;
            totalProd=0;
            //System.out.println("Ingresa el precio del producto "+ nomProd);
            precio = sc.nextInt();

            //System.out.println("Ingresa el numero de ventas del producto "+ nomProd);
            nroVtas = sc.nextInt();

            // Contador productos sin ventas
            if (nroVtas == 0){
                prod0Vtas ++;
            }

            // Ciclo para las ventas de cada producto
            for (int i=0; i < nroVtas; i++){
                //System.out.println("Ingresa la cantidad de compras del producto: ");
                cantVta = sc.nextInt();
                cantVtaProd += cantVta;
            }
            
            totalProd = cantVtaProd * precio;

            montoTotalVentas += totalProd;

            // Contador productos que superan la meta
            if (totalProd > meta){
                prodSupMeta ++;
            }

           

            // Obtener el nombre del prodcuto mas vendido
            // Asignar el monto como el monto del producto mas vendido
            if (cantVtaProd > cantProdMasVen){
                prodMasVen = nomProd;
                mayorMonto = cantVtaProd*precio;
                
            }

            //System.out.println("Ingresa el nombre del producto");   
            nomProd = sc.next();
        }

        porcMonProd = (mayorMonto*100/(float)montoTotalVentas);


        System.out.println("REPORTE DE VENTAS");
        System.out.println("------------------");
        System.out.println("Nro. de productos sin ventas: " + prod0Vtas);
        System.out.println("Nro. de productos con ventas superiores a la meta: " + prodSupMeta);
        System.out.println("Nombre producto mas vendido: " + prodMasVen);
        System.out.println("% monto ventas del producto mas vendido con respecto del monto total vendido: "+  porcMonProd);
        sc.close();
    }
    
    
}
