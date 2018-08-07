package com.hsg.bfc.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Date;

/**
 * 2.8 JSP 2的自定义标签
 */
public class HelloWorldTag extends SimpleTagSupport {
    private String myName;
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        getJspContext().getOut().write("Hello World Tag " + new Date());
        getJspContext().getOut().write("属性 " + myName);
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
