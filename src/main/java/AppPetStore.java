import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import animals.Cat;
import animals.Fish;
import enums.FishLivEnv;
import store.Address;
import store.PetStore;
import store.Product;

public class AppPetStore {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("digi-d12");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
//		Insert 1

        
        Address adr1 = new Address("5", "Rue Saint-Albert", "60500", "Mongneville");
        em.persist(adr1);
        
        PetStore petStore1 = new PetStore("Annie & Malaurie", "Annie");
        petStore1.setAddress(adr1);
        em.persist(petStore1);
        
        Cat nougat = new Cat(new Date(12, 9, 2021), "White", "fvctyguhj", petStore1);
        em.persist(nougat);
        
        Fish bubulle = new Fish(new Date(12, 9, 2021), "Red", FishLivEnv.FRESH_WATER, petStore1);
        em.persist(bubulle);
        
//      Insert 2

        
        Address adr2 = new Address("13 Bis", "Avenue Michel-Bernard", "80000", "Amiens");
        em.persist(adr2);
        
        PetStore petStore2 = new PetStore("Zootopia", "Artémis");
        petStore2.setAddress(adr2);
        em.persist(petStore2);
        
        Cat nougatine = new Cat(new Date(8, 8, 2019), "Brown", "azerttyyui", petStore2);
        em.persist(nougatine);
        
        Fish sushi = new Fish(new Date(5, 5, 2018), "Orange", FishLivEnv.SEA_WATER, petStore2);
        em.persist(sushi);
        
//      Insert 3
        

        Address adr3 = new Address("17", "Rue de la place", "75000", "Paris");
        em.persist(adr3);
        
        PetStore petStore3 = new PetStore("La'nimalerie", "Zoé Michelin");
        petStore3.setAddress(adr3);
        em.persist(petStore3);
        
        Cat leChat = new Cat(new Date(9, 5, 2017), "Black", "drgdhgyjgj", petStore3);
        em.persist(leChat);
        
        Fish poisson = new Fish(new Date(2, 6, 2018), "White", FishLivEnv.SEA_WATER, petStore3);
        em.persist(poisson);
        
        et.commit();
        em.close();
        emf.close();
        
    }
}
