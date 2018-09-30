package com.foxhis.itf.handler;

import java.util.List;
import java.util.Map;

/**
 * 公安通用接口
 *
 */
public interface IPoliceHandler 
{
	/**
	 * 扫描获取xml
	 * 
	 * @param input
	 * @return map
	 * 成功的话返回map，key=result,value=true
	 *                key =msg,value ="正确内容"
	 * 失败的话返回map, key=result,value=false
	 *                 key =msg,value ="错误内容"
	 */
	public List<String> getXMLFile();
	
	/**
	 * 解析xml文件
	 * 
	 * @return map
	 * 成功的话返回map，key=result,value=true
	 *                key =balance,value ="余额"
	 * 失败的话返回map, key=result,value=false
	 *                key =msg,value ="错误内容"
	 */
	public List<Map<String, Object>> parseXMLtoMap(String url);
	
	/**
	 * 生成xml文件
	 * 
	 * @return map
	 * 成功的话返回map，key=result,value=true
	 *                key =balance,value ="余额"
	 * 失败的话返回map, key=result,value=false
	 *                key =msg,value ="错误内容"
	 */
	public Map<String, Object> greateXMLFile(Map<String, Object> input);
	
	/**
	 * 删除xml文件
	 * 
	 * @return map
	 * 成功的话返回map，key=result,value=true
	 *                key =balance,value ="余额"
	 * 失败的话返回map, key=result,value=false
	 *                key =msg,value ="错误内容"
	 */
	public Map<String, Object> deleteXMLFile(boolean issuccess,String url);
}
