package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Automovel")	
public class Automovel implements Serializable, ClasseBase {	

	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idautomovel")
	private Long idAutomovel;

	@Column(name = "nome_automovel")
	private String nome;

	@Column(name = "marca_automovel")
	private String marca;

	@Column(name = "modelo_automovel")
	private String modelo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ano_carro")
	private Date anoCarro;

	@ManyToOne
	@JoinColumn(name = "pessoa_id",referencedColumnName="idpessoa",
			foreignKey = @ForeignKey(name = "Fkey_Pessoa")
	)
	private Pessoa pessoa;

	public Long getIdAutomovel() {
		return idAutomovel;
	}

	public void setIdAutomovel(Long idAutomovel) {
		this.idAutomovel = idAutomovel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(Date anoCarro) {
		this.anoCarro = anoCarro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAutomovel == null) ? 0 : idAutomovel.hashCode());
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
		Automovel other = (Automovel) obj;
		if (idAutomovel == null) {
			if (other.idAutomovel != null)
				return false;
		} else if (!idAutomovel.equals(other.idAutomovel))
			return false;
		return true;
	}

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
