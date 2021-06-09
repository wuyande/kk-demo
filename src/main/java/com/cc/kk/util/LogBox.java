package com.cc.kk.util;

//日志记录工具类

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;

public class LogBox {

    private final String request_line = "============================================================";

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void recordRequest( HttpServletRequest request, String position ){

        log.info("\n" + request_line + "\n" +
                "[" + position +"]\n" +
                "character encoding: " + request.getCharacterEncoding() + "\n" +
                "content type:       " + request.getContentType() + "\n" +
                "method:             " + request.getMethod() + "\n" +
                "url:                " + request.getRequestURI() + "\n" +
                "params:             " + JSONObject.fromObject(request.getParameterMap()).toString() + "\n" +
                "session:            " + request.getRequestedSessionId() + "\n" +
                request_line
        );
    }
}
