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
        
        # Menampilkan Hasil Dari API
        print("API Status: " + str(json_status) + " = A successful route call.\n")
        print("=============================================")
        print("Directions from " + (orig) + " to " + (dest))
        print("Trip Duration: " + (json_data["route"]["formattedTime"]))
        
        # print("Miles: " + str(json_data["route"]["distance"]))
        # print("Fuel Used (Gal): " + str(json_data["route"]["fuelUsed"]))
        
        # print("Kilometers: " + str((json_data["route"]["distance"])*1.61))
        # print("Fuel Used (Ltr): " + str((json_data["route"]["fuelUsed"])*3.78))
        
        print("Kilometers: " + str("{:.2f}".format((json_data["route"]["distance"])*1.61)))
        print("Fuel Used (Ltr): " + str("{:.2f}".format((json_data["route"]["fuelUsed"])*3.78)))
        print("=============================================")
        
        print("=============================================")
        
        # Perulangan untuk jalur menuju titik akhir
        for each in json_data["route"]["legs"][0]["maneuvers"]:
            print((each["narrative"]) + " (" + str("{:.2f}".format((each["distance"])*1.61) + " km)"))
            print("=============================================\n")
        
        ## Source Code Error disebabkan data "fuelUsed" tidak tersedia bagi pengguna free di API www.mapquestapi.com ##
        # print("Fuel Used (Ltr): " + str("{:.2f}".format((json_data["route"]["fuelUsed"])*3.78)))
        # KeyError: 'fuelUsed'