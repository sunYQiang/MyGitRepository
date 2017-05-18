package sun.yu.qiang.commercialweb.mappers;

import java.util.List;
import java.util.Map;

import sun.yu.qiang.commercialweb.bean.CommercialBean;

public interface  CommercialMapper {
	
	/**
	 * 相数据插入商户需要上传的数据内容
	 * @param commercialBean
	 */
	public void insertcommodity(CommercialBean commercialBean);
	
	/**
	 * 通过id查询数据库
	 * @param id
	 * @return
	 */
	public CommercialBean searchcommodity(String id);
	/**
	 * 通过id查询数据
	 * @param id
	 * @return
	 */
	public List searchid(String id);

}
