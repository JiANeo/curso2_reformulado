package sql_hibernate.repository2;

import java.io.Serializable;

import sql_hibernate.model.Pessoa;

public class teste implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Pessoa pessoa = new Pessoa();
			pessoa.setIdade(30);
			pessoa.setMorada("Alameda 1 de Março");
			pessoa.setNome("Daniel da Silva");
			
			Pessoasmetodo pessoas=new Pessoasmetodo();
			pessoas.salvar(pessoa);
		
	}

}
