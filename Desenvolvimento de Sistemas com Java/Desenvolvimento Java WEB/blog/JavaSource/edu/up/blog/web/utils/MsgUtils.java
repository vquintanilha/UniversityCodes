package edu.up.blog.web.utils;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * Auxilio no envio de mensagens
 * 
 * @author Aluno
 *
 */
public class MsgUtils {
			
	/**
	 * Envia uma mensagem de sucesso via JSF
	 * @param mensagem
	 */
	public static void enviarSucesso(String mensagem) {
		enviarMensagem(mensagem, FacesMessage.SEVERITY_INFO);
	}
	
	public static void enviarAtencao(String mensagem) {
		enviarMensagem(mensagem, FacesMessage.SEVERITY_WARN);	}
	
	private static void enviarMensagem(String mensagem, Severity severity) {
		FacesMessage message = new FacesMessage();
		message.setSeverity(severity);
		message.setSummary(mensagem);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
}
