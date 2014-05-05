/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author feña
 */
public class CuentaCorriente {
   
    private int MontoTotal;

    public CuentaCorriente(int MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public int getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(int MontoTotal) {
        this.MontoTotal = MontoTotal;
    }
}
