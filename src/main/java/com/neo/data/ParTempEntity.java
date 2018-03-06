package com.neo.data;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author zy
 * @email 553224182@qq.com
 * @date 2018-02-11 21:09:45
 */
public class ParTempEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long tempId;
	//
	private Long deviceId;
	//
	private String tempName;
	//
	private String tempValue;
	//
	private Date tempDate;

	/**
	 * 设置：
	 */
	public void setTempId(Long tempId) {
		this.tempId = tempId;
	}
	/**
	 * 获取：
	 */
	public Long getTempId() {
		return tempId;
	}
	/**
	 * 设置：
	 */
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * 获取：
	 */
	public Long getDeviceId() {
		return deviceId;
	}
	/**
	 * 设置：
	 */
	public void setTempName(String tempName) {
		this.tempName = tempName;
	}
	/**
	 * 获取：
	 */
	public String getTempName() {
		return tempName;
	}
	/**
	 * 设置：
	 */
	public void setTempValue(String tempValue) {
		this.tempValue = tempValue;
	}
	/**
	 * 获取：
	 */
	public String getTempValue() {
		return tempValue;
	}
	/**
	 * 设置：
	 */
	public void setTempDate(Date tempDate) {
		this.tempDate = tempDate;
	}
	/**
	 * 获取：
	 */
	public Date getTempDate() {
		return tempDate;
	}
}
