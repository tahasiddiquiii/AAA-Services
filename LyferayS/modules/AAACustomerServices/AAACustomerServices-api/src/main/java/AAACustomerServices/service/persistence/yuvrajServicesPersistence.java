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

import AAACustomerServices.exception.NoSuchyuvrajServicesException;

import AAACustomerServices.model.yuvrajServices;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the yuvraj services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServicesUtil
 * @generated
 */
@ProviderType
public interface yuvrajServicesPersistence
	extends BasePersistence<yuvrajServices> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link yuvrajServicesUtil} to access the yuvraj services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the yuvraj serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching yuvraj serviceses
	 */
	public java.util.List<yuvrajServices> findByUuid(String uuid);

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
	public java.util.List<yuvrajServices> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<yuvrajServices> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

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
	public java.util.List<yuvrajServices> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

	/**
	 * Returns the yuvraj serviceses before and after the current yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param serviceId the primary key of the current yuvraj services
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public yuvrajServices[] findByUuid_PrevAndNext(
			long serviceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Removes all the yuvraj serviceses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching yuvraj serviceses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchyuvrajServicesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByUUID_G(String uuid, long groupId)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the yuvraj services where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the yuvraj services that was removed
	 */
	public yuvrajServices removeByUUID_G(String uuid, long groupId)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching yuvraj serviceses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching yuvraj serviceses
	 */
	public java.util.List<yuvrajServices> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

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
	public java.util.List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

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
	public yuvrajServices[] findByUuid_C_PrevAndNext(
			long serviceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Removes all the yuvraj serviceses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching yuvraj serviceses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the yuvraj serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching yuvraj serviceses
	 */
	public java.util.List<yuvrajServices> findByGroupId(long groupId);

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
	public java.util.List<yuvrajServices> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<yuvrajServices> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

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
	public java.util.List<yuvrajServices> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the first yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

	/**
	 * Returns the last yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	public yuvrajServices findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the last yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	public yuvrajServices fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

	/**
	 * Returns the yuvraj serviceses before and after the current yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param serviceId the primary key of the current yuvraj services
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public yuvrajServices[] findByGroupId_PrevAndNext(
			long serviceId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
				orderByComparator)
		throws NoSuchyuvrajServicesException;

	/**
	 * Removes all the yuvraj serviceses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of yuvraj serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching yuvraj serviceses
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the yuvraj services in the entity cache if it is enabled.
	 *
	 * @param yuvrajServices the yuvraj services
	 */
	public void cacheResult(yuvrajServices yuvrajServices);

	/**
	 * Caches the yuvraj serviceses in the entity cache if it is enabled.
	 *
	 * @param yuvrajServiceses the yuvraj serviceses
	 */
	public void cacheResult(java.util.List<yuvrajServices> yuvrajServiceses);

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	public yuvrajServices create(long serviceId);

	/**
	 * Removes the yuvraj services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services that was removed
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public yuvrajServices remove(long serviceId)
		throws NoSuchyuvrajServicesException;

	public yuvrajServices updateImpl(yuvrajServices yuvrajServices);

	/**
	 * Returns the yuvraj services with the primary key or throws a <code>NoSuchyuvrajServicesException</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	public yuvrajServices findByPrimaryKey(long serviceId)
		throws NoSuchyuvrajServicesException;

	/**
	 * Returns the yuvraj services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services, or <code>null</code> if a yuvraj services with the primary key could not be found
	 */
	public yuvrajServices fetchByPrimaryKey(long serviceId);

	/**
	 * Returns all the yuvraj serviceses.
	 *
	 * @return the yuvraj serviceses
	 */
	public java.util.List<yuvrajServices> findAll();

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
	public java.util.List<yuvrajServices> findAll(int start, int end);

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
	public java.util.List<yuvrajServices> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator);

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
	public java.util.List<yuvrajServices> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<yuvrajServices>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the yuvraj serviceses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	public int countAll();

}