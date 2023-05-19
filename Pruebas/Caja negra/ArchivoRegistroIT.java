/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ArchivoRegistroIT {
    
    public ArchivoRegistroIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of guardarRegistro method, of class ArchivoRegistro.
     */
    @Test
    public void testGuardarRegistro() {
        System.out.println("guardarRegistro");
        Object objeto = null;
        ArchivoRegistro instance = new ArchivoRegistro();
        instance.guardarRegistro(objeto);
        
    }

    /**
     * Test of verificarCredenciales method, of class ArchivoRegistro.
     */
    @Test
    public void testVerificarCredenciales() {
        System.out.println("verificarCredenciales");
        String nombreUsuario = "";
        String contraseña = "";
        ArchivoRegistro instance = new ArchivoRegistro();
        boolean expResult = false;
        boolean result = instance.verificarCredenciales(nombreUsuario, contraseña);
        assertEquals(expResult, result);
        
    }
    
}
