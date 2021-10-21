package br.com.ifmt.controller;

import br.com.ifmt.model.CTe;
import br.com.ifmt.model.NFe;
import br.com.ifmt.view.JDGerenciarUsuario;
import br.com.ifmt.view.JDVisualizarInformacoes;
import br.com.ifmt.view.JFLogin;
import br.com.ifmt.view.JFPrincipal;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * @author Vitor Santos
 */
public class AbreTela {

    private JDialog JDGerenciarUsuario;
    private JDialog JDVisualizaInformacoes;
    private JFrame JFLogin;
    private JFrame JFPrincipal;
    
    public void abreGerenciaUsuario(JFrame frame){
        if(JDGerenciarUsuario == null || JDGerenciarUsuario.isVisible()==false){
                JDGerenciarUsuario = new JDGerenciarUsuario(frame,true);
                JDGerenciarUsuario.setVisible(true);
            }else{
                JDVisualizaInformacoes.toFront();
            }
    }
    
    public void abreVisualizaInformacoes(JFrame frame, NFe nfe, CTe cte){
        if(JDVisualizaInformacoes == null || JDVisualizaInformacoes.isVisible()==false){
                JDVisualizaInformacoes = new JDVisualizarInformacoes(frame, true, nfe, cte);
                JDVisualizaInformacoes.setVisible(true);
            }else{
                JDVisualizaInformacoes.toFront();
            }
    }
    
    public void abreLogin(){
        if(JFLogin == null || JFLogin.isVisible() == false){
            JFLogin = new JFLogin();
            JFLogin.setVisible(true);
        }else{
            JFLogin.toFront();
        }
    }
    
    public void abrePrincipal(){
        if(JFPrincipal == null || JFPrincipal.isVisible() == false){
            JFPrincipal = new JFPrincipal();
            JFPrincipal.setVisible(true);
        }else{
            JFPrincipal.toFront();
        }
    }
    
}//class
