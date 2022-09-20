

package test.entregatres;


public class EntregaTres {

    public static void main(String[] args) {
        
        //Ejemplo
        String[] arrayTexto={"Hola"," ","como"," ","estas","?"};
        
        String salida=concatenar(arrayTexto);
        
        System.out.println(salida);
        
    }
    
    
    public static String concatenar(String[] arrayTexto){
        
            
            String acum="";
        for (String t : arrayTexto) {
            acum += t;
        }
        return acum;
    }
    
    
}
