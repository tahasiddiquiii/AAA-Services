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

package AAACustomerServices.service;

import AAACustomerServices.model.yuvrajServices;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for yuvrajServices. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServicesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface yuvrajServicesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>AAACustomerServices.service.impl.yuvrajServicesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the yuvraj services local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link yuvrajServicesLocalServiceUtil} if injection and service tracking are not available.
	 */
	public yuvrajServices addServices(
			long userId, long groupId, String serviceName,
			String serviceDescription, String servicePrice,
			ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	 * Adds the yuvraj services to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect yuvrajServicesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param yuvrajServices the yuvraj services
	 * @return the yuvraj services that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public yuvrajServices addyuvrajServices(yuvrajServices yuvrajServices);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	@Transactional(enabled = false)
	public yuvrajServices createyuvrajServices(long serviceId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public yuvrajServices deleteServices(long serviceId)
		throws PortalException, SystemException;

	public yuvrajServices deleteServices(yuvrajServices services)
		throws SystemException;

	/**
	 * Deletes the yuvraj services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect yuvrajServicesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services that was removed
	 * @throws PortalException if a yuvraj services with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public yuvrajServices deleteyuvrajServices(long serviceId)
		throws PortalException;

	/**
	 * Deletes the yuvraj services from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect yuvrajServicesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param yuvrajServices the yuvraj services
	 * @return the yuvraj services that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public yuvrajServices deleteyuvrajServices(yuvrajServices yuvrajServices);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AAACustomerServices.model.impl.yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AAACustomerServices.model.impl.yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public yuvrajServices fetchyuvrajServices(long serviceId);

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public yuvrajServices fetchyuvrajServicesByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<yuvrajServices> getServicesByGroupId(long groupId)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<yuvrajServices> getServicesByGroupId(
			long groupId, int start, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getServicesCountByGroupId(long groupId) throws SystemException;

	/**
	 * Returns the yuvraj services with the primary key.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws PortalException if a yuvraj services with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public yuvrajServices getyuvrajServices(long serviceId)
		throws PortalException;

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services
	 * @throws PortalException if a matching yuvraj services could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public yuvrajServices getyuvrajServicesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the yuvraj serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AAACustomerServices.model.impl.yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @return the range of yuvraj serviceses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<yuvrajServices> getyuvrajServiceses(int start, int end);

	/**
	 * Returns all the yuvraj serviceses matching the UUID and company.
	 *
	 * @param uuid the UUID of the yuvraj serviceses
	 * @param companyId the primary key of the company
	 * @return the matching yuvraj serviceses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<yuvrajServices> getyuvrajServicesesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of yuvraj serviceses matching the UUID and company.
	 *
	 * @param uuid the UUID of the yuvraj serviceses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching yuvraj serviceses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<yuvrajServices> getyuvrajServicesesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator);

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getyuvrajServicesesCount();

	public yuvrajServices updateServices(
			long userId, long serviceId, String serviceName,
			String serviceDescription, String servicePrice,
			ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	 * Updates the yuvraj services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect yuvrajServicesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param yuvrajServices the yuvraj services
	 * @return the yuvraj services that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public yuvrajServices updateyuvrajServices(yuvrajServices yuvrajServices);

}