package com.pedro.projeto.projetocjava.models.candidatos;
import lombok.Data;

import java.util.UUID;

@Data
public class CandidatoEntity {
    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculo;


}
