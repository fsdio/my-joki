# Nama    : Vera Merirotun Hidayatika
# NIM     : 202051114
# Kelas   : Prak. Pemograman Jaringan (B)

# Librari untuk akses url
import urllib.parse

# Librari untuk request HTTPS
import requests

# Variabel untuk membuat akses API
main_api = "https://www.mapquestapi.com/directions/v2/route?"
# Variabel Titik Awal
orig = "Starting Pati"
# Variabel Titik Akhir
dest = "Dexination kudus"
# Key mapsquestapi
key = "2UZ2hxwWMG0v7tM4tbrfZGbumViMcx7k"

# url GET API
url = main_api + urllib.parse.urlencode({"key":key, "from":orig, "to":dest})

# Tampung JSON
json_data = requests.get(url).json()
# Tampilkan JSON
print(json_data)