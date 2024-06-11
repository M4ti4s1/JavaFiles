import java.util.Scanner;

public class AgendaContactos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] agenda = new String[10][4];
        String[] regiones = {
            "Arica y Parinacota",
            "Tarapaca",
            "Antofagasta",
            "Atacama",
            "Coquimbo",
            "Valparaiso",
            "Metropolitana",
            "O'Higgins",
            "Maule",
            "Nuble",
            "Biobio",
            "La Araucanía",
            "Los Rios",
            "Los Lagos",
            "Aysen",
            "Magallanes"
        };
        int cantContactos=0, opc;
        String find, email="", telefono="", nombre="", region=""; 
        int contactoRegion;

        // Ciclo Menu
        do{
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Ingresa nuevo contacto a la agenda");
            System.out.println("2. Desplegar datos de un contacto");
            System.out.println("3. Salir\n");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    agenda[cantContactos][0] = sc.next();
                    agenda[cantContactos][1] = sc.next();
                    agenda[cantContactos][2] = sc.next();
                    // region
                    contactoRegion = sc.nextInt();
                    agenda[cantContactos][3] = regiones[contactoRegion]; 
                    cantContactos++;                    
                    break;
                case 2:
                    find = sc.next();
                    for (int i = 0; i < cantContactos; i++) {
                       if (find.equalsIgnoreCase(agenda[i][0])){
                            nombre= agenda[i][0];
                            email = agenda[i][1]; 
                            telefono = agenda[i][2];
                            region = agenda[i][3]; 
                       }
                    }
                    if((!nombre.isEmpty()) && (!email.isEmpty()) && (!telefono.isEmpty()) && (!region.isEmpty())){
                        System.out.println(nombre);
                        System.out.println(email);
                        System.out.println(telefono);
                        System.out.println(region);
                    }else{
                        System.out.println("Informacion no encontrada");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opc != 3);
        
        

    }
}
