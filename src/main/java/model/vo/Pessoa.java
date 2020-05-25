package model.vo;

public class Pessoa {
	
	private int id;
	private String nome;
	private String cpf;
	private String rua;
	private String numero;
	private String bairro;
	private String email;
	private String telefone;
	
	public Pessoa() {
		super();
		
	}
	public Pessoa(int id, String nome, String cpf, String rua, String numero, String bairro, String email,
			String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.email = email;
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rua=" + rua + ", numero=" + numero
				+ ", bairro=" + bairro + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
}
