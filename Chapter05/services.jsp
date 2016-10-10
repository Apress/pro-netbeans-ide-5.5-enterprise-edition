<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{services.page1}" id="page1">
            <webuijsf:html binding="#{services.html1}" id="html1">
                <webuijsf:head binding="#{services.head1}" id="head1">
                    <webuijsf:link binding="#{services.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{services.body1}" focus="form1:dropOffices" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{services.form1}" id="form1">
                        <webuijsf:table binding="#{services.table1}" id="table1"/>
                        <webuijsf:tableRowGroup binding="#{services.tableRowGroup1}" id="tableRowGroup1"/>
                        <webuijsf:tableColumn binding="#{services.tableColumn1}" id="tableColumn1"/>
                        <webuijsf:staticText binding="#{services.staticText1}" id="staticText1"/>
                        <webuijsf:tableColumn binding="#{services.tableColumn2}" id="tableColumn2"/>
                        <webuijsf:staticText binding="#{services.staticText2}" id="staticText2"/>
                        <webuijsf:tableColumn binding="#{services.tableColumn3}" id="tableColumn3"/>
                        <webuijsf:staticText binding="#{services.staticText3}" id="staticText3"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
