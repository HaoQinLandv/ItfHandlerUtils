package com.foxhis.itf.handler;



/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. */

import java.util.Map;

import com.foxhis.itf.suphandler.IHandler;

/**
 * 
 * 门卡本地接口
 * 
 * 传入的input都是 <br>
 *  input.put("parent",Window(窗体父类)); <br>
 *  input.put("hotelid",酒店编码);  <br>
 *  input.put("roomno", 房号);  <br>
 *  input.put("name", 姓名);  <br>
 *  input.put("arr", 到日 yyyy-MM-dd HH|mm);  <br>
 *  input.put("dep", 离日yyyy-MM-dd HH|mm); <br>
 *  input.put("cardtype", 卡类型(new 新卡,copy 复制卡));  <br>
 *  input.put("num", 卡数量); <br>
 *  input.put("accnt", 帐号);  <br>
 *  input.put("resno", 预定号); <br>
 * 
 * 返回的return都是 <br>
 * ret.put("result",返回结果(true/false)); <br>
 * ret.put("msg",各种失败消息) <br>
 * 
 * @author 郭贇 2013-12-17
 * @see
 * @since 1.0
 */
public interface IDoorCardHandler extends IHandler{
	/**
	 * 读卡
	 * 
	 * @param datas
	 * @return
	 */
	public Map<String, Object> readCard(Map<String, Object> input);

	/**
	 * 写卡
	 * 
	 * @param datas
	 * @return
	 */
	public Map<String, Object> writeCard(Map<String, Object> input);

	/**
	 * 销卡
	 * 
	 * @return
	 */
	public Map<String, Object> eraseCard(Map<String, Object> input);
}


