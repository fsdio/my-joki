#include <iostream>
#include <string>
using namespace std;

// POINTER THIS
class this_biodata{
	public:
		string nama;
		string nim;
		int usia;
		string prodi;
		
	void tampilData(string nama, string nim, int usia, string prodi){
		
		// SET
		this->nama = nama;
		this->nim = nim;
		this->usia = usia;
		this->prodi = prodi;
		
		// GET
		cout << this->nama << endl;
		cout << this->nim << endl;
		cout << this->usia << endl;
		cout << this->prodi << endl;
	}
};

// POINTER KE OBJECT
class biodata_pointer{
	public:
		string nama;
		int usia;
		
	void tampilData(string nama, int usia){
		this->nama = nama;
		this->usia = usia;
		
		cout << this->nama << endl;
		cout << this->usia << endl;
	}
};

// GETTER & SETTER
class biodata_GS{
	private:
		string user;
		string pass;
		
	public:
		
		void userSet(string user){
			this->user = user;
		}
		
		string userGet(){
			return this->user;
		}
		
		void passSet(string pass){
			this->pass = pass;
		}
		
		string passGet(){
			return this->pass;
		}
		
		void tampilData(){
			cout << userGet() << endl;
			cout << passGet() << endl;
		}
};

// MEMBER FUNCTION & OVERIDING
// MEMBER FUNCTION
// OVERIDING
class animal{
	protected:
		string nama;
		string type;
	public:
		void setNama(string nama){
			this->nama=nama;
		}
		
		void setType(string type){
			this->type=type;
		}
		
		void display(){
			cout << this->nama;
		}
};

class cat: public animal{
	public:
		void setType(){
			this->type="CAT";
		}
		
		void display(){
			cout << this->nama << endl;
			cout << this->type << endl;
		}
};

// Acess Spesifer
// Public = Bebas Akses
// Private = Tidak Bisa Dilihat Dari Luar Kelas
// Protected = Hanya Kelas Warisan Yang Bisa Akses

class access{
	public:
		string nama="ARYA";
	private:
		string password="ARYA123";
	public:
		string getPass(){
			return this->password;
		}
	protected:
		string nama_a="AGUS";
	public:
		string getAnak(){
			return this->nama_a;
		}
};

class agus: public access{
	public:
		void getAgus(){
			cout << "Ayah, Aku " << this->nama_a << endl;
		}
};

// Inheritance
class bos{
	public:
		string public_data = "PUBLIC";
	protected:
		string protected_data = "PROTECTED";
	private:
		string private_data = "PRIVATE";
		
	public:
		string getProtected(){
			return this-> protected_data;
		}
		
		string getPrivate(){
			return this-> private_data;
		}
};

class manager: public bos{
	public:
		string gaji = "RP. 10.000";
};
// Multilevel Inheritance
class pegawai: public manager{
};
// Multiple Inheritance
class bos2{
	public:
		string gaji_b2="RP. 30.000";
};

class pegawai_vip:public manager, public bos2{
};
// Inheritance Access Class
class pegawai_access:public bos{
	public:
		string public_data = "PUBLIC";
	protected:
		string protected_data = "PROTECTED";
	private:
		string private_data = "PRIVATE";
		
	public:
		string getProtected(){
			return this-> protected_data;
		}
		
		string getPrivate(){
			return this-> private_data;
		}
};

// Conctructor
// Conctructor Parameter
// Destructor
class hitung{
	public:
		int value_1;
		int value_2;
		int hasil;
	
	hitung(int value_1, int value_2){
		this->value_1 = value_1;
		this->value_2 = value_2;
		this->hasil = this->value_1 + this->value_2;
		cout << "HASIL : " << hasil << endl;
	}
	
	~hitung(){
		this->value_1 = 0;
		this->value_2 = 0;
		this->hasil = 0;
		cout << "DATA DIHAPUS" << endl;
		cout << "value_1 : " << value_1 << endl;
		cout << "value_2 : " << value_2 << endl;
		cout << "HASIL : " << hasil << endl;
		
	}
};

// CLASS
class data_org{
	public:
		string nama;
		string hobi;
	
	data_org(string nama, string hobi){
		this->nama=nama;
		this->hobi=hobi;
		
		getData();
	}
	
	void getData(){
		cout << nama << " " << hobi << endl;
	}
};

// Objek Sebagai Nilai Kembalian
// Objek Sebagai Parameter
class biodata{
	public:
		int data;
		
		void tampilData(int value){
			this->data=value;
			cout << this-> data << endl;
		}
		
		int getData(int value){
			this->data=value;
			return data;
		}
};

biodata setBiodata(int value){
	biodata new_biodata;
	new_biodata.tampilData(value);
	return new_biodata;
}

int getBiodata(biodata data, int value){
	return data.getData(value);
}

int main() {
	biodata data1;
	setBiodata(20);
	cout << getBiodata(data1, 30) << endl;
	cin.get();
    return 0;
}
