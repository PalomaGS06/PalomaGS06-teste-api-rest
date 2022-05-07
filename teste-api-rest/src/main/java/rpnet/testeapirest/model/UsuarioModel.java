package rpnet.testeapirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.jboss.jandex.VoidType;


@Entity(name = "usuario")   //entidade de um banco de dados
public class UsuarioModel {


    @Column(nullable = false, length = 50)  // "nullable= false" significa que não pode ser nulo.
    public String nome;

    @Column(nullable = false, length = 15)
    public String senha;
       
    @Id
    public Integer tipo;  // o usuario possui apenas um tipo.
    
    @Column(nullable = false, length = 30)
    public String email;

    
    @Column(nullable = false, length = 10)
    public Integer status;


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Integer getTipo() {
        return tipo;
    }


    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


@Override
public static StatusUsuario(Integer status, tipo) {
if(status= 1)   {
    System.out.println("Ativo");

} if(status=2) {
    System.out.println("Inativo");
}
return status;
 

 if(tipo= 1)   {
    System.out.println("Admin");

} if(tipo=2) {
    System.out.println("Geral");
} 
 if(tipo=3) {
    System.out.println("Root");
}
return tipo;
 }


}
