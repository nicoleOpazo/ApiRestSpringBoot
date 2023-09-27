package com.h2.h2api.repositorios;

import com.h2.h2api.modelos.Carrito;
import com.h2.h2api.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCarrito extends JpaRepository<Carrito, Long> {
    //Obtener el carrito de compras de un usuario
    Carrito findCarritoByUsuario(Usuario usuario);
}
