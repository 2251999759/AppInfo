package cn.appsys.pojo;

import javax.xml.crypto.Data;

public class AdPromotion {

	private Integer id;//主键Id
	private Integer appId;//appid
	private String adPicPath;//广告图片存储路径
	private Integer adPV;//广告点击量
	private Integer carouselPosition;//轮播位（1-n）
	private Data startTime;//广告起效时间
	private Data endTime;//广告失效时间
	private Integer createdBy;//创建者
	private Data creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Data modifyDate;//更新时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getAdPicPath() {
		return adPicPath;
	}
	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}
	public Integer getAdPV() {
		return adPV;
	}
	public void setAdPV(Integer adPV) {
		this.adPV = adPV;
	}
	public Integer getCarouselPosition() {
		return carouselPosition;
	}
	public void setCarouselPosition(Integer carouselPosition) {
		this.carouselPosition = carouselPosition;
	}
	public Data getStartTime() {
		return startTime;
	}
	public void setStartTime(Data startTime) {
		this.startTime = startTime;
	}
	public Data getEndTime() {
		return endTime;
	}
	public void setEndTime(Data endTime) {
		this.endTime = endTime;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Data getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Data creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Data getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Data modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
