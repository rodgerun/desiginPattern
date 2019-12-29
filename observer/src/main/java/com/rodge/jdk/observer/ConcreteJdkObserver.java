package com.rodge.jdk.observer;

import java.util.Observable;
import java.util.Observer;

import com.rodge.jdk.subject.ConcreteJdkSubject;
import com.rodge.jdk.subject.ConcreteJdkSubject.JdkContent;

/**
 * jdk自带接口实现观察者
 * 
 * @author rodge
 *
 */
public class ConcreteJdkObserver implements Observer {
	
	private String observerStatus;
	private String observerName;
	private String oberverAction;
	

	public ConcreteJdkObserver() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConcreteJdkObserver(String observerName, String oberverAction) {
		super();
		this.observerName = observerName;
		this.oberverAction = oberverAction;
	}


	public String getObserverStatus() {
		return observerStatus;
	}


	public void setObserverStatus(String observerStatus) {
		this.observerStatus = observerStatus;
	}


	public String getObserverName() {
		return observerName;
	}


	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}


	public String getOberverAction() {
		return oberverAction;
	}


	public void setOberverAction(String oberverAction) {
		this.oberverAction = oberverAction;
	}


	public void update(Observable o, Object arg) {
		/**
		 * 拉模式的观察者模式
		 */
		if (null != o) {
			if (o instanceof ConcreteJdkSubject) {
				ConcreteJdkSubject concreteJdkSubject = (ConcreteJdkSubject) o;
				JdkContent content = concreteJdkSubject.getContent();
				switch (content) {
				case sunny:
					System.out.println("it's "+content.getWeatherContent()+" today, " + observerName + " " + oberverAction);
					break;
				case cloudy:
					System.out.println("it's "+content.getWeatherContent()+" today, " + observerName + " " + oberverAction);
					
					break;
				case rainy:
					System.out.println("it's "+content.getWeatherContent()+" today, " + observerName + " " + oberverAction);
					
					break;

				default:
					break;
				}
				
			}
		}
		/**
		 * 推模式
		 */
		if (null != arg) {
			try {
				throw new Exception("推模式还没有实现");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
