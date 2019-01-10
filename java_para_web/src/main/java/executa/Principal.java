package executa;

import java.util.Date;

import dao.AutomovelDao;
import dao.DadosDao;
import dao.PessoaDao;
import model.Automovel;
import model.Dados;
import model.Pessoa;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Automovel automovel = new Automovel();
		AutomovelDao automovelDao = new AutomovelDao();
		Dados dados = new Dados();
		DadosDao dadosDao = new DadosDao();

		pessoa.setIdade(30);
		pessoa.setMorada("TESTE");
		pessoa.setNome("Daniel da Silva");

		PessoaDao pessoaDao = new PessoaDao();

		automovel.setNome("fiat");
		automovel.setMarca("punto");
		automovel.setModelo("sx");
		automovel.setAnoCarro(new Date());
		
		dados.setEmail("teste@teste.com");
		dados.setPassword("root");
		

		try {
			pessoaDao.salvar(pessoa);
			Pessoa pessoaAutomovel = pessoaDao.consultarPorId(Pessoa.class, pessoa.getIdPessoa());
			Pessoa pessoaDados = pessoaDao.consultarPorId(Pessoa.class, pessoa.getIdPessoa());
			dados.setPessoa(pessoaDados);
			automovel.setPessoa(pessoaAutomovel);
			automovelDao.salvar(automovel);
			dadosDao.salvar(dados);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
}
