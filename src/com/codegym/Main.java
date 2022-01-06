package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(" Tên bạn nhập không có trong mảng");
        }
        else {
            System.out.println("Tên bạn nhập có vị trí " + index + " Trong mảng");
        }
    }
}
