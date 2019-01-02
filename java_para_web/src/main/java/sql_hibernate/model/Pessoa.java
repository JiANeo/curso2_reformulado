package sql_hibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pessoa")
public class Pessoa implements Serializable, ClasseBase {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpessoa")
	private int idPessoa;
	
	
	@Column(name ="nome_pessoa")
	private String nome;
	
	@Column(name="idade_pessoa")
	private int idade;
	
	@Column(name="morada_pessoa")
	private String morada;
	
	@OneToMany(mappedBy="pessoa")
	private List<Automovel> automoveis;
	
	@OneToOne(mappedBy="pessoa")
	@JoinColumn()
	private Dados dados;
	
	public int getIdPessoa() {		
		return idPessoa;
	}

	public void setIdPessoa(int id) {
		this.idPessoa = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	@Override
	public String toString() {
		return "Pessoa [hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((automoveis == null) ? 0 : automoveis.hashCode());
		result = prime * result + idPessoa;
		result = prime * result + idade;
		result = prime * result + ((morada == null) ? 0 : morada.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (automoveis == null) {
			if (other.automoveis != null)
				return false;
		} else if (!automoveis.equals(other.automoveis))
			return false;
		if (idPessoa != other.idPessoa)
			return false;
		if (idade != other.idade)
			return false;
		if (morada == null) {
			if (other.morada != null)
				return false;
		} else if (!morada.equals(other.morada))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
