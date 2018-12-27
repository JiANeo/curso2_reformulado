package sql_hibernate.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.inject.Inject;

import sql_hibernate.repository.Automoveis;
import sql_hibernate.model.Automovel;
import java.util.List;


@ManagedBean
@ViewScoped
public class AutomovelBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Automoveis automoveis;
	
	private List<Automovel> ListaAutomoveis;
	
	public void todosAutomoveis(){
		
		ListaAutomoveis=automoveis.todos();
	}

	public List<Automovel> getListaAutomoveis() {
		return ListaAutomoveis;
	}

}
