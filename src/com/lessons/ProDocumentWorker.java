package com.lessons;

public class ProDocumentWorker extends DocumentWorker {



    @Override
    void EditDocument() {
        System.out.println("Документ оредактирован");
    }

    @Override
    void SaveDocument() {
        System.out.println("Документ сохранен");
    }
}
