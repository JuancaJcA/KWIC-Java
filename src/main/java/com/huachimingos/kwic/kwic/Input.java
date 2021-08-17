/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huachimingos.kwic.kwic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author martin
 */
public class Input {

    String[] result;
    private final static Logger LOGGER
            = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public Input(File file) {
        this.result = buildResult(file);
    }

    public Input() {
    }

    public String[] getResult() {
        return result;
    }

    private String[] buildResult(File file) {
        LOGGER.log(Level.INFO, file.getPath());

        int arrSize = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                br.readLine();
                arrSize++;
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, e.toString());
        }
        String[] strings = new String[arrSize];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int c = 0;
            while (br.ready()) {
                strings[c] = br.readLine();
                c++;
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, e.toString());
        }

        return strings;
    }
}
