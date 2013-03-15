package com.kamatama41.sample.weather

class WeatherController {
	// OK
	def weatherService

	def index() {
//		def weatherService = new WeatherServiceJavaOK()	// OK
//		def weatherService = new WeatherServiceJavaNG()	// NG
		def tokyo = 130010;
		[weather:weatherService.getWeather(tokyo)]
	}
}
