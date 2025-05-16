package com.example.soundsnippets.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SoundSnippet {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String description;
    private String category;
    private String url;
}
