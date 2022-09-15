package com.company;

import com.sun.source.util.Trees;

import java.util.Collections;
import java.util.TreeSet;

public class City implements Comparable<City> {
    private int kode;
    private String mane;

    public City(int kode, String mane) {
        this.kode = kode;
        this.mane = mane;

    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    @Override
    public String toString() {
        return "City{" +
                "kode=" + kode +
                ", mane='" + mane + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {

        return this.kode - o.kode;
    }
}
