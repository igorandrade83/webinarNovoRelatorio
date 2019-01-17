package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("FormacaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FormacaoDAO extends JpaRepository<Formacao, java.lang.String> {

  /**
   * Obtém a instância de Formacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Formacao entity WHERE entity.id = :id")
  public Formacao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Formacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Formacao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key aluno
   * @generated
   */
  @Query("SELECT entity FROM Formacao entity WHERE entity.aluno.id = :id")
  public Page<Formacao> findFormacaosByAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key tipoformacao
   * @generated
   */
  @Query("SELECT entity FROM Formacao entity WHERE entity.tipoformacao.id = :id")
  public Page<Formacao> findFormacaosByTipoformacao(@Param(value="id") java.lang.String id, Pageable pageable);

}
