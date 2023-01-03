-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2023 at 07:53 PM
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
-- Database: `2010010030_db_universitas`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_dosen`
--

CREATE TABLE `tb_dosen` (
  `nidn` varchar(50) NOT NULL,
  `nama_dosen` varchar(100) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_dosen`
--

INSERT INTO `tb_dosen` (`nidn`, `nama_dosen`, `tempat_lahir`, `tanggal_lahir`, `no_telepon`, `alamat`) VALUES
('ID-DOSEN-002', 'HERNA', 'CIWIDEY', '2023-01-03', '083114576500', 'BANDUNG'),
('ID-DOSEN-001', 'DILAN IMAM', 'BANDUNG', '1944-12-04', '08353255643', 'JAKARTA'),
('ID-DOSEN-003', 'BACIL', 'KOREA', '1976-01-10', '081234686484', 'KADU NGORA');

-- --------------------------------------------------------

--
-- Table structure for table `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `npm` varchar(15) NOT NULL,
  `nama_mahasiswa` varchar(100) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`npm`, `nama_mahasiswa`, `tempat_lahir`, `tanggal_lahir`, `no_telepon`, `alamat`) VALUES
('ID-MHS-001', 'ENDAR SURENDAR', 'GARUT', '2023-01-04', '083353267332', 'BANDUNG');

-- --------------------------------------------------------

--
-- Table structure for table `tb_matakuliah`
--

CREATE TABLE `tb_matakuliah` (
  `kode_matkul` varchar(15) NOT NULL,
  `mata_kuliah` varchar(100) NOT NULL,
  `nama_dosen` varchar(100) NOT NULL,
  `sks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_matakuliah`
--

INSERT INTO `tb_matakuliah` (`kode_matkul`, `mata_kuliah`, `nama_dosen`, `sks`) VALUES
('KODE-001', 'AGAMA ISLAM', 'DILAN IMAM', 12),
('KODE-002', 'ALGORITMA', 'HERNA', 13);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
