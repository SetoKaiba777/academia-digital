package kaiba.corp.academia.digital.service;

import kaiba.corp.academia.digital.entity.Matricula;
import kaiba.corp.academia.digital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

  Matricula create(MatriculaForm form);

  Matricula get(Long id);

  List<Matricula> getAll(String bairro);

  void delete(Long id);

}
