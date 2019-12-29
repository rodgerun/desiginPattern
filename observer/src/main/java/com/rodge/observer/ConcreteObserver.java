package com.rodge.observer;

import com.rodge.subject.ConcreteSubject;
import com.rodge.subject.ConcreteSubject.Content;
import com.rodge.subject.Subject;

/**
 * 订阅者具体实现类
 * @author rodge
 *
 */
public class ConcreteObserver implements Observer {
	/**
	 * 观察者状态
	 */
	private String observerStatus;
	/**
	 * 观察者名称
	 */
	private String observerName;
	/**
	 * 观察者行为
	 */
	private String observerAction;

	public ConcreteObserver() {
		super();
	}

	public ConcreteObserver(String observerName, String observerAction) {
		this.observerName = observerName;
		this.observerAction = observerAction;
	}

	public void update(Subject subject) {
		if (null != subject) {
			if (subject instanceof ConcreteSubject) {
				ConcreteSubject concreteSubject = (ConcreteSubject) subject;
				Content content = concreteSubject.getContent();
				switch (content) {
				case laught:
					System.out.println(observerName+"收到的主题为"+content.getBehavior());
					break;
				case cry:
					System.out.println(observerName+"收到的主题为"+content.getBehavior());
					break;

				default:
					System.out.println(observerName+"收到非法主题");
					break;
				}
				
			}
		}
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

	public String getObserverAction() {
		return observerAction;
	}

	public void setObserverAction(String observerAction) {
		this.observerAction = observerAction;
	}

	
}
