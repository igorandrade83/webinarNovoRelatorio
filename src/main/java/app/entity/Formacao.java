package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FORMACAOACADEMICA
 * @generated
 */
@Entity
@Table(name = "\"FORMACAOACADEMICA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Formacao")
public class Formacao implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "codInstituicaoEnsino", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String codInstituicaoEnsino;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataInicio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataInicio;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataTermino", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataTermino;

  /**
  * @generated
  */
  @Column(name = "descricaoCurso", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricaoCurso;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tipoformacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Tipoformacao tipoformacao;

  /**
   * Construtor
   * @generated
   */
  public Formacao(){
  }


  /**
   * Obtém codInstituicaoEnsino
   * return codInstituicaoEnsino
   * @generated
   */
  
  public java.lang.String getCodInstituicaoEnsino(){
    return this.codInstituicaoEnsino;
  }

  /**
   * Define codInstituicaoEnsino
   * @param codInstituicaoEnsino codInstituicaoEnsino
   * @generated
   */
  public Formacao setCodInstituicaoEnsino(java.lang.String codInstituicaoEnsino){
    this.codInstituicaoEnsino = codInstituicaoEnsino;
    return this;
  }

  /**
   * Obtém dataInicio
   * return dataInicio
   * @generated
   */
  
  public java.util.Date getDataInicio(){
    return this.dataInicio;
  }

  /**
   * Define dataInicio
   * @param dataInicio dataInicio
   * @generated
   */
  public Formacao setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém dataTermino
   * return dataTermino
   * @generated
   */
  
  public java.util.Date getDataTermino(){
    return this.dataTermino;
  }

  /**
   * Define dataTermino
   * @param dataTermino dataTermino
   * @generated
   */
  public Formacao setDataTermino(java.util.Date dataTermino){
    this.dataTermino = dataTermino;
    return this;
  }

  /**
   * Obtém descricaoCurso
   * return descricaoCurso
   * @generated
   */
  
  public java.lang.String getDescricaoCurso(){
    return this.descricaoCurso;
  }

  /**
   * Define descricaoCurso
   * @param descricaoCurso descricaoCurso
   * @generated
   */
  public Formacao setDescricaoCurso(java.lang.String descricaoCurso){
    this.descricaoCurso = descricaoCurso;
    return this;
  }

  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Formacao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public Aluno getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public Formacao setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém tipoformacao
   * return tipoformacao
   * @generated
   */
  
  public Tipoformacao getTipoformacao(){
    return this.tipoformacao;
  }

  /**
   * Define tipoformacao
   * @param tipoformacao tipoformacao
   * @generated
   */
  public Formacao setTipoformacao(Tipoformacao tipoformacao){
    this.tipoformacao = tipoformacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Formacao object = (Formacao)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
