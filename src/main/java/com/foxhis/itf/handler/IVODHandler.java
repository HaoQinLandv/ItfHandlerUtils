package com.foxhis.itf.handler;

import java.util.Map;

import com.foxhis.itf.suphander.IHander;

/**
 * Hello world!
 *
 */
public interface IVODHandler extends IHander
{
	/***
	 * 入住
	 * 
	 * @param input
	 * @return
	 */
	public Map<String, Object> vodCkin(Map<String, Object> input);

	/**
	 * 退房
	 * 
	 * @param input
	 * @return
	 */
	public Map<String, Object> vodCkot(Map<String, Object> input);
}
