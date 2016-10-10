<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{aboutus.page1}" id="page1">
            <webuijsf:html binding="#{aboutus.html1}" id="html1">
                <webuijsf:head binding="#{aboutus.head1}" id="head1">
                    <webuijsf:link binding="#{aboutus.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{aboutus.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{aboutus.form1}" id="form1"/>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
