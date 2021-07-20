package br.com.zupedu.dojo.ot4dojo.dto.request;

import br.com.zupedu.dojo.ot4dojo.entidades.Turma;
import br.com.zupedu.dojo.ot4dojo.validations.ValorUnico;
import org.hibernate.validator.constraints.Length;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class TurmaRequest {
    @NotNull
    @NotEmpty
    @Length(max = 50)
    @ValorUnico(obj = Turma.class, fieldName = "nome")
    private String nome;
    @ValorUnico(obj = Turma.class, fieldName = "terminaEm")
    private LocalDateTime terminaEm;

    public Turma toModel() {
        return new Turma(
                this.nome,
                this.terminaEm
        );

    }
}
