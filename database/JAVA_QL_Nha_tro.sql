use master
go
drop database JAVA_QL_NHA_TRO
go
Create database JAVA_QL_NHA_TRO;
go
use JAVA_QL_NHA_TRO;
go

CREATE TABLE [TaiKhoan] (
  [user] varchar(20) PRIMARY KEY,
  [pass] varchar(30),
  [tenChuTaiKhoan] nvarchar(30)
)
GO

CREATE TABLE [PhongTro] (
  [maPhong] char(4) PRIMARY KEY,
  [tang] int,
  [tinhTrang] nvarchar(20) NOT NULL,
  [soNguoiO] int,
  [soXe] int,
  [maHD] char(5)
)
GO

CREATE TABLE [ThongTinNguoiO] (
  [maPhong] char(4),
  [hoTen] nvarchar(30),
  [namSinh] int,
  [sdt] char(10),
  [soCCCD] varchar(12),
  [bienSoXe] varchar(10),
  [tenXe] varchar(20),
  [queQuan] nvarchar(100)
)
GO

CREATE TABLE [ThongTinHopDong] (
  [maHD] char(5) primary key,
  [giaPhong] int,
  [giaDien] int,
  [giaNuoc] int,
  [giaVeSinh] int,
  [giaXe] int,
  [thoiGianBatDau] date,
  [thoiGianHieuLuc] date,
  [file] varchar(255)
)
GO

create TABLE [HoaDon] (
  [maHoaDon] int primary key identity(1,1),
  [maPhong] char(4),
  [soDienCu] int,
  [soDienMoi] int,
  [soNuocCu] int,
  [soNuocMoi] int,
  [soXe] int,
  [soNguoi] int,
  [ngayChot] date,
  [tongTien] int
)
GO

CREATE TABLE [CocPhong] (
  [maPhong] char(4),
  [tienCoc] int,
  [ngayCoc] date,
  [nguoiCoc] nvarchar(30),
  [file] varchar(255)
)
GO

ALTER TABLE [ThongTinNguoiO] ADD FOREIGN KEY ([maPhong]) REFERENCES [PhongTro] ([maPhong])
GO

ALTER TABLE [PhongTro] ADD FOREIGN KEY ([maHD]) REFERENCES [ThongTinHopDong] ([maHD])
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([maPhong]) REFERENCES [PhongTro] ([maPhong])
GO

ALTER TABLE [CocPhong] ADD FOREIGN KEY ([maPhong]) REFERENCES [PhongTro] ([maPhong])
GO
