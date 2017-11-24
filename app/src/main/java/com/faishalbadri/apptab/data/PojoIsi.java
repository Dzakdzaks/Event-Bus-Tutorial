package com.faishalbadri.apptab.data;

import java.util.List;

/**
 * Created by faishal on 13/11/17.
 */

public class PojoIsi {
  /**
   * isi : [{"id_isi":"5","id_provinsi":"2","id_kota":"2","id_kategori":"1","isi_nama":"BarberShop Ganss","provinsi_nama":"Jakarta Pusat","kota_nama":"Sudirman","kategori_nama":"BarberShop","isi_alamat":"sdfaewfergert\r\ndasf das ds","isi_notlp":"023842342","isi_keterangan":"regregefg dsf dasf adsf das\r\ndsafdsaf sda","isi_kunjungan":"100","isi_gambar":"Screen Shot 2017-01-15 at 1.38.04 PM.png","isi_lat":"-6.39547","isi_long":"106.9570933","isi_status":"Ada"}]
   * status : 1
   * msg : Data Semua Isi
   */

  private String status;
  private String msg;
  private List<IsiBean> isi;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public List<IsiBean> getIsi() {
    return isi;
  }

  public void setIsi(List<IsiBean> isi) {
    this.isi = isi;
  }

  public static class IsiBean {

    /**
     * id_isi : 5
     * id_provinsi : 2
     * id_kota : 2
     * id_kategori : 1
     * isi_nama : BarberShop Ganss
     * provinsi_nama : Jakarta Pusat
     * kota_nama : Sudirman
     * kategori_nama : BarberShop
     * isi_alamat : sdfaewfergert
     * dasf das ds
     * isi_notlp : 023842342
     * isi_keterangan : regregefg dsf dasf adsf das
     * dsafdsaf sda
     * isi_kunjungan : 100
     * isi_gambar : Screen Shot 2017-01-15 at 1.38.04 PM.png
     * isi_lat : -6.39547
     * isi_long : 106.9570933
     * isi_status : Ada
     */

    private String id_isi;
    private String id_provinsi;
    private String id_kota;
    private String id_kategori;
    private String isi_nama;
    private String provinsi_nama;
    private String kota_nama;
    private String kategori_nama;
    private String isi_web;
    private String isi_alamat;
    private String isi_notlp;
    private String isi_keterangan;
    private Double isi_kunjungan;
    private String isi_gambar;
    private Double isi_lat;
    private Double isi_long;
    private String isi_status;

    public String getId_isi() {
      return id_isi;
    }

    public void setId_isi(String id_isi) {
      this.id_isi = id_isi;
    }

    public String getId_provinsi() {
      return id_provinsi;
    }

    public void setId_provinsi(String id_provinsi) {
      this.id_provinsi = id_provinsi;
    }

    public String getId_kota() {
      return id_kota;
    }

    public void setId_kota(String id_kota) {
      this.id_kota = id_kota;
    }

    public String getId_kategori() {
      return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
      this.id_kategori = id_kategori;
    }

    public String getIsi_nama() {
      return isi_nama;
    }

    public void setIsi_nama(String isi_nama) {
      this.isi_nama = isi_nama;
    }

    public String getProvinsi_nama() {
      return provinsi_nama;
    }

    public void setProvinsi_nama(String provinsi_nama) {
      this.provinsi_nama = provinsi_nama;
    }

    public String getKota_nama() {
      return kota_nama;
    }

    public void setKota_nama(String kota_nama) {
      this.kota_nama = kota_nama;
    }

    public String getKategori_nama() {
      return kategori_nama;
    }

    public void setKategori_nama(String kategori_nama) {
      this.kategori_nama = kategori_nama;
    }

    public String getIsi_alamat() {
      return isi_alamat;
    }

    public void setIsi_alamat(String isi_alamat) {
      this.isi_alamat = isi_alamat;
    }

    public String getIsi_notlp() {
      return isi_notlp;
    }

    public void setIsi_notlp(String isi_notlp) {
      this.isi_notlp = isi_notlp;
    }

    public String getIsi_keterangan() {
      return isi_keterangan;
    }

    public void setIsi_keterangan(String isi_keterangan) {
      this.isi_keterangan = isi_keterangan;
    }

    public Double getIsi_kunjungan() {
      return isi_kunjungan;
    }

    public void setIsi_kunjungan(Double isi_kunjungan) {
      this.isi_kunjungan = isi_kunjungan;
    }

    public String getIsi_gambar() {
      return isi_gambar;
    }

    public void setIsi_gambar(String isi_gambar) {
      this.isi_gambar = isi_gambar;
    }

    public Double getIsi_lat() {
      return isi_lat;
    }

    public void setIsi_lat(Double isi_lat) {
      this.isi_lat = isi_lat;
    }

    public Double getIsi_long() {
      return isi_long;
    }

    public void setIsi_long(Double isi_long) {
      this.isi_long = isi_long;
    }

    public String getIsi_status() {
      return isi_status;
    }

    public void setIsi_status(String isi_status) {
      this.isi_status = isi_status;
    }

    public String getIsi_web() {
      return isi_web;
    }

    public void setIsi_web(String isi_web) {
      this.isi_web = isi_web;
    }
  }
}
