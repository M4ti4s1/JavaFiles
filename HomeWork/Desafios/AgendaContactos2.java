import java.util.Scanner;

public class AgendaContactos2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int agendaLimit = 10;
        String[][] agenda = new String[agendaLimit][4];
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
        String find, nameRemove, email="", telefono="", nombre="", region=""; 
        int contactoRegion, indexRemove=-1, indexInsert;

        // Ciclo Menu
        do{
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Ingresa nuevo contacto a la agenda");
            System.out.println("2. Eliminar un Contacto");
            System.out.println("3. Desplegar datos de un contacto");
            System.out.println("4. Salir\n");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    
                
                     
                    if (cantContactos < agendaLimit){
                        

                        if (cantContactos == 0){
                            agenda[cantContactos][0] = sc.next();
                            agenda[cantContactos][1] = sc.next();
                            agenda[cantContactos][2] = sc.next();
                            contactoRegion = sc.nextInt();
                            agenda[cantContactos][3] = regiones[contactoRegion];
                            cantContactos++;

                        }else if(cantContactos == 1){
                            nombre = sc.next();
                            email = sc.next();
                            telefono = sc.next();
                            contactoRegion = sc.nextInt();

                            if (nombre.compareTo(agenda[0][0]) < 0){
                                indexInsert = 0;
                            }else{
                                indexInsert = cantContactos;
                            }                                
                            

                            for (int i = cantContactos; i >= indexInsert; i--){
                                agenda[i+1][0] = agenda[i][0];
                                agenda[i+1][1] = agenda[i][1];
                                agenda[i+1][2] = agenda[i][2];
                                agenda[i+1][3] = agenda[i][3];
                            }
                            agenda[indexInsert][0] = nombre;
                            agenda[indexInsert][1] = email;
                            agenda[indexInsert][2] = telefono;
                            agenda[indexInsert][3] = regiones[contactoRegion];
                            cantContactos++;

                        }else{
                            nombre = sc.next();
                            email = sc.next();
                            telefono = sc.next();
                            contactoRegion = sc.nextInt();

                            indexInsert = cantContactos;

                            for (int i = cantContactos-1; i >= 0; i--){
                                
                                if (nombre.compareTo(agenda[i][0]) < 0){
                                    indexInsert = i;
                                    System.out.println(indexInsert);
                                }
                            }

                            // voy bien

                            for (int i = cantContactos; i >= indexInsert; i--){
                                agenda[i+1][0] = agenda[i][0];
                                agenda[i+1][1] = agenda[i][1];
                                agenda[i+1][2] = agenda[i][2];
                                agenda[i+1][3] = agenda[i][3];
                            }
                            agenda[indexInsert][0] = nombre;
                            agenda[indexInsert][1] = email;
                            agenda[indexInsert][2] = telefono;
                            agenda[indexInsert][3] = regiones[contactoRegion];
                            cantContactos++;
                        }


                    }else{
                        System.out.println("Se alcanzo el maximo de contactos");
                        System.out.println("Borra uno para ingresar uno nuevo...");
                    }
                    
                    break;


                case 2:
                    
                    nameRemove = sc.next();
                    for (int i = 0; i < cantContactos; i++) {
                        if(nameRemove.equals(agenda[i][0])){
                            indexRemove = i;

                        }
                    }

                    for( int i = indexRemove; i <= cantContactos; i++){
                        agenda[i][0] = agenda[i+1][0];
                        agenda[i][1] = agenda[i+1][1];
                        agenda[i][2] = agenda[i+1][2];
                        agenda[i][3] = agenda[i+1][3];

                    } 

                    break;
                
                case 3:
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
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opc != 4);
        



        // escribir la lista de contactos al final del programa
        for (int i = 0; i < cantContactos; i++){
            for (int j = 0; j < agenda[0].length; j++){
                System.out.print(agenda[i][j] + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
