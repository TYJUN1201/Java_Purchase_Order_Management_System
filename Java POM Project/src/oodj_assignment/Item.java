package oodj_assignment;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Item
{
//Attributes
    private static String Prefix = "IT";
    private static String FileName = "Item.txt" ;
    private String Item_Id;
    private String ItemName;
    private double Price;
    private int Qty;
    private int CurPRIndex = 0;;
    private String CreatedBy;
    private String CreatedAt;
    private String UpdatedBy;
    private String UpdatedAt;
    Scanner Sc = new Scanner(System.in);
    Scanner ScTemp = new Scanner(System.in);
    
//Constructor
    //Add Item
     public Item(String id, String name, double price, String createby, String createdat,String updatedby, String updatedat)
    {
        Item_Id = id;
        ItemName = name;
        Price = price;
        CreatedBy = createby;
        CreatedAt = createdat;
        UpdatedBy = updatedby;
        UpdatedAt = updatedat;
    }
    
    //Edit Item
    public Item(String id, String name, double price, String updatedby, String updatedat)
    {
        Item_Id = id;
        ItemName = name;
        Price = price;
        UpdatedBy = updatedby;
        UpdatedAt = updatedat;
    }
    //Set Item to PR/PO
    public Item(String id, String n, double p, int qty)
    {
        Item_Id = FileOperator.getNewId(FileName, Prefix);
        ItemName = n;
        Price = p;
        Qty = qty;
    }
    
//Methods
    
//    public static String getNewId()
//    {
//        int New_Id = 0;
//        try
//        {
//            File myData = new File("Item.txt");
//            Scanner Sc = new Scanner(myData);
//            String String_List;
//            while (Sc.hasNextLine())
//            {
//                String_List = Sc.nextLine(); 
//                if (Sc.hasNextLine() == false)
//                {
//                    String[] List_Arr = String_List.split(";");
//                    New_Id = Integer.parseInt(List_Arr[0].substring(2)) + 1;
//                    return (Prefix + Integer.toString(New_Id));
//                }
//            }
//        }
//        catch (IOException Ex)
//        {
//            System.out.println("File error.");
//            return "Error";
//        }
//        return (Prefix + Integer.toString(New_Id));
//    }
        
    public void saveItem()
    {
        String Item_String =  Item_Id +";"+
                                            ItemName+";"+ 
                  Double.toString(Price)+";"+
                                             CreatedBy+";"+ 
                                             CreatedAt+";"+
                                            UpdatedBy+";"+
                                            UpdatedAt;
        FileOperator.addLine(FileName, Item_String);
//        try
//        {        
//            File Finput = new File("Item.txt");
//            FileWriter fWriter = new FileWriter(Finput, true);
//            BufferedWriter bWriter = new BufferedWriter(fWriter);
//            PrintWriter pWriter = new PrintWriter(bWriter);
//            
//            pWriter.write(Item_String);
//            pWriter.close();
//            Item_String = null;
//            System.out.println("Item save sucessfully");
//        }
//        catch (IOException Ex)
//        {
//            System.out.println("File error.");
//        }
    }
    
    public static void deleteItem(String delete_Id)
    {
        FileOperator.deleteLine(FileName, delete_Id);
//        try
//        {  
//            //File object of file path
//            File ItemData = new File("Item.txt");
//            File ItemTempData = new File("TempData.txt");
//            
//        //Find the item want to delete
//            FileWriter dataTempWriter = new FileWriter(ItemTempData, true);
//            Scanner Sc = new Scanner(ItemData);
//            String Line;
//            //Read ItemTemp.txt line by line 
//            while (Sc.hasNextLine())
//            {
//                Line = Sc.nextLine();
//                //Write all the item in Item.txt to ItemTemp.txt, except the item want to delete
//                if (!Line.contains(delete_Id))
//                {
//                    dataTempWriter.write(Line+"\n");
//                }
//            }
//            Sc.close();
//            dataTempWriter.close();
//            
//        //Empty Item.txt (old data)
//            FileWriter emptyItemData = new FileWriter(ItemData, false);
//            emptyItemData.close();
//            
//        //Write to Item.txt
//            File Finput = new File("Item.txt");
//            FileWriter fWriter = new FileWriter(Finput, true);
//            BufferedWriter bWriter = new BufferedWriter(fWriter);
//            PrintWriter pWriter = new PrintWriter(bWriter);
//            
//            Scanner ScTemp = new Scanner(ItemTempData);
//            //Read ItemTemp.txt line by line & write it to Item.txt 
//            String LineTemp;
//            while (ScTemp.hasNextLine())
//            {
//                LineTemp = ScTemp.nextLine();
//                pWriter.write(LineTemp+"\n");
//                System.out.print(LineTemp);
//            }
//            pWriter.close();
//            //Empty ItemTemp.txt
//            FileWriter emptyItemTempData = new FileWriter(ItemTempData, false);
//            emptyItemTempData.close();
//            System.out.println("Item delete sucessfully");
//        }
//        catch (IOException Ex)
//        {
//            System.out.println("File error.");
//        }
    }
    
    //Search item by Id, print out item detail, return item in array
    public static String[] searchItem(String search_Id)
    {
        String[] search_item = new String[10];
        String Line = "";
        try
        { 
            File myData = new File("Item.txt");
            //Item_String = null;
            boolean found = false;
            //System.out.println("Item save sucessfully");
            Scanner Sc = new Scanner(myData);
            while (Sc.hasNextLine())
            {
                Line = Sc.nextLine(); 
                if (Line.contains(search_Id))
                {
                    found = true;
                    search_item = Line.split(";");
                }
            }
            Sc.close();
            if (found != true)
            { 
                System.out.println("Item Not found"); 
                return null;
            }else
            {
                System.out.println(Line);
                return search_item;
            }
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
            return null;
        }
    }
    //Search item by Id, print out item detail
    public static void search_Item(String search_Id)
    {
        String Line = "";
        try
        { 
            File ItemData = new File("Item.txt");
            boolean found = false;
            Scanner Sc = new Scanner(ItemData);
            while (Sc.hasNextLine())
            {
                Line = Sc.nextLine(); 
                if (Line.contains(search_Id))
                {
                    found = true;
                    System.out.print(Line);
                }
            }
            Sc.close();
            if (found != true)
            { 
                System.out.println("Item Not found");
            }
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
        }
    }
         
    public String toString()
    {
        return Item_Id + "\t"+ ItemName + "\t"+ Price + "\t" + Qty;
    }
    public int getQty()
    {
        return Qty;
    }
    public double getPrice()
    {
        return Price;
    }
    public String getID()
    {
        System.out.println(Item_Id);
        return Item_Id;
    }
    
}