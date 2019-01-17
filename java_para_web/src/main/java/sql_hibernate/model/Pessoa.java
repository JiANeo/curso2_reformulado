package sql_hibernate.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pessoa;
	
	
	@Column(name ="nome_pessoa")
	private String nome;
	
	@Column(name="idade_pessoa")
	private int idade;
	
	@Column(name="morada_pessoa")
	private String morada;

//	@OneToOne
//	//@JoinColumn(name = "pessoa_login")
//	@JoinColumn(name = "id_dados")
//	private Dados dados;

	
	public int getId() {
		return id_pessoa;
	}

	public void setId(int id) {
		this.id_pessoa = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + id_pessoa;
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
//		if (id == null) {
//			if (other.id != null)
//				return false;
		//} else 
			
			if (id_pessoa != other.id_pessoa)
			return false;
		return true;
	}

}
