package kaiba.corp.academia.digital.service;

import kaiba.corp.academia.digital.entity.Aluno;
import kaiba.corp.academia.digital.entity.AvaliacaoFisica;
import kaiba.corp.academia.digital.entity.form.AlunoForm;
import kaiba.corp.academia.digital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

  Aluno create(AlunoForm form);

  Aluno get(Long id);

  List<Aluno> getAll(String dataDeNascimento);

  Aluno update(Long id, AlunoUpdateForm formUpdate);

  /**
   * Deleta um Aluno específico.
   * @param id id do Aluno que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do aluno que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
