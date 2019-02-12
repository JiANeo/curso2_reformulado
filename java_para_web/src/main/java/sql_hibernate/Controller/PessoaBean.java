package sql_hibernate.Controller;

import java.io.Serializable;
import java.util.List;


//import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.*;
//import javax.inject.Named;


import sql_hibernate.model.Pessoa;
import sql_hibernate.repository.Pessoas;


@Named
//@ManagedBean
@ViewScoped

public class PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Pessoas pessoas;
	
	
	private List<Pessoa> listapessoas;
	

    public void todasPessoas(){ 
		
		 listapessoas=pessoas.todas();
		
	} 


	public List<Pessoa> getListapessoas() {
		return listapessoas;
	}


	public void setListapessoas(List<Pessoa> listapessoas) {
		this.listapessoas = listapessoas;
	}

}
