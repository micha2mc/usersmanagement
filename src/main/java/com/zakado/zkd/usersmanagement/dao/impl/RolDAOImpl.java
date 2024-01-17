package com.zakado.zkd.usersmanagement.dao.impl;

import com.zakado.zkd.usersmanagement.dao.RolDAO;
import com.zakado.zkd.usersmanagement.dao.repository.RolRepository;
import com.zakado.zkd.usersmanagement.model.Rol;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class RolDAOImpl implements RolDAO {

    private final RolRepository rolRepository;
    @Override
    public List<Rol> buscarTodos() {
        return rolRepository.findAll();
    }

    @Override
    public Rol buscarRolPorId(Integer idRol) {
        return rolRepository.findById(idRol).orElse(null);
    }

    @Override
    public void guardarRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
        rolRepository.deleteById(idRol);
    }
}
