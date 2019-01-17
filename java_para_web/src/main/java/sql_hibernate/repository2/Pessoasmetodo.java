package sql_hibernate.repository2;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sql_hibernate.model.Pessoa;

public class Pessoasmetodo implements Serializable {
	
	EntityManagerFactory emf;
    EntityManager em ;

    public  Pessoasmetodo(){
    	emf=Persistence.createEntityManagerFactory("javawebPU");
    	em=emf.createEntityManager();
    	
    }
    
    public void salvar(Pessoa pessoa) {
    	try{
    	 em.getTransaction().begin();
		 em.merge(pessoa);
		 em.getTransaction().commit();
		 emf.close();
    	}catch(Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
    	}
}
    public void remover(Pessoa pessoa){
    	try{
    	em.getTransaction().begin();
    	Query q=em.createNativeQuery("delete pessoa from Pessoa where id_pessoa"+pessoa.getId());
    	q.executeUpdate();
    	em.getTransaction().commit();
    	emf.close();
    	}catch(Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
    		
    	}
    	
    }
}
