package dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Automovel;

public class AutomovelDao {
	public EntityManager getEM(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javawebPU");
		return emf.createEntityManager();
	}
	
	public Automovel salvar(Automovel t)throws Exception{
		EntityManager em = getEM();
		try {
			em.getTransaction().begin();
			if(t.getId() == null){	
				em.persist(t);
			}else{
				if(!em.contains(t)){
					if(em.find(t.getClass(), t.getId()) == null){
						throw new Exception("Erro ao atualizar Objeto!");
					}
				}
				t = em.merge(t);
			}
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		return t;
	}
	
	public void remover(Class<Automovel> classe, Serializable id){
		EntityManager em = getEM();
		Automovel t = em.find(classe, id);
		try {
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
		
	public Automovel consultarPorId(Class<Automovel> classe, Serializable id){
		EntityManager em = getEM();
		Automovel t = null;
		try {
			t = em.find(classe, id);
		} finally {
			em.close();
		}
		return t;
	}
}
