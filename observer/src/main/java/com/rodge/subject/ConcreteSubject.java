package com.rodge.subject;
/**
 * 主题具体实现类
 * @author rodge
 *
 */
public class ConcreteSubject extends Subject {

	/**
	 * 主题内容
	 */
	private Content content;

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
		super.notifyAllObservers();
	}
	
	public static enum Content {
		laught("1", "笑"), cry("2","哭");
		
		private String status;
		private String behavior;
		private Content(String status, String behavior) {
			this.status = status;
			this.behavior = behavior;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getBehavior() {
			return behavior;
		}
		public void setBehavior(String behavior) {
			this.behavior = behavior;
		}
		
	}
	
}
