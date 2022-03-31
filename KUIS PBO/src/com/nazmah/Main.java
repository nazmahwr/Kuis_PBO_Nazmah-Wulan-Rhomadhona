package com.nazmah;
import java.util.Scanner;

class SalamPembuka{
    String salam;

    SalamPembuka(String salam){
        this.salam = salam;
    }

    void method(){
        System.out.println(this.salam);
    }
}
class Dosen{
    String nama;
    String NIDN;
    String alamat;
    String jenisKelamin;
    String noAnggota;


    void method(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nAbsensi Dosen");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIDN: ");
        NIDN = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = input.nextLine();
        System.out.print("noAnggota: ");
        noAnggota = input.nextLine();
    }

    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No Anggota: " + noAnggota);
    }
}

class Mahasiswa{
    String nama;
    String npm;
    String noAnggota;
    String jenisKelamin;
    String alamat;


    void method(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nAbsensi Mahasiswa");
        System.out.print("Nama: ");
        nama =  input.nextLine();
        System.out.print("NPM: ");
        npm = input.nextLine();
        System.out.print("No Anggota: ");
        noAnggota = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = input.nextLine();
        System.out.println("Alamat: ");
        alamat = input.nextLine();

    }
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("No Anggota: " + noAnggota);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
    }
}

class JurusanTeknik {
    String masukan;

