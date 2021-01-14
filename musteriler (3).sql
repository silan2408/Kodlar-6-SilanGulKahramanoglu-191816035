-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 14 Oca 2021, 20:27:47
-- Sunucu sürümü: 10.4.17-MariaDB
-- PHP Sürümü: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `musteriler`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `biletbilgileri`
--

CREATE TABLE `biletbilgileri` (
  `ID` int(100) NOT NULL,
  `AD` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `SOYAD` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `TC` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `CEP` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `MAIL` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `GIDISTARIHI` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `biletbilgileri`
--

INSERT INTO `biletbilgileri` (`ID`, `AD`, `SOYAD`, `TC`, `CEP`, `MAIL`, `GIDISTARIHI`) VALUES
(14, 'İLAYDA', 'ÇETİN', '4444444444444', '4444444444444', 'İLAYDA@gmail.com', '0000-00-00'),
(15, 'GÖRKEM', 'KARA', '59598766', '56487945997', 'görkem@gmail.com', '21/20/2020'),
(17, 'aylin', 'karakışlak', '67865484666', '59879465654', 'ayln@hotmail.com', '0000-00-00'),
(19, 'sezen ', 'aksu', '54613345155', '54646848464', 'aksusezen@gmail.com', '0000-00-00'),
(27, 'Hacer', 'YAVAŞ', '46556896659', '58664848613', 'HACER@gmail.com', '2021-01-19'),
(28, 'Gökhan ', 'EMOL', '555555555', '555555555', 'gökhan@gmail.com', '2021-01-17'),
(32, 'berfin', 'kahramanoğlu', '883559787979', '46468464464', 'ber_fin@gmail.com', '2021-01-14'),
(33, 'şilangül', 'kahramanoğlu', '485464313554', '46464166462', 'silan@gmail.com', '2021-01-24');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masraflar`
--

CREATE TABLE `masraflar` (
  `ARABANO` int(11) NOT NULL,
  `VERGİLER` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `YEMEKMAALİYET` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `ARABAAYLIKBAKIM` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `MAZOT` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `masraflar`
--

INSERT INTO `masraflar` (`ARABANO`, `VERGİLER`, `YEMEKMAALİYET`, `ARABAAYLIKBAKIM`, `MAZOT`) VALUES
(1, '24000 TL', '4500 TL', '12000 TL', '45000 TL'),
(2, '26850 TL', '4750 TL', '13550 TL', '46000 TL'),
(3, '27000 TL', '4500 TL', '17000 TL', '43000 TL'),
(4, '29500 TL', '4950 TL', '14575 TL', '46500 TL'),
(5, '32000 TL', '4250 TL', '18900 TL', '43000 TL');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `çalişanlar`
--

CREATE TABLE `çalişanlar` (
  `ID` int(11) NOT NULL,
  `ÇALIŞANAD` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `ÇALIŞANSOYAD` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `ÇALIŞANSEFERİ` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `ÇALIŞANSEFERTARİHİ` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `çalişanlar`
--

INSERT INTO `çalişanlar` (`ID`, `ÇALIŞANAD`, `ÇALIŞANSOYAD`, `ÇALIŞANSEFERİ`, `ÇALIŞANSEFERTARİHİ`) VALUES
(1, 'AHMET', 'GÜRSU', 'ANKARA-İZMİR', '24/08/2001'),
(2, 'MEHMET', 'ERSOY', 'İZMİR-İSTANBUL', '26/06/2020'),
(3, 'FIRAT', 'YILMAZ', 'İSTANBUL-MERSİN', '23/10/2020'),
(4, 'FATİH', 'AK', 'MERSİN-BURSA', '7/09/2020'),
(5, 'KEREM', 'GÖKTEKİN', 'BURSA-İZMİR', '30/11/2020');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `çalişanmaaşlari`
--

CREATE TABLE `çalişanmaaşlari` (
  `ID` int(11) NOT NULL,
  `AD` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `SOYAD` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `MAAŞ` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `çalişanmaaşlari`
--

INSERT INTO `çalişanmaaşlari` (`ID`, `AD`, `SOYAD`, `MAAŞ`) VALUES
(1, 'AHMET(ŞOFÖR)', 'GÜRSU', '3555.75'),
(2, 'MEHMET(ŞOFÖR)', 'ERSOY', '3280.00'),
(3, 'FIRAT(ŞOFÖR)', 'YILMAZ', '3800.00'),
(4, 'FATİH(ŞOFÖR)', 'AK', '4250.50'),
(5, 'KEREM(ŞOFÖR)', 'GÖKTEKİN', '2750.75'),
(6, 'CİHAN(MUAVİN)', 'AKARPINAR', '2555.75'),
(7, 'ERCÜMENT(MUAVİN)', 'AKINCILAR', '2750.00'),
(8, 'UMUT(MUAVİN)', 'ANIK', '2345.00'),
(9, 'EDİP(MUAVİN)', 'ATİLLA', '2458.75'),
(10, 'UĞUR ALİ(MUAVİN)', 'AYSAL', '2963.00');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `biletbilgileri`
--
ALTER TABLE `biletbilgileri`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `masraflar`
--
ALTER TABLE `masraflar`
  ADD PRIMARY KEY (`ARABANO`);

--
-- Tablo için indeksler `çalişanlar`
--
ALTER TABLE `çalişanlar`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `çalişanmaaşlari`
--
ALTER TABLE `çalişanmaaşlari`
  ADD PRIMARY KEY (`ID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `biletbilgileri`
--
ALTER TABLE `biletbilgileri`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Tablo için AUTO_INCREMENT değeri `masraflar`
--
ALTER TABLE `masraflar`
  MODIFY `ARABANO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `çalişanlar`
--
ALTER TABLE `çalişanlar`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `çalişanmaaşlari`
--
ALTER TABLE `çalişanmaaşlari`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
