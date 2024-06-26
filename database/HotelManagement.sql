﻿create database Hotel
go
use Hotel
go
create table tbl_HotelRoom(
	ID_R int primary key,
	Ten_R nvarchar(20),
	Loai_R nvarchar(20),
	SoGiuong_R tinyint,
	Gia_R money
)
go
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(201,N'Phòng T2-201',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(202,N'Phòng T2-202',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(203,N'Phòng T2-203',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(204,N'Phòng T2-204',N'Standard',2,950000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(205,N'Phòng T2-205',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(301,N'Phòng T3-301',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(302,N'Phòng T3-302',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(303,N'Phòng T3-303',N'Standard',2,950000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(304,N'Phòng T3-304',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(305,N'Phòng T3-305',N'Deluxe',1,1200000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(401,N'Phòng T4-401',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(402,N'Phòng T4-402',N'Deluxe',2,1450000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(403,N'Phòng T4-403',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(404,N'Phòng T4-404',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(405,N'Phòng T4-405',N'Suite',2,1850000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(501,N'Phòng T5-501',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(502,N'Phòng T5-502',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(503,N'Phòng T5-503',N'Deluxe',1,1200000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(504,N'Phòng T5-504',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(505,N'Phòng T5-505',N'Superior',2,1100000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(601,N'Phòng T6-601',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(602,N'Phòng T6-602',N'Superior',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(603,N'Phòng T6-603',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(604,N'Phòng T6-604',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(605,N'Phòng T6-605',N'Deluxe',2,1450000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(701,N'Phòng T7-701',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(702,N'Phòng T7-702',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(703,N'Phòng T7-703',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(704,N'Phòng T7-704',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(705,N'Phòng T7-705',N'Superior',2,1100000)

--Khách Hàng
create table tbl_KH(
	ID_KH int primary key,
	Ten_KH nvarchar(20),
	DC_KH nvarchar(30),
	SDT_KH varchar(20),	
)
go

--Phòng đã đặt
create table tbl_BookedRoom(
	ID_BK int primary key,
	ID_R int,
	ID_KH int,
	NgayNhan date,
	NgayTra date,
	bkstatus bit,
	constraint KN_ID_R_BK foreign key(ID_R) references tbl_HotelRoom(ID_R),
	constraint KN_ID_KH_BK foreign key(ID_KH) references tbl_KH(ID_KH)
)
go

--Nhân viên
create table tbl_NV(
	ID_NV varchar(6) primary key,
	Ho_NV nvarchar(20),
	Ten_NV nvarchar(10),
	CCCD_NV char(12),
	ChucVu nvarchar(30),
	Luong money,
	GT nvarchar(10),
	DC_NV nvarchar(30),
	SDT_NV varchar(10)
)
go
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values('001',N'Trần Mạnh',N'Cường',001203999999,N'Quản Lý',500000,N'Nam',N'Hà Nội',N'0392683276')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values('002',N'Đồng Thanh',N'Tuấn',001203888888,N'Quản Lý',30000,N'Nam',N'Bắc Giang',N'0395673286')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values('003',N'Đỗ Việt',N'Hưng',001203777777,N'Lễ Tân',20000,N'Nam',N'Hà Nội',N'0395468723')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values('004',N'Hoàng Trần',N'Nguyên',001203666666,N'Phục vụ',10000,N'Nam',N'Nghệ An',N'0395673299')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values('005',N'Cristiano',N'Ronaldo',001203555555,N'Phục vụ',50000,N'Nữ',N'TP. Hồ Chí Minh',N'0386427965')

go

--Hóa đơn
create table tbl_HD(
	ID_HD int primary key,
	ID_BK int,
	ID_NV varchar(6),
	CheckinDate date,
	CheckinTime  time,
	CheckoutDate date,
	CheckoutTime time,
	SoDem tinyint,
	hdstatus bit,
	constraint KN_ID_BK_HD foreign key(ID_BK) references tbl_BookedRoom(ID_BK),
	constraint KN_ID_NV_HD foreign key(ID_NV) references tbl_NV(ID_NV)
)
go

--Dịch vụ
create table tbl_DV(
	ID_DV int primary key,
	Ten_DV nvarchar(30),
	SL_DV tinyint,
	Gia_DV money,
	GhiChu_DV nvarchar(100)
)
go
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(1,N'Coca',100,15,N'Loại lon')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(2,N'Pesi',100,15,N'Loại lon')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(3,N'Fanta',100,15,N'Loại lon')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(4,N'Ăn sáng',1,100,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(5,N'Ăn trưa',1,500,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(6,N'Ăn tối',1,500,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(7,N'Bim bim',100,10,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(8,N'Bể bơi',1,200,N'Bơi 1 ngày')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(9,N'Gym',1,200,N'Tập 1 ngày')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(10,N'Làm sạch phòng',1,500,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(11,N'Giặt là',1,500,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(12,N'Dịch vụ cấp cứu',1,100,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(13,N'Phòng giải trí',1,70,N'Giá 1 giờ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(14,N'Phòng karaoke',1,70,N'Giá 1 giờ')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(15,N'Massage',1,100,N'Giá 1 người')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(16,N'Dịch vụ bác sĩ',1,300,N'Bác sĩ 24/24')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(17,N'Đặt vé xe',1,50,N'Tiền công')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(18,N'Đặt vé tàu',1,50,N'Tiền công')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(19,N'Đặt vé máy bay',1,50,N'Tiền công')
Insert into tbl_DV(ID_DV,Ten_DV,SL_DV,Gia_DV,GhiChu_DV) values(20,N'Thuê xe hơi',1,200,N' ')
go

-- Chi tiết hóa đơn(dịch vụ)
create table tbl_ChiTietHD_DV(
	ID_HD int not null,
	ID_DV int not null,
	NgayDung date,
	SoLuong tinyint,
	GhiChu nvarchar(100),
	DenBu int,
	primary key(ID_HD,ID_DV),
	constraint KN_ID_HD_CT foreign key(ID_HD) references tbl_HD(ID_HD),
	constraint KN_ID_DV_CT foreign key(ID_DV) references tbl_DV(ID_DV)
)
go

--Khách hàng tại phòng
create table tbl_KH_stay(
	ID_HD int not null,
	Ten_KH_stay nvarchar(30),
	CCCD_KH_stay varchar(20),
	NgaySinh date,
	QuocTich nvarchar(20),
	constraint KN_ID_HD_KHS foreign key(ID_HD) references tbl_HD(ID_HD)
)
go

--Trinh trang phong
create table tbl_RoomStatus(
	ID_R int primary key,
	statusRoom nvarchar(30),
	constraint KN_ID_RS_R foreign key(ID_R) references tbl_RoomStatus(ID_R),
)
go
Insert into tbl_RoomStatus(ID_R, statusRoom) values(201,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(202,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(203,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(204,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(205,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(301,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(302,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(303,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(304,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(305,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(401,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(402,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(403,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(404,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(405,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(501,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(502,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(503,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(504,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(505,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(601,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(602,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(603,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(604,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(605,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(701,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(702,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(703,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(704,N'Sẵn sàng')
Insert into tbl_RoomStatus(ID_R, statusRoom) values(705,N'Hỏng')

--account
create table tbl_Account(
	username varchar(30) primary key,
	pass varchar(30),
	ten nvarchar(50),
	chucvu nvarchar(20),
	sdt varchar(20)
)

Insert into tbl_Account(username, pass, ten, chucvu, sdt) values('admin','admin', N'Quản lý', 'Quản lý', '0392683276')
Insert into tbl_Account(username, pass, ten, chucvu, sdt) values('tmc1810','cuong18102003', N'Cường', 'Nhân viên', '0392683277')
ALTER TABLE tbl_HD DROP CONSTRAINT KN_ID_BK_HD;