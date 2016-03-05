package aplicacao.exemplo;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class validatePassword implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		String senha = (String) arg2;
		if (senha.length() < 3) {
			throw new ValidatorException(new FacesMessage("Menos de três caracteres"));
		}

	}

}
