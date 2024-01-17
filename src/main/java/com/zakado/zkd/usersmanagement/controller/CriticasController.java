package com.zakado.zkd.usersmanagement.controller;

import com.zakado.zkd.usersmanagement.model.Reviews;
import com.zakado.zkd.usersmanagement.service.CriticasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class CriticasController {

    private final CriticasService criticasService;

    @GetMapping
    public List<Reviews> buscarTodas() {
        return criticasService.buscarTodas();
    }

    @GetMapping("/movie/{idPel}")
    public List<Reviews> buscarCriticasPorIdPelicula(@PathVariable("idPel") Integer idPel) {
        return criticasService.buscarCriticasPorIdPelicula(idPel);
    }

    @GetMapping("/{id}")
    public Reviews buscarCriticaPorId(@PathVariable("id") Integer id) {
        return criticasService.buscarCriticasPorId(id);
    }

    @PostMapping
    public void guardarCritica(@RequestBody Reviews critica) {
        criticasService.guardarCritica(critica);
    }
}
