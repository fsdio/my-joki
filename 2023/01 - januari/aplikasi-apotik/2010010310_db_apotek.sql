-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2023 at 01:49 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2010010310_db_apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_beli`
--

CREATE TABLE `tb_beli` (
  `id_beli` int(7) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `detailer` varchar(15) NOT NULL,
  `harga` int(10) NOT NULL,
  `total_harga` int(10) NOT NULL,
  `jumlah` int(3) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_beli`
--

INSERT INTO `tb_beli` (`id_beli`, `nama`, `detailer`, `harga`, `total_harga`, `jumlah`, `tanggal`) VALUES
(1, 'PROMAG', 'INC CO', 12000, 60000, 5, '2023-01-02'),
(6, 'DD', 'DD', 40, 400, 10, '2023-01-02'),
(8, 'OSKADON', 'HALODOC', 5000, 10000, 2, '2023-01-02'),
(9, 'PARAMEX', 'HALODOC', 10000, 20000, 2, '2023-01-02');

-- --------------------------------------------------------

--
-- Table structure for table `tb_obat`
--

CREATE TABLE `tb_obat` (
  `id_obat` int(7) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `harga` int(10) NOT NULL,
  `harga_jual` int(10) NOT NULL,
  `pabrik` varchar(20) NOT NULL,
  `indikasi` varchar(50) NOT NULL,
  `detailer` varchar(15) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_obat`
--

INSERT INTO `tb_obat` (`id_obat`, `nama`, `jenis`, `harga`, `harga_jual`, `pabrik`, `indikasi`, `detailer`, `jumlah`) VALUES
(1, 'PROMAG', 'TABLET', 20000, 25000, 'CAP 3 ELANG', 'KEDINGINAN, NGANTUK', 'TOKO KEVIN', 50),
(2, 'TOLAK ANGIN', 'TABLET', 3500, 40000, 'CAP 3 ELANG', 'KEDINGINAN, NGANTUK', 'TOKO KEVIN', 50),
(3, 'KOMIK', 'CAIR', 12000, 15000, 'KEVIN CO', 'BATUK', 'KK', 0),
(5, 'SUSU BERUANG', 'KAPSUL', 353, 436, 'ger', 're', 'er', 45),
(6, 'KAYU PUTIH', 'KAPSUL', 353, 436, 'ger', 're', 'er', 45);

-- --------------------------------------------------------

--
-- Table structure for table `tb_penjualan`
--

CREATE TABLE `tb_penjualan` (
  `no_nota` int(11) NOT NULL,
  `id_obat` int(7) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `jumlah` int(3) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(7) NOT NULL,
  `user` varchar(12) NOT NULL,
  `bagian` enum('farmasi','apotik') NOT NULL,
  `password` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `user`, `bagian`, `password`) VALUES
(1, 'FARMASI', 'farmasi', '12345'),
(2, 'APOTIK', 'apotik', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_beli`
--
ALTER TABLE `tb_beli`
  ADD PRIMARY KEY (`id_beli`);

--
-- Indexes for table `tb_obat`
--
ALTER TABLE `tb_obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD PRIMARY KEY (`no_nota`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_beli`
--
ALTER TABLE `tb_beli`
  MODIFY `id_beli` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tb_obat`
--
ALTER TABLE `tb_obat`
  MODIFY `id_obat` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  MODIFY `no_nota` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
