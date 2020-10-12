package trabajocloud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoCLOUD {
    
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);        
                List<String> Lista = new ArrayList<>();

     int opc2=0;
     int opc;
             String Dato;

       do{ 
        System.out.println("Que desea realizar:");
        System.out.println("Elija una opcion.............................");
        System.out.println("1. Insertar dato");
        System.out.println("2. Leer lista");
        System.out.println("3. Actualizar lista");
        System.out.println("4. Borrar elemento de la lista");
        System.out.println("5. Salir del programa");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                 do{
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el dato");
        String dato;
        dato= lector.nextLine();
        Lista.add(dato);
       System.out.println("\ndesea insertar otro dato?"
               + "\n presione "
               + "\n1=Si    "
               + "\n2=No");
       opc2=lector.nextInt();
       }while(opc2!=2); 
                    break;
            case 2:
            if(Lista.isEmpty()){
            System.out.println("La lista está vacia."
                    + "\ningrese un dato: "); }
     else{
        for (int i = 0; i <= Lista.size() - 1; i++) {
            System.out.println(i+"."+Lista.get(i));
        }  
      }     
            break;
            case 3:
                if(Lista.isEmpty()){
        System.out.println("La lista está vacia"
                + "\nIngrese otro dato: "); }

        else{
        for (int i = 0; i <= Lista.size() - 1; i++) {
            System.out.println(i+"."+Lista.get(i));
        }
        
        try{
        System.out.println("\n¿Que dato desea modificar?");
        int dato1;
        dato1= leer.nextInt();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nuevo dato");
        String dato2;
        dato2= lector.nextLine();
        Lista.set(dato1,dato2);
         for (int i = 0; i <= Lista.size() - 1; i++) {
            System.out.println(i+"."+Lista.get(i));
        }
         
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la modificacion");
        }
     } 
                
                break;
            case 4:
                if(Lista.isEmpty()){
        System.out.println("La lista está vacia"
                + "\nIngrese un dato"); 
         }

       else{
        for (int i = 0; i <= Lista.size() - 1; i++) {
       System.out.println(i+"."+Lista.get(i));}
                    System.out.println("\n1.- borrar lista."
                            + "\n2.- borrar un elemento.");
       int opc1;
        Scanner lector = new Scanner(System.in);
        opc= lector.nextInt();
        if (opc==2){
        try{ 
        System.out.println("Que dato desea eliminar?");
        int dato; 
        dato= lector.nextInt();
        Lista.remove(dato);
        System.out.println("El dato ha sido eliminado...");
        System.out.println("Nueva lista");
        for (int i = 0; i <= Lista.size() - 1; i++) {
            System.out.println(i+"."+Lista.get(i));
        }
        }
        catch(Exception e){
            System.out.println("El dato que ingresó, no exixte.");
        }
        }
        else {
            Lista.clear();
            System.out.println("Se ha eliminado la lista con exito");
        }
        }
                break;
            case 5:
                System.out.println("Saliendo.");
                 System.exit(0);
            break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }

          System.out.println("\n¿Desea realizar otro proceso? "
                  + "\npresione "
                  + "\n1=Si    "
                  + "\n2=No");
       opc2=leer.nextInt();
       }while(opc2!=2); 
    }

}
