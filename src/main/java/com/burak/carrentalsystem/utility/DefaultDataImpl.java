package com.burak.Java3Monolithic.utility;

import com.burak.Java3Monolithic.repository.IMusteriRepository;
import com.burak.Java3Monolithic.repository.ISatisRepository;
import com.burak.Java3Monolithic.repository.IUrunRepository;
import com.burak.Java3Monolithic.repository.entity.Musteri;
import com.burak.Java3Monolithic.repository.entity.Urun;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DefaultDataImpl {

    private final IMusteriRepository iMusteriRepository;
    private final IUrunRepository iUrunRepository;
    private final ISatisRepository iSatisRepository;

    @PostConstruct
    private void create(){
        saveMusteri();
        saveUrun();

    }

    private void saveMusteri(){
        Musteri musteri = Musteri.builder()
                .ad("Muhammet")
                .soyad("Kaya")
                .adres("İstanbul")
                .telefon("0532 123 45 67")
                .dogumtarihi(1990)
                .email("muhammed@gmail.com").build();
        Musteri musteri1 = Musteri.builder()
                .ad("Kenan")
                .soyad("KESKİN")
                .adres("İstanbul")
                .telefon("0532 785 45 67")
                .dogumtarihi(1980)
                .email("kanen@gmail.com").build();
        Musteri musteri2 = Musteri.builder()
                .ad("Bahar")
                .soyad("TAŞ")
                .adres("Ankara")
                .telefon("0532 785 87 67")
                .dogumtarihi(1984)
                .email("bahar@gmail.com").build();
        Musteri musteri3 = Musteri.builder()
                .ad("Mehmet")
                .soyad("KAYA")
                .adres("İzmir")
                .telefon("0532 785 45 67")
                .dogumtarihi(1988)
                .email("mehmet@gmail.com").build();
        Musteri musteri4 = Musteri.builder()
                .ad("Ayşe")
                .soyad("KAYA")
                .adres("Adana")
                .telefon("0532 785 45 98")
                .dogumtarihi(1991)
                .email("ayse@gmail.com").build();

        iMusteriRepository.saveAll(Arrays.asList(musteri,musteri1,musteri2,musteri3,musteri4));
    }

    public void saveUrun(){
        Urun urun = Urun.builder().ad("Şeker").fiyat(100.0).isActive(true).marka("A marka").model("B model").stok(50).build();
        Urun urun1 = Urun.builder().ad("çay").fiyat(1050.0).isActive(true).marka("b marka").model("s model").stok(500).build();
        Urun urun2 = Urun.builder().ad("makarna").fiyat(300.0).isActive(true).marka("c marka").model("s model").stok(10).build();
        Urun urun3 = Urun.builder().ad("süt").fiyat(106.0).isActive(true).marka("v marka").model("B model").stok(500).build();
        Urun urun4 = Urun.builder().ad("bal").fiyat(156.0).isActive(true).marka("r marka").model("r model").stok(30).build();
        Urun urun5 = Urun.builder().ad("çay").fiyat(123.0).isActive(true).marka("t marka").model("t model").stok(50).build();
        Urun urun6 = Urun.builder().ad("kola").fiyat(1000.0).isActive(true).marka("e marka").model("w model").stok(50).build();

        iUrunRepository.saveAll(Arrays.asList(urun,urun1,urun2,urun3,urun4,urun5,urun6));
    }


    }



