package rpnet.testeapirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tipo")   //entidade de um banco de dados
public class TiposModel {

       
    @Id
    public String nome;  //para identificar o usuario
    
    
    @Column(nullable = false, length = 5)
    public String tipo_usuario;


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTipo_usuario() {
        return tipo_usuario;
    }


    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
   
    public static TipoUsuario(String "tipo") {
             
         if(tipo= "Admin" && "Root")   {
            System.out.println("Permissão para cadastrar novo usuario e alterar as informações!");
        
        } if(tipo="Root") {
            System.out.println("Permissão para excluir usuário.");
         
        } if(tipo="Geral") {
            System.out.println("Permissão para listar e alterar suas próprias informações.");
        } 
        
        return tipo;
         }
        
}
