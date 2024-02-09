package com.zakado.zkd.usersmanagement.service;


import com.zakado.zkd.usersmanagement.model.Rol;

import java.util.List;

public interface RolService {
    List<Rol> buscarTodos();

    Rol buscarRolPorId(Integer idRol);

    void guardarRol(Rol rol);

    void eliminarRol(Integer idRol);
}