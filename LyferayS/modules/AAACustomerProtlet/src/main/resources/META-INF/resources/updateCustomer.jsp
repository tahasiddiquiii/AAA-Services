<%@ include file="init.jsp" %>

<%
	Customer customer = null;
	long customerId = ParamUtil.getLong(request, "customerId");

	if (customerId > 0) {
		customer = CustomerLocalServiceUtil.getCustomer(customerId);

	}
	List<yuvrajServices> services = yuvrajServicesLocalServiceUtil.getServicesByGroupId(scopeGroupId);
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= customer %>" model="<%= Customer.class %>" />
<portlet:renderURL var="viewCustomerURL" />
<portlet:actionURL name='<%=customer==null?"addCustomer":"updateCustomer"%>' var="editCustomerURL" windowState="normal" />

<liferay-ui:header
	backURL="<%= viewCustomerURL %>"
	title='<%= (customer != null) ? customer.getName() : "New Customer" %>'
/>



<aui:form action="<%= editCustomerURL %>" method="POST" name="fm">
	<aui:fieldset  cssClass="col-md-7">
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

		<aui:input name="customerId" type="hidden" value='<%= customer == null ? "" : customer.getCustomerId() %>'/>

		<aui:input name="name" />

		<aui:input name="email" />

		<aui:input name="address" />
		
		<aui:input name="national_Id" />
		
		<aui:input name="contact" />
		
		<aui:select label="yuvrajServices" name="serviceId" showEmptyOption="<%= true %>">

	 		<%
				for (yuvrajServices service : services) {
			%>

			<aui:option selected="<%= customer!=null && service.getServiceId()==customer.getServiceId()%>" value="<%= service.getServiceId()%>"><%=service.getServiceName() %></aui:option>

			<%
				}
			%>

		</aui:select>

		<aui:input name="start_date" />
		
	</aui:fieldset>

	<aui:button-row cssClass="ml-2">
		<aui:button type="submit" />

		<aui:button onClick="<%= viewCustomerURL %>"  type="cancel" />
	</aui:button-row>
</aui:form>