package com.matthewlind.springcrud;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<Project> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Project one(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Project create(@RequestBody Project p) {
        return service.create(p);
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable Long id, @RequestBody Project p) {
        return service.update(id, p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
