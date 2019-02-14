package com.openshift.eap.resources;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
@RequestScoped
public class AppResource {

	@GET
	public String message() {
		return "ping!";
	}
}
