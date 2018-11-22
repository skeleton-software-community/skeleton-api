package com.sklsft.commons.rest.security.credentials.validator;

import org.sklsft.commons.rest.security.credentials.validator.SecurityCredentialsValidator;
import org.sklsft.commons.rest.security.exception.InvalidTokenException;

import com.sklsft.commons.rest.security.tokens.CredentialsMock;

public class UserCredentialsMockValidator implements SecurityCredentialsValidator<CredentialsMock> {

	@Override
	public void validateCredentials(CredentialsMock securityCredentials) {
		if (!(securityCredentials.getUserFirstName().equals("Nicolas") && securityCredentials.getUserLastName().equals("Thibault"))) {
			throw new InvalidTokenException("Bad credentials");
		}
	}
}