<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{formComponents.page1}" id="page1">
            <webuijsf:html binding="#{formComponents.html1}" id="html1">
                <webuijsf:head binding="#{formComponents.head1}" id="head1">
                    <webuijsf:link binding="#{formComponents.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{formComponents.body1}" focus="dropDown1" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{formComponents.form1}" id="form1">
                        <webuijsf:tree binding="#{formComponents.tree1}" id="tree1"
                            style="position: absolute; left: 24px; top: 48px; width: 372px; height: 180px" text="Cities that start with the letter 'C'">
                            <webuijsf:treeNode actionExpression="#{formComponents.treeNodeRoot1_action}" binding="#{formComponents.treeNodeRoot1}"
                                expanded="true" id="treeNodeRoot1" style="color: #ff0000; font-family: Arial,Helvetica,sans-serif; font-weight: bold" text="#{formComponents.citiesDataProvider.value['CITIES.CITY_NAME']}">
                                <f:facet name="image">
                                    <webuijsf:image binding="#{formComponents.image1}" icon="TREE_DOCUMENT" id="image1"/>
                                </f:facet>
                            </webuijsf:treeNode>
                            <webuijsf:treeNode binding="#{formComponents.treeNodeRoot2}" expanded="true" id="treeNodeRoot2" text="Tree Node 5">
                                <f:facet name="image">
                                    <webuijsf:image binding="#{formComponents.image5}" icon="TREE_DOCUMENT" id="image5"/>
                                </f:facet>
                            </webuijsf:treeNode>
                            <webuijsf:treeNode binding="#{formComponents.treeNodeRoot3}" id="treeNodeRoot3" text="Tree Node 6">
                                <f:facet name="image">
                                    <webuijsf:image binding="#{formComponents.image6}" icon="TREE_DOCUMENT" id="image6"/>
                                </f:facet>
                            </webuijsf:treeNode>
                        </webuijsf:tree>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
