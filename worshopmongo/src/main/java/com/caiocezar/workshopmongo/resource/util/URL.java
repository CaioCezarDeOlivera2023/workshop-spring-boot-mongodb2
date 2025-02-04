package com.caiocezar.workshopmongo.resource.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {

	public static String decodeParam(String tet) {
		try {
			return URLDecoder.decode(tet, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	public static Date converDate(String textDate, Date defaultValue) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return sdf.parse(textDate);
		} catch (ParseException e) {

			return defaultValue;
		}
	}
}
