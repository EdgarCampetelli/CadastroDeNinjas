package dev.java10x.CadastroDeNinja.Ninjas;
import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Transforma um class em entidade do Banco de dados
//JPA (Java Persistence API)
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String nome;
    private String email;
    private int idade;

    //N(many) Ninjas para UMA(one) missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")//foering key ou chave estrangeira
    private MissoesModel missoes;

}
