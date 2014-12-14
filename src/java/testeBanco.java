
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testeBanco {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BlogPU");
        EntityManager manager = factory.createEntityManager();
        manager.close();
        factory.close();
    }
    
}
