package com.example.hajibootdi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("unused")
@SpringBootApplication
public class HajibootDiApplication implements CommandLineRunner {
	@Autowired
	ArgumentResolver argumentResolver;
	@Autowired
	Calclator calclator;
	@Override
	public void run(String... strings) throws Exception {
		System.out.print("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calclator.calc(argument.getA(), argument.getB());
		System.out.println("result = " + result);
	}
	public static void main(String[] args) {
		SpringApplication.run(HajibootDiApplication.class, args);
	}
}
