/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.NormalizeText;
import Model.TextNomalizeModel;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        TextNomalizeModel model = new TextNomalizeModel();

        new NormalizeText(model).run();
    }

}
