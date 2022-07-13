package com.belajar.springtutorial.models;

// Konsep singleton
public class Database {
    // Membuat private field
    private static Database database;

    // Membuat fungsi getInstance()
    // yang mengreturn nilai dari private 'Database' konstruktor
    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    // Mengubah default konstruktor dari public ke private
    private Database() {
    }
}
