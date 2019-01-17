package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LY_ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"LY_ENDERECO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Endereco")
public class Endereco implements Serializable {

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
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "complemento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String complemento;

  /**
  * @generated
  */
  @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String endereco;

  /**
  * @generated
  */
  @Column(name = "municipio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String municipio;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numero;

  /**
  * @generated
  */
  @Column(name = "unidade_federativa", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String unidadeFederativa;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
   * Construtor
   * @generated
   */
  public Endereco(){
  }


  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Endereco setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Endereco setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém complemento
   * return complemento
   * @generated
   */
  
  public java.lang.String getComplemento(){
    return this.complemento;
  }

  /**
   * Define complemento
   * @param complemento complemento
   * @generated
   */
  public Endereco setComplemento(java.lang.String complemento){
    this.complemento = complemento;
    return this;
  }

  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  
  public java.lang.String getEndereco(){
    return this.endereco;
  }

  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Endereco setEndereco(java.lang.String endereco){
    this.endereco = endereco;
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
  public Endereco setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém municipio
   * return municipio
   * @generated
   */
  
  public java.lang.String getMunicipio(){
    return this.municipio;
  }

  /**
   * Define municipio
   * @param municipio municipio
   * @generated
   */
  public Endereco setMunicipio(java.lang.String municipio){
    this.municipio = municipio;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.String getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Endereco setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém unidadeFederativa
   * return unidadeFederativa
   * @generated
   */
  
  public java.lang.String getUnidadeFederativa(){
    return this.unidadeFederativa;
  }

  /**
   * Define unidadeFederativa
   * @param unidadeFederativa unidadeFederativa
   * @generated
   */
  public Endereco setUnidadeFederativa(java.lang.String unidadeFederativa){
    this.unidadeFederativa = unidadeFederativa;
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
  public Endereco setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Endereco object = (Endereco)obj;
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
