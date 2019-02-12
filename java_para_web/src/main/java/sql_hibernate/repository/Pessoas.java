package sql_hibernate.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


//import sql_hibernate.model.Automovel;
import sql_hibernate.model.Pessoa;
import sql_hibernate.util.Transacional;

public class Pessoas implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public Pessoas() {

	}

	public Pessoas(EntityManager manager) {

		this.manager = manager;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	// metodos jpa
	 
	   
	  public Pessoa porId(Long id_pessoa) {
			return manager.find(Pessoa.class, id_pessoa);
	}
	  
	
//	  public List<Pessoa> todas(){
//		  
//		  return manager.createQuery("from Pessoa",Pessoa.class).getResultList();
//		  }
	  
	  public List<Pessoa> todas(){
		  String query = "Select nome_pessoa  from Pessoa";
		  Query q=manager.createNativeQuery(query);
		  return q.getResultList();
		  
	  }
	  
	  
	  public Pessoa guardar(Pessoa pessoa) {
			return manager.merge(pessoa);
	}
	  
	  public void inserir(Pessoa pessoa){
		  String query = "insert into Pessoa (idade_pessoa,morada_pessoa,nome_pessoa) values(?,?,?)";
		  Query q=manager.createNativeQuery(query);
		       q.setParameter(1, pessoa.getIdade());
		       q.setParameter(2, pessoa.getMorada());
		       q.setParameter(3, pessoa.getNome());
		    	q.executeUpdate();
		    		    	 }
	  public void  porIdupdate(int id_pessoa, String nome) {
			Pessoa pes= manager.find(Pessoa.class, id_pessoa);
			
			System.out.println(pes.getNome());
	}
	  
	public List<Pessoa> pesquisarpessoasbtn(){
		
	  String query =("select * from Pessoa");
	  return manager.createQuery(query,Pessoa.class).getResultList();
	  
	
  }
	  
	 
	  
	  //public List<Pessoa> pesquiarpessoasbtn(String nome){
//		  String query =("select * from Pessoa where nome like %"+nome);
//		  return manager.createQuery(query,Pessoa.class).getResultList();
//		  
//	  }

}
