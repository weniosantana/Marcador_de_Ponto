package entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Registro {
	
	private String nome;
	private String data;
	private String hora;
	private Date data_hora;
	private boolean almoco;
	public Registro() {}
	
	public Registro(String nome, String data, String hora, Date data_hora) {
		this.nome = nome;
		this.data = data;
		this.hora = hora;
		this.data_hora = data_hora;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
	public void registrar_data_hora() {
		
		Calendar c = Calendar.getInstance();
		
		DateFormat dh = new SimpleDateFormat("HH:mm:ss");
		
		SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
		this.data_hora = c.getTime();
		this.hora = dh.format(data_hora);
		this.data = dd.format(data_hora);
		
		
		
		
		
		
	}
	
	public void cadastrar_nome(String nome) {
		this.nome = nome;
	}
	
	@Override
	
	public String toString() {
		
		return "Funcionário: " + this.nome + " Registrou o ponto no Dia: " + this.data + " Hora: " + this.hora;
	}
	
	
	
}
