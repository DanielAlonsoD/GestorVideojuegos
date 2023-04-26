package Entidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProbandoJPA {

	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("gestorVideojuegos");
		EntityManager em=emFactory.createEntityManager();
		
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		Videojuego j1=new Videojuego("Sonic the Hedgehog", "Sega", 1991);
		em.persist(j1);
		tran.commit();
	}

}
