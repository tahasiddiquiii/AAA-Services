/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package AAACustomerServices.service.impl;

import AAACustomerServices.exception.ServiceNameException;
import AAACustomerServices.model.yuvrajServices;
import AAACustomerServices.service.base.yuvrajServicesLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=AAACustomerServices.model.yuvrajServices",
	service = AopService.class
)
public class yuvrajServicesLocalServiceImpl
	extends yuvrajServicesLocalServiceBaseImpl {
	
	protected void validate (String serviceName) 
	        throws PortalException {
	    if (Validator.isNull(serviceName)) {
	        throw new ServiceNameException();
	    }

	}
	
	public yuvrajServices addServices(
	        long userId, long groupId, String serviceName, String serviceDescription, String servicePrice,
	         ServiceContext serviceContext)
	throws PortalException, SystemException {

		User user = userLocalService.getUserById(userId);

	    Date now = new Date();
	    
	    validate(serviceName);

	    long serviceId =
	        counterLocalService.increment(yuvrajServices.class.getName());

	    yuvrajServices services = yuvrajServicesPersistence.create(serviceId);

	    services.setServiceName(serviceName);
	    services.setServiceDescription(serviceDescription);
	    services.setServicePrice(servicePrice);

	    services.setGroupId(groupId);
	    services.setCompanyId(user.getCompanyId());
	    services.setUserId(user.getUserId());
	    services.setCreateDate(serviceContext.getCreateDate(now));
	    services.setModifiedDate(serviceContext.getModifiedDate(now));

	    super.addyuvrajServices(services);
	    return services;
	}

	public yuvrajServices deleteServices(yuvrajServices services)
	    throws SystemException {

	    return yuvrajServicesPersistence.remove(services);
	}

	public yuvrajServices deleteServices(long serviceId)
	    throws PortalException, SystemException {

		yuvrajServices services = yuvrajServicesPersistence.fetchByPrimaryKey(serviceId);

	    return deleteServices(services);
	}

	public List<yuvrajServices> getServicesByGroupId(long groupId)
	    throws SystemException {

	    return yuvrajServicesPersistence.findByGroupId(groupId);
	}

	public List<yuvrajServices> getServicesByGroupId(
	        long groupId, int start, int end)
	    throws SystemException {

	    return yuvrajServicesPersistence.findByGroupId(groupId, start, end);
	}

	public int getServicesCountByGroupId(long groupId) throws SystemException {

	    return yuvrajServicesPersistence.countByGroupId(groupId);
	}

	public yuvrajServices updateServices(
	        long userId, long serviceId, String serviceName, String serviceDescription, String servicePrice,
	         ServiceContext serviceContext)
	    throws PortalException, SystemException {

		User user = userLocalService.getUserById(userId);

	    Date now = new Date();
	    
	    validate(serviceName);

	    yuvrajServices services = yuvrajServicesPersistence.findByPrimaryKey(serviceId);

	    services.setServiceName(serviceName);
	    services.setServiceDescription(serviceDescription);
	    services.setServicePrice(servicePrice);

	    services.setModifiedDate(serviceContext.getModifiedDate(now));

	    
	    super.updateyuvrajServices(services);
	    return services;
	}
	
}