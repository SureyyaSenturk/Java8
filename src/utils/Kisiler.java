package utils;


public class Kisiler {
private String ad;
private String soyad;
private String cinsiyet;
private Integer yas;
private Long dogumGunu;

    public Kisiler(String ad, String soyad, String cinsiyet, Integer yas, Long dogumGunu) {
        super();
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.dogumGunu = dogumGunu;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public Long getDogumGunu() {
        return dogumGunu;
    }

    public void setDogumGunu(Long dogumGunu) {
        this.dogumGunu = dogumGunu;
    }

    @Override
    public String toString() {
        return "Kisiler [ad=" + ad + ", soyad=" + soyad + ", cinsiyet=" + cinsiyet + ", yas=" + yas + ", dogumgünü=" + dogumGunu + "]";
    }
}
