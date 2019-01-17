//package sql_hibernate.model;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Automovel")
//public class Automovel implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//	
//	
//	@Id
//	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id_automovel;
//
//	@Column(name = "nome_automovel")
//	private String nome;
//
//	@Column(name = "marca_automovel")
//	private String marca;
//
//	@Column(name = "modelo_automovel")
//	private String modelo;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "ano_carro")
//	private Date anoCarro;
//
////	@ManyToOne
////	//@JoinColumn(name = "dono_carro")
////	@JoinColumn(name = "id_pessoa", insertable=false, updatable=false)
////	private Pessoa pessoa;
//
//	public Long getId() {
//		return id_automovel;
//	}
//
//	public void setId(Long id) {
//		this.id_automovel = id;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getMarca() {
//		return marca;
//	}
//
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public String getModelo() {
//		return modelo;
//	}
//
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//
//	public Date getAnoCarro() {
//		return anoCarro;
//	}
//
//	public void setAnoCarro(Date anoCarro) {
//		this.anoCarro = anoCarro;
//	}
//
////	public Pessoa getPessoa() {
////		return pessoa;
////	}
////
////	public void setPessoa(Pessoa pessoa) {
////		this.pessoa = pessoa;
////	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id_automovel == null) ? 0 : id_automovel.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Automovel other = (Automovel) obj;
//		if (id_automovel == null) {
//			if (other.id_automovel != null)
//				return false;
//		} else if (!id_automovel.equals(other.id_automovel))
//			return false;
//		return true;
//	}
//	
//	
//
//}
