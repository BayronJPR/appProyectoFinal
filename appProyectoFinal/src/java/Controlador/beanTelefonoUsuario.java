/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author luubs
 */
@Named(value = "beanTelefonoUsuario")
@SessionScoped
public class beanTelefonoUsuario implements Serializable {

    /**
     * Creates a new instance of beanTelefonoUsuario
     */
    public beanTelefonoUsuario() {
    }
    
}
