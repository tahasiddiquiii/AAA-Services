create index IX_CC6558F4 on AAA_AAA_Customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D978C76 on AAA_AAA_Customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_898BA974 on AAA_AAA_Services (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A917FCF6 on AAA_AAA_Services (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5B21CFC8 on AAA_Customer (groupId);
create index IX_F32FC896 on AAA_Customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3E1D7C98 on AAA_Customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7906EF48 on AAA_Services (groupId);
create index IX_B0561916 on AAA_Services (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D99DED18 on AAA_Services (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8A19E8A on yuvraj_AAA_Customer (groupId);
create index IX_3D3F7414 on yuvraj_AAA_Customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1E7DEF96 on yuvraj_AAA_Customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F2199A4E on yuvraj_AAA_tServices (groupId);
create index IX_13CC74D0 on yuvraj_AAA_tServices (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_408BEF52 on yuvraj_AAA_tServices (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4F7F2C69 on yuvraj_AAA_yuvrajServices (groupId);
create index IX_9E4A1115 on yuvraj_AAA_yuvrajServices (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_57DDD8D7 on yuvraj_AAA_yuvrajServices (uuid_[$COLUMN_LENGTH:75$], groupId);