-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2023 at 01:20 PM
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
-- Database: `2010010599_apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_apotek`
--

CREATE TABLE `tb_apotek` (
  `id_apotek` varchar(20) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `qty` int(3) NOT NULL,
  `tgl_produksi` date NOT NULL,
  `indikasi` varchar(100) NOT NULL,
  `jenis` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tb_apotek`
--

INSERT INTO `tb_apotek` (`id_apotek`, `nama_obat`, `harga`, `qty`, `tgl_produksi`, `indikasi`, `jenis`) VALUES
('IDAP-001', 'MIXAGRIP FLU', 10000, 5, '2023-01-04', 'PUSING', 'TABLET');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
