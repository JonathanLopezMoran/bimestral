package bimestral.lopezjf;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class LopezjfApplication implements CommandLineRunner {

    @Autowired
    RepositorioTarjetas repoTar;

	public static void main(String[] args) {
		SpringApplication.run(LopezjfApplication.class, args);
	}

@Override
    public void run(String... args) throws Exception {

        
        //Guarda un mensaje
        //repoTar.save(new TarjetaHabiente("1", "Jonathan", "bleck_hurts@hotmail.com", new Tarjeta(4488215, "Banamex", 99999f)));
        //Buscamos todos los mensajes
        for(TarjetaHabiente tar: repoTar.findAll()){
        System.out.println(tar);
        }
        //Buscamos por id
        System.out.println(repoTar.findById("1").get());
        //Buscamos por titulo
        //repoTar.save(new Mensajito("malo", "yo", "topoyiya", LocalDate.now()));
        //System.out.println(repoTar.findByTitulo("yo"));
        
	//Actualizamos una tarjeta
	    
	    
        //Borramos por id
        // TarjetaHabiente tar=new TarjetaHabiente();
        //tar.setId("1");
        // repoTar.delete(tar);

    }    
}
