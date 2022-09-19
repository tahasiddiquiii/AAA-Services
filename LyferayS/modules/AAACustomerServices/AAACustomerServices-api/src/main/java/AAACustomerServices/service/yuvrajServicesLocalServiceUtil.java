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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for yuvrajServices. This utility wraps
 * <code>AAACustomerServices.service.impl.yuvrajServicesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServicesLocalService
 * @generated
 */
public class yuvrajServicesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>AAACustomerServices.service.impl.yuvrajServicesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static yuvrajServices addServices(
			long userId, long groupId, String serviceName,
			String serviceDescription, String servicePrice,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().addServices(
			userId, groupId, serviceName, serviceDescription, servicePrice,
			serviceContext);
	}

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
	public static yuvrajServices addyuvrajServices(
		yuvrajServices yuvrajServices) {

		return getService().addyuvrajServices(yuvrajServices);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	public static yuvrajServices createyuvrajServices(long serviceId) {
		return getService().createyuvrajServices(serviceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static yuvrajServices deleteServices(long serviceId)
		throws PortalException, SystemException {

		return getService().deleteServices(serviceId);
	}

	public static yuvrajServices deleteServices(yuvrajServices services)
		throws SystemException {

		return getService().deleteServices(services);
	}

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
	public static yuvrajServices deleteyuvrajServices(long serviceId)
		throws PortalException {

		return getService().deleteyuvrajServices(serviceId);
	}

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
	public static yuvrajServices deleteyuvrajServices(
		yuvrajServices yuvrajServices) {

		return getService().deleteyuvrajServices(yuvrajServices);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static yuvrajServices fetchyuvrajServices(long serviceId) {
		return getService().fetchyuvrajServices(serviceId);
	}

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchyuvrajServicesByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchyuvrajServicesByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static List<yuvrajServices> getServicesByGroupId(long groupId)
		throws SystemException {

		return getService().getServicesByGroupId(groupId);
	}

	public static List<yuvrajServices> getServicesByGroupId(
			long groupId, int start, int end)
		throws SystemException {

		return getService().getServicesByGroupId(groupId, start, end);
	}

	public static int getServicesCountByGroupId(long groupId)
		throws SystemException {

		return getService().getServicesCountByGroupId(groupId);
	}

	/**
	 * Returns the yuvraj services with the primary key.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws PortalException if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices getyuvrajServices(long serviceId)
		throws PortalException {

		return getService().getyuvrajServices(serviceId);
	}

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services
	 * @throws PortalException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices getyuvrajServicesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getyuvrajServicesByUuidAndGroupId(uuid, groupId);
	}

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
	public static List<yuvrajServices> getyuvrajServiceses(int start, int end) {
		return getService().getyuvrajServiceses(start, end);
	}

	/**
	 * Returns all the yuvraj serviceses matching the UUID and company.
	 *
	 * @param uuid the UUID of the yuvraj serviceses
	 * @param companyId the primary key of the company
	 * @return the matching yuvraj serviceses, or an empty list if no matches were found
	 */
	public static List<yuvrajServices> getyuvrajServicesesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getyuvrajServicesesByUuidAndCompanyId(
			uuid, companyId);
	}

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
	public static List<yuvrajServices> getyuvrajServicesesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getService().getyuvrajServicesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	public static int getyuvrajServicesesCount() {
		return getService().getyuvrajServicesesCount();
	}

	public static yuvrajServices updateServices(
			long userId, long serviceId, String serviceName,
			String serviceDescription, String servicePrice,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().updateServices(
			userId, serviceId, serviceName, serviceDescription, servicePrice,
			serviceContext);
	}

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
	public static yuvrajServices updateyuvrajServices(
		yuvrajServices yuvrajServices) {

		return getService().updateyuvrajServices(yuvrajServices);
	}

	public static yuvrajServicesLocalService getService() {
		return _service;
	}

	private static volatile yuvrajServicesLocalService _service;

}