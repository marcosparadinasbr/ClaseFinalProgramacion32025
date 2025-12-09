package com.usal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @ Test
    void fromString_ShouldReturnPersona_WhenInputIsValid () {
        // AAA (Arrange, Act, Assert)
        // Arrange
        String input ="Juan,Garcia";
        // Act
        Persona persona = Persona.fromCSVString(input);
        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellido());
    }
}
