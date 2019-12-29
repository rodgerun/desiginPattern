package com.rodge.observer;

import com.rodge.subject.Subject;

/**
 * 观察者接口
 * @author rodge
 *
 */
public interface Observer {

	void update(Subject subject);
}
