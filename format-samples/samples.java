public class FormattingTester {

	// Blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah
	public void test() {}

	/*
	 * Blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah
	 */
	public void test() {
		Builder request = target.request().accept(MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
	}

	/**
	 * Blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah
	 */
	public void test() {
		return String.format("Service Account rest test (%s): (%s-%s) %s", restPath, httpStatus, responseStatus.toString(), entity);
	}
	
	public void test() {
		WebTarget target = client.target("https://login-dev.tre-pr.jus.br/auth")
				.path("/realms/master/protocol/openid-connect/token");
	}
	
	private String getServiceAccountAccessToken() {
		Response r = target.request()
				.accept(MediaType.APPLICATION_JSON)
				.header("Authorization", "Basic " + Base64.getEncoder().encodeToString("sst-cliente:a1a856ee-e74f-4ab9-b193-9864ef58a0a4".getBytes()))
				.header("Content-Type", "application/x-www-form-urlencoded")
				.post(Entity.entity(new Form()
						.param(OAuth2Constants.GRANT_TYPE, OAuth2Constants.CLIENT_CREDENTIALS)
						//.param(OAuth2Constants.CLIENT_ID, "sst-cliente")
						//.param(OAuth2Constants.CLIENT_SECRET, "a1a856ee-e74f-4ab9-b193-9864ef58a0a4")
						//.param(OAuth2Constants.SCOPE, OAuth2Constants.SCOPE_OPENID + " code")
						, MediaType.APPLICATION_FORM_URLENCODED_TYPE));

		if (r.hasEntity()) {
			String entity = r.readEntity(String.class);
			String token = null;
			try (JsonReader jsonReader = Json.createReader(new StringReader(entity))) {
				token = jsonReader.readObject().getString("access_token");
			}
			log.infof("status: %s, response: %s,  token %s", r.getStatus(), entity, token);
			return token;
		} else {
			log.errorf("status: %s, no entity found", r.getStatus());
			return null;
		}
	}
	
	public boolean test() {
		return this.inconsistenciasDto != null
				&& (this.inconsistenciasDto.isPossuiEmItemNe()
						|| this.inconsistenciasDto.isPossuiEmPreEmpenhos()
						|| this.inconsistenciasDto.isPossuiEmSaldoNegativo()
						|| this.inconsistenciasDto.isPossuiEmValores());
	}
	
}