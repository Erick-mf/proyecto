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
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
     * Test of getNombreEmpleado method, of class Empleado.
     */
    @Test
    public void testGetNombreEmpleado() {
        System.out.println("getNombreEmpleado");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getNombreEmpleado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCargoEmpleado method, of class Empleado.
     */
    @Test
    public void testGetCargoEmpleado() {
        System.out.println("getCargoEmpleado");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getCargoEmpleado();
        assertEquals(expResult, result);
        
    }
    
}
