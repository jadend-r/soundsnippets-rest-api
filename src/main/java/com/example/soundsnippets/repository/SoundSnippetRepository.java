package com.example.soundsnippets.repository;

import com.example.soundsnippets.model.SoundSnippet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SoundSnippetRepository extends JpaRepository<SoundSnippet, UUID> {}
