package oodj_assignment;
import java.io.*;
import java.util.Scanner;

public class PurchaseRequisition
{
//Attributes
    static private String Prefix = "PR";
    static private String FileName = "PR.txt";
    private String PR_Id;
    private String Supplier_Id;
    private Item[] PR_Item = new Item[50]; // Item id +Name + price+ qty+supplier
    private int CurPRIndex = 0;
    private double Total;
    private String CreatedBy;
    private String CreatedAt;
    private String UpdatedAt;
    Scanner Sc = new Scanner(System.in);
    
//Constructor
    //Created PR
    public PurchaseRequisition(String sp_id , String crt_by, String crt_at, String upd_at)
    {
        PR_Id = getNewId();
        Supplier_Id = sp_id;
        CreatedBy = crt_by; //SM_Id pass by Login page
        CreatedAt = crt_at; //Cur_Time
        UpdatedAt = upd_at; //Cur_Time
    }
    
    /*//
    public PurchaseRequisition(String prid, String p)
    {
        PR_Id;
        ItemId;
        Supplier_Id;
        date;
        Qty;
        Total;
    }
    */
    
//Methods
    //Set Item
    public void setItem(Item cur_item)
    {
        PR_Item[CurPRIndex] = cur_item; // Item id + qty
        CurPRIndex ++;
    }
    
    //Find & Generate new Id
    static public String getNewId()
    {
        int New_Id = 0;
        try
        {
            File myData = new File("Item.txt");
            Scanner Sc = new Scanner(myData);
            while (Sc.hasNextLine())
            {
                if (Sc.hasNextLine() == false)
                {
                    String LatestLine = Sc.nextLine();
                    String[] LatestLine_Arr = LatestLine.split(";");
                    New_Id = Integer.parseInt(LatestLine_Arr[0].substring(2) + 1);
                    return (Prefix + Integer.toString(New_Id));
                }
            }
        }
        catch (IOException Ex)
        {
            System.out.println("File error.");
            return "Error";
        }
        return (Prefix + Integer.toString(New_Id));
    }
    /*
    //Create PR
    public String[][] createPR()
    {
        boolean continue_ = true;
        String[][] PR_Item = new String[50][6];
        while(continue_)
        {
            
        }
    
        return "Item";
    }
    
    //Save PR
    public void savePR(String[][] PR_Item)
    {
        try
        {
            for(int i = 0; i <=PR_Item.length; i++){
                File Finput = new File("PR.txt");
                FileWriter fWriter = new FileWriter(Finput, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                PrintWriter pWriter = new PrintWriter(bWriter);

                String PR_Line =  getNewId() +";"+ PR_Item[i][0] +";"+ PR_Item[i][1]";"+PR_Item[i][2]+";"+ Supplier_Id+";"+PR_Item[i][3]+";"+PR_Item.getTotal()+"\n";
                pWriter.write(PR_Line);
                pWriter.close();
                System.out.println("Data written sucessfully");
            }
        }
        catch (IOException Ex)
        {
            System.out.println("File Error");
           
        }
        
    public void printList()
    {
        System.out.println("ItemId\tItemName\t\tPrice\tItemQty\tAmount");
        for (int i = 0; i < OrderItems.length; i++) {
            //Item item = OrderItems[i];
            if (OrderItems[i]!=null) {
                System.out.println(OrderItems[i] +"\t"+ Double.toString(getAmount()));// + getAmount(OrderItems[i]));
            //System.out.println("Item: " + item.ItemId + ", Price: " + item.getPrice());
            }

        }
    }
    
    public double getTotal(Item cur_item)
    {
       double OrderAmt = 0;
        for(int  i= 0; i < CurOrderIndex; i++)
        {
            OrderAmt  = OrderAmt + (OrderItems[i].getItemQty())*(OrderItems[i].getItemPrice());
        }
        return OrderAmt;
    }
*/
}