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
public class Cuenta {
    private double saldo;
    private int retiros;

    public Cuenta() {
        saldo = 0;
    }
    public void depositar(double monto) throws MontoExcedidoException{
        System.out.println("Depositando"+monto);
        if(monto>=20000)
            throw new MontoExcedidoException();
        
        saldo+=monto;
    }
    public void retirar(double monto) throws SaldoInsuficienteException, RetirosMaximosException{
    
        if(retiros<3){
        System.out.println("Retirando"+monto);
        if(saldo<monto){
            throw new SaldoInsuficienteException();   
            
        }}
        else{
            System.out.println("Retiros realizados:"+retiros);
            throw new RetirosMaximosException();}
        retiros=retiros+1;
        saldo-=monto;
    }
    public void consultaSaldo(){
        System.out.println(saldo);
    }
}
