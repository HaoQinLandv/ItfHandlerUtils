package com.foxhis.itf.handler;

import java.util.Map;

public interface ICtrlRoomHandler {
	
	/***
	 * 入住
	 * 
	 * @param input
	 * @return
	 */
	public Map<String, Object> ctrlroomCkin(Map<String, Object> input);
	
	
	/**
	 * 续住
	 * @param input
	 * @return
	 */
	public Map<String, Object> ctrlroomContinued(Map<String, Object> input);

	/**
	 * 退房
	 * 
	 * @param input
	 * @return
	 */
	public Map<String, Object> ctrlroomCkot(Map<String, Object> input);
	
	
	/**
	 * 通过第三方指令获取房态信息
	 * @param cmd 指令名称
	 * @return 返回json数据格式
	 */
	public String getRmSta(String cmd);
	

}
