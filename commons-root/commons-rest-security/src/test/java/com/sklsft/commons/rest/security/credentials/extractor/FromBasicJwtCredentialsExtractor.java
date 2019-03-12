package com.sklsft.commons.rest.security.credentials.extractor;

import org.sklsft.commons.rest.security.credentials.BasicCredentials;
import org.sklsft.commons.rest.security.credentials.extractor.impl.FromJwtCredentialsExtractor;
import org.sklsft.commons.rest.security.tokens.jwt.BasicRsaJwtHeader;

import com.sklsft.commons.rest.security.tokens.jwt.BasicJwtBody;

public class FromBasicJwtCredentialsExtractor extends FromJwtCredentialsExtractor<BasicRsaJwtHeader, BasicJwtBody, BasicCredentials>{

	@Override
	protected BasicCredentials extractFromBody(BasicJwtBody body) {
		BasicCredentials result = new BasicCredentials();
		result.setApplication(body.getApplication());
		result.setUser(body.getUser());
		return result;
	}

}
