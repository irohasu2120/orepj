package jp.sample.orepj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrepjApplication {

	public static void main(String[] args) {
		// System.out.println("OrepjApplication Start");
		SpringApplication.run(OrepjApplication.class, args);
		Kensho kensho = new Kensho();
		kensho.execute();
	}
}
