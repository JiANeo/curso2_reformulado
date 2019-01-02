package sql_hibernate.repository;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import sql_hibernate.model.Automovel;
import sql_hibernate.model.Pessoa;

public class SchemaGeneration implements Serializable{

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javawebPU");
        EntityManager em = emf.createEntityManager();
        //System.out.println(em);
em.getTransaction().begin();
        
		// Vou criar um automovel
		Automovel automovel = new Automovel();
		automovel.setNome("fiat");
		automovel.setMarca("punto");
		automovel.setModelo("sx");
		automovel.setAnoCarro(new Date());
		
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(30);
		pessoa.setMorada("TESTE");
		pessoa.setNome("Daniel da Silva");
		automovel.setPessoa(pessoa);
		
		Automoveis automoveis = new Automoveis(em);
        // guardar/salvar o automovel inserido
		automoveis.guardar(automovel);

		// faço o commit das transaçoes
		em.getTransaction().commit();
		
        List<Automovel> lista = em.createQuery("from Automovel", Automovel.class).getResultList();

		System.out.println(lista);

		em.close();
		emf.close();
	}

}
