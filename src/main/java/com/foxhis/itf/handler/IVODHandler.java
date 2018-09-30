package com.foxhis.itf.handler;

import java.util.Map;

/**
 * Hello world!
 *
 */
public interface IVODHandler {
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
