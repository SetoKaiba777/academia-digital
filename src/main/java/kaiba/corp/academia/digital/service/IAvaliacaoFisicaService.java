package kaiba.corp.academia.digital.service;

import kaiba.corp.academia.digital.entity.AvaliacaoFisica;
import kaiba.corp.academia.digital.entity.form.AvaliacaoFisicaForm;
import kaiba.corp.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

  AvaliacaoFisica create(AvaliacaoFisicaForm form);

  AvaliacaoFisica get(Long id);


  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

  void delete(Long id);
}
