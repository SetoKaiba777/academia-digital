package kaiba.corp.academia.digital.service.impl;

import kaiba.corp.academia.digital.infra.utils.JavaTimeUtils;
import kaiba.corp.academia.digital.repository.AlunoRepository;
import kaiba.corp.academia.digital.entity.Aluno;
import kaiba.corp.academia.digital.entity.AvaliacaoFisica;
import kaiba.corp.academia.digital.entity.form.AlunoForm;
import kaiba.corp.academia.digital.entity.form.AlunoUpdateForm;
import kaiba.corp.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository repository;

  @Override
  public Aluno create(AlunoForm form) {
    Aluno aluno = new Aluno();
    aluno.setNome(form.getNome());
    aluno.setCpf(form.getCpf());
    aluno.setBairro(form.getBairro());
    aluno.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return null;
  }

  @Override
  public List<Aluno> getAll(String dataDeNascimento) {
    LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
    return dataDeNascimento == null ? repository.findAll() : repository.findByDataDeNascimento(localDate);
    }


  @Override
  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    var aluno = repository.getById(id);
    if(formUpdate.getBairro()!=null) aluno.setBairro(formUpdate.getBairro());
    if(formUpdate.getNome()!=null) aluno.setNome(formUpdate.getNome());
    if(formUpdate.getDataDeNascimento()!=null) aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());
    return repository.save(aluno);
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();

  }

}
