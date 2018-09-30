package com.foxhis.itf.handler;

import java.util.Map;

/**
 * 短信通用接口!
 *
 */
public interface ISMSHandler 
{
	/**
	 * 发送短信
	 * 
	 * @param input
	 * @return map
	 * 成功的话返回map，key=result,value=true
	 *                key =msg,value ="正确内容"
	 * 失败的话返回map, key=result,value=false
	 *                 key =msg,value ="错误内容"
	 */
	public Map<String, Object> send(Map<String, Object> input);
	
	/**
	 * 查询短信余额
	 * 
	 * @return map
	 * 成功的话返回map，key=result,value=true
	 *                key =balance,value ="余额"
	 * 失败的话返回map, key=result,value=false
	 *                key =msg,value ="错误内容"
	 */
	public Map<String, Object> getBalance();
}
