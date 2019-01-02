package sql_hibernate.repository;

import javax.persistence.*;

import dao.AutomovelDAO;
import dao.DadosDAO;
import dao.PessoaDAO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import sql_hibernate.model.Automovel;
import sql_hibernate.model.Dados;
import sql_hibernate.model.Pessoa;

public class SchemaGeneration implements Serializable{

	public static void main(String[] args) throws Exception {
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("javawebPU");
        EntityManager em = emf.createEntityManager();
        //System.out.println(em);
        em.getTransaction().begin();*/
        Pessoa pessoa = new Pessoa();
        PessoaDAO dao = new PessoaDAO();
        Automovel automovel = new Automovel();
        AutomovelDAO automovelDAO = new AutomovelDAO();
        Dados dados = new Dados();	
        DadosDAO dadosDAO = new DadosDAO();
		
        pessoa.setIdade(30);
		pessoa.setMorada("TESTE");
		pessoa.setNome("Daniel da Silva");
		
		automovel.setNome("fiat");	
		automovel.setMarca("punto");
		automovel.setModelo("sx");
		automovel.setAnoCarro(new Date());		
		
		dados.setEmail("teste@teste.com");
		dados.setPassword("root");
		

		try {
			dao.salvar(pessoa);
			Pessoa pessoaAutomovel = dao.consultarPorId(Pessoa.class, pessoa.getIdPessoa());
			automovel.setPessoa(pessoaAutomovel);
			Pessoa pessoaDados = dao.consultarPorId(Pessoa.class, pessoa.getIdPessoa());
			dados.setPessoa(pessoaDados);
			automovelDAO.salvar(automovel);
			dadosDAO.salvar(dados);
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Erro: " + e.getMessage());
		}
		// faço o commit das transaçoes
		//em.getTransaction().commit();
		
        /*List<Automovel> lista = em.createQuery("from Automovel", Automovel.class).getResultList();

		System.out.println(lista);*/

		//em.close();
		//emf.close();
	}

}
