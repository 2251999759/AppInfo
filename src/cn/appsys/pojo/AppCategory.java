package cn.appsys.pojo;

import javax.xml.crypto.Data;

public class AppCategory {
	private Integer id;//主键id
	private String categoryCode;//分类编码
	private String categoryName;//分类名称
	private Integer parentId;//父级节点id
	private Integer categoryBy;//创建者
	private Data creationTime;//创建时间
	private Integer modifyBy;//更新者
	private Data modifyDate;//更新时间
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
