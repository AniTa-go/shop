/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-10 12:00:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sendgoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>快递</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("<link href=\"../css/bootstrap.min14ed.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/font-awesome.min93e3.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/plugins/iCheck/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/plugins/steps/jquery.steps.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/style.min862f.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//g.alicdn.com/??tm/wuliu-kuaidi/1.0.9/kuaidi/index.css\"\r\n");
      out.write("\ttype=\"text/css\" rel=\"stylesheet\" />\r\n");

	request.setCharacterEncoding("utf-8");

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t<div class=\"ibox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"ibox-title\">\r\n");
      out.write("\t\t\t\t\t\t<h5>寄件</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t<form id=\"form\" class=\"wizard-big\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>填写寄件人/收件人地址</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"module j_module\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"module-head\">寄件人地址</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"module-body poster\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"orderid\" id=\"orderId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table class=\"senderInfo\" id=\"J_posterSenderInfo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: table;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"t-all\"><span class=\"c-red\">*</span>&nbsp;寄件人：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control required\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"t-all\"><span class=\"c-red\">*</span>&nbsp;地址：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"address\" id=\"s_address_container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"Province\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select> <select id=\"City\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select> <select id=\"Area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div> <input type=\"hidden\" id=\"s_prov_value\" name=\"province\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"s_city_value\" name=\"city\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"s_area_value\" name=\"area\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>&nbsp;详细地址：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"addressText  form-control\" name=\"address\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"t-all\"><span class=\"c-red\">*</span>&nbsp;邮编：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"zipcode\" id=\"zipcode\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control required\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"t-all\"><span class=\"c-red\">*</span>&nbsp;手机：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"mobile form-control required phone\" name=\"mobile\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"mobile\" />&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<h1>选择快递公司</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"module-body postCompany\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table class=\"mui-table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col width=\"40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col width=\"40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"search-table-logo\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"J_SelectCompany\" value=\"中国邮政\" name=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"//img.alicdn.com/tps/i2/T1kH40FPFcXXc_d6ve-160-80.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t中国邮政</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"search-table-logo\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"J_SelectCompany\" value=\"EMS\" name=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"//img.alicdn.com/tps/i2/T1q1d6FKlaXXc_d6ve-160-80.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEMS</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"search-table-logo\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"J_SelectCompany\" value=\"圆通速递\" name=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"//img.alicdn.com/tps/i3/T1Z.V2FS8bXXc_d6ve-160-80.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t圆通速递</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"search-table-logo\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"J_SelectCompany\" value=\"中通快递\" name=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"//img.alicdn.com/tps/i1/T1aPR1FLXcXXc_d6ve-160-80.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t中通快递</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"search-table-logo\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"J_SelectCompany\" value=\"韵达快递\" name=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"//img.alicdn.com/tps/i1/T1y8h0FLpcXXc_d6ve-160-80.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t韵达快递</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"search-table-logo\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"J_SelectCompany\" value=\"顺丰速运\" name=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"//img.alicdn.com/tps/i4/T1qpX0FPFcXXc_d6ve-160-80.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t顺丰速运</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h1>完成预约</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"remarks\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>快递公司:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><span id=\"cp\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>货物名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"goodsname\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control required\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>货值:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"goodsvalue\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"goodsvalue\" class=\"form-control required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;元&nbsp;&nbsp;填写物品价值，便于您投诉维权。</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>备注:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"remark\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"remarksText form-control\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>寄件人信息:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"info\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>目标地址:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"radio\" name=\"targetinfo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tchecked=\"checked\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"../js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("\t<script src=\"../js/content.min.js?v=1.0.0\"></script>\r\n");
      out.write("\t<script src=\"../js/plugins/staps/jquery.steps.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/plugins/validate/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/plugins/validate/messages_zh.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document)\r\n");
      out.write("\t\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t// 手机号码验证\r\n");
      out.write("\t\t\t\t\t\t\tjQuery.validator\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.addMethod(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"isMobile\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(value, element) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar length = value.length;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treturn this.optional(element)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t|| (length == 11 && mobile\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.test(value));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}, \"请正确填写您的手机号码\");\r\n");
      out.write("\t\t\t\t\t\t\t//邮编地址验证\r\n");
      out.write("\t\t\t\t\t\t\tjQuery.validator.addMethod(\"isZipCode\", function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue, element) {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar length = value.length;\r\n");
      out.write("\t\t\t\t\t\t\t\tvar zipcode = /^[1-9][0-9]{5}$/;\r\n");
      out.write("\t\t\t\t\t\t\t\treturn this.optional(element)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t|| (length == 6 && zipcode.test(value));\r\n");
      out.write("\t\t\t\t\t\t\t}, \"请正确填写邮编地址\");\r\n");
      out.write("\t\t\t\t\t\t\t//金钱的验证\r\n");
      out.write("\t\t\t\t\t\t\tjQuery.validator\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.addMethod(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"isMoney\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(value, element) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar length = value.length;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar money = /(^[1-9]([0-9]+)?(\\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\\.[0-9]([0-9])?$)/;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treturn this.optional(element)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t|| (money.test(value));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}, \"请正确填写金额\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#wizard\").steps();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#form\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.steps(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tbodyTag : \"fieldset\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonStepChanging : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tevent, currentIndex,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tnewIndex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (currentIndex > newIndex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (newIndex === 3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&& Number($(\"#age\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()) < 18) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn false\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar form = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (currentIndex < newIndex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\".body:eq(\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ newIndex\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \") label.error\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tform).remove();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\".body:eq(\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ newIndex\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \") .error\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tform)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.removeClass(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"error\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tform.validate().settings.ignore = \":disabled,:hidden\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn form.valid()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonStepChanged : function(event,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcurrentIndex,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpriorIndex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (currentIndex == 2) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t//获取选中的快递公司\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar value = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'input:radio[name=\"company\"]:checked')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (value == null)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#cp\").val(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"没有设置快递公司\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#cp\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html(value);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t//设置寄件人信息\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar name = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'input:text[name=\"name\"]')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar address = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#s_prov_value\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#s_city_value\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#s_area_value\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'input:text[name=\"address\"]')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar zipcode = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'input:text[name=\"zipcode\"]')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar mobile = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'input:text[name=\"mobile\"]')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#info\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ address\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ zipcode\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ mobile);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (currentIndex === 2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&& Number($(\"#age\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()) >= 18) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).steps(\"next\")\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (currentIndex === 2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&& priorIndex === 3) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).steps(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"previous\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonFinishing : function(event,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcurrentIndex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar form = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tform.validate().settings.ignore = \":disabled\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn form.valid()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonFinished : function(event,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcurrentIndex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar form = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcache : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\turl : \"/send/goods\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata : form\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.serialize(),// 你的formid\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tasync : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\terror : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequest) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"提交失败，请稍后重试\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsuccess : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talert(\"提交成功,物流号为:\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ data.data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlocation.href = \"/page/order\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.validate(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\terrorPlacement : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\terror, element) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\telement.before(error)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\trules : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmobile : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tminlength : 11,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tisMobile : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tzipcode : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tminlength : 6,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tisZipCode : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tgoodsvalue : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tisMoney : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmobile : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired : \"请输入手机号码\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tminlength : \"必须是11位数字\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tisMobile : \"请输入正确的手机格式\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tzipcode : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired : \"请输入邮编地址\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tminlength : \"必须是6位数字\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tisZipCode : \"请输入正确的邮编地址格式\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tgoodsvalue : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tisMoney : \"请输入金钱的正确格式\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t//初始化城市联动select\r\n");
      out.write("\t\t\t\t\t\t\tprovince();\r\n");
      out.write("\t\t\t\t\t\t\t$('#Province').bind(\"change\", city);\r\n");
      out.write("\t\t\t\t\t\t\t$('#City').bind(\"change\", area);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t/*省(jsonp)*/\r\n");
      out.write("\t\t\t\t\t\t\tfunction province() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdataType : \"jsonp\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8083/logistics/location\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"type\" : \"province\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjsonp : 'callback',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjsonpCallback : 'mycallback',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar json = eval(data.data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfor (var i = 0; i < json.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#Province\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<option value=\" + json[i].provinceid + \">\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ json[i].province\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcity();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t\t\t/*城市(jsonp)*/\r\n");
      out.write("\t\t\t\t\t\t\tfunction city() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#City\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t//设置隐藏域的内容，方便提交\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#s_prov_value\").attr(\"value\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#Province option:selected\").html());\r\n");
      out.write("\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdataType : \"jsonp\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8083/logistics/location\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"type\" : \"city\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"id\" : $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#Province option:selected\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjsonp : 'callback',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjsonpCallback : 'mycallback',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar json = eval(data.data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfor (var i = 0; i < json.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#City\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<option value=\" + json[i].cityid + \">\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ json[i].city\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//设置隐藏域的内容，方便提交\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tarea();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t\t\t/*区域(jsonp)*/\r\n");
      out.write("\t\t\t\t\t\t\tfunction area() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#Area\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#s_city_value\").attr(\"value\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#City option:selected\").html());\r\n");
      out.write("\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdataType : \"jsonp\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8083/logistics/location\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"type\" : \"area\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"id\" : $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#City option:selected\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjsonp : 'callback',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjsonpCallback : 'mycallback',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar json = eval(data.data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfor (var i = 0; i < json.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#Area\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<option value=\" + json[i].areaid + \">\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ json[i].area\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#s_area_value\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"value\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#Area option:selected\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.html());\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t//监听区选择列表，为隐藏域赋值\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#Area\").change(\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t//设置隐藏域的内容，方便提交\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#s_area_value\").attr(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"value\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#Area option:selected\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val());\r\n");
      out.write("\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t//为隐藏域orderid设置值\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"http://tajs.qq.com/stats?sId=9051096\" charset=\"UTF-8\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
