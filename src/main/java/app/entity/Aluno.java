package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LY_CADASTRO_ALUNO
 * @generated
 */
@Entity
@Table(name = "\"LY_CADASTRO_ALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Aluno")
public class Aluno implements Serializable {

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
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cpf;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataNascimento;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "estadoCivil", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String estadoCivil;

  /**
  * @generated
  */
  @Column(name = "nomeAluno", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeAluno;

  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sexo;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] foto;

  /**
   * Construtor
   * @generated
   */
  public Aluno(){
  }


  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Aluno setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }

  /**
   * Obtém dataNascimento
   * return dataNascimento
   * @generated
   */
  
  public java.util.Date getDataNascimento(){
    return this.dataNascimento;
  }

  /**
   * Define dataNascimento
   * @param dataNascimento dataNascimento
   * @generated
   */
  public Aluno setDataNascimento(java.util.Date dataNascimento){
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public Aluno setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém estadoCivil
   * return estadoCivil
   * @generated
   */
  
  public java.lang.String getEstadoCivil(){
    return this.estadoCivil;
  }

  /**
   * Define estadoCivil
   * @param estadoCivil estadoCivil
   * @generated
   */
  public Aluno setEstadoCivil(java.lang.String estadoCivil){
    this.estadoCivil = estadoCivil;
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
  public Aluno setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomeAluno
   * return nomeAluno
   * @generated
   */
  
  public java.lang.String getNomeAluno(){
    return this.nomeAluno;
  }

  /**
   * Define nomeAluno
   * @param nomeAluno nomeAluno
   * @generated
   */
  public Aluno setNomeAluno(java.lang.String nomeAluno){
    this.nomeAluno = nomeAluno;
    return this;
  }

  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  
  public java.lang.String getSexo(){
    return this.sexo;
  }

  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public Aluno setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public byte[] getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Aluno setFoto(byte[] foto){
    this.foto = foto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno object = (Aluno)obj;
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
