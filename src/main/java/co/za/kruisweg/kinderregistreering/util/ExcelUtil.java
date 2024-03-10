package co.za.kruisweg.kinderregistreering.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExcelUtil {

    public static void verifyDirectory(String pathToVerify){
        // Define the file path
        String filePath = pathToVerify;

        // Create a Path object
        Path path = Paths.get(filePath);

        // Check if the file path exists
        if (!Files.exists(path)) {
            try {
                // Create the file path
                Files.createDirectories(path);
//                System.out.println("File path created successfully.");
            } catch (IOException e) {
                System.err.println("Failed to create file path: " + e.getMessage());
            }
        } else {
//            System.out.println("File path already exists.");
        }
    }

    public static void writeToExcel(String excelFileName, String kidNameAndSurname, String parentNameAndSurname, String cellphoneNumber, String service){
        try{
            String filePath = "DATA" + File.separator + DateUtil.getTodaysDate();
            verifyDirectory(filePath);
            String fileName = excelFileName+".xlsx";
            File file = new File(filePath + File.separator + fileName);
            Workbook workbook;

            if (file.exists()) {
                // If the file exists, open existing workbook
                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
            } else {
                // If the file doesn't exist, create a new workbook
                workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet(excelFileName);

                // Create header row
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("ID");
                headerRow.createCell(1).setCellValue("Kind Naam en Van");
                headerRow.createCell(2).setCellValue("Ouer Naam en Van");
                headerRow.createCell(3).setCellValue("Selfoon Nommer");
                headerRow.createCell(4).setCellValue("Diens");
            }

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Get the last row number
            int lastRowNum = sheet.getLastRowNum();

            // Create a new row
            Row newRow = sheet.createRow(lastRowNum + 1);

            // Write data to cells
            newRow.createCell(0).setCellValue(lastRowNum + 1); // ID
            newRow.createCell(1).setCellValue(kidNameAndSurname);
            newRow.createCell(2).setCellValue(parentNameAndSurname);
            newRow.createCell(3).setCellValue(cellphoneNumber);
            newRow.createCell(4).setCellValue(service);

            // Write the workbook back to the file
            try (FileOutputStream fos = new FileOutputStream(filePath + File.separator + fileName)) {
                workbook.write(fos);
            }

//            System.out.println("Data written to Excel successfully.");

            // Close the workbook
            workbook.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int readNumberOfEntriesFromExcel(String folder){
        return 0;
    }

}
