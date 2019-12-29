package com.rodge.jdk.subject;

import java.util.Observable;

/**
 * jdk自带的观察者模式实现
 * 
 * @author rodge
 *
 */
public class ConcreteJdkSubject extends Observable {

	private JdkContent content;

	public JdkContent getContent() {
		return content;
	}

	public void setContent(JdkContent content) {
		this.content = content;
		
		super.setChanged();
		//拉模式的观察者模型
		super.notifyObservers();
		
		//推模式的观察者模型
//		super.notifyObservers(content.getWeatherContent());
	}

	public static enum JdkContent {
		sunny("1", "sunny", "25"), cloudy("2", "cloudy", "14"), rainy("3", "rainy", "12");
		private String weatherStatus;
		private String weatherContent;
		private String temperature;

		private JdkContent(String weatherStatus, String weatherContent, String temperature) {
			this.weatherStatus = weatherStatus;
			this.weatherContent = weatherContent;
			this.temperature = temperature;
		}

		public String getWeatherStatus() {
			return weatherStatus;
		}

		public void setWeatherStatus(String weatherStatus) {
			this.weatherStatus = weatherStatus;
		}

		public String getWeatherContent() {
			return weatherContent;
		}

		public void setWeatherContent(String weatherContent) {
			this.weatherContent = weatherContent;
		}

		public String getTemperature() {
			return temperature;
		}

		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}

	}
}
