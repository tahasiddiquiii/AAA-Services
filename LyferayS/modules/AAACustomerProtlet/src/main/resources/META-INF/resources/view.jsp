<%@ include file="init.jsp" %>

<liferay-ui:tabs names="yuvrajServices, Customer" refresh="false" tabsValues="yuvrajServices, Customer">
    <liferay-ui:section>
         <%@ include file="/viewService.jsp" %>
    </liferay-ui:section>
    <liferay-ui:section>
        <%@ include file="/viewCustomer.jsp" %>
    </liferay-ui:section>
   
</liferay-ui:tabs> 
