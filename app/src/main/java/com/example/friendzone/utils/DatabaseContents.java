package com.example.friendzone.utils;
//tanggal 12/08/2019
//NIM : 10116014
//NAMA : Fathia Azzahra
//Kelas : IF 1

public enum DatabaseContents {
    DATABASE("loginsederhana.db"),
    TABLE_USERS("tbl_users");
    private String name;
    private DatabaseContents(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
