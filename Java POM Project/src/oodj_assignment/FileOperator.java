package oodj_assignment;

import java.io.*;
import java.util.Scanner;

public class FileOperator {
    public static String getNewId(String file_name, String prefix)
    {
        int New_Id = 0;
        try
        {
            File myData = new File(file_name);
            Scanner Sc = new Scanner(myData);
            String String_List;
            while (Sc.hasNextLine())
            {
                String_List = Sc.nextLine(); 
                if (Sc.hasNextLine() == false)
                {
                    String[] List_Arr = String_List.split(";");
                    New_Id = Integer.parseInt(List_Arr[0].substring(2)) + 1;
                    return (prefix + Integer.toString(New_Id));
                }
            }
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
            return "Error";
        }
        return (prefix+ Integer.toString(New_Id));
    }
    
    public static void addLine(String file_name, String line_str)
    {
        try
        {        
            File Finput = new File(file_name);
            FileWriter fWriter = new FileWriter(Finput, true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            pWriter.write(line_str+"\n");
            pWriter.close();
            System.out.println("Add successfully");
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
        }
    }
    
    public static void deleteLine(String file_name, String delete_Id)
    {
         try
        {  
            //File object of file path
            File fileData = new File(file_name);
            File tempData = new File("TempData.txt");
            
        //Find the item want to delete
            FileWriter tempDataWriter = new FileWriter(tempData, true);
            Scanner Sc = new Scanner(fileData);
            String Line;
            //Read ItemTemp.txt line by line 
            while (Sc.hasNextLine())
            {
                Line = Sc.nextLine();
                //Write all the item in Item.txt to ItemTemp.txt, except the item want to delete
                if (!Line.contains(delete_Id))
                {
                    tempDataWriter.write(Line+"\n");
                }
            }
            Sc.close();
            tempDataWriter.close();
            
        //Empty Item.txt (old data)
            FileWriter emptyItemData = new FileWriter(fileData, false);
            emptyItemData.close();
            
        //Write to Item.txt
            File Finput = new File(file_name);
            FileWriter fWriter = new FileWriter(Finput, true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            
            //Read ItemTemp.txt line by line & write it to Item.txt 
            Scanner ScTemp = new Scanner(tempData);
            String cur_line;
            while (ScTemp.hasNextLine())
            {
                cur_line = ScTemp.nextLine();
                pWriter.write(cur_line+"\n");
                System.out.print(cur_line);
            }
            pWriter.close();
            
            //Empty ItemTemp.txt
            FileWriter emptyTempData = new FileWriter(tempData, false);
            emptyTempData.close();
            System.out.println("Delete successfully");
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
        }
    }
}