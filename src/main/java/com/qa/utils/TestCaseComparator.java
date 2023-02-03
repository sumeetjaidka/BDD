package com.qa.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;

public class TestCaseComparator {

    static int implementedScenarios = 0;

    public static String readFile(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void buildImplementedCases(String filename, HashSet implemented) throws Exception {
        String rawCases = readFile(filename);
        String[] cases = rawCases.split("\n");
        for (String s : cases) {
            if (s.contains("#") || s.contains("@") || s.length() < 8)//!s.toUpperCase().contains("VERIFY"))//||!s.toUpperCase().contains("VEIRFY"))
            {
                // System.out.println("Ignoring :" + s);
            } else if (!s.toUpperCase().contains("VERIFY"))//||!s.toUpperCase().contains("VEIRFY")){

            {
                //  System.out.println("More ignored :" + s);
            } else {
                // System.out.println("Implemented :" + s);
                int index = s.toUpperCase().indexOf("VERIFY");
                implemented.add(s.substring(index));
            }
        }

    }

    public static void buildUpdatedScenarios(String filename, HashSet updatedScenarios) throws Exception {
        String rawCases = readFile(filename);
        String[] cases = rawCases.split("\n");
        for (String s : cases) {
            if (s.contains("#") || s.contains("@")) {
            } else {
                updatedScenarios.add(s);
            }
        }

    }

    public static void populateScenarios(String path, Integer sheetNumber, HashSet<String> set) throws IOException {
        //HashMap<String,String> hmap = new HashMap<>();
        FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + path));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
        int i = 1;
        // for( i=1;i<endIndex;i++) {
        boolean flag = true;
        while (flag) {
            //company name is in first column
            String scenario = sheet.getRow(i).getCell(3).getStringCellValue();
            System.out.println("Extracted : " + scenario);
            set.add(scenario);
            if (scenario == "") {
                flag = false;
                break;
            } else {
                i++;
            }


        }
    }

    public void implementationStatus(String path, int sheetNumber, int columnNumber, int rowNumber, String bioExists, String link) throws IOException {
        FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + path));

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
        Cell cell = null;

        //Update the value of cell
        cell = sheet.getRow(rowNumber).getCell(0);
        XSSFRow rowBio = sheet.getRow(rowNumber);
        rowBio.createCell(4).setCellValue(link);
        XSSFRow rowFlag = sheet.getRow(rowNumber);

        rowFlag.createCell(3).setCellValue(String.valueOf(bioExists));

        file.close();

        FileOutputStream outFile = new FileOutputStream(new File(System.getProperty("user.dir") + path));
        workbook.write(outFile);
        outFile.close();
    }

    public static int constructMap(String path, Integer sheetNumber, HashSet<String> implementedSet, int scenarioCount) throws IOException {
        //HashMap<String,String> hmap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + path));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
        int i = 1;
        // for( i=1;i<endIndex;i++) {
        boolean flag = true;
        while (flag) {
            //scenario is in third column
            String scenario = sheet.getRow(i).getCell(3).getStringCellValue();
            if (scenario != "") {
                set.add(scenario);
                //System.out.println("Scenario from file " + scenario);
                if (implementedSet.contains(scenario)) {
                    System.out.println("Matched in file : " + scenario);
                    XSSFRow rowBio = sheet.getRow(i);
                    rowBio.createCell(4).setCellValue("YES");
                }
                i++;
                scenarioCount++;
            } else if (scenario == "") {
                flag = false;
                FileOutputStream outFile = new FileOutputStream(new File(System.getProperty("user.dir") + path));
                workbook.write(outFile);
                outFile.close();
                break;
            }

        }
        return scenarioCount;
    }

    public static int constructMapIgnoringFullStop(String path, Integer sheetNumber, HashSet<String> implementedSet, int scenarioCount) throws IOException {
        //HashMap<String,String> hmap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + path));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
        int i = 1;
        // for( i=1;i<endIndex;i++) {
        boolean flag = true;
        while (flag) {
            //scenario is in third column
            String scenario = sheet.getRow(i).getCell(3).getStringCellValue();
            if (scenario != "") {
                set.add(scenario);
                String modifiedWithoutFullStop = scenario.trim();
                if (modifiedWithoutFullStop.charAt(modifiedWithoutFullStop.length() - 1) == '.') {
                    modifiedWithoutFullStop = modifiedWithoutFullStop.substring(0, modifiedWithoutFullStop.length() - 1);
                }
                if (implementedSet.contains(scenario)) {
                    System.out.println("Matched in file : " + scenario);
                    XSSFRow rowBio = sheet.getRow(i);
                    rowBio.createCell(4).setCellValue("YES");
                    implementedScenarios++;
                } else if (implementedSet.contains(modifiedWithoutFullStop)) {
                    System.out.println("Matched without fullstop : " + scenario);
                    XSSFRow rowBio = sheet.getRow(i);
                    rowBio.createCell(4).setCellValue("YES");
                    implementedScenarios++;
                }
                i++;
                scenarioCount++;
            } else if (scenario == "") {
                flag = false;
                FileOutputStream outFile = new FileOutputStream(new File(System.getProperty("user.dir") + path));
                workbook.write(outFile);
                outFile.close();
                break;
            }

        }
        return scenarioCount;
    }

    public static ArrayList<String> fileList() {
        File folder = new File(System.getProperty("user.dir") + "/src/test/resources/");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> featureFiles = new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                if (listOfFiles[i].getName().contains(".feature")) ;
                {
                    featureFiles.add(listOfFiles[i].getName());
                }
            }
        }
        return featureFiles;
    }

    public static void main(String[] args) throws Exception {
        HashSet<String> implemented = new HashSet<>();
        String path = System.getenv("PWD");
        ArrayList<String> featureFiles = fileList();

        //build the automated feature set dynamically
        for (String s : featureFiles) {
            buildImplementedCases(path + "/src/test/resources/" + s, implemented);

        }
        System.out.println("Size of implemented cases " + implemented.size());
        int scenarioCount = 0;
        for (int i = 0; i < 19; i++) {
            scenarioCount += constructMapIgnoringFullStop("/src/main/resources/Test file.xlsx", i, implemented, 0);
            //scenarioCount+=constructMap("/src/main/resources/Test file.xlsx", i, implemented,0);
        }
        int automationPercentage = implemented.size();
        //automationPercentage = automationPercentage/scenarioCount;
        double percentage = ((float) implementedScenarios / (float) scenarioCount) * 100.0;
        System.out.println("Total scenarios :" + scenarioCount + "\nAutomated scenarios :" + implemented.size() + "\nAutomation coverage :" + percentage);
    }
}
