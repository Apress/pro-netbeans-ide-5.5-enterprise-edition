<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{menu.page1}" id="page1">
            <webuijsf:html binding="#{menu.html1}" id="html1">
                <webuijsf:head binding="#{menu.head1}" id="head1">
                    <webuijsf:link binding="#{menu.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{menu.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{menu.form1}" id="form1">
                        <webuijsf:button actionExpression="#{menu.btnProducts_action}" binding="#{menu.btnProducts}" id="btnProducts"
                            style="left: 35px; top: 24px; position: absolute" text="Products"/>
                        <webuijsf:button actionExpression="#{menu.btnServices_action}" binding="#{menu.btnServices}" id="btnServices"
                            style="left: 35px; top: 60px; position: absolute" text="Services"/>
                        <webuijsf:button actionExpression="#{menu.btnAboutUs_action}" binding="#{menu.btnAboutUs}" id="btnAboutUs"
                            style="left: 35px; top: 96px; position: absolute" text="About Us"/>
                        <webuijsf:hyperlink actionExpression="#{menu.lnkSiteMap_action}" binding="#{menu.lnkSiteMap}" id="lnkSiteMap"
                            style="left: 36px; top: 144px; position: absolute" text="Site Map"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
