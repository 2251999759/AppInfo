package cn.appsys.pojo;

import javax.xml.crypto.Data;

public class AdPromotion {

	private Integer id;//����Id
	private Integer appId;//appid
	private String adPicPath;//���ͼƬ�洢·��
	private Integer adPV;//�������
	private Integer carouselPosition;//�ֲ�λ��1-n��
	private Data startTime;//�����Чʱ��
	private Data endTime;//���ʧЧʱ��
	private Integer createdBy;//������
	private Data creationDate;//����ʱ��
	private Integer modifyBy;//������
	private Data modifyDate;//����ʱ��
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
