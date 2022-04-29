package com.projeto.am.model;

import java.time.Instant;

public class Consulta {
	
	private Long protocolo;
	private Instant data;
	private Medico medico;
	private Paciente paciente;
	
	public Consulta() {
	}

	public Consulta(Long protocolo, Instant data, Medico medico, Paciente paciente) {
		super();
		this.protocolo = protocolo;
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
	}

	public Long getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Long protocolo) {
		this.protocolo = protocolo;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((protocolo == null) ? 0 : protocolo.hashCode());
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
		Consulta other = (Consulta) obj;
		if (protocolo == null) {
			if (other.protocolo != null)
				return false;
		} else if (!protocolo.equals(other.protocolo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consulta [protocolo=" + protocolo + "]";
	}
	
	
	
	
	
	
	
}
