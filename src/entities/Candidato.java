package entities;

public class Candidato {
	
	private String nome;
	private Integer qtdVotos;
	
	public Candidato(String nome, Integer qtdVotos) {
		this.nome = nome;
		this.qtdVotos = qtdVotos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(Integer qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((qtdVotos == null) ? 0 : qtdVotos.hashCode());
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
		Candidato other = (Candidato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (qtdVotos == null) {
			if (other.qtdVotos != null)
				return false;
		} else if (!qtdVotos.equals(other.qtdVotos))
			return false;
		return true;
	}
	
	
	

}
