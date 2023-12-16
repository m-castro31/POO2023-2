package edu.co.ucaldas.ingenieria.poo.soc.service;


import edu.co.ucaldas.ingenieria.poo.soc.dto.Persona;
import edu.co.ucaldas.ingenieria.poo.soc.dto.Respuesta;
import java.util.HashMap;
import java.util.Map;
import edu.co.ucaldas.ingenieria.poo.soc.admin.Admin;

public class AdminService {

    public Respuesta login(String email, String password){ // Metodo 
        Respuesta respuesta =  new Respuesta();
        Admin admin =  new Admin();
        Persona persona = new Persona();
        String cuentaAdmin = admin.getListaAdmins().get(email);
        String cuentaPersona = persona.getListaPersonas().get(email);
        if(cuentaAdmin != null || cuentaPersona != null){
            if(password.equals(cuentaAdmin) || password.equals(cuentaPersona)){
                respuesta.setStatus(true);
                respuesta.setMensaje("Se logeo correctamente");
            }else{
                respuesta.setStatus(false);
                respuesta.setMensaje("La contraseña ingresada es incorrecta");
            }

        }else{
            respuesta.setStatus(false);
            respuesta.setMensaje("La cuenta no existe");
        }

        return  respuesta;
    }

}
