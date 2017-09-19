package com.practice.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author myq
 *
 * 2017年9月18日
 */
public class DownloadEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4528819650892428876L;
	
	private Integer id;
	private Date time;
	private String ip;
	private String channel;
	private String url;
	private String version;
	public DownloadEntity(String ip, String channel) {
		// TODO Auto-generated constructor stub
		super();
		this.ip = ip;
		this.channel = channel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "DownloadEntity [id=" + id + ", time=" + time + ", ip=" + ip + ", channel=" + channel + ", url=" + url
				+ ", version=" + version + "]";
	}
	
}
