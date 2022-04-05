/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_pbo_c_123200025;

import lomba.animasi;

/**
 *
 * @author LENOVO
 */
public class ProsesAnimasi implements animasi{
    double al,ko,kA,si;
    String keterangan;
    double hasil;
    
    public ProsesAnimasi(double alur, double konten, double kreatifA, double sinema) {
        this.al = alur;
        this.ko = konten;
        this.kA = kreatifA;
        this.si = sinema;
    }
    
     @Override
    public double alur() {
        al = al*0.15;
        return al;
    }

    @Override
    public double konten() {
        ko = ko*0.35;
        return ko;
    }

    @Override
    public double kreatif() {
        kA = kA*0.35;
        return kA;
    }

    @Override
    public double sinema() {
        si = si*0.15;
        return si;
    }

    @Override
    public double hasil() {
        hasil = alur()+konten()+kreatif()+sinema();
        return hasil;
    }   
    
 
}
