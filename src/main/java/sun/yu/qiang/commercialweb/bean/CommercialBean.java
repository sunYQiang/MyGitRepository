package sun.yu.qiang.commercialweb.bean;

public class CommercialBean {
	
	
	/**
	 * 手机号
	 */
	private String phoneNumber;
	/**
	 * 商品名字
	 */
	private String commodityName;
	/**
	 * 商品价格
	 */
	private String commodityPrice;
	/**
	 * 商品id
	 */
	private String commodityId;
	/**
	 * 
	 * 商户所在位置
	 */
	private String commodityLocation;
	
	
	public String getCommodityLocation() {
		return commodityLocation;
	}
	public void setCommodityLocation(String commodityLocation) {
		this.commodityLocation = commodityLocation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityPrice() {
		return commodityPrice;
	}
	public void setCommodityPrice(String commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}


}
