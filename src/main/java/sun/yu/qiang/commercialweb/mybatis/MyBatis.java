package sun.yu.qiang.commercialweb.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sun.yu.qiang.commercialweb.bean.CommercialBean;
import sun.yu.qiang.commercialweb.mappers.CommercialMapper;
import sun.yu.qiang.commercialweb.utils.MyBatisUtil;



public class MyBatis {
	

	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

//    public static void main(String[] args) {
//        testAdd();
//        getUser();
//    }

    public static void Add(CommercialBean commercial) {
    	
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
        	CommercialMapper commercialMapper = sqlSession.getMapper(CommercialMapper.class);
            commercialMapper.insertcommodity(commercial);
            
            System.out.println("插入数据成功");
            sqlSession.commit();//相数据库提交数据
            
        } finally {
            sqlSession.close();
        }
    }

    public static CommercialBean getCommercial(CommercialBean commercial) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CommercialBean commercialBean = null;
        try {
        	CommercialMapper commercialMapper = sqlSession.getMapper(CommercialMapper.class);
        	 commercialBean = commercialMapper.searchcommodity(commercial.getPhoneNumber());//通过手机号查询
            System.out.println("id: " + commercialBean.getCommodityId()+ "|name: "
                    + commercialBean.getCommodityName()+"number"+commercialBean.getPhoneNumber()+
                    "price"+commercialBean.getCommodityPrice());
            
           
        } finally {
            sqlSession.close();
        }
        return commercialBean;
    }
    public static Map getPagerList() {
    	
    	
    	SqlSession sqlSession = sqlSessionFactory.openSession();
        CommercialBean commercialBean = null; 
        Map<String, List> map;
        try {
        	
        	CommercialMapper commercialMapper = sqlSession.getMapper(CommercialMapper.class);
        	List lsit = commercialMapper.searchid("commodityId");//查询id名字
        	 map = new HashMap<String, List>();
        	map.put("list", lsit);
        	
//        	 map.put("list", commercialBean);
        	 
        } finally {
            sqlSession.close();
        }
    	
    	return map;
    }

}
