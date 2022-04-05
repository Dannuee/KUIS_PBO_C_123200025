/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_pbo_c_123200025;

import lomba.surat;

/**
 *
 * @author LENOVO
 */
public class ProsesSurat implements surat{
    double struktur,isi,kreatifS,bahasa;
    double hasil;
    public ProsesSurat(double struktur, double isi, double kreatifS, double bahasa) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreatifS = kreatifS;
        this.bahasa = bahasa;
    }
    
    @Override
    public double struktur() {
        struktur = (struktur*10)/100;
        return struktur;
    }

    @Override
    public double isi() {
        isi = (isi*40)/100;
        return isi;
    }

    @Override
    public double kreatif() {
        kreatifS = (kreatifS*30)/100;
        return kreatifS;
    }

    @Override
    public double bahasa() {
        bahasa = (bahasa*20)/100;
        return bahasa;
    }

    public double hasil() {
        hasil = struktur() + isi() + kreatif() + bahasa();
        return hasil;
    }
    
}
