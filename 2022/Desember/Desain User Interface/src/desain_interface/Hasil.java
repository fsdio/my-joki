/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desain_interface;

/**
 *
 * @author BEM-FIKI
 */
public class Hasil {
    
    static boolean[] data_hasil_SIG = new boolean[10];
    static boolean[] data_hasil_WEB = new boolean[10];
    static boolean[] data_hasil_JAR = new boolean[10];
    static boolean[] data_hasil_MM = new boolean[10];
    static boolean[] data_hasil_RPL = new boolean[10];
    
    public String getRecomend(){
    
        int SIG = getSIG();
        int WEB = getWEB();
        int JAR = getJAR();
        int MM = getMM();
        int RPL = getRPL();
        
        String hasil = "ANDA BELUM MEMILIH APAPUN";
        if( (SIG>WEB) && (SIG>JAR) && (SIG>MM) && (SIG>RPL)){
            hasil = "SISTEM INFORMASI GEOGRAFIS";
        }else if( (WEB>SIG) && (WEB>JAR) && (WEB>MM) && (WEB>RPL)){
            hasil = "WEBSITE";
        }else if( (JAR>SIG) && (JAR>WEB) && (JAR>MM) && (JAR>RPL)){
            hasil = "JARINGAN";
        }else if( (MM>SIG) && (MM>JAR) && (MM>WEB) && (MM>RPL)){
            hasil = "MULTIMEDIA";
        }else if( (RPL>SIG) && (RPL>JAR) && (RPL>MM) && (RPL>WEB)){
            hasil = "REKAYASA PERANGKAT LUNAK";
        }else{
            hasil = "SEMUA PILIHAN SEBANDING";
        }
        return hasil;
    }
    
    public int getSIG(){
        int hasil = 0;
        for(int i=0; i<this.data_hasil_SIG.length; i++){
            
            if(this.data_hasil_SIG[i] == true){
                hasil +=1;
            }
        }
        return hasil;
    }
    
    public int getWEB(){
        int hasil = 0;
        for(int i=0; i<this.data_hasil_WEB.length; i++){
            
            if(this.data_hasil_WEB[i] == true){
                hasil +=1;
            }
        }
        return hasil;
    }
    
    public int getJAR(){
        int hasil = 0;
        for(int i=0; i<this.data_hasil_JAR.length; i++){
            
            if(this.data_hasil_JAR[i] == true){
                hasil +=1;
            }
        }
        return hasil;
    }
    
    public int getMM(){
        int hasil = 0;
        for(int i=0; i<this.data_hasil_MM.length; i++){
            
            if(this.data_hasil_MM[i] == true){
                hasil +=1;
            }
        }
        return hasil;
    }
    
    public int getRPL(){
        int hasil = 0;
        for(int i=0; i<this.data_hasil_RPL.length; i++){
            
            if(this.data_hasil_RPL[i] == true){
                hasil +=1;
            }
        }
        return hasil;
    }
 
    public void clearData(){
        
        for(boolean data : data_hasil_SIG){
            data = false;
        }
        
        for(boolean data : data_hasil_WEB){
            data = false;
        }
        
        for(boolean data : data_hasil_JAR){
            data = false;
        }
        
        for(boolean data : data_hasil_MM){
            data = false;
        }
        
        for(boolean data : data_hasil_RPL){
            data = false;
        }

    }
}
