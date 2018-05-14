
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BautistS
 */
@Stateless
@Path("calculator")
public class calculator { 
    @GET
    @Path("mult/{numeros: .+}")
    public String mult(@PathParam("numeros") String numeros){
         String parts[] = numeros.split("/");
        if (parts.length < 2){
            return "Se deben indicar por lo menos dos números";
        }
        else{  
            int valor = 1;
            for (int i = 1; i < parts.length; i++){ 
                if (valor == 1)
                    valor = Integer.parseInt(parts[i-1])*Integer.parseInt(parts[i]);
                else
                    valor = valor*Integer.parseInt(parts[i]);
            }
            return String.valueOf(valor);
        }
    }
    
    @GET
    @Path("add/{numeros: .+}")
    public String add(@PathParam("numeros") String numeros){
        String parts[] = numeros.split("/");
        if (parts.length < 2){
            return "Se deben indicar por lo menos dos números";
        }
        else{
            int valor = 0;
            for (int i = 0; i < parts.length; i++){ 
                valor = valor +  Integer.parseInt(parts[i]);
            }
            return String.valueOf(valor);
        }
    }
    
    @GET
    @Path("subs/{numeros: .+}")
    public String subs(@PathParam("numeros") String numeros){
         String parts[] = numeros.split("/");
        if (parts.length < 2){
            return "Se deben indicar por lo menos dos números";
        }
        else{
            int valor = 0;
            for (int i = 1; i < parts.length; i++){ 
               if (valor == 0)
                    valor = Integer.parseInt(parts[i-1])-Integer.parseInt(parts[i]);
                else
                    valor = valor - Integer.parseInt(parts[i]);
            }
            return String.valueOf(valor);
        }
    }
    
    @GET
    @Path("div/{numeros: .+}")
    public String div(@PathParam("numeros") String numeros){
         String parts[] = numeros.split("/");
        if (parts.length < 2){
            return "Se deben indicar por lo menos dos números";
        }
        else{
            float valor = 0;
            for (int i = 1; i < parts.length; i++){ 
                if (parts[i] == "0"){
                    return "La division por cero no esta definida";
                }
                if (i == 1)
                    valor = Float.valueOf(parts[i-1])/Float.valueOf(parts[i]);
                else
                    valor = valor/Float.valueOf(parts[i]);
            }
            return String.valueOf(valor);
        }
    }
}
