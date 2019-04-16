/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Heikki
 */
public class ProxyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Image> list = new ArrayList<>();
        boolean suunta = true;

        String imageName = "HiRes_10MB_Photo";
        for (int i = 1; i <= 10; i++) {
            list.add(new ProxyImage(imageName + i));
        }

        System.out.println("Images: ");
        list.forEach(Image::showData);
        System.out.println("");

        ListIterator<Image> litr;
        Scanner scanner = new Scanner(System.in);

        //first time loads and displays
        //second time displays
        for (int i = 0; i < 2; i++) {
            litr = list.listIterator();
            while (litr.hasNext()) {
                System.out.println("a: previous, d: next");
                String answer = scanner.next();
                switch (answer) {
                    case "d":
                        if (suunta != true) {
                            litr.next();
                            litr.next().displayImage();
                            suunta = true;
                        }else {
                            litr.next().displayImage();
                        }
                        break;
                    case "a":
                        if ((litr.hasPrevious()) && (suunta != false)) {
                            litr.previous();
                            litr.previous().displayImage();
                            suunta = false;
                        }else if ((litr.hasPrevious()) && (suunta != true)) {
                            litr.previous().displayImage();
                        }else {
                            System.out.println("There's no previous image.");
                        }
                        break;
                    default:
                        System.out.println("Not a or d.");
                        break;
                }
            }
        }
    }

}
