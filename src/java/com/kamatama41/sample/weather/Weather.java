package com.kamatama41.sample.weather;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Weather {
	private String title;

	private Description description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public static class Description {
		private String text;
		private Date publicTime;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Date getPublicTime() {
			return publicTime;
		}

		public void setPublicTime(Date publicTime) {
			this.publicTime = publicTime;
		}
	}
}
