package br.com.fiap.abctechservice.repository;

import br.com.fiap.abctechservice.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Query("from Livro l where l.titulo like %:titulo%")
    List<Livro> buscaPorTitulo(String titulo);

    List<Livro> findAllByTituloLike(String titulo);

    //@Query("from Livro l where l.nome like %:nome%")
    //List<Livro> buscaPorNome(String nome);

}