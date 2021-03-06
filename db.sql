create database BookStore
go
USE [BookStore]
GO
/****** Object:  Table [dbo].[Publisher]    Script Date: 01/18/2014 01:08:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Publisher](
	[Publisher_id] [int] IDENTITY(1,1) NOT NULL,
	[Publisher_name] [nvarchar](50) NOT NULL,
	[address] [nvarchar](50) NOT NULL,
	[Phone] [varchar](15) NULL,
	[fax] [varchar](15) NULL,
	[Website] [varchar](50) NULL,
 CONSTRAINT [PK_Publisher] PRIMARY KEY CLUSTERED 
(
	[Publisher_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Publisher] ON
INSERT [dbo].[Publisher] ([Publisher_id], [Publisher_name], [address], [Phone], [fax], [Website]) VALUES (1, N'Giáo dục', N'187B Gi?ng Võ - Ð?ng Ða - Hà N?i', N'4.35121980', N'4.35121601', N'http://www.nxbgdhn.com.vn                         ')
INSERT [dbo].[Publisher] ([Publisher_id], [Publisher_name], [address], [Phone], [fax], [Website]) VALUES (2, N'Tuổi Trẻ', N'187B Gi?ng Võ - Ð?ng Ða - Hà N?i', N'4.35121980', N'4.35121601', N'http://www.nxbgdhn.com.vn                         ')
INSERT [dbo].[Publisher] ([Publisher_id], [Publisher_name], [address], [Phone], [fax], [Website]) VALUES (3, N'Kim Đồng', N'187B Gi?ng Võ - Ð?ng Ða - Hà N?i', N'4.35121980', N'4.35121601', N'http://www.nxbgdhn.com.vn                         ')
INSERT [dbo].[Publisher] ([Publisher_id], [Publisher_name], [address], [Phone], [fax], [Website]) VALUES (5, N'ZZZZZZ', N'Hà Nội', N'012345', N'123', N'http://ww.dfdfdfd.')
SET IDENTITY_INSERT [dbo].[Publisher] OFF
/****** Object:  Table [dbo].[Invoice]    Script Date: 01/18/2014 01:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Invoice](
	[Invoice_id] [int] IDENTITY(1,1) NOT NULL,
	[date] [date] NOT NULL,
	[total] [int] NOT NULL,
	[Account_id] [int] NULL,
 CONSTRAINT [PK__Invoice__0DF900AC0519C6AF] PRIMARY KEY CLUSTERED 
(
	[Invoice_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 01/18/2014 01:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[Customer_id] [int] IDENTITY(1,1) NOT NULL,
	[Customer_name] [nvarchar](50) NOT NULL,
	[phone] [varchar](15) NULL,
	[address] [nvarchar](50) NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[Customer_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Customer] ON
INSERT [dbo].[Customer] ([Customer_id], [Customer_name], [phone], [address]) VALUES (1, N'Nguyễn Thị Lan', N'0765445454', N'Đống Đa, Hà Nồ')
INSERT [dbo].[Customer] ([Customer_id], [Customer_name], [phone], [address]) VALUES (3, N'Trần Văn Tăng', N'0986445455', N'Từ Liêm , Hà Nội')
INSERT [dbo].[Customer] ([Customer_id], [Customer_name], [phone], [address]) VALUES (4, N'Lê Văn Lương', N'01156453453', N'Láng Hạ, Hà Nội')
INSERT [dbo].[Customer] ([Customer_id], [Customer_name], [phone], [address]) VALUES (5, N'Nguyễn Thái Học', N'09564654545', N'Láng Hạ, TP.HCM')
INSERT [dbo].[Customer] ([Customer_id], [Customer_name], [phone], [address]) VALUES (6, N'Nguyên Quang Trung', N'0909994543535', N'TP Hồ Chí Minh')
SET IDENTITY_INSERT [dbo].[Customer] OFF
/****** Object:  Table [dbo].[Category]    Script Date: 01/18/2014 01:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[Category_id] [int] IDENTITY(1,1) NOT NULL,
	[Category_name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[Category_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Category] ON
INSERT [dbo].[Category] ([Category_id], [Category_name]) VALUES (1, N'SGK')
INSERT [dbo].[Category] ([Category_id], [Category_name]) VALUES (2, N'Kinh tế')
INSERT [dbo].[Category] ([Category_id], [Category_name]) VALUES (3, N'Văn học')
INSERT [dbo].[Category] ([Category_id], [Category_name]) VALUES (5, N'Truyện Tranh')
INSERT [dbo].[Category] ([Category_id], [Category_name]) VALUES (6, N'Khoa học')
SET IDENTITY_INSERT [dbo].[Category] OFF
/****** Object:  Table [dbo].[Author]    Script Date: 01/18/2014 01:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Author](
	[Author_id] [int] IDENTITY(1,1) NOT NULL,
	[Author_name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Author] PRIMARY KEY CLUSTERED 
(
	[Author_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Author] ON
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (1, N'Nguyễn Du')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (2, N'Kim Thư')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (3, N'Xuân Diệu')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (4, N'Nguyễn Tuân')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (6, N'Nam Cao')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (7, N'Hồ Chí Minh')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (8, N'Tố Hữu')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (9, N'Hồ Xuân Hương')
INSERT [dbo].[Author] ([Author_id], [Author_name]) VALUES (10, N'Hoàng Lan')
SET IDENTITY_INSERT [dbo].[Author] OFF
/****** Object:  Table [dbo].[Account]    Script Date: 01/18/2014 01:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Account_Id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[PassWord] [varchar](40) NOT NULL,
	[Permission] [int] NOT NULL,
	[Account_Name] [nvarchar](40) NOT NULL,
	[gender] [tinyint] NULL,
	[DateOfBirth] [date] NULL,
	[Phone] [varchar](15) NULL,
	[Adress] [nvarchar](100) NULL,
	[status] [tinyint] NOT NULL,
 CONSTRAINT [PK__account__B19E45E9014935CB] PRIMARY KEY CLUSTERED 
(
	[Account_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON
INSERT [dbo].[Account] ([Account_Id], [username], [PassWord], [Permission], [Account_Name], [gender], [DateOfBirth], [Phone], [Adress], [status]) VALUES (1, N'admin', N'e10adc3949ba59abbe56e057f20f883e', 2047, N'Quản trị', 0, CAST(0x56140B00 AS Date), N'012312312', N'HN', 1)
INSERT [dbo].[Account] ([Account_Id], [username], [PassWord], [Permission], [Account_Name], [gender], [DateOfBirth], [Phone], [Adress], [status]) VALUES (2, N'hoangduong', N'aaaa', 123, N'Hoang Duong', 0, CAST(0x2D150B00 AS Date), N'043382473', N'HN', 1)
INSERT [dbo].[Account] ([Account_Id], [username], [PassWord], [Permission], [Account_Name], [gender], [DateOfBirth], [Phone], [Adress], [status]) VALUES (3, N'giang', N'dddd', 123, N'Quang Giang', 0, CAST(0x6E100B00 AS Date), N'093757384', N'HN', 1)
INSERT [dbo].[Account] ([Account_Id], [username], [PassWord], [Permission], [Account_Name], [gender], [DateOfBirth], [Phone], [Adress], [status]) VALUES (4, N'minh', N'dddd', 232, N'Nguyen Minh', 0, CAST(0xC9170B00 AS Date), N'02323232', N'HN', 1)
INSERT [dbo].[Account] ([Account_Id], [username], [PassWord], [Permission], [Account_Name], [gender], [DateOfBirth], [Phone], [Adress], [status]) VALUES (5, N'tuan', N'dddd', 232, N'Ho Tuan', 0, CAST(0x9D180B00 AS Date), N'034384373', N'HN', 1)
INSERT [dbo].[Account] ([Account_Id], [username], [PassWord], [Permission], [Account_Name], [gender], [DateOfBirth], [Phone], [Adress], [status]) VALUES (7, N'quantri', N'sdsd', 121, N'Quan Tri Vien', 0, CAST(0x0F100B00 AS Date), N'0909993966', N'Lang Ha - Thai Thinh, Ha Noi', 1)
SET IDENTITY_INSERT [dbo].[Account] OFF
/****** Object:  Table [dbo].[Order]    Script Date: 01/18/2014 01:08:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[Order_id] [int] IDENTITY(1,1) NOT NULL,
	[Customer_id] [int] NOT NULL,
	[date] [datetime] NOT NULL,
	[status] [tinyint] NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[Order_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Invoice_Detail]    Script Date: 01/18/2014 01:08:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Invoice_Detail](
	[Invoice_Detail_id] [int] IDENTITY(1,1) NOT NULL,
	[Invoice_id] [int] NOT NULL,
	[Book_id] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
	[price] [int] NOT NULL,
 CONSTRAINT [PK_Invoice_Detail] PRIMARY KEY CLUSTERED 
(
	[Invoice_Detail_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Book]    Script Date: 01/18/2014 01:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Book](
	[Book_id] [int] IDENTITY(1,1) NOT NULL,
	[Book_Name] [nvarchar](50) NOT NULL,
	[Category_id] [int] NOT NULL,
	[Publisher_id] [int] NOT NULL,
	[Author_id] [int] NOT NULL,
	[price] [int] NOT NULL,
	[discount] [tinyint] NOT NULL,
	[NumberOfPages] [int] NULL,
	[publishYear] [int] NULL,
	[image] [varchar](100) NULL,
 CONSTRAINT [PK_Book] PRIMARY KEY CLUSTERED 
(
	[Book_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Book] ON
INSERT [dbo].[Book] ([Book_id], [Book_Name], [Category_id], [Publisher_id], [Author_id], [price], [discount], [NumberOfPages], [publishYear], [image]) VALUES (1, N'Toán 9', 1, 1, 1, 24000, 8, 123, 2009, NULL)
INSERT [dbo].[Book] ([Book_id], [Book_Name], [Category_id], [Publisher_id], [Author_id], [price], [discount], [NumberOfPages], [publishYear], [image]) VALUES (2, N'Ngữ Văn 7', 1, 1, 1, 36000, 4, 324, 2012, NULL)
INSERT [dbo].[Book] ([Book_id], [Book_Name], [Category_id], [Publisher_id], [Author_id], [price], [discount], [NumberOfPages], [publishYear], [image]) VALUES (3, N'Tiếng Anh 12', 1, 1, 4, 123, 5, 123, 2010, NULL)
INSERT [dbo].[Book] ([Book_id], [Book_Name], [Category_id], [Publisher_id], [Author_id], [price], [discount], [NumberOfPages], [publishYear], [image]) VALUES (4, N'Toán cao cấp', 1, 1, 1, 153, 8, 153, 2005, NULL)
INSERT [dbo].[Book] ([Book_id], [Book_Name], [Category_id], [Publisher_id], [Author_id], [price], [discount], [NumberOfPages], [publishYear], [image]) VALUES (5, N'Lập trình nhúng', 1, 1, 9, 157, 2, 157, 2005, NULL)
SET IDENTITY_INSERT [dbo].[Book] OFF
/****** Object:  Table [dbo].[Order_Detail]    Script Date: 01/18/2014 01:08:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order_Detail](
	[Order_Detail_id] [int] IDENTITY(1,1) NOT NULL,
	[Order_id] [int] NOT NULL,
	[Book_Id] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
	[price] [int] NOT NULL,
	[discount] [tinyint] NOT NULL,
 CONSTRAINT [PK_Order_Detail] PRIMARY KEY CLUSTERED 
(
	[Order_Detail_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Default [DF_Account_status]    Script Date: 01/18/2014 01:08:02 ******/
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_status]  DEFAULT ((0)) FOR [status]
GO
/****** Object:  Default [DF_Book_discount]    Script Date: 01/18/2014 01:08:02 ******/
ALTER TABLE [dbo].[Book] ADD  CONSTRAINT [DF_Book_discount]  DEFAULT ((0)) FOR [discount]
GO
/****** Object:  ForeignKey [FK_Book_Author]    Script Date: 01/18/2014 01:08:02 ******/
ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_Book_Author] FOREIGN KEY([Author_id])
REFERENCES [dbo].[Author] ([Author_id])
GO
ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_Book_Author]
GO
/****** Object:  ForeignKey [FK_Book_Category]    Script Date: 01/18/2014 01:08:02 ******/
ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_Book_Category] FOREIGN KEY([Category_id])
REFERENCES [dbo].[Category] ([Category_id])
GO
ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_Book_Category]
GO
/****** Object:  ForeignKey [FK_Book_Publisher]    Script Date: 01/18/2014 01:08:02 ******/
ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_Book_Publisher] FOREIGN KEY([Publisher_id])
REFERENCES [dbo].[Publisher] ([Publisher_id])
GO
ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_Book_Publisher]
GO
/****** Object:  ForeignKey [FK_Invoice_Detail_Invoice]    Script Date: 01/18/2014 01:08:03 ******/
ALTER TABLE [dbo].[Invoice_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Invoice_Detail_Invoice] FOREIGN KEY([Invoice_id])
REFERENCES [dbo].[Invoice] ([Invoice_id])
GO
ALTER TABLE [dbo].[Invoice_Detail] CHECK CONSTRAINT [FK_Invoice_Detail_Invoice]
GO
/****** Object:  ForeignKey [FK_Order_Customer]    Script Date: 01/18/2014 01:08:03 ******/
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Customer] FOREIGN KEY([Customer_id])
REFERENCES [dbo].[Customer] ([Customer_id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Customer]
GO
/****** Object:  ForeignKey [FK_Order_Detail_Order]    Script Date: 01/18/2014 01:08:03 ******/
ALTER TABLE [dbo].[Order_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Order_Detail_Order] FOREIGN KEY([Order_id])
REFERENCES [dbo].[Order] ([Order_id])
GO
ALTER TABLE [dbo].[Order_Detail] CHECK CONSTRAINT [FK_Order_Detail_Order]
GO
