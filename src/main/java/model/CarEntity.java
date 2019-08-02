package model;

/**
 * @author chenzhifei
  *  车辆信息实体
 */
public class CarEntity {
	/*车牌号码:  如果勾选临牌,默认为LS+车架号后6位, 不允许为空。
	车架号:    长度为17位, 不允许为空。
	发动号:    不允许为空。
	初登日期:  格式:yyyy-MM-dd 且小于当天, 不允许为空。
	购车价值:  金额整数，不允许为空。
	下一步按钮 id,carNum,carFrame,carEng,carDate,carValue*/
	
	private Integer id;
	
	
	/*车牌号码*/
	private String carNum;
	/*车架号*/
	private String carFrame;
	/*发动号*/
	private String carEng;
	/*初登日期*/
	private String carDate;
	/*购车价值*/
	private String carValue;
	
	
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CarEntity(Integer id, String carNum, String carFrame, String carEng, String carDate, String carValue) {
		super();
		this.id = id;
		this.carNum = carNum;
		this.carFrame = carFrame;
		this.carEng = carEng;
		this.carDate = carDate;
		this.carValue = carValue;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCarFrame() {
		return carFrame;
	}
	public void setCarFrame(String carFrame) {
		this.carFrame = carFrame;
	}
	public String getCarEng() {
		return carEng;
	}
	public void setCarEng(String carEng) {
		this.carEng = carEng;
	}
	public String getCarDate() {
		return carDate;
	}
	public void setCarDate(String carDate) {
		this.carDate = carDate;
	}
	public String getCarValue() {
		return carValue;
	}
	public void setCarValue(String carValue) {
		this.carValue = carValue;
	}
	
	

}
