CREATE DATABASE QLCongty 
USE QLCongty
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [nvarchar](20) NOT NULL,
	[password] [nvarchar](20) NOT NULL,
	[type] [nvarchar](10) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinNhanVien](
	[MaNV] [nvarchar](10) NOT NULL,
	[TenNV] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [nvarchar](10) NOT NULL,
	[ChucVu] [nvarchar](50) NOT NULL,
	[TienLuong] [int] NOT NULL,
 CONSTRAINT [PK_ThongTinNhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'abc', N'123', N'admin')
GO
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'acb', N'123', N'user')
GO
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'admin', N'admin', N'admin')
GO
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'local', N'123', N'local')
GO
INSERT [dbo].[ThongTinNhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [ChucVu], [TienLuong]) VALUES (N'NV001', N'Nguyễn Văn A', CAST(N'1989-03-02' AS Date), N'Nam', N'Nhân viên', 10000)
GO
INSERT [dbo].[ThongTinNhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [ChucVu], [TienLuong]) VALUES (N'NV002', N'Trần Văn B', CAST(N'1990-03-02' AS Date), N'Nam', N'Giám đốc', 15000)
GO
INSERT [dbo].[ThongTinNhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [ChucVu], [TienLuong]) VALUES (N'NV003', N'Đặng Thị Bình', CAST(N'1993-08-23' AS Date), N'Nữ', N'Nhân viên', 10000)
GO
INSERT [dbo].[ThongTinNhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [ChucVu], [TienLuong]) VALUES (N'NV004', N'Trần Cao Vân', CAST(N'1999-02-02' AS Date), N'Nữ', N'Nhân viên', 10000)
GO
INSERT [dbo].[ThongTinNhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [ChucVu], [TienLuong]) VALUES (N'NV005', N'Nguyễn Cao Kỳ Duyên', CAST(N'1991-09-12' AS Date), N'Nữ', N'Kế toán', 30000)
GO
INSERT [dbo].[ThongTinNhanVien] ([MaNV], [TenNV], [NgaySinh], [GioiTinh], [ChucVu], [TienLuong]) VALUES (N'NV006', N'Nguyễn Ngọc Phúc', CAST(N'1990-05-09' AS Date), N'Nam', N'Sales', 10000)
GO