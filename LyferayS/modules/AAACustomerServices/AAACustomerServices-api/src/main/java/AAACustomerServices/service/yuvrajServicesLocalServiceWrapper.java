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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link yuvrajServicesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServicesLocalService
 * @generated
 */
public class yuvrajServicesLocalServiceWrapper
	implements ServiceWrapper<yuvrajServicesLocalService>,
			   yuvrajServicesLocalService {

	public yuvrajServicesLocalServiceWrapper() {
		this(null);
	}

	public yuvrajServicesLocalServiceWrapper(
		yuvrajServicesLocalService yuvrajServicesLocalService) {

		_yuvrajServicesLocalService = yuvrajServicesLocalService;
	}

	@Override
	public AAACustomerServices.model.yuvrajServices addServices(
			long userId, long groupId, String serviceName,
			String serviceDescription, String servicePrice,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.addServices(
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
	@Override
	public AAACustomerServices.model.yuvrajServices addyuvrajServices(
		AAACustomerServices.model.yuvrajServices yuvrajServices) {

		return _yuvrajServicesLocalService.addyuvrajServices(yuvrajServices);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _yuvrajServicesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	@Override
	public AAACustomerServices.model.yuvrajServices createyuvrajServices(
		long serviceId) {

		return _yuvrajServicesLocalService.createyuvrajServices(serviceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _yuvrajServicesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public AAACustomerServices.model.yuvrajServices deleteServices(
			long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.deleteServices(serviceId);
	}

	@Override
	public AAACustomerServices.model.yuvrajServices deleteServices(
			AAACustomerServices.model.yuvrajServices services)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.deleteServices(services);
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
	@Override
	public AAACustomerServices.model.yuvrajServices deleteyuvrajServices(
			long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _yuvrajServicesLocalService.deleteyuvrajServices(serviceId);
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
	@Override
	public AAACustomerServices.model.yuvrajServices deleteyuvrajServices(
		AAACustomerServices.model.yuvrajServices yuvrajServices) {

		return _yuvrajServicesLocalService.deleteyuvrajServices(yuvrajServices);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _yuvrajServicesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _yuvrajServicesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _yuvrajServicesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _yuvrajServicesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _yuvrajServicesLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _yuvrajServicesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _yuvrajServicesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _yuvrajServicesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public AAACustomerServices.model.yuvrajServices fetchyuvrajServices(
		long serviceId) {

		return _yuvrajServicesLocalService.fetchyuvrajServices(serviceId);
	}

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public AAACustomerServices.model.yuvrajServices
		fetchyuvrajServicesByUuidAndGroupId(String uuid, long groupId) {

		return _yuvrajServicesLocalService.fetchyuvrajServicesByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _yuvrajServicesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _yuvrajServicesLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _yuvrajServicesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _yuvrajServicesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _yuvrajServicesLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<AAACustomerServices.model.yuvrajServices>
			getServicesByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.getServicesByGroupId(groupId);
	}

	@Override
	public java.util.List<AAACustomerServices.model.yuvrajServices>
			getServicesByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.getServicesByGroupId(
			groupId, start, end);
	}

	@Override
	public int getServicesCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.getServicesCountByGroupId(groupId);
	}

	/**
	 * Returns the yuvraj services with the primary key.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws PortalException if a yuvraj services with the primary key could not be found
	 */
	@Override
	public AAACustomerServices.model.yuvrajServices getyuvrajServices(
			long serviceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _yuvrajServicesLocalService.getyuvrajServices(serviceId);
	}

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services
	 * @throws PortalException if a matching yuvraj services could not be found
	 */
	@Override
	public AAACustomerServices.model.yuvrajServices
			getyuvrajServicesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _yuvrajServicesLocalService.getyuvrajServicesByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<AAACustomerServices.model.yuvrajServices>
		getyuvrajServiceses(int start, int end) {

		return _yuvrajServicesLocalService.getyuvrajServiceses(start, end);
	}

	/**
	 * Returns all the yuvraj serviceses matching the UUID and company.
	 *
	 * @param uuid the UUID of the yuvraj serviceses
	 * @param companyId the primary key of the company
	 * @return the matching yuvraj serviceses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<AAACustomerServices.model.yuvrajServices>
		getyuvrajServicesesByUuidAndCompanyId(String uuid, long companyId) {

		return _yuvrajServicesLocalService.
			getyuvrajServicesesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<AAACustomerServices.model.yuvrajServices>
		getyuvrajServicesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AAACustomerServices.model.yuvrajServices> orderByComparator) {

		return _yuvrajServicesLocalService.
			getyuvrajServicesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	@Override
	public int getyuvrajServicesesCount() {
		return _yuvrajServicesLocalService.getyuvrajServicesesCount();
	}

	@Override
	public AAACustomerServices.model.yuvrajServices updateServices(
			long userId, long serviceId, String serviceName,
			String serviceDescription, String servicePrice,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _yuvrajServicesLocalService.updateServices(
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
	@Override
	public AAACustomerServices.model.yuvrajServices updateyuvrajServices(
		AAACustomerServices.model.yuvrajServices yuvrajServices) {

		return _yuvrajServicesLocalService.updateyuvrajServices(yuvrajServices);
	}

	@Override
	public yuvrajServicesLocalService getWrappedService() {
		return _yuvrajServicesLocalService;
	}

	@Override
	public void setWrappedService(
		yuvrajServicesLocalService yuvrajServicesLocalService) {

		_yuvrajServicesLocalService = yuvrajServicesLocalService;
	}

	private yuvrajServicesLocalService _yuvrajServicesLocalService;

}