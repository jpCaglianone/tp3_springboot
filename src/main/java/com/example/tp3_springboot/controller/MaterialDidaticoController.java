package com.example.tp3_springboot.controller;

import com.example.tp3_springboot.model.core.MaterialDidatico;
import com.example.tp3_springboot.model.service.MaterialDidaticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/materialDidatico")
public class MaterialDidaticoController {

    @Autowired
    private MaterialDidaticoService service;

    @GetMapping
    public List<MaterialDidatico> getAllMaterials() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MaterialDidatico> getMaterialById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public MaterialDidatico createMaterial(@RequestBody MaterialDidatico materialDidatico) {
        return service.save(materialDidatico);
    }

    @PutMapping("/{id}")
    public MaterialDidatico updateMaterial(@PathVariable String id, @RequestBody MaterialDidatico materialDidatico) {
        materialDidatico.setId(id);
        return service.save(materialDidatico);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable String id) {
        service.deleteById(id);
    }
}
