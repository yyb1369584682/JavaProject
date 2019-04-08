package cn.gjp.service;
/*
业务层类
接收上一层，传递给dao层，操作数据库
调用dao层中的类，类成员位置，创建Dao类的对象
 */
import cn.gjp.dao.ZhangWuDao;
import cn.gjp.domin.ZhangWu;

import java.util.List;

public class ZhangWuService {

    private static ZhangWuDao dao = new ZhangWuDao();
    /*
  定义方法，实现删除账务功能
  方法由控制层调用，传递参数zwid
  调用dao层的方法，传递参数zwid
   */
    public void deleteZhangWu(int zwid) {
        dao.deleteZhangWu(zwid);
    }
    /*
    定义方法，实现编辑账务功能
    方法由控制层调用，传递ZhangWu对象
    调用dao层的方法，传递ZhangWu对象
     */
    public void editZhangWu(ZhangWu zw){
        dao.editZhangWu(zw);

    }
    /*
    定义方法，实现添加账务
    方法由控制层调用，传递ZhangWu对象
    调用dao层的方法，传递ZhangWu对象
     */
    public void addZhangWu(ZhangWu zw){
        dao.addZhangWu(zw);

    }
    /*
    定义方法，实现条件查询账务
    方法由控制层调用，传递两个日期字符串
    调用dao层方法，传递两个日期字符串
    获取查询结果
     */
    public List<ZhangWu> select(String startDate,String stopDate){
        return dao.select(startDate,stopDate);

    }
    /*
    定义方法，实现查询所有账务数据
    此方法，由控制层调用，去调用dao层方法
    返回存储ZhangWu对象的List集合
     */
    public List<ZhangWu> selectAll(){
        return  dao.selectAll();
    }


}
