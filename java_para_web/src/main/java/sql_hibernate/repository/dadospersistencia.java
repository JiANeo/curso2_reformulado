//package sql_hibernate.repository;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import sql_hibernate.model.Dados;
//import sql_hibernate.model.Pessoa;
//
//public class dadospersistencia implements Serializable {
//
//	
//	private static final long serialVersionUID = 1L;
//	
//	private EntityManager manager;
//
//	public dadospersistencia() {
//
//	}
//
//	public dadospersistencia(EntityManager manager) {
//
//		this.manager = manager;
//	}
//
//	public EntityManager getManager() {
//		return manager;
//	}
//
//	public void setManager(EntityManager manager) {
//		this.manager = manager;
//	}
//
//	// metodos hql
//
//	  public Dados porId(Long id_dados) {
//			return manager.find(Dados.class, id_dados);
//	}
//	  
//	  public List<Dados> todosdados(){
//		  
//		  return manager.createQuery("from Dados",Dados.class).getResultList();
//	  }
//	  public Dados  guardar(Dados dados) {
//			return manager.merge(dados);
//	}
//
//}
