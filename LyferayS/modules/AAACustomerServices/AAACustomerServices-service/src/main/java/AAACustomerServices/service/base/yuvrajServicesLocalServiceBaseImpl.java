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

package AAACustomerServices.service.base;

import AAACustomerServices.model.yuvrajServices;

import AAACustomerServices.service.persistence.CustomerPersistence;
import AAACustomerServices.service.persistence.yuvrajServicesPersistence;
import AAACustomerServices.service.yuvrajServicesLocalService;
import AAACustomerServices.service.yuvrajServicesLocalServiceUtil;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the yuvraj services local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link AAACustomerServices.service.impl.yuvrajServicesLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AAACustomerServices.service.impl.yuvrajServicesLocalServiceImpl
 * @generated
 */
public abstract class yuvrajServicesLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, yuvrajServicesLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>yuvrajServicesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>yuvrajServicesLocalServiceUtil</code>.
	 */

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
	@Override
	public yuvrajServices addyuvrajServices(yuvrajServices yuvrajServices) {
		yuvrajServices.setNew(true);

		return yuvrajServicesPersistence.update(yuvrajServices);
	}

	/**
	 * Creates a new yuvraj services with the primary key. Does not add the yuvraj services to the database.
	 *
	 * @param serviceId the primary key for the new yuvraj services
	 * @return the new yuvraj services
	 */
	@Override
	@Transactional(enabled = false)
	public yuvrajServices createyuvrajServices(long serviceId) {
		return yuvrajServicesPersistence.create(serviceId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public yuvrajServices deleteyuvrajServices(long serviceId)
		throws PortalException {

		return yuvrajServicesPersistence.remove(serviceId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public yuvrajServices deleteyuvrajServices(yuvrajServices yuvrajServices) {
		return yuvrajServicesPersistence.remove(yuvrajServices);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return yuvrajServicesPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			yuvrajServices.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return yuvrajServicesPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return yuvrajServicesPersistence.findWithDynamicQuery(
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return yuvrajServicesPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return yuvrajServicesPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return yuvrajServicesPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public yuvrajServices fetchyuvrajServices(long serviceId) {
		return yuvrajServicesPersistence.fetchByPrimaryKey(serviceId);
	}

	/**
	 * Returns the yuvraj services matching the UUID and group.
	 *
	 * @param uuid the yuvraj services's UUID
	 * @param groupId the primary key of the group
	 * @return the matching yuvraj services, or <code>null</code> if a matching yuvraj services could not be found
	 */
	@Override
	public yuvrajServices fetchyuvrajServicesByUuidAndGroupId(
		String uuid, long groupId) {

		return yuvrajServicesPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the yuvraj services with the primary key.
	 *
	 * @param serviceId the primary key of the yuvraj services
	 * @return the yuvraj services
	 * @throws PortalException if a yuvraj services with the primary key could not be found
	 */
	@Override
	public yuvrajServices getyuvrajServices(long serviceId)
		throws PortalException {

		return yuvrajServicesPersistence.findByPrimaryKey(serviceId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(yuvrajServicesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(yuvrajServices.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("serviceId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			yuvrajServicesLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(yuvrajServices.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("serviceId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(yuvrajServicesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(yuvrajServices.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("serviceId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<yuvrajServices>() {

				@Override
				public void performAction(yuvrajServices yuvrajServices)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, yuvrajServices);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(yuvrajServices.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return yuvrajServicesPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return yuvrajServicesLocalService.deleteyuvrajServices(
			(yuvrajServices)persistedModel);
	}

	@Override
	public BasePersistence<yuvrajServices> getBasePersistence() {
		return yuvrajServicesPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return yuvrajServicesPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the yuvraj serviceses matching the UUID and company.
	 *
	 * @param uuid the UUID of the yuvraj serviceses
	 * @param companyId the primary key of the company
	 * @return the matching yuvraj serviceses, or an empty list if no matches were found
	 */
	@Override
	public List<yuvrajServices> getyuvrajServicesesByUuidAndCompanyId(
		String uuid, long companyId) {

		return yuvrajServicesPersistence.findByUuid_C(uuid, companyId);
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
	public List<yuvrajServices> getyuvrajServicesesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<yuvrajServices> orderByComparator) {

		return yuvrajServicesPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public yuvrajServices getyuvrajServicesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return yuvrajServicesPersistence.findByUUID_G(uuid, groupId);
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
	public List<yuvrajServices> getyuvrajServiceses(int start, int end) {
		return yuvrajServicesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of yuvraj serviceses.
	 *
	 * @return the number of yuvraj serviceses
	 */
	@Override
	public int getyuvrajServicesesCount() {
		return yuvrajServicesPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public yuvrajServices updateyuvrajServices(yuvrajServices yuvrajServices) {
		return yuvrajServicesPersistence.update(yuvrajServices);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			yuvrajServicesLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		yuvrajServicesLocalService = (yuvrajServicesLocalService)aopProxy;

		_setLocalServiceUtilService(yuvrajServicesLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return yuvrajServicesLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return yuvrajServices.class;
	}

	protected String getModelClassName() {
		return yuvrajServices.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = yuvrajServicesPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		yuvrajServicesLocalService yuvrajServicesLocalService) {

		try {
			Field field = yuvrajServicesLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, yuvrajServicesLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected CustomerPersistence customerPersistence;

	protected yuvrajServicesLocalService yuvrajServicesLocalService;

	@Reference
	protected yuvrajServicesPersistence yuvrajServicesPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}