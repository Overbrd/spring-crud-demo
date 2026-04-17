package com.matthewlind.springcrud;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public List<Project> findAll() {
        return repo.findAll();
    }

    public Project findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    public Project create(Project p) {
        return repo.save(p);
    }

    public Project update(Long id, Project p) {
        Project existing = findById(id);
        existing.setName(p.getName());
        existing.setDescription(p.getDescription());
        existing.setStatus(p.getStatus());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
