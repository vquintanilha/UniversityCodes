package com.andrepimenta.exemplo.view;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;

import com.andrepimenta.exemplo.services.BirthDateService;

/**
 * BackingBean para testes
 * 
 * @author Andre Pimenta
 *
 */
@Named
@ViewScoped
public class someTestBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4373909204128839746L;

	@NotNull
	private Date birthDate;

	@EJB
	private BirthDateService birthDateService;

	public someTestBean() {
		// default Constructor
	}

	public void verifyYourAge() {
		Integer age = this.birthDateService.verifyAgeWithBirthIn(this.birthDate);
		Messages.addGlobal(FacesMessage.SEVERITY_INFO, "All right!! Your age is {0}", age);
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
