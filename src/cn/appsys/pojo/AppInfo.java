package cn.appsys.pojo;

import java.math.BigDecimal;

import javax.xml.crypto.Data;

public class AppInfo {
	private Integer id;//����id
	private String softwareName;//�������
	private String APKName;//APK���ƣ�Ψһ��
	private String supportROM;//֧��ROM
	private String interfaceLanguage;//��������
	private BigDecimal softwareSize;//�����С����λ��M��
	private Data updateDate;//��������
	private Integer devId;//������id����Դ�ڣ�dev_user��Ŀ�����id��
	private String appInfo;//Ӧ�ü��
	private Integer status;//����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
	private Data onSaleDate;//�ϼ�ʱ��
	private Data offSaleDate;//�¼�ʱ��
	private Integer flatformId;//����ƽ̨����Դ�ڣ�data_dictionary��1
	private Integer categoryLevel3;//�����������ࣨ��Դ�ڣ�data_dictionary��
	private Integer downloads;//����������λ���Σ�
	private Integer createdBy;//�����ߣ���Դ��dev_user��������Ϣ����û�id��
	private Data creationDate;//����ʱ��
	private Integer modifyBy;//�����ߣ���Դ��dev_user��������Ϣ����û�id��
	private Data modifyDate;//���¸���ʱ��
	private Integer categoryLevel1;//����һ�����ࣨ��Դ�ڣ�data_dictionary��
	private Integer categoryLevel2;//�����������ࣨ��Դ�ڣ�data_dictionary��
	private String logoPicPath;//LOGOͼƬurl·��
	private String  logoLocPath;//LOGOͼƬ�ķ������洢·��
	private Integer versionId;//���µİ汾id
	private String categoryLevel1Name;//����һ����������
	private String categoryLevel2Name;//����������������
	private String versionNo;//���µİ汾��
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
