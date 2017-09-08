package com.lessons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        int Pro = 0000;
        int Expert = 1111;


        System.out.println("Введите ключ : ");
        int keys = in.nextInt();

        if (keys != Pro && keys != Expert)
        {
            DocumentWorker document = new DocumentWorker();

            System.out.println("Ключ : " + keys);

            document.OpenDocument();
            document.EditDocument();
            document.SaveDocument();
        } else if (keys == Pro)
        {
            ProDocumentWorker proversion = new ProDocumentWorker();

            System.out.println("Ключ: " + keys);

            proversion.OpenDocument();
            proversion.EditDocument();
            proversion.SaveDocument();
        }  else if (keys == Expert)
        {
            ExpertDocumentWorker expertversion = new ExpertDocumentWorker();

            System.out.println("Ключ : " + keys);

            expertversion.OpenDocument();
            expertversion.EditDocument();
            expertversion.SaveDocument();
        }

    }
}
