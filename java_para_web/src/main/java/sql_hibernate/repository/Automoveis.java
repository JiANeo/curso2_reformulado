//package sql_hibernate.repository;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//
//import sql_hibernate.model.Automovel;
//
//public class Automoveis implements Serializable {
//
//private EntityManager manager;
//	
//	public Automoveis(){
//		
//	}
//    public EntityManager getManager() {
//		return manager;
//	}
//	public void setManager(EntityManager manager) {
//		this.manager = manager;
//	}
//	public Automoveis(EntityManager manager){
//    	this.manager=manager;
//    	
//    }
//    
//    
//    public Automovel porId(Long id_automovel) {
//		return manager.find(Automovel.class, id_automovel);
//}
//    
//    public List<Automovel> pesquisar(String nome) {
//		String jpql = "from Automovel where nome like :nome";
//		
//		TypedQuery<Automovel> query = manager
//				.createQuery(jpql, Automovel.class);
//		
//		query.setParameter("nome_automovel", nome + "%");
//		
//		return query.getResultList();
//		}
//    
//    public List<Automovel> todos() {
//        return manager.createQuery("from Automovel", Automovel.class).getResultList();
//   }
//    
//    public Automovel guardar(Automovel automovel) {
//		return manager.merge(automovel);
//}
//    public void remover(Automovel automovel) {
//		automovel = porId(automovel.getId());
//		manager.remove(automovel);
//}
//	
//}
