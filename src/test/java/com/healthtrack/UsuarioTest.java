package com.healthtrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testActualizarPeso() {
        Usuario user = new Usuario("Carlos", 70.0);
        user.actualizarPeso(72.5);
        assertEquals(72.5, user.getPeso(), 0.01);
    }

    @Test
    void testNoActualizarPesoIncorrectamente() {
        Usuario user = new Usuario("Ana", 60.0);
        user.actualizarPeso(59.0);
        assertNotEquals(59.0 - 1, user.getPeso()); // Ya no debería restar 1
    }
}
