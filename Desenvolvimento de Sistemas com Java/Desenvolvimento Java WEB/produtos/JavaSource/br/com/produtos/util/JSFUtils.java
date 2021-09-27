package br.com.produtos.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Classe para eventos utilitários de JSF
 * 
 * @author 1829203
 *
 */
public class JSFUtils {

	/**
	 * Envia uma mensagem de sucesso para a tela usando JSF
	 * 
	 * @param mensagem
	 */
	public static void enviarMensagemDeSucesso(String mensagem) {
		
		FacesMessage msg = new FacesMessage();
		msg.setSummary(mensagem);
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}

}