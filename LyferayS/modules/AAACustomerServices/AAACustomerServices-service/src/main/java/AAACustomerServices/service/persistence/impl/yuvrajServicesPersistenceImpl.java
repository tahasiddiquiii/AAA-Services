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

package AAACustomerServices.service.persistence.impl;

import AAACustomerServices.exception.NoSuchyuvrajServicesException;

import AAACustomerServices.model.impl.yuvrajServicesImpl;
import AAACustomerServices.model.impl.yuvrajServicesModelImpl;
import AAACustomerServices.model.yuvrajServices;
import AAACustomerServices.model.yuvrajServicesTable;

import AAACustomerServices.service.persistence.impl.constants.yuvraj_AAAPersistenceConstants;
import AAACustomerServices.service.persistence.yuvrajServicesPersistence;
import AAACustomerServices.service.persistence.yuvrajServicesUtil;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the yuvraj services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {yuvrajServicesPersistence.class, BasePersistence.class})
public class yuvrajServicesPersistenceImpl
	extends BasePersistenceImpl<yuvrajServices>
	implements yuvrajServicesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>yuvrajServicesUtil</code> to access the yuvraj services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		yuvrajServicesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the yuvraj serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching yuvraj serviceses
	 */
	@Override
	public List<yuvrajServices> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<yuvrajServices> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<yuvrajServices> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<yuvrajServices> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<yuvrajServices> list = null;

		if (useFinderCache) {
			list = (List<yuvrajServices>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (yuvrajServices yuvrajServices : list) {
					if (!uuid.equals(yuvrajServices.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(yuvrajServicesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<yuvrajServices>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices findByUuid_First(
			String uuid, OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByUuid_First(
			uuid, orderByComparator);

		if (yuvrajServices != null) {
			return yuvrajServices;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchyuvrajServicesException(sb.toString());
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByUuid_First(
		String uuid, OrderByComparator<yuvrajServices> orderByComparator) {

		List<yuvrajServices> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices findByUuid_Last(
			String uuid, OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByUuid_Last(
			uuid, orderByComparator);

		if (yuvrajServices != null) {
			return yuvrajServices;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchyuvrajServicesException(sb.toString());
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByUuid_Last(
		String uuid, OrderByComparator<yuvrajServices> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<yuvrajServices> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public yuvrajServices[] findByUuid_PrevAndNext(
			long serviceId, String uuid,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		uuid = Objects.toString(uuid, "");

		yuvrajServices yuvrajServices = findByPrimaryKey(serviceId);

		Session session = null;

		try {
			session = openSession();

			yuvrajServices[] array = new yuvrajServicesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, yuvrajServices, uuid, orderByComparator, true);

			array[1] = yuvrajServices;

			array[2] = getByUuid_PrevAndNext(
				session, yuvrajServices, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected yuvrajServices getByUuid_PrevAndNext(
		Session session, yuvrajServices yuvrajServices, String uuid,
		OrderByComparator<yuvrajServices> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(yuvrajServicesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						yuvrajServices)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<yuvrajServices> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the yuvraj serviceses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (yuvrajServices yuvrajServices :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(yuvrajServices);
		}
	}

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching yuvraj serviceses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_YUVRAJSERVICES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"yuvrajServices.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(yuvrajServices.uuid IS NULL OR yuvrajServices.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchyuvrajServicesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices findByUUID_G(String uuid, long groupId)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByUUID_G(uuid, groupId);

		if (yuvrajServices == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchyuvrajServicesException(sb.toString());
		}

		return yuvrajServices;
	}

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the yuvraj services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs);
		}

		if (result instanceof yuvrajServices) {
			yuvrajServices yuvrajServices = (yuvrajServices)result;

			if (!Objects.equals(uuid, yuvrajServices.getUuid()) ||
				(groupId != yuvrajServices.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<yuvrajServices> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					yuvrajServices yuvrajServices = list.get(0);

					result = yuvrajServices;

					cacheResult(yuvrajServices);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (yuvrajServices)result;
		}
	}

	/**
	 * Removes the yuvraj services where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the yuvraj services that was removed
	 */
	@Override
	public yuvrajServices removeByUUID_G(String uuid, long groupId)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = findByUUID_G(uuid, groupId);

		return remove(yuvrajServices);
	}

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching yuvraj serviceses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_YUVRAJSERVICES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"yuvrajServices.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(yuvrajServices.uuid IS NULL OR yuvrajServices.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"yuvrajServices.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching yuvraj serviceses
	 */
	@Override
	public List<yuvrajServices> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<yuvrajServices> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<yuvrajServices> list = null;

		if (useFinderCache) {
			list = (List<yuvrajServices>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (yuvrajServices yuvrajServices : list) {
					if (!uuid.equals(yuvrajServices.getUuid()) ||
						(companyId != yuvrajServices.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(yuvrajServicesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<yuvrajServices>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public yuvrajServices findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (yuvrajServices != null) {
			return yuvrajServices;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchyuvrajServicesException(sb.toString());
	}

	/**
	 * Returns the first yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<yuvrajServices> orderByComparator) {

		List<yuvrajServices> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public yuvrajServices findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (yuvrajServices != null) {
			return yuvrajServices;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchyuvrajServicesException(sb.toString());
	}

	/**
	 * Returns the last yuvraj services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<yuvrajServices> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<yuvrajServices> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public yuvrajServices[] findByUuid_C_PrevAndNext(
			long serviceId, String uuid, long companyId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		uuid = Objects.toString(uuid, "");

		yuvrajServices yuvrajServices = findByPrimaryKey(serviceId);

		Session session = null;

		try {
			session = openSession();

			yuvrajServices[] array = new yuvrajServicesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, yuvrajServices, uuid, companyId, orderByComparator,
				true);

			array[1] = yuvrajServices;

			array[2] = getByUuid_C_PrevAndNext(
				session, yuvrajServices, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected yuvrajServices getByUuid_C_PrevAndNext(
		Session session, yuvrajServices yuvrajServices, String uuid,
		long companyId, OrderByComparator<yuvrajServices> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(yuvrajServicesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						yuvrajServices)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<yuvrajServices> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the yuvraj serviceses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (yuvrajServices yuvrajServices :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(yuvrajServices);
		}
	}

	/**
	 * Returns the number of yuvraj serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching yuvraj serviceses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_YUVRAJSERVICES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"yuvrajServices.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(yuvrajServices.uuid IS NULL OR yuvrajServices.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"yuvrajServices.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByGroupId;
	private FinderPath _finderPathWithoutPaginationFindByGroupId;
	private FinderPath _finderPathCountByGroupId;

	/**
	 * Returns all the yuvraj serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching yuvraj serviceses
	 */
	@Override
	public List<yuvrajServices> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<yuvrajServices> findByGroupId(
		long groupId, int start, int end) {

		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<yuvrajServices> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<yuvrajServices> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByGroupId;
				finderArgs = new Object[] {groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByGroupId;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<yuvrajServices> list = null;

		if (useFinderCache) {
			list = (List<yuvrajServices>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (yuvrajServices yuvrajServices : list) {
					if (groupId != yuvrajServices.getGroupId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(yuvrajServicesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				list = (List<yuvrajServices>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices findByGroupId_First(
			long groupId, OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByGroupId_First(
			groupId, orderByComparator);

		if (yuvrajServices != null) {
			return yuvrajServices;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchyuvrajServicesException(sb.toString());
	}

	/**
	 * Returns the first yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByGroupId_First(
		long groupId, OrderByComparator<yuvrajServices> orderByComparator) {

		List<yuvrajServices> list = findByGroupId(
			groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services
	 * @throws NoSuchyuvrajServicesException if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices findByGroupId_Last(
			long groupId, OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByGroupId_Last(
			groupId, orderByComparator);

		if (yuvrajServices != null) {
			return yuvrajServices;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchyuvrajServicesException(sb.toString());
	}

	/**
	 * Returns the last yuvraj services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchByGroupId_Last(
		long groupId, OrderByComparator<yuvrajServices> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<yuvrajServices> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public yuvrajServices[] findByGroupId_PrevAndNext(
			long serviceId, long groupId,
			OrderByComparator<yuvrajServices> orderByComparator)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = findByPrimaryKey(serviceId);

		Session session = null;

		try {
			session = openSession();

			yuvrajServices[] array = new yuvrajServicesImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, yuvrajServices, groupId, orderByComparator, true);

			array[1] = yuvrajServices;

			array[2] = getByGroupId_PrevAndNext(
				session, yuvrajServices, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected yuvrajServices getByGroupId_PrevAndNext(
		Session session, yuvrajServices yuvrajServices, long groupId,
		OrderByComparator<yuvrajServices> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_YUVRAJSERVICES_WHERE);

		sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(yuvrajServicesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						yuvrajServices)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<yuvrajServices> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the yuvraj serviceses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (yuvrajServices yuvrajServices :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(yuvrajServices);
		}
	}

	/**
	 * Returns the number of yuvraj serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching yuvraj serviceses
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_YUVRAJSERVICES_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"yuvrajServices.groupId = ?";

	public yuvrajServicesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(yuvrajServices.class);

		setModelImplClass(yuvrajServicesImpl.class);
		setModelPKClass(long.class);

		setTable(yuvrajServicesTable.INSTANCE);
	}

	/**
	 * Caches the yuvraj services in the entity cache if it is enabled.
	 *
	 * @param yuvrajServices the yuvraj services
	 */
	@Override
	public void cacheResult(yuvrajServices yuvrajServices) {
		entityCache.putResult(
			yuvrajServicesImpl.class, yuvrajServices.getPrimaryKey(),
			yuvrajServices);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				yuvrajServices.getUuid(), yuvrajServices.getGroupId()
			},
			yuvrajServices);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the yuvraj serviceses in the entity cache if it is enabled.
	 *
	 * @param yuvrajServiceses the yuvraj serviceses
	 */
	@Override
	public void cacheResult(List<yuvrajServices> yuvrajServiceses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (yuvrajServiceses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (yuvrajServices yuvrajServices : yuvrajServiceses) {
			if (entityCache.getResult(
					yuvrajServicesImpl.class, yuvrajServices.getPrimaryKey()) ==
						null) {

				cacheResult(yuvrajServices);
			}
		}
	}

	/**
	 * Clears the cache for all yuvraj serviceses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(yuvrajServicesImpl.class);

		finderCache.clearCache(yuvrajServicesImpl.class);
	}

	/**
	 * Clears the cache for the yuvraj services.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(yuvrajServices yuvrajServices) {
		entityCache.removeResult(yuvrajServicesImpl.class, yuvrajServices);
	}

	@Override
	public void clearCache(List<yuvrajServices> yuvrajServiceses) {
		for (yuvrajServices yuvrajServices : yuvrajServiceses) {
			entityCache.removeResult(yuvrajServicesImpl.class, yuvrajServices);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(yuvrajServicesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(yuvrajServicesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		yuvrajServicesModelImpl yuvrajServicesModelImpl) {

		Object[] args = new Object[] {
			yuvrajServicesModelImpl.getUuid(),
			yuvrajServicesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, yuvrajServicesModelImpl);
	}

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	@Override
	public yuvrajServices create(long serviceId) {
		yuvrajServices yuvrajServices = new yuvrajServicesImpl();

		yuvrajServices.setNew(true);
		yuvrajServices.setPrimaryKey(serviceId);

		String uuid = _portalUUID.generate();

		yuvrajServices.setUuid(uuid);

		yuvrajServices.setCompanyId(CompanyThreadLocal.getCompanyId());

		return yuvrajServices;
	}

	/**
	 * Removes the yuvraj services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services that was removed
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	@Override
	public yuvrajServices remove(long serviceId)
		throws NoSuchyuvrajServicesException {

		return remove((Serializable)serviceId);
	}

	/**
	 * Removes the yuvraj services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the yuvraj services
	 * @return the yuvraj services that was removed
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	@Override
	public yuvrajServices remove(Serializable primaryKey)
		throws NoSuchyuvrajServicesException {

		Session session = null;

		try {
			session = openSession();

			yuvrajServices yuvrajServices = (yuvrajServices)session.get(
				yuvrajServicesImpl.class, primaryKey);

			if (yuvrajServices == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchyuvrajServicesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(yuvrajServices);
		}
		catch (NoSuchyuvrajServicesException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected yuvrajServices removeImpl(yuvrajServices yuvrajServices) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(yuvrajServices)) {
				yuvrajServices = (yuvrajServices)session.get(
					yuvrajServicesImpl.class,
					yuvrajServices.getPrimaryKeyObj());
			}

			if (yuvrajServices != null) {
				session.delete(yuvrajServices);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (yuvrajServices != null) {
			clearCache(yuvrajServices);
		}

		return yuvrajServices;
	}

	@Override
	public yuvrajServices updateImpl(yuvrajServices yuvrajServices) {
		boolean isNew = yuvrajServices.isNew();

		if (!(yuvrajServices instanceof yuvrajServicesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(yuvrajServices.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					yuvrajServices);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in yuvrajServices proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom yuvrajServices implementation " +
					yuvrajServices.getClass());
		}

		yuvrajServicesModelImpl yuvrajServicesModelImpl =
			(yuvrajServicesModelImpl)yuvrajServices;

		if (Validator.isNull(yuvrajServices.getUuid())) {
			String uuid = _portalUUID.generate();

			yuvrajServices.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (yuvrajServices.getCreateDate() == null)) {
			if (serviceContext == null) {
				yuvrajServices.setCreateDate(date);
			}
			else {
				yuvrajServices.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!yuvrajServicesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				yuvrajServices.setModifiedDate(date);
			}
			else {
				yuvrajServices.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(yuvrajServices);
			}
			else {
				yuvrajServices = (yuvrajServices)session.merge(yuvrajServices);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			yuvrajServicesImpl.class, yuvrajServicesModelImpl, false, true);

		cacheUniqueFindersCache(yuvrajServicesModelImpl);

		if (isNew) {
			yuvrajServices.setNew(false);
		}

		yuvrajServices.resetOriginalValues();

		return yuvrajServices;
	}

	/**
	 * Returns the yuvraj services with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	@Override
	public yuvrajServices findByPrimaryKey(Serializable primaryKey)
		throws NoSuchyuvrajServicesException {

		yuvrajServices yuvrajServices = fetchByPrimaryKey(primaryKey);

		if (yuvrajServices == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchyuvrajServicesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return yuvrajServices;
	}

	/**
	 * Returns the yuvraj services with the primary key or throws a <code>NoSuchyuvrajServicesException</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws NoSuchyuvrajServicesException if a yuvraj services with the primary key could not be found
	 */
	@Override
	public yuvrajServices findByPrimaryKey(long serviceId)
		throws NoSuchyuvrajServicesException {

		return findByPrimaryKey((Serializable)serviceId);
	}

	/**
	 * Returns the yuvraj services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services, or <code>null</code> if a yuvraj services with the primary key could not be found
	 */
	@Override
	public yuvrajServices fetchByPrimaryKey(long serviceId) {
		return fetchByPrimaryKey((Serializable)serviceId);
	}

	/**
	 * Returns all the yuvraj serviceses.
	 *
	 * @return the yuvraj serviceses
	 */
	@Override
	public List<yuvrajServices> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<yuvrajServices> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<yuvrajServices> findAll(
		int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<yuvrajServices> findAll(
		int start, int end, OrderByComparator<yuvrajServices> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<yuvrajServices> list = null;

		if (useFinderCache) {
			list = (List<yuvrajServices>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_YUVRAJSERVICES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_YUVRAJSERVICES;

				sql = sql.concat(yuvrajServicesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<yuvrajServices>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the yuvraj serviceses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (yuvrajServices yuvrajServices : findAll()) {
			remove(yuvrajServices);
		}
	}

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_YUVRAJSERVICES);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "serviceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_YUVRAJSERVICES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return yuvrajServicesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the yuvraj services persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByGroupId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"groupId"}, true);

		_finderPathWithoutPaginationFindByGroupId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()}, new String[] {"groupId"},
			true);

		_finderPathCountByGroupId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()}, new String[] {"groupId"},
			false);

		_setyuvrajServicesUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setyuvrajServicesUtilPersistence(null);

		entityCache.removeCache(yuvrajServicesImpl.class.getName());
	}

	private void _setyuvrajServicesUtilPersistence(
		yuvrajServicesPersistence yuvrajServicesPersistence) {

		try {
			Field field = yuvrajServicesUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, yuvrajServicesPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = yuvraj_AAAPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = yuvraj_AAAPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = yuvraj_AAAPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_YUVRAJSERVICES =
		"SELECT yuvrajServices FROM yuvrajServices yuvrajServices";

	private static final String _SQL_SELECT_YUVRAJSERVICES_WHERE =
		"SELECT yuvrajServices FROM yuvrajServices yuvrajServices WHERE ";

	private static final String _SQL_COUNT_YUVRAJSERVICES =
		"SELECT COUNT(yuvrajServices) FROM yuvrajServices yuvrajServices";

	private static final String _SQL_COUNT_YUVRAJSERVICES_WHERE =
		"SELECT COUNT(yuvrajServices) FROM yuvrajServices yuvrajServices WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "yuvrajServices.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No yuvrajServices exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No yuvrajServices exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		yuvrajServicesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private yuvrajServicesModelArgumentsResolver
		_yuvrajServicesModelArgumentsResolver;

}