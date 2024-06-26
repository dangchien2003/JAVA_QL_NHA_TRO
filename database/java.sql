USE [JAVA_QL_NHA_TRO]
GO
/****** Object:  Table [dbo].[CocPhong]    Script Date: 21/10/2023 9:36:21 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CocPhong](
	[maPhong] [char](4) NULL,
	[tienCoc] [int] NULL,
	[ngayCoc] [date] NULL,
	[nguoiCoc] [nvarchar](30) NULL,
	[file] [varchar](255) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 21/10/2023 9:36:21 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[maPhong] [char](4) NULL,
	[soDienCu] [int] NULL,
	[soDienMoi] [int] NULL,
	[soNuocCu] [int] NULL,
	[soNuocMoi] [int] NULL,
	[soXe] [int] NULL,
	[soNguoi] [int] NULL,
	[ngayChot] [date] NULL,
	[tongTien] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhongTro]    Script Date: 21/10/2023 9:36:21 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhongTro](
	[maPhong] [char](4) NOT NULL,
	[tang] [int] NULL,
	[tinhTrang] [nvarchar](20) NOT NULL,
	[soNguoiO] [int] NULL,
	[soXe] [int] NULL,
	[maHD] [char](5) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 21/10/2023 9:36:21 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[user] [varchar](20) NOT NULL,
	[pass] [varchar](30) NULL,
	[tenChuTaiKhoan] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThongTinHopDong]    Script Date: 21/10/2023 9:36:21 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinHopDong](
	[maHD] [char](5) NOT NULL,
	[giaPhong] [int] NULL,
	[giaDien] [int] NULL,
	[giaNuoc] [int] NULL,
	[giaVeSinh] [int] NULL,
	[giaXe] [int] NULL,
	[thoiGianBatDau] [date] NULL,
	[thoiGianHieuLuc] [int] NULL,
	[file] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThongTinNguoiO]    Script Date: 21/10/2023 9:36:21 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinNguoiO](
	[maPhong] [char](4) NULL,
	[hoTen] [nvarchar](30) NULL,
	[namSinh] [int] NULL,
	[sdt] [char](10) NULL,
	[soCCCD] [varchar](12) NULL,
	[bienSoXe] [varchar](20) NULL,
	[tenXe] [varchar](20) NULL,
	[queQuan] [nvarchar](100) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'A301', 3, N'PH?NG TR?NG', 0, 0, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'P101', 1, N'Đang sử dụng', 0, 0, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'P102', 1, N'Đang sử dụng', 0, 0, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'P103', 1, N'Phòng trống', 0, 0, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'P201', 2, N'Phòng trống', 0, 0, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'P202', 2, N'Đang sử dụng', 1, 2, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'P203', 2, N'Đang cọc', 0, 0, N'0    ')
INSERT [dbo].[PhongTro] ([maPhong], [tang], [tinhTrang], [soNguoiO], [soXe], [maHD]) VALUES (N'p204', 2, N'Đang cọc', 0, 0, N'0    ')
GO
INSERT [dbo].[TaiKhoan] ([user], [pass], [tenChuTaiKhoan]) VALUES (N'a', N'a', N'LÊ ĐĂNG CHIẾN')
GO
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'0    ', 0, 0, 0, 0, 0, CAST(N'1990-01-01' AS Date), 0, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD001', 2000000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD002', 2000000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD003', 2000000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD004', 2000000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD005', 1500000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD006', 1610000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD007', 2000000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
INSERT [dbo].[ThongTinHopDong] ([maHD], [giaPhong], [giaDien], [giaNuoc], [giaVeSinh], [giaXe], [thoiGianBatDau], [thoiGianHieuLuc], [file]) VALUES (N'HD008', 2000000, 2500, 90000, 50000, 50000, CAST(N'2023-09-28' AS Date), 2, NULL)
GO
INSERT [dbo].[ThongTinNguoiO] ([maPhong], [hoTen], [namSinh], [sdt], [soCCCD], [bienSoXe], [tenXe], [queQuan]) VALUES (N'P202', N'lê đăng chiến', 2003, N'0333757429', N'03020300546', N'34MĐ1 40979', N'xe dien', N'Hải dương')
INSERT [dbo].[ThongTinNguoiO] ([maPhong], [hoTen], [namSinh], [sdt], [soCCCD], [bienSoXe], [tenXe], [queQuan]) VALUES (N'P101', N'', 0, N'          ', N'1', N'', N'', N'')
INSERT [dbo].[ThongTinNguoiO] ([maPhong], [hoTen], [namSinh], [sdt], [soCCCD], [bienSoXe], [tenXe], [queQuan]) VALUES (N'P202', N'lê đăng chiến', 2003, N'0333757429', N'030203005425', N'34MĐ1 40979', N'xe đien', N'Hải dương')
GO
ALTER TABLE [dbo].[CocPhong]  WITH CHECK ADD FOREIGN KEY([maPhong])
REFERENCES [dbo].[PhongTro] ([maPhong])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([maPhong])
REFERENCES [dbo].[PhongTro] ([maPhong])
GO
ALTER TABLE [dbo].[PhongTro]  WITH CHECK ADD FOREIGN KEY([maHD])
REFERENCES [dbo].[ThongTinHopDong] ([maHD])
GO
ALTER TABLE [dbo].[ThongTinNguoiO]  WITH CHECK ADD FOREIGN KEY([maPhong])
REFERENCES [dbo].[PhongTro] ([maPhong])

SELECT * FROM ThongTinHopDong;