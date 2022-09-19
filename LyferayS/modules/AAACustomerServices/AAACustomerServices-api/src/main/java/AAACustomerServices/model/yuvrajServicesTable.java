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

package AAACustomerServices.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;yuvraj_AAA_yuvrajServices&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see yuvrajServices
 * @generated
 */
public class yuvrajServicesTable extends BaseTable<yuvrajServicesTable> {

	public static final yuvrajServicesTable INSTANCE =
		new yuvrajServicesTable();

	public final Column<yuvrajServicesTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, Long> serviceId = createColumn(
		"serviceId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<yuvrajServicesTable, String> serviceName = createColumn(
		"serviceName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, String> serviceDescription =
		createColumn(
			"serviceDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, String> servicePrice =
		createColumn(
			"servicePrice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<yuvrajServicesTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private yuvrajServicesTable() {
		super("yuvraj_AAA_yuvrajServices", yuvrajServicesTable::new);
	}

}