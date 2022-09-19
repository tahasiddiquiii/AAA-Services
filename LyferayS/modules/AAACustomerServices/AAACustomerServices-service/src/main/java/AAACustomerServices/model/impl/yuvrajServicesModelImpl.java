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

package AAACustomerServices.model.impl;

import AAACustomerServices.model.yuvrajServices;
import AAACustomerServices.model.yuvrajServicesModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the yuvrajServices service. Represents a row in the &quot;yuvraj_AAA_yuvrajServices&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>yuvrajServicesModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link yuvrajServicesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServicesImpl
 * @generated
 */
public class yuvrajServicesModelImpl
	extends BaseModelImpl<yuvrajServices> implements yuvrajServicesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a yuvraj services model instance should use the <code>yuvrajServices</code> interface instead.
	 */
	public static final String TABLE_NAME = "yuvraj_AAA_yuvrajServices";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"serviceId", Types.BIGINT},
		{"serviceName", Types.VARCHAR}, {"serviceDescription", Types.VARCHAR},
		{"servicePrice", Types.VARCHAR}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("serviceName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("servicePrice", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table yuvraj_AAA_yuvrajServices (uuid_ VARCHAR(75) null,serviceId LONG not null primary key,serviceName VARCHAR(75) null,serviceDescription VARCHAR(75) null,servicePrice VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table yuvraj_AAA_yuvrajServices";

	public static final String ORDER_BY_JPQL =
		" ORDER BY yuvrajServices.serviceName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY yuvraj_AAA_yuvrajServices.serviceName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long SERVICENAME_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public yuvrajServicesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _serviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return yuvrajServices.class;
	}

	@Override
	public String getModelClassName() {
		return yuvrajServices.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<yuvrajServices, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<yuvrajServices, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<yuvrajServices, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((yuvrajServices)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<yuvrajServices, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<yuvrajServices, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(yuvrajServices)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<yuvrajServices, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<yuvrajServices, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<yuvrajServices, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<yuvrajServices, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<yuvrajServices, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<yuvrajServices, Object>>();
		Map<String, BiConsumer<yuvrajServices, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<yuvrajServices, ?>>();

		attributeGetterFunctions.put("uuid", yuvrajServices::getUuid);
		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<yuvrajServices, String>)yuvrajServices::setUuid);
		attributeGetterFunctions.put("serviceId", yuvrajServices::getServiceId);
		attributeSetterBiConsumers.put(
			"serviceId",
			(BiConsumer<yuvrajServices, Long>)yuvrajServices::setServiceId);
		attributeGetterFunctions.put(
			"serviceName", yuvrajServices::getServiceName);
		attributeSetterBiConsumers.put(
			"serviceName",
			(BiConsumer<yuvrajServices, String>)yuvrajServices::setServiceName);
		attributeGetterFunctions.put(
			"serviceDescription", yuvrajServices::getServiceDescription);
		attributeSetterBiConsumers.put(
			"serviceDescription",
			(BiConsumer<yuvrajServices, String>)
				yuvrajServices::setServiceDescription);
		attributeGetterFunctions.put(
			"servicePrice", yuvrajServices::getServicePrice);
		attributeSetterBiConsumers.put(
			"servicePrice",
			(BiConsumer<yuvrajServices, String>)
				yuvrajServices::setServicePrice);
		attributeGetterFunctions.put("groupId", yuvrajServices::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<yuvrajServices, Long>)yuvrajServices::setGroupId);
		attributeGetterFunctions.put("companyId", yuvrajServices::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<yuvrajServices, Long>)yuvrajServices::setCompanyId);
		attributeGetterFunctions.put("userId", yuvrajServices::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<yuvrajServices, Long>)yuvrajServices::setUserId);
		attributeGetterFunctions.put("userName", yuvrajServices::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<yuvrajServices, String>)yuvrajServices::setUserName);
		attributeGetterFunctions.put(
			"createDate", yuvrajServices::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<yuvrajServices, Date>)yuvrajServices::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", yuvrajServices::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<yuvrajServices, Date>)yuvrajServices::setModifiedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@Override
	public long getServiceId() {
		return _serviceId;
	}

	@Override
	public void setServiceId(long serviceId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_serviceId = serviceId;
	}

	@Override
	public String getServiceName() {
		if (_serviceName == null) {
			return "";
		}
		else {
			return _serviceName;
		}
	}

	@Override
	public void setServiceName(String serviceName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_serviceName = serviceName;
	}

	@Override
	public String getServiceDescription() {
		if (_serviceDescription == null) {
			return "";
		}
		else {
			return _serviceDescription;
		}
	}

	@Override
	public void setServiceDescription(String serviceDescription) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_serviceDescription = serviceDescription;
	}

	@Override
	public String getServicePrice() {
		if (_servicePrice == null) {
			return "";
		}
		else {
			return _servicePrice;
		}
	}

	@Override
	public void setServicePrice(String servicePrice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_servicePrice = servicePrice;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(yuvrajServices.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), yuvrajServices.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public yuvrajServices toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, yuvrajServices>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		yuvrajServicesImpl yuvrajServicesImpl = new yuvrajServicesImpl();

		yuvrajServicesImpl.setUuid(getUuid());
		yuvrajServicesImpl.setServiceId(getServiceId());
		yuvrajServicesImpl.setServiceName(getServiceName());
		yuvrajServicesImpl.setServiceDescription(getServiceDescription());
		yuvrajServicesImpl.setServicePrice(getServicePrice());
		yuvrajServicesImpl.setGroupId(getGroupId());
		yuvrajServicesImpl.setCompanyId(getCompanyId());
		yuvrajServicesImpl.setUserId(getUserId());
		yuvrajServicesImpl.setUserName(getUserName());
		yuvrajServicesImpl.setCreateDate(getCreateDate());
		yuvrajServicesImpl.setModifiedDate(getModifiedDate());

		yuvrajServicesImpl.resetOriginalValues();

		return yuvrajServicesImpl;
	}

	@Override
	public yuvrajServices cloneWithOriginalValues() {
		yuvrajServicesImpl yuvrajServicesImpl = new yuvrajServicesImpl();

		yuvrajServicesImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		yuvrajServicesImpl.setServiceId(
			this.<Long>getColumnOriginalValue("serviceId"));
		yuvrajServicesImpl.setServiceName(
			this.<String>getColumnOriginalValue("serviceName"));
		yuvrajServicesImpl.setServiceDescription(
			this.<String>getColumnOriginalValue("serviceDescription"));
		yuvrajServicesImpl.setServicePrice(
			this.<String>getColumnOriginalValue("servicePrice"));
		yuvrajServicesImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		yuvrajServicesImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		yuvrajServicesImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		yuvrajServicesImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		yuvrajServicesImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		yuvrajServicesImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));

		return yuvrajServicesImpl;
	}

	@Override
	public int compareTo(yuvrajServices yuvrajServices) {
		int value = 0;

		value = getServiceName().compareTo(yuvrajServices.getServiceName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof yuvrajServices)) {
			return false;
		}

		yuvrajServices yuvrajServices = (yuvrajServices)object;

		long primaryKey = yuvrajServices.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<yuvrajServices> toCacheModel() {
		yuvrajServicesCacheModel yuvrajServicesCacheModel =
			new yuvrajServicesCacheModel();

		yuvrajServicesCacheModel.uuid = getUuid();

		String uuid = yuvrajServicesCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			yuvrajServicesCacheModel.uuid = null;
		}

		yuvrajServicesCacheModel.serviceId = getServiceId();

		yuvrajServicesCacheModel.serviceName = getServiceName();

		String serviceName = yuvrajServicesCacheModel.serviceName;

		if ((serviceName != null) && (serviceName.length() == 0)) {
			yuvrajServicesCacheModel.serviceName = null;
		}

		yuvrajServicesCacheModel.serviceDescription = getServiceDescription();

		String serviceDescription = yuvrajServicesCacheModel.serviceDescription;

		if ((serviceDescription != null) &&
			(serviceDescription.length() == 0)) {

			yuvrajServicesCacheModel.serviceDescription = null;
		}

		yuvrajServicesCacheModel.servicePrice = getServicePrice();

		String servicePrice = yuvrajServicesCacheModel.servicePrice;

		if ((servicePrice != null) && (servicePrice.length() == 0)) {
			yuvrajServicesCacheModel.servicePrice = null;
		}

		yuvrajServicesCacheModel.groupId = getGroupId();

		yuvrajServicesCacheModel.companyId = getCompanyId();

		yuvrajServicesCacheModel.userId = getUserId();

		yuvrajServicesCacheModel.userName = getUserName();

		String userName = yuvrajServicesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			yuvrajServicesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			yuvrajServicesCacheModel.createDate = createDate.getTime();
		}
		else {
			yuvrajServicesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			yuvrajServicesCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			yuvrajServicesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return yuvrajServicesCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<yuvrajServices, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<yuvrajServices, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<yuvrajServices, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((yuvrajServices)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<yuvrajServices, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<yuvrajServices, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<yuvrajServices, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((yuvrajServices)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, yuvrajServices>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					yuvrajServices.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _serviceId;
	private String _serviceName;
	private String _serviceDescription;
	private String _servicePrice;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<yuvrajServices, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((yuvrajServices)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("serviceId", _serviceId);
		_columnOriginalValues.put("serviceName", _serviceName);
		_columnOriginalValues.put("serviceDescription", _serviceDescription);
		_columnOriginalValues.put("servicePrice", _servicePrice);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("serviceId", 2L);

		columnBitmasks.put("serviceName", 4L);

		columnBitmasks.put("serviceDescription", 8L);

		columnBitmasks.put("servicePrice", 16L);

		columnBitmasks.put("groupId", 32L);

		columnBitmasks.put("companyId", 64L);

		columnBitmasks.put("userId", 128L);

		columnBitmasks.put("userName", 256L);

		columnBitmasks.put("createDate", 512L);

		columnBitmasks.put("modifiedDate", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private yuvrajServices _escapedModel;

}