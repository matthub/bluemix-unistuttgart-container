package net.bluemix.samples.java.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/microservice")
public class MicroserviceResource {

	SimpleDateFormat SF = new SimpleDateFormat("yyyy/MM/dd'T'HH:mm:ss");

	@GET
	public String hello() {
		return "{ \"dropwizard.microservice\" : \"" + SF.format(new Date()) + "\" }";
	}
}
