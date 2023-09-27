package com.h2.h2api.servicios;

import com.h2.h2api.modelos.Carrito;
import com.h2.h2api.modelos.Usuario;

public interface ServicioCarrito {
    Carrito guardarCarrito(Carrito carrito);

    Carrito obtenerCarrito(Long idCarrito);

    Carrito modificarCarrito(Long id, Carrito carritoModificar);

    boolean eliminarCarrito(Long id);

    //Obtener el carrito de un usuario
    Carrito obtenerCarritoPorUsuario(Usuario usuario);
}
