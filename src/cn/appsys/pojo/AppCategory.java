package cn.appsys.pojo;

import javax.xml.crypto.Data;

public class AppCategory {
	private Integer id;//����id
	private String categoryCode;//�������
	private String categoryName;//��������
	private Integer parentId;//�����ڵ�id
	private Integer categoryBy;//������
	private Data creationTime;//����ʱ��
	private Integer modifyBy;//������
	private Data modifyDate;//����ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getCategoryBy() {
		return categoryBy;
	}
	public void setCategoryBy(Integer categoryBy) {
		this.categoryBy = categoryBy;
	}
	public Data getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Data creationTime) {
		this.creationTime = creationTime;
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
