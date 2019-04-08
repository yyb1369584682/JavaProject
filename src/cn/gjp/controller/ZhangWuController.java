package cn.gjp.controller;

import cn.gjp.domin.ZhangWu;
import cn.gjp.service.ZhangWuService;

import java.util.List;

/*
控制器层
接收视图层的数据，数据传递给service层
成员位置，创建service对象
 */
public class ZhangWuController {
    private static ZhangWuService service = new ZhangWuService();
    /*
        定义方法，实现删除账务
        方法由视图层调用，传递参数zwid
        调用service层的方法，传递参数zwid
         */
    public void deleteZhangWu(int zwid) {
        service.deleteZhangWu(zwid);
    }

    /*
    定义方法，实现编辑账务
    方法由视图层调用，传递参数ZhangWu类型对象（分类名称、金额、账户、日期、具体描述五个参数）
    调用service层的方法，传递ZhangWu类型对象
     */
    public void editZhangWu(ZhangWu zw){
        service.editZhangWu(zw);

    }
    /*
    定义方法，实现添加账务
    方法由视图层调用，传递参数ZhangWu类型对象（分类名称、金额、账户、日期、具体描述五个参数）
    调用service层的方法，传递ZhangWu类型对象
     */
    public void addZhangWu(ZhangWu zw){
        service.addZhangWu(zw);
    }
    /*
    定义方法，实现条件查询账务
    方法由视图层调用，传递两个日期的字符串
    调用service层的方法，传递两个日期字符串，获取结果集
    结果集返回给视图
     */
    public List<ZhangWu> select(String startDate,String stopDate){
        return service.select(startDate,stopDate);

    }
    /*
    控制层类定义方法，实现查询所有的账务数据
    方法由视图层调用，方法调用service层
     */
    public List<ZhangWu> selectAll(){
        return service.selectAll();
    }


}
