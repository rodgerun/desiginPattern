package com.rodge.subject;

import java.util.ArrayList;
import java.util.List;

import com.rodge.observer.Observer;

/**
 * 消息类
 * @author rodge
 *
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * 新增订阅者
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObservers() {
		
	}
}
