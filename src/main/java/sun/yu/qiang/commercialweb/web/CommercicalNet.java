package sun.yu.qiang.commercialweb.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.yu.qiang.commercialweb.bean.CommercialBean;
import sun.yu.qiang.commercialweb.mybatis.MyBatis;
@Controller
@RequestMapping(value = "getcommercical",method = RequestMethod.GET,produces={"text/html;charset=UTF-8;","application/json;"})
public class CommercicalNet {
	
	@RequestMapping(value = "insertcommercical",method = RequestMethod.GET,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public void insertCommercical (@RequestParam(value = "commodityid")String commodityid
			,@RequestParam(value = "commodityname")String commodityname
			,@RequestParam(value = "commodityprice")String commodityprice
			,@RequestParam(value = "commoditylocation")String commoditylocation
			,@RequestParam(value = "phonenumber") String phonenumber
			)throws Exception{
		
		System.out.println("aaaaaaaaaaaaaaa"+"id"+commodityid+"name"+commodityname+"price"+commodityprice
				+"location"+commoditylocation+"phonenumber"+phonenumber
				);
		//���յ���Ʒ
		if(!commodityid.isEmpty() && !commodityname.isEmpty() && !commodityprice.isEmpty()
				&& !commoditylocation.isEmpty()
				){
			//��ȡ���ϴ������ݳ����뵽������
			System.out.println("id"+commodityid+"name"+commodityname+"price"+commodityprice
					+"location"+commoditylocation+"phonenumber"+phonenumber
					);
			CommercialBean commercialBean = new CommercialBean();
			commercialBean.setCommodityId(commodityid);
			commercialBean.setCommodityName(commodityname);
			commercialBean.setCommodityPrice(commodityprice);
			commercialBean.setPhoneNumber(phonenumber);
			commercialBean.setCommodityLocation(commoditylocation);
			
			
			MyBatis.Add(commercialBean);//��ʼ�����ݿ��������
			
		}else {
			
		}
		
	}
	
	@RequestMapping(value = "getcommercicaldata",method = RequestMethod.GET,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public CommercialBean getCommercical(@RequestParam(value = "phonenumber")String phonenumber){
	
		System.out.println(phonenumber);
		CommercialBean commercialBean = null;
		if(!phonenumber.isEmpty()){
			
			CommercialBean bean= new CommercialBean();
			bean.setPhoneNumber(phonenumber);
			
			 commercialBean = MyBatis.getCommercial(bean);
			 
		}     
		return commercialBean;
	}
	
	@RequestMapping(value = "getpage")
	@ResponseBody
	public Map getpage(){
		
		
		Map map = MyBatis.getPagerList();
		
		System.out.println("������getpage"+map);
		
		return map;
	}

}
