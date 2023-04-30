package kaiba.corp.academia.digital.entity.form;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
public class AlunoUpdateForm {

  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
}
