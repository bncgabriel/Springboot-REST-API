package br.com.bncgabriel.servicex.categoria.domain;

import jakarta.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "CATEGORIA")
@Data
@EqualsAndHashCode (
        onlyExplicitlyIncluded = true
)
@NoArgsConstructor
public class Categoria {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;

    @Column(name = "NOME_CATEGORIA")
    private String nomeCategoria;

    @OneToMany(mappedBy = "ID_CATEGORIA", cascade = CascadeType.ALL)
    private List<Service> servicos;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;
}
