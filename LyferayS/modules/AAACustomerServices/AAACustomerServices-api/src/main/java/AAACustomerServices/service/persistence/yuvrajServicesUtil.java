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

package AAACustomerServices.service.persistence;

import AAACustomerServices.model.yuvrajServices;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the yuvraj services service. This utility wraps <code>AAACustomerServices.service.persistence.impl.yuvrajServicesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServicesPersistence
 * @generated
 */
public class yuvrajServicesUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(yuvrajServices yuvrajServices) {
		getPersistence().clearCache(yuvrajServices);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, yuvrajServices> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<yuvrajServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<yuvrajServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<yuvrajServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static yuvrajServices update(yuvrajServices yuvrajServices) {
		return getPersistence().update(yuvrajServices);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static yuvrajServices update(
		yuvrajServices yuvrajServices, ServiceContext serviceContext) {

		return getPersistence().update(yuvrajServices, serviceContext);
	}

	/**
	 * Returns all the yuvraj serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the yuvraj serviceses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @return the range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByUuid_First(
			String uuid, OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByUuid_First(
		String uuid, OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByUuid_Last(
			String uuid, OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByUuid_Last(
		String uuid, OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the yuvraj serviceses before and after the current yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param serviceId the primary key of the current yuvraj services
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices[] findByUuid_PrevAndNext(
			long serviceId, String uuid,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUuid_PrevAndNext(
			serviceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the yuvraj serviceses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching yuvraj serviceses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchyuvrajServicesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByUUID_G(String uuid, long groupId)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the yuvraj services where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the yuvraj services that was removed
	 */
	public static yuvrajServices removeByUUID_G(String uuid, long groupId)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching yuvraj serviceses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @return the range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the yuvraj serviceses before and after the current yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param serviceId the primary key of the current yuvraj services
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices[] findByUuid_C_PrevAndNext(
			long serviceId, String uuid, long companyId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			serviceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the yuvraj serviceses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching yuvraj serviceses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the yuvraj serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the yuvraj serviceses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @return the range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching yuvraj serviceses
	 */
	public static List<yuvrajServices> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByGroupId_First(
			long groupId, OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByGroupId_First(
		long groupId, OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public static yuvrajServices findByGroupId_Last(
			long groupId, OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public static yuvrajServices fetchByGroupId_Last(
		long groupId, OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the yuvraj serviceses before and after the current yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param serviceId the primary key of the current yuvraj services
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices[] findByGroupId_PrevAndNext(
			long serviceId, long groupId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByGroupId_PrevAndNext(
			serviceId, groupId, orderByComparator);
	}

	/**
	 * Removes all the yuvraj serviceses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of yuvraj serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching yuvraj serviceses
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the yuvraj services in the entity cache if it is enabled.
	 *
	 * @param yuvrajServices the yuvraj services
	 */
	public static void cacheResult(yuvrajServices yuvrajServices) {
		getPersistence().cacheResult(yuvrajServices);
	}

	/**
	 * Caches the yuvraj serviceses in the entity cache if it is enabled.
	 *
	 * @param yuvrajServiceses the yuvraj serviceses
	 */
	public static void cacheResult(List<yuvrajServices> yuvrajServiceses) {
		getPersistence().cacheResult(yuvrajServiceses);
	}

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	public static yuvrajServices create(long serviceId) {
		return getPersistence().create(serviceId);
	}

	/**
	 * Removes the yuvraj services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services that was removed
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices remove(long serviceId)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().remove(serviceId);
	}

	public static yuvrajServices updateImpl(yuvrajServices yuvrajServices) {
		return getPersistence().updateImpl(yuvrajServices);
	}

	/**
	 * Returns the yuvraj services with the primary key or throws a <code>NoSuchyuvrajServicesException</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices findByPrimaryKey(long serviceId)
		throws AAACustomerServices.exception.NoSuchyuvrajServicesException {

		return getPersistence().findByPrimaryKey(serviceId);
	}

	/**
	 * Returns the yuvraj services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services, or <code>null</code> if a yuvraj services with the primary key could not be found
	 */
	public static yuvrajServices fetchByPrimaryKey(long serviceId) {
		return getPersistence().fetchByPrimaryKey(serviceId);
	}

	/**
	 * Returns all the yuvraj serviceses.
	 *
	 * @return the yuvraj serviceses
	 */
	public static List<yuvrajServices> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the yuvraj serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @return the range of yuvraj serviceses
	 */
	public static List<yuvrajServices> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of yuvraj serviceses
	 */
	public static List<yuvrajServices> findAll(
		int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the yuvraj serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>yuvrajServicesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of yuvraj serviceses
	 * @param end the upper bound of the range of yuvraj serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of yuvraj serviceses
	 */
	public static List<yuvrajServices> findAll(
		int start, int end, OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the yuvraj serviceses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static yuvrajServicesPersistence getPersistence() {
		return _persistence;
	}

	private static volatile yuvrajServicesPersistence _persistence;

}