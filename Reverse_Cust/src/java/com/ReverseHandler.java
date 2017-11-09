/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.io.IOException;
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;
/**
 *
 * @author Bharat
 */
public class ReverseHandler extends TagSupport{  
private String input;

public void setInput(String input)
{
    this.input = input;
}

@Override
public int doStartTag() throws JspException {  
    JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
    try{  
     String reverse =  new StringBuffer(input).reverse().toString();   
     out.print("<br>");   
     out.print("Reverse:  "+reverse);//printing date and time using JspWriter  
    
    }catch(IOException e){System.out.println(e);}  
    return SKIP_BODY;//will not evaluate the body content of the tag  
}  
    
}