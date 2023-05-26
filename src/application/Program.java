package application;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		
		LocalDate date = LocalDate.now(); //instanciar agora!!
		
		//Definir o formato da data
		DateTimeFormatter fmTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Para converter a horario padrao por zona!!!
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		LocalDate date2 = LocalDate.parse("22/05/2023", fmTimeFormatter);
		
		System.out.println(date2.format(fmTimeFormatter));
		
		System.out.println(date);
		System.out.println(date.format(fmTimeFormatter));
		
		//Para adicionar tempo Cria nova data pois Datas são imutaveis
		
		LocalDate novoMesDate = date2.plusMonths(5);
		System.out.println("novo: " + novoMesDate.format(fmTimeFormatter));
		
		
	}

}
