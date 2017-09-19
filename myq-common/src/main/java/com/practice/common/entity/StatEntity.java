package com.practice.common.entity;

import java.util.concurrent.atomic.AtomicLong;

/** 
* 
* 统计数据Entry
* @author myq
* @version 2017年9月18日 下午2:25:22
*/
public class StatEntity {
	/**
	 * 对象类型
	 */
	private String objType;
	/**
	 * 对象ID
	 */
	private String objId;
	/**
	 * 点击数
	 */
	private AtomicLong clickNum;
	/**
	 * 更新时间
	 */
	private long updateTime;
}
