package net.bluemix.samples.java.web;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SampleApplication extends Application<Configuration> {

	public static void main(String[] args) throws Exception {
		new SampleApplication().run(args);
	}

	@Override
	public String getName() {
		return "dropwizard-sample";
	}

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap) {
	}

	@Override
	public void run(Configuration configuration, Environment environment) throws ClassNotFoundException {
		final MicroserviceResource microservice = new MicroserviceResource();
		environment.jersey().register(microservice);
		environment.healthChecks().register("rest", new RestHealthCheck());
	}

}