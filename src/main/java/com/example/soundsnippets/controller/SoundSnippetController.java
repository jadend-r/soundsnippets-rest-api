package com.example.soundsnippets.controller;

import com.example.soundsnippets.model.SoundSnippet;
import com.example.soundsnippets.repository.SoundSnippetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/snippets")
public class SoundSnippetController {

    private final SoundSnippetRepository repository;

    public SoundSnippetController(SoundSnippetRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<SoundSnippet> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public SoundSnippet getById(@PathVariable UUID id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public SoundSnippet create(@RequestBody SoundSnippet snippet) {
        return repository.save(snippet);
    }

    @PutMapping("/{id}")
    public SoundSnippet update(@PathVariable UUID id, @RequestBody SoundSnippet updated) {
        SoundSnippet existing = repository.findById(id).orElseThrow();
        existing.setName(updated.getName());
        existing.setDescription(updated.getDescription());
        existing.setCategory(updated.getCategory());
        existing.setUrl(updated.getUrl());
        return repository.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        repository.deleteById(id);
    }
}
