package com.redhat.management.approval;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestPacket implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private Map<String, Object> content;
    private Map<String, Object> context;

    public RequestPacket(Map<String, Object> maps) {
        this.context = (LinkedHashMap<String, Object>) maps.get("context");
        this.content = (LinkedHashMap<String, Object>) maps.get("content");
    }
    
    public Map<String, Object> getContent() {
        return this.content;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    public Map<String, Object> getContext() {
        return this.context;
    }

    public void setContext(Map<String, Object> context) {
        this.context = context;
    }

    public String toString() {
        return "Request context: \n" + this.context
            + "\nRequest content: \n" + this.content;
    }
    
    public LinkedHashMap<String, Object> getHeaders() {
        return (LinkedHashMap<String, Object>) this.context.get("headers");
    }

    public String getEncodedIdentity() {
        return getHeaders().get("x-rh-identity").toString();
    }
    
    public String getOriginalUrl() {
        return this.context.get("original_url").toString();
    }

}