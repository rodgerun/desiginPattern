package com.rodge;

import com.rodge.jdk.observer.ConcreteJdkObserver;
import com.rodge.jdk.subject.ConcreteJdkSubject;
import com.rodge.jdk.subject.ConcreteJdkSubject.JdkContent;

/**
 * 基于jdk自带的观察者模式类实现观察者模式
 * 
 * @author rodge
 *
 */
public class ObserverJdkDemo {
	public static void main(String[] args) {
		/**
		 * 主题
		 */
		ConcreteJdkSubject subject = new ConcreteJdkSubject();

		/**
		 * 观察者
		 */
		ConcreteJdkObserver observer1 = new ConcreteJdkObserver("xiaobai", "will go out to play");
		ConcreteJdkObserver observer2 = new ConcreteJdkObserver("xiaohong", "will go out to shopping");

		/**
		 * 观察者订阅主题
		 */
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		/**
		 * 设置主题内容并发布
		 */
		JdkContent content = JdkContent.cloudy;
		subject.setContent(content);
	}
}
