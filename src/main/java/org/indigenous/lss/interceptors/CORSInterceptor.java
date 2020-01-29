package org.indigenous.lss.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CORSInterceptor implements HandlerInterceptor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CORSInterceptor.class);

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOGGER.debug("CORSInterceptor postHandle called for :: " + request.getRequestURL().toString());
		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	    response.addHeader("Access-Control-Allow-Credentials", "true");
	    response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	    response.addHeader("Access-Control-Max-Age", "3600");
	    response.addHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
	    response.setHeader("Sec-Fetch-Mode", "");
	    response.setHeader("Sec-Fetch-Site", "");
	}

}
