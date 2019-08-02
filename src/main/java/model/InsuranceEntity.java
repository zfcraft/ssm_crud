package model;

import java.util.List;

/**
 * @author chenzhifei
  *  保单信息实体
 */
public class InsuranceEntity {
	/*投保人名称: 2~20位, 不允许为空。
	投保人证件类型: 下拉框。
	投保人证件号码: 不允许为空。
	投保人移动电话:  11位, 不允许为空。
	投保人地址:  不允许为空。
	电子邮箱: 不允许为空。insurName,insurCate,insurPaper,insurPhone,insurAddr,insurEmail*/
	private Integer id;
	/*投保人名称*/
	private String insurName;
	/*投保人证件类型*/
	private String insurCate;
	/*投保人证件号码*/
	private String insurPaper;
	/*投保人移动电话*/
	private String insurPhone;
	/*投保人地址*/
	private String insurAddr;
	/*电子邮箱*/
	private String insurEmail;
	
	private CarEntity carEntity;
	
	public CarEntity getCarEntity() {
		return carEntity;
	}
	public void setCarEntity(CarEntity carEntity) {
		this.carEntity = carEntity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInsurName() {
		return insurName;
	}
	public void setInsurName(String insurName) {
		this.insurName = insurName;
	}
	public String getInsurCate() {
		return insurCate;
	}
	public void setInsurCate(String insurCate) {
		this.insurCate = insurCate;
	}
	public String getInsurPaper() {
		return insurPaper;
	}
	public void setInsurPaper(String insurPaper) {
		this.insurPaper = insurPaper;
	}
	public String getInsurPhone() {
		return insurPhone;
	}
	public void setInsurPhone(String insurPhone) {
		this.insurPhone = insurPhone;
	}
	public String getInsurAddr() {
		return insurAddr;
	}
	public void setInsurAddr(String insurAddr) {
		this.insurAddr = insurAddr;
	}
	public String getInsurEmail() {
		return insurEmail;
	}
	public void setInsurEmail(String insurEmail) {
		this.insurEmail = insurEmail;
	}
	
	

}
