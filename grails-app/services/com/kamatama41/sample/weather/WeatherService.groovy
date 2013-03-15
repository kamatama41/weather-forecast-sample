package com.kamatama41.sample.weather

import org.codehaus.jackson.map.ObjectMapper
import org.glassfish.jersey.jackson.JacksonFeature

import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.ext.ContextResolver

class WeatherService {

	private static final String API_BASE = "http://weather.livedoor.com/forecast/webservice/json/v1";

	def getWeather(int cityCode) {
		return createClient().target(API_BASE).queryParam("city", cityCode).request().get(Weather.class);
	}

	private Client createClient() {
		Client client = ClientBuilder.newClient();
		final ObjectMapper mapper = new ObjectMapper();
		client.register(new JacksonFeature()).register(new ContextResolver<ObjectMapper>() {
			@Override
			public ObjectMapper getContext(Class<?> type) {
				return mapper;
			}
		});
		return client;
	}
}
