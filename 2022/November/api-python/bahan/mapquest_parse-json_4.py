# Nama    : Vera Merirotun Hidayatika
# NIM     : 202051114
# Kelas   : Prak. Pemograman Jaringan (B)

# Librari untuk akses url
import urllib.parse

# Librari untuk request HTTPS
import requests

# Variabel untuk membuat akses API
main_api = "https://www.mapquestapi.com/directions/v2/route?"

# Key mapsquestapi
key = "2UZ2hxwWMG0v7tM4tbrfZGbumViMcx7k"

while True:
    
    # Input Variabel Titik Awal
    orig = input("Starting Location: ")
    
    # Jika Input quit Atau q Maka Akan Berhenti
    if orig == "quit" or orig == "q":
        break
    
    # Input Variabel Titik Akhir
    dest = input("Destination: ")

    # Jika Input quit Atau q Maka Akan Berhenti
    if orig == "quit" or orig == "q":
        break
    
    # url GET API
    url = main_api + urllib.parse.urlencode({"key":key, "from":orig, "to":dest})

    # Tampung JSON
    json_data = requests.get(url).json()

    # Tampilkan URL API
    print("URL: " + (url))
    json_data = requests.get(url).json()
    
    # Variabel Cek Status API
    json_status = json_data["info"]["statuscode"]

    # Jika Status 0 Maka Success
    if json_status == 0:
        print("API Status: " + str(json_status) + " = A successful route call.\n")