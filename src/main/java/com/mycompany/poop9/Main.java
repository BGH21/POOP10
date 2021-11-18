/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop9;


/**
 *
 * @author Belen Gaytan Herrera
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("################Arreglos################");
        try{
        String mensajes[]={"Mensaje 1","Mensaje 2","Mensaje 3"};
        for(int i=0;i<=3;i++){
            System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Fuera de rango");
            System.out.println(e);
        }finally{
            System.out.println("A pesar del error se ejecuta el bloque finally");
        }  
        System.out.println("\n################Aritmetica################");
        try{
            Integer denominador=null;
        float equis=5/denominador;
        System.out.println(equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Fuera de rango");
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("Error:"+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Error:"+e.getMessage());
        }catch(Exception e){
            System.out.println("Error general"+e.getMessage());   
        }
        System.out.println("################Propagacion####################");
        try{
           int division=division(10,0);
            System.out.println(division); 
             
        }catch(ArithmeticException e){
            System.out.println("Ocurrio un Error: "+e.getMessage());
        }
        System.out.println("###########Propagacion 2##############");
        int division2=division2(10,0);
        System.out.println(division2);
        
        System.out.println("#######trhows throw#########");
        try{
        int div3=division3(6,0);
        System.out.println(div3);
        }catch(ArithmeticException e){
            System.out.println("Ocurrio un Error: "+e.getMessage());
        }
        System.out.println("\n#############Creacion nuevas excepciones#################");
        Cuenta miCuenta =new Cuenta();
        try{
        miCuenta.depositar(2000);
            System.out.print("\nSu saldo es: $");
        miCuenta.consultaSaldo();
        miCuenta.retirar(500);
        miCuenta.consultaSaldo();
        miCuenta.retirar(200);
        miCuenta.consultaSaldo();
        miCuenta.retirar(350);
        miCuenta.consultaSaldo();
        miCuenta.retirar(150);
        miCuenta.consultaSaldo();
            miCuenta.retirar(100);
        miCuenta.consultaSaldo();
        }catch(SaldoInsuficienteException e){
            System.out.println("Error:"+e.getMessage());
        }catch(MontoExcedidoException e){
            System.out.println("Error:"+e.getMessage());
        } catch (RetirosMaximosException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }
    
    private static int division(int a,int b){
        int c=a/b;
        return c;
    }
    private static int division2(int a,int b){
        int c=0;
        try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Error: "+e);
        }
        return c;
    }
    
    private static int division3(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("División entre 0, no lo vuelvas a hacer");
        }
        int c=a/b;
        return c;
    }
}
