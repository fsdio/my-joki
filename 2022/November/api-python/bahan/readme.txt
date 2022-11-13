Nama    :  Vera Merirotun Hidayatika
NIM     : 202051114
Kelas   : Prak. Pemograman Jaringan (B)

KEYS-API    : 2UZ2hxwWMG0v7tM4tbrfZGbumViMcx7k
orig        : Starting Pati
dest        : Dexination kudus

Source Code Error disebabkan data "fuelUsed" tidak tersedia bagi pengguna yang free di API www.mapquestapi.com

print("Fuel Used (Ltr): " + str("{:.2f}".format((json_data["route"]["fuelUsed"])*3.78)))
KeyError: 'fuelUsed'