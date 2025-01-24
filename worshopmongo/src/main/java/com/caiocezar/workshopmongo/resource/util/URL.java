package com.caiocezar.workshopmongo.resource.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	public static String decodeParam(String tet) {
		try {
			return URLDecoder.decode(tet, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
}
