package boot.dubbo.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用户
 * 
 * @author percy
 *
 */
@XmlRootElement
public class Application implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 用户标识
	 */
	private Integer appId;
	/**
	 * 用户姓名
	 */
	private String appName;
	private String appOwner;
	
	public Application(Integer appId, String appName, String appOwner){
		this.appId = appId;
		this.appName=appName;
		this.appOwner=appOwner;
	}
	
	public Application(){
		
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppOwner() {
		return appOwner;
	}

	public void setAppOwner(String appOwner) {
		this.appOwner = appOwner;
	}

	
}
