package oodj_assignment;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import static oodj_assignment.Item.*;

public class OODJ_Assignment {
    public static void main(String[] args) {
        int choice_1 = 0;
        int choice_2 = 0;
        Scanner Sc = new Scanner(System.in);
        while (choice_1 != -1)
        {
            System.out.println("Sales Manager Menu Screen");
            System.out.println("------------------------------");
            System.out.println("1. Item Entry");
            System.out.println("2. Supplier Entry");
            System.out.println("3. Daily Item-wise Sales Entry");
            System.out.println("4. Create a Purchase Requisition");
            System.out.println("5. Display Purchase Requisition");
            System.out.println("6. Display List of Purchase Orders");
            System.out.println("-1. Exit");
            System.out.println("------------------------------");
            System.out.print("Please enter your choice: ");
            choice_1 = Sc.nextInt();
            switch (choice_1) 
            {
                case 1:
                    while (choice_2 != -1)
                    {
                        System.out.println("Item Entry Screen");
                        System.out.println("------------------------------");
                        System.out.println("1. Add Item");
                        System.out.println("2. Delete Item");
                        System.out.println("3. Edit Item");
                        System.out.println("4. Search Item");
                        System.out.println("-1. Exit");
                        System.out.println("------------------------------");
                        System.out.print("Please enter your choice: ");
                        choice_2 = Sc.nextInt();
                        
                        //Add Item
                        if (choice_2 == 1){
                                System.out.println("Please enter the details of new item.");
                                System.out.println("New Item Id:" + FileOperator.getNewId("Item.txt","IT"));
                                System.out.print("Item name:");
                                String i_name = Sc.next();
                                System.out.print("Price:");
                                double i_price = Sc.nextDouble();
                                Item NewItem = new Item( FileOperator.getNewId("Item.txt","IT"), i_name, i_price, "SM01", java.time.LocalDate.now().toString(), "SM01", java.time.LocalDate.now().toString());
                                NewItem.saveItem();
                        }
                        
                        //Delete Item
                        else if (choice_2 == 2){
                                System.out.print("Please enter the Item Id you want to delete: ");
                                String delete_Id = Sc.next();
                                FileOperator.deleteLine("Item.txt", delete_Id);
                        }
                        
                        //Edit Item
                        else if (choice_2 == 3){
                                System.out.print("Please enter the Item Id you want to edit: ");
                                String edit_Id = Sc.next();
                                System.out.println("Previous details of item.");
                                //searchItem(edit_Id);
                                System.out.println("----------------------------------------------------------");  
                                System.out.println("Please enter the new details of item.");
                                System.out.print("Item name:");
                                String new_name = Sc.next();
                                System.out.print("Price:");
                                double new_price = Sc.nextDouble();
                                //Item NewItem = new Item(edit_id, "Peanut Butter", 7.99, "SM01",  "SM01", java.time.LocalDate.now().toString());
                                //Item NewItem = new Item(getNewId(), i_name, i_price, "SM01", java.time.LocalDate.now().toString(), "SM01", java.time.LocalDate.now().toString());
                                //NewItem.saveItem();
                                
                     
                        }
                        
                        //Search Item
                        else if (choice_2 == 4){
                                System.out.print("Please enter the Item Id you want to search: ");
                                String search_Id = Sc.next();
                                //searchItem(search_Id);
                        }
                    }/*
                case 2:
                    try
                    {
                        File myData = new File("UserData.txt");
                        Scanner Sc1 = new Scanner(myData);
                        UList.clear();
                        while (Sc1.hasNextLine())
                        {
                            String UserInfo = Sc1.nextLine();
                            String[] myArr = UserInfo.split(";");
                            //User TmpUser_2 = new User(myArr[0], myArr[1]);
                            //UList.add(TmpUser_2);
                            //TmpUser_2 = null;
                        }
                        System.out.println("List of users:");
                        for (int i = 0; i < UList.size(); i++) {
                            if (UList.get(i) != null) {
                                System.out.println(UList.get(i));
                            }
                        }
                        //System.out.println(UList);
                        System.out.println("-----------------");

                    }
                    catch (IOException Ex)
                    {
                        System.out.println("File error.");
                    }
                    break;
                case 3:

                    //Ord1.getOrderAmount();
                    break;
                case 4:
                    break;
                case 5:
                    break;
*/
            }
           
        }
    }
}
