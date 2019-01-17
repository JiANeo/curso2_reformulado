package sql_hibernate.repository;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//import sql_hibernate.model.Automovel;
//import sql_hibernate.model.Dados;
import sql_hibernate.model.Pessoa;

public class SchemaGeneration implements Serializable{

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javawebPU");
        EntityManager em = emf.createEntityManager();
        //System.out.println(em);
em.getTransaction().begin();
        
		// Vou criar um automovel
//		Automovel automovel = new Automovel();
//		automovel.setNome("fiat");
//		automovel.setMarca("punto");
//		automovel.setModelo("sx");
//		automovel.setAnoCarro(new Date());
//		

	    Pessoa pessoa2 = new Pessoa();
	    pessoa2.setId(6);
		//pessoa2.setIdade(80);
	//pessoa2.setMorada("Alameda 1 de Março");
		 pessoa2.setNome("Daniela Santos");
	
		Pessoas pessoas = new Pessoas(em);
		//pessoas.guardar(pessoa2);
		//pessoas.inserir(pessoa2);
		pessoas.porIdupdate(pessoa2.getId(),pessoa2.getNome());
		
		
	
//		Automovel automovel = new Automovel();
//		automovel.setNome("fiat");
//		automovel.setMarca("punto");
//		automovel.setModelo("sx");
//		automovel.setAnoCarro(new Date());
//		
//		Dados dados =new Dados();
//		dados.setEmail("rsraulsnts@gmail.com");
//		dados.setPassword("123456");
		
//		Pessoas pessoas = new Pessoas(em);
//		pessoas.guardar(pessoa);
//		
		//pessoas.inserir(pessoa);
		
	
//		Automoveis automoveis = new Automoveis(em);
//		automoveis.guardar(automovel);
//		
//		dadospersistencia dadospersiste=new dadospersistencia(em);
//		dadospersiste.guardar(dados);
//		
		

		// faço o commit das transaçoes
		em.getTransaction().commit();
		
//		System.out.println(""+pessoas.todaspessoas());
//		System.out.println(""+automoveis.todos());
//		System.out.println(""+dadospersiste.todosdados());
//


		em.close();
		emf.close();
	}

}
