package com.healthtrack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Usuario usuario = new Usuario("Juan", 70.0);
        usuario.mostrarInformacion();
        usuario.actualizarPeso(68.0); // Intento de actualizar el peso
        usuario.mostrarInformacion(); // Mostrar información después de la actualización
    }
}
