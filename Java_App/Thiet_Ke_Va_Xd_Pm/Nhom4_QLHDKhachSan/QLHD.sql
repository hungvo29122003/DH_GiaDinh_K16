CREATE DATABASE invoice;
USE invoice;

CREATE TABLE `invoice` (
  `maHD` INT NOT NULL AUTO_INCREMENT,
  `tenKH` VARCHAR(255) NOT NULL,
  `ngayHD` DATE NOT NULL,
  `maPhong` VARCHAR(255) NOT NULL,
  `donGia` DOUBLE NOT NULL,
  `loaiHD` VARCHAR(255) NOT NULL,
  `soNgay` INT NOT NULL,
  `soGio` INT NOT NULL,
  
  PRIMARY KEY (`maHD`)
);

ALTER TABLE `invoice` AUTO_INCREMENT = 1;

INSERT INTO `invoice` (`tenKH`, `ngayHD`, `maPhong`, `donGia`, `loaiHD`, `soNgay`, `soGio`) VALUES
('Văn Khánh', '2024-04-01', '12', '100', 'Theo ngày', '2', 0),
('Chiến Thắng', '2024-05-05', '8', '120', 'Theo giờ', 0, '3');

SELECT * FROM invoice;