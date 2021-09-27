package br.edu.dsj.scv.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Classe para eventos utilitários de JSF
 * 
 * @author 4694
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

	public static void enviarMensagemDeAtencao(String mensagem) {

		FacesMessage msg = new FacesMessage();
		msg.setSummary(mensagem);
		msg.setSeverity(FacesMessage.SEVERITY_WARN);

		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

}
