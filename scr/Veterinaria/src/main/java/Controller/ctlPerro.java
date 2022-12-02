/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Dog;
import Model.modeloPerro;

/**
 *
 * @author zambr
 */
public class ctlPerro {
    
    private modeloPerro modeloPerro;
    
    public ctlPerro(){
        modeloPerro = new modeloPerro();
    }
    
    public String registrarPerro(Dog objectDog){
        
        //Validar que el objeto de tipo perro es correcto
        
        boolean result = modeloPerro.crear(objectDog);
        
        if(result){
            return "OK";
        }else{
            return "Ocurrio un error al almacenar el perro";
        }        
        
    }
    
    public boolean eliminarPerro(int codigo){
        
        //Validar si existe el dato
        
        boolean result = modeloPerro.eliminar(codigo);
        
        return result;
    }
    
    public Dog[] buscarGeneral(String buscar, String valor){    
        
        //Validar antes de enviar al modelo
        
        
        if(buscar.equals("nombre")){
            return modeloPerro.obtenerListadoPorNombre(valor);
        }else{
            return modeloPerro.obtenerListadoPorRaza(valor);
        }
        
    }
    
    public Dog buscarPerroCodigo(int codigo){    
        
        //Validar antes de enviar al modelo
        
        Dog perro = modeloPerro.obtenerPerro(codigo);
        
        return perro;
        
    }
    
}