    void method1() {
        System.out.println("\n\nPilihan Jurusan Teknik");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Teknik Elektro");
        System.out.println("3. Teknik Mesin");
        System.out.println("4. Teknik Geodesi");
        System.out.println("5. Teknik Geofisika");
        System.out.println("6. Teknik Kimia");
        System.out.println("7. Teknik Sipil");
        System.out.println("8. Teknik Survey dan Pemetaan");
        System.out.println("9. Teknik Arsitektur");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanFEB{
    String masukan;

    void method2(){
        System.out.println("\n\nPilihan Jurusan FEB");
        System.out.println("1. Akuntasi");
        System.out.println("2. Keuanagan dan Perbankan");
        System.out.println("3. Manajemen Pemasaran");
        System.out.println("4. Perpajakan");
        System.out.println("5. Manajemen");
        System.out.println("6. Ekonomi Pembangunan");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanFISIP {
    String masukan;

    void method3() {
        System.out.println("\n\nPilihan Jurusan FISIP");
        System.out.println("1. Hubungan Masyarakat");
        System.out.println("2. Perpustakaan");
        System.out.println("3. Administrasi Perkantoran");
        System.out.println("4. Hubungan Internasional");
        System.out.println("5. Ilmu Administrasi Bisnis");
        System.out.println("6. Ilmu Komunikasi");
        System.out.println("7. Ilmu Pemerintahan");
        System.out.println("8. Sosiologi");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanFMIPA {
    String masukan;

    void method4() {
        System.out.println("\n\nPilihan Jurusan FMIPA");
        System.out.println("1. Manajemen Informatika");
        System.out.println("2. Biologi");
        System.out.println("3. Kimia");
        System.out.println("4. Matematika");
        System.out.println("5. Fisika");
        System.out.println("6. Ilmu Komputer");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanHukum {
    String masukan;

    void method5() {
        System.out.println("\n\nPilihan Jurusan Hukum");
        System.out.println("1. Ilmu Hukum");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanKedokteran {
    String masukan;

    void method6() {
        System.out.println("\n\nPilihan Jurusan Kedokteran");
        System.out.println("1. Pendidikan Kedokteran");
        System.out.println("2. Farmasi");
        System.out.println("3. Kesehatan Masyarakat");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanPertanian {
    String masukan;

    void method7() {
        System.out.println("\n\nPilihan Jurusan Pertanian ");
        System.out.println("1. Agribisnis");
        System.out.println("2. Agronomi");
        System.out.println("3. Agroteknologi");
        System.out.println("4. Budidaya Perairan");
        System.out.println("5. Ilmu Kelautan");
        System.out.println("6. Ilmu Tanah");
        System.out.println("7. Kehutanan");
        System.out.println("8. Penyuluhan Pertanian");
        System.out.println("9. Peternakan ");
        System.out.println("10.Proteksi Tanaman ");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class JurusanFKIP {
    String masukan;

    void method8() {
        System.out.println("\n\nPilihan Jurusan FKIP");
        System.out.println("1. Bahasa dan Sastra Indonesia");
        System.out.println("2. Pendidikan Bahasa Lampung");
        System.out.println("3. Pendidikan Bahasa Prancis");
        System.out.println("4. Pendidikan Biologi");
        System.out.println("5. Pendidikan Matematika");
        System.out.println("6. Pendidikan Fisika");
        System.out.println("7. Pendidikan Kimia");
        System.out.println("8. Pendidikan Ekonomi");
        System.out.println("9. Pendidikan Geografi");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Jurusan: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class Pemilihan {
    int pilihan;

    void method() {
        System.out.println("\n\nPilihan Fakultas");
        System.out.println("1.  Teknik");
        System.out.println("2.  FEB");
        System.out.println("3.  FISIP");
        System.out.println("4.  FMIPA");
        System.out.println("5.  Hukum");
        System.out.println("6.  Kedokteran");
        System.out.println("7.  Pertanian");
        System.out.println("8.  FKIP");
        System.out.print("Masukan Nama Fakultas: ");
        Scanner keyboard = new Scanner(System.in);
        pilihan = keyboard.nextInt();
        System.out.println(pilihan);
        switch (pilihan) {
            case 1:
                JurusanTeknik cetak1 = new JurusanTeknik();
                cetak1.method1();
                break;

            case 2:
                JurusanFEB cetak2 = new JurusanFEB();
                cetak2.method2();
                break;

            case 3:
                JurusanFISIP cetak3 = new JurusanFISIP();
                cetak3.method3();
                break;

            case 4:
                JurusanFMIPA cetak4 = new JurusanFMIPA();
                cetak4.method4();
                break;

            case 5:
                JurusanHukum cetak5 = new JurusanHukum();
                cetak5.method5();
                break;

            case 6:
                JurusanKedokteran cetak6 = new JurusanKedokteran();
                cetak6.method6();
                break;

            case 7:
                JurusanPertanian cetak7 = new JurusanPertanian();
                cetak7.method7();
                break;

            case 8:
                JurusanFKIP cetak8 = new JurusanFKIP();
                cetak8.method8();
                break;

            default:
                System.out.println("Input yang anda Masukkan Salah");
        }

    }
}

class SalamPenutup{
    String penutup;

    SalamPenutup(String penutup){
        this.penutup = penutup;
    }

    void method(){
        System.out.println(this.penutup);
    }
}


public class Main {
    public static void main(String[] args) {
        SalamPembuka salam = new SalamPembuka("Aplikasi Absensi Perpustakaan Unila ");
        SalamPembuka salam2 = new SalamPembuka("Selamat Datang di Aplikasi Absensi Perpustakaan Unila");
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        Pemilihan pilih = new Pemilihan();
        SalamPenutup salam1 = new SalamPenutup("Absen Berhasil");
        Scanner input = new Scanner(System.in);
        int pilihan;
        int jumlah;
        //Alur Program
        salam.method();
        salam2.method();
        System.out.println("1.Dosen");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Jumlah Dosen yang Perlu di Absensi  : ");
                jumlah = input.nextInt();
                for (int i = 1; i <= jumlah; i++) {
                    dosen.method();
                    pilih.method();
                }
                salam1.method();


                break;

            case 2:
                System.out.println("Masukkan Jumlah Mahasiswa yang Perlu di Absensi : ");
                jumlah = input.nextInt();
                for (int i = 1; i <= jumlah; i++) {
                    mahasiswa.method();
                    pilih.method();
                }
                salam1.method();
                break;

            default:
                System.out.println("Input yang anda Masukkan Salah");

        }
    }
}

