package com.bjsxt.shopping.tag;

import java.io.IOException;

import javax.servlet.jsp.*;


public class HelloWorldTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		this.getJspContext().getOut().write("HelloWorld From Tag");
	}

}
