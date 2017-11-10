package com.mx.fava.Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManejoFecha {

	public static void main(String[] args) {
		  LocalDate date = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		  String text = date.format(formatter);
		  LocalDate parsedDate = LocalDate.parse(text, formatter);
		  System.out.println(parsedDate);
		  System.out.println(text);
		  System.out.println("FAVA");
	}
	
}
