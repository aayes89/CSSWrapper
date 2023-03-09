/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csswwrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Slam
 */
public class CSSWWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        String in = input.nextLine();
        String cad = "";
        for (int i = 0; i < in.length(); i++) {
            switch (in.charAt(i)) {
                case '{':
                    output.add(cad + "{\n");
                    cad = "";
                    break;
                case '}':
                    output.add(cad + "}\n");
                    cad = "";
                    break;
                case ',':
                    output.add(cad + ",\n");
                    cad = "";
                    break;
                case ';':
                    output.add(cad + ";\n");
                    cad = "";
                    break;
                default:
                    cad += in.charAt(i);
                    break;
            }
        }
        for (String str : output) {
            System.out.println(str);
        }
    }
}
