package managedbeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@SessionScoped
public class ListaMB {

    List<String> listaUsuarios;
    
    public ListaMB() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BlogPU");
        EntityManager manager = factory.createEntityManager();
        listaUsuarios = manager.createQuery("Select login from Usuario").getResultList();
        manager.close();
    }

    public List<String> getListaUsuarios() {
        return listaUsuarios;
    }
    
}
