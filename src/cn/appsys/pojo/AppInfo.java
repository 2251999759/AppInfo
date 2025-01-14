package cn.appsys.pojo;

import java.math.BigDecimal;

import javax.xml.crypto.Data;

public class AppInfo {
	private Integer id;//主键id
	private String softwareName;//软件名称
	private String APKName;//APK名称（唯一）
	private String supportROM;//支持ROM
	private String interfaceLanguage;//界面语言
	private BigDecimal softwareSize;//软件大小（单位：M）
	private Data updateDate;//更新日期
	private Integer devId;//开发者id（来源于：dev_user表的开发者id）
	private String appInfo;//应用简介
	private Integer status;//发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
	private Data onSaleDate;//上架时间
	private Data offSaleDate;//下架时间
	private Integer flatformId;//所属平台（来源于：data_dictionary，1
	private Integer categoryLevel3;//所属三级分类（来源于：data_dictionary）
	private Integer downloads;//下载量（单位：次）
	private Integer createdBy;//创建者（来源于dev_user开发者信息表的用户id）
	private Data creationDate;//创建时间
	private Integer modifyBy;//更新者（来源于dev_user开发者信息表的用户id）
	private Data modifyDate;//最新更新时间
	private Integer categoryLevel1;//所属一级分类（来源于：data_dictionary）
	private Integer categoryLevel2;//所属二级分类（来源于：data_dictionary）
	private String logoPicPath;//LOGO图片url路径
	private String  logoLocPath;//LOGO图片的服务器存储路径
	private Integer versionId;//最新的版本id
	private String categoryLevel1Name;//所属一级分类名称
	private String categoryLevel2Name;//所属二级分类名称
	private String versionNo;//最新的版本号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public BigDecimal getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(BigDecimal softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Data getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Data updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getDevId() {
		return devId;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Data getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Data onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Data getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Data offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public Integer getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(Integer flatformId) {
		this.flatformId = flatformId;
	}
	public Integer getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(Integer categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public Integer getDownloads() {
		return downloads;
	}
	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
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
	public Integer getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(Integer categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public Integer getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(Integer categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public String getCategoryLevel1Name() {
		return categoryLevel1Name;
	}
	public void setCategoryLevel1Name(String categoryLevel1Name) {
		this.categoryLevel1Name = categoryLevel1Name;
	}
	public String getCategoryLevel2Name() {
		return categoryLevel2Name;
	}
	public void setCategoryLevel2Name(String categoryLevel2Name) {
		this.categoryLevel2Name = categoryLevel2Name;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
}
