/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deber_padre_e_hijo;

/**
 *
 * @author rb940
 */

//clase
public class Deber_padre_e_hijo {
    public String nombre, apellido;
    public int edad;
    
    //constructor
    public Deber_padre_e_hijo(String nombre,String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
//metodo
    public void muestra(){
        System.out.println("el nombre y apellido del padre es: "+ nombre+" "+ apellido+"y tiene "+edad+" anos");
    }
    
    //clase
public class Hijo{
    public String nombre_01;
    public int dias_cum;
    
    //constructor
    public Hijo(String nombre_01, int dias_cum){
        this.nombre_01=nombre_01;
        this.dias_cum=dias_cum;
    }
    
    //metodo
    public void show(){
        System.out.println("su hijo de llama: "+nombre_01+""+apellido +"y su edad en dias es: "+dias_cum);
    }
}
            
    public static void main(String[] args) {
       Deber_padre_e_hijo padre = new Deber_padre_e_hijo("Carlos","Garcia ",46);
       Deber_padre_e_hijo.Hijo son =  padre.new Hijo("David ",5110);
                
        padre.muestra();
        son.show();
    }
}



  