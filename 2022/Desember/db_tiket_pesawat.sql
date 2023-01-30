-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2022 at 11:15 AM
-- Server version: 10.10.2-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tiket_pesawat`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_riwayat`
--

CREATE TABLE `tb_riwayat` (
  `id_penerbangan` int(11) NOT NULL,
  `id_tiket` int(11) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `bandara` varchar(100) NOT NULL,
  `maskapai` varchar(100) NOT NULL,
  `destinasi` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `jam` time NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `QTY` int(11) NOT NULL,
  `harga_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_tiket`
--

CREATE TABLE `tb_tiket` (
  `id_tiket` int(11) NOT NULL,
  `nama_tiket` varchar(100) NOT NULL,
  `bandara` varchar(100) NOT NULL,
  `maskapai` varchar(100) NOT NULL,
  `destinasi` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `jam` time NOT NULL,
  `kelas` enum('ekonomi','bisnis','first_class') NOT NULL,
  `QTY` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `nama_lengkap`, `no_hp`, `email`, `password`, `alamat`) VALUES
(3, 'ADMIN', '083144605600', 'admin@gmail.com', 'admin123', 'DIRUMAH ADMIN'),
(4, 'Rizki Wahyu', '083174506600', 'rizki@gmail.com', 'rizki123', 'AKU DIRUMAH');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_riwayat`
--
ALTER TABLE `tb_riwayat`
  ADD PRIMARY KEY (`id_penerbangan`);

--
-- Indexes for table `tb_tiket`
--
ALTER TABLE `tb_tiket`
  ADD PRIMARY KEY (`id_tiket`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_riwayat`
--
ALTER TABLE `tb_riwayat`
  MODIFY `id_penerbangan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_tiket`
--
ALTER TABLE `tb_tiket`
  MODIFY `id_tiket` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
