package net.bluemix.samples.java.web;

import com.codahale.metrics.health.HealthCheck;

public class RestHealthCheck extends HealthCheck {

	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}

}
