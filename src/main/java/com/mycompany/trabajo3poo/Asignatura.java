/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo3poo;

/**
 *
 * @author Pc Daniel
 */
public class Asignatura {
   
    String nombreAsignatura ;
    String nombreDocente;
    String nombreCarrera;
    public Asignatura (String nombreAsignatura,
            String nombreDocente,String nombreCarrera){
        this.nombreAsignatura= nombreAsignatura;
        this.nombreDocente= nombreDocente;
        this.nombreCarrera=nombreCarrera;
        
        
        
    }
    public String getinfoAsignatura(){
        var retorno= "La asignatura se llama "+ this.nombreAsignatura + "su docente es "+
                this.nombreDocente+ " y es una asignatura que pertenece a "+ this.nombreCarrera;
        return retorno ;
        
        
        
    
    
}}
