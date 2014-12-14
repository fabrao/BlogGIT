package managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import objetos.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
    private Usuario usuario = new Usuario();
    
    public String efetuarLogin(){
        if(usuario.getLogin().equals("admin") && usuario.getSenha().equals("admin")){
            return "blogPrincipal";
        }else{
            FacesMessage msg = new FacesMessage ("Usuário ou Senha inválidos!");
            FacesContext.getCurrentInstance().addMessage("erro", msg);
            return null;
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

