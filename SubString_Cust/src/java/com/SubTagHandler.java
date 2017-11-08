/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;
/**
 *
 * @author bsc1
 */
public class SubTagHandler extends TagSupport{  
private String input;
private int start;
private int end;
public void setInput(String input)
{
    this.input = input;
}

public void setStart(int start)
{
    this.start = start;
}

public void setEnd(int end)
{
    this.end = end;
}

public int doStartTag() throws JspException {  
    JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
    try{  
     out.print("<br>");   
     out.print("Reverse of "+input+" with start= "+start+"and end= "+end+"  is: "+input.substring(start, end));//printing date and time using JspWriter  
    
    }catch(Exception e){System.out.println(e);}  
    return SKIP_BODY;//will not evaluate the body content of the tag  
}  
    
}
