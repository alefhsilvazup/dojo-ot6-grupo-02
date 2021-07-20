package br.com.zupedu.dojo.ot4dojo.entidades;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max = 50)
    private String nome;

    @CreationTimestamp
    private LocalDateTime inicioEm;

    private LocalDateTime terminaEm;

    @Deprecated
    public Turma(){
    }

    public Turma(String nome, LocalDateTime terminaEm) {
        this.nome = nome;
        this.terminaEm = terminaEm;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getInicioEm() {
        return inicioEm;
    }

    public LocalDateTime getTerminaEm() {
        return terminaEm;
    }
}
