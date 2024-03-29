package Aula0208;

import java.time.Duration;
import java.time.Instant;

public class AulaDatasTempos {
	
	
	public static void main(String[] args) {
		Instant inicio = Instant.now();
		
		try {
		Thread.sleep(1000); // fazer o processador esperar
		} catch (InterruptedException e) {
		   e.printStackTrace();	
		}
		
		
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println("dura��o em nanos segundos" + duracao.toNanos());
		System.out.println("dura��o em minutos" + duracao.toMinutes());
		System.out.println("dura��o em horas" + duracao.toHours());
		System.out.println("dura��o em milisegundos" + duracao.toMillis());
		System.out.println("dura��o em dias" + duracao.toDays());
	}
	 

}
