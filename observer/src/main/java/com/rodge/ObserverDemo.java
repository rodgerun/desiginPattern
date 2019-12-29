package com.rodge;

import com.rodge.observer.ConcreteObserver;
import com.rodge.observer.Observer;
import com.rodge.subject.ConcreteSubject;
import com.rodge.subject.ConcreteSubject.Content;

/**
 * 观察者模式示例
 * @author rodge
 *
 */
public class ObserverDemo {

	public static void main(String[] args) {
		/**
		 * 主题
		 */
		ConcreteSubject subject = new ConcreteSubject();
		
		/**
		 * 观察者
		 */
		Observer observer1 = new ConcreteObserver("xiaobai","lalala");
		Observer observer2 = new ConcreteObserver("xiaohong","lagolagogo");
		
		/**
		 * 观察者订阅主题
		 */
		subject.attach(observer1);
		subject.attach(observer2);
		/**
		 * 设置主题内容并发布
		 */
		Content content = Content.cry;
		subject.setContent(content);
	}
}
