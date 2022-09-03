package com.tema5;

public class Main {
    public static void main(String[] args){
        CocheCRUD cocheCrud = new CocheCRUDimpl();
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();
    }
}
