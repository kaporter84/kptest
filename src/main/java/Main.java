import commons.FileDeleter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> patternList = Arrays.asList("[a-z]+_[0-9A-Za-z]+", "[a-z]+_[0-9A-Za-z]+_[0-9A-Za-z]+", "file_[0-9]+", "\\d+_ord_\\d+-\\d+-\\d+_\\d{12}");
        List<String> exclusionFolderList = Collections.singletonList("/zones");
        List<String> extensionList = Arrays.asList("txt", "csv", "DS_Store", "DS_STORE", "xlsx", "xls");

        FileDeleter.deleteFilesInFolders("/Users/kaporter84/imports", extensionList, null, null);
        FileDeleter.deleteFilesInFolders("/Users/kaporter84/customers_dev", extensionList, patternList, exclusionFolderList);
        FileDeleter.deleteFilesInFolders("/Users/kaporter84/logs", Collections.singletonList("log"), null, null);
        FileDeleter.deleteFoldersInFolders("/Users/kaporter84/Movies", Collections.singletonList("nvidia"));

//        String base64Label = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAzklEQVQ4T2NkwAT/GQDjKZZ0m0H/YCFDoCJCYj4z/4+4v7/2P/8H///fjMw+ALwPFhmxgf8/Pz/9sLd//X/9jGZmBi/GZDmAjDo1f/jq3/w/wyIb+/v7/X/d/ez2/68A/wc8Ov/hj/wGATwFgYGBhYGDN8Mv/wfP/9z+9f5ngZGZmZgYJigUGBwQgKjY2NjnJ7/zH4/u74/9Xq3v/Gsw/kxfh//z+fjHwBf+MgYJlBmJiYx8fwQgIaKl67v/d//vLZ/8gQAAAABJRU5ErkJggg==";
//        String outputFilePath = "output.png";
//        Base64ToImageConverter.convert(base64Label, outputFilePath);


//        String text = "Master EDI No,Invoice Number,Invoice Date,Type,Settle,Inv Charge,Trans Cnt,Bill-to Account,Cntry,N/A,Consolidated Acct,Co.Cd,Grd Prefix,Tracking Number,Rebill,Non-Dup,Ship Date,Svc,Pkg,Grd Svc,IPD Adr,Msg Cd,Ref 1,Ref 2,Ref 3,Store No,Grd PO No,Grd Dept No,Cust Inv No,RMA No,Device No,Device,Payor,Net Chrg,Curr,Chrg 1,Freight Amt,Chrg 2,Vol Disc Amt,Chrg 3,Earned Disc Amt,Chrg 4,Auto Disc Amt,Chrg 5,Perf Price Amt,Chrg 6,Fuel Amt,Chrg 7,Resi Amt,Chrg 8,DAS Amt,Chrg 9,On-Call Amt,Chrg 10,D.V. Amt,Chrg 11,Sign Svc Amt,Chrg 12,Sat Amt,Chrg 13,Addn Hndlg Amt,Chrg 14,Adr Corr Amt,Chrg 15,GST Amt,Chrg 16,Duty Amt,Chrg 17,Adv Fee Amt,Chrg 18,Orig VAT Amt,Chrg 19,Misc 1 Amt,Chrg 20,Misc 2 Amt,Chrg 21,Misc 3 Amt,Exchg Rate,Exc Curr,Fuel Pct,EU Bd,C.L.Cnt,Call Tag,Dec Value,Customs,Cus Curr,Entry No,Bundle No,Scale,Pcs,Bill Wt,Orig Wt,Multi-Wt,Wt Unit,Length,Width,Height,Dim Unit,Divisor,Grd Misc 1,Grd Misc 2,Grd Misc 3,Shipper Name,Shipper Company,Shipper Dept,Shipper Address 1,Shipper Address 2,Shipper City,ST,Postal,US Origin,Cntry1,Region,Recipient Name,Recipient Company,Recipient Address 1,Recipient Address 2,Recipient City,ST2,Postal2,Cntry2,Hndlg,Dlvry Date,Time,Final,Exceptn,Attempt Date,Attempt Time,Signature,Svc Area,COD Amt,COD Trkg No,PDue,PDue Inv,Svc Pct,Threshold,Orig Recip Adr 1,Orig Recip Adr 2,Original City,ST3,Postal3,EU VAT No,FedEx VAT No,Cross Ref No,Intl Grd Shipmt No,LF Orig Inv Nbr,LF Orig Date,LF Orig Amt,LF Inv Open Amt,LF Rate,LF Date";
//
//        long count = Arrays.stream(text.split(",")).count();
//        System.out.println(count);


//        try
//        {
//            String filesBytes = getString();
//
//            try(FileOutputStream fileInputStream = new FileOutputStream("/Users/kaporter84/Downloads/test.pdf"))
//            {
//                fileInputStream.write(Base64.getDecoder().decode(filesBytes));
//            }
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }




//        String s = "{\n" +
//                "  \"nodes\": [\n" +
//                "    {\"children\": [\"B\", \"C\", \"D\"], \"id\": \"A\", \"value\": \"A\"},\n" +
//                "    {\"children\": [\"E\", \"F\"], \"id\": \"B\", \"value\": \"B\"},\n" +
//                "    {\"children\": [], \"id\": \"C\", \"value\": \"C\"},\n" +
//                "    {\"children\": [\"G\", \"H\"], \"id\": \"D\", \"value\": \"D\"},\n" +
//                "    {\"children\": [], \"id\": \"E\", \"value\": \"E\"},\n" +
//                "    {\"children\": [\"I\", \"J\"], \"id\": \"F\", \"value\": \"F\"},\n" +
//                "    {\"children\": [\"K\"], \"id\": \"G\", \"value\": \"G\"},\n" +
//                "    {\"children\": [], \"id\": \"H\", \"value\": \"H\"},\n" +
//                "    {\"children\": [], \"id\": \"I\", \"value\": \"I\"},\n" +
//                "    {\"children\": [], \"id\": \"J\", \"value\": \"J\"},\n" +
//                "    {\"children\": [], \"id\": \"K\", \"value\": \"K\"}\n" +
//                "  ],\n" +
//                "  \"startNode\": \"A\"\n" +
//                "}";

//
//        NodeJson nodeJson = new Gson().fromJson(s, NodeJson.class);
//        Program program = BinaryTreeUtil.listToNode(nodeJson.getNodes(), nodeJson.getStartNode());
//        List<String> finalArray = program.depthFirstSearch(new ArrayList<>());
//        System.out.println(finalArray);


//        String s = "{\n" +
//                "  \"tree\": {\n" +
//                "    \"nodes\": [\n" +
//                "      {\"id\": \"1\", \"left\": \"2\", \"right\": \"3\", \"value\": -1},\n" +
//                "      {\"id\": \"2\", \"left\": null, \"right\": null, \"value\": 2},\n" +
//                "      {\"id\": \"3\", \"left\": null, \"right\": null, \"value\": 3}\n" +
//                "    ],\n" +
//                "    \"root\": \"1\"\n" +
//                "  }\n" +
//                "}";
//        Treedata tree = new Gson().fromJson(s, Treedata.class);
//        BinaryTree binaryTree = BinaryTreeUtil.listToBinaryTree(tree.getTree().getNodes(), tree.getTree().getRoot());
//        System.out.println(EasyAlgos.evaluateExpressionTree(binaryTree));

//        List<String> dateRanges = new ArrayList<>();
//        dateRanges.add("01/01/2023 - 12/31/2023");
//        dateRanges.add("01/01/2022 - 12/31/2022");
//        dateRanges.add("06/01/2023 - 06/30/2023");
//
//        boolean hasOverlappingDates = OverlappingDatesChecker.hasOverlappingDates(dateRanges);
//        System.out.println("Has overlapping dates: " + hasOverlappingDates); // prints "true"

    }

    private static String getString() throws IOException
    {
        return new String(Files.readAllBytes(Paths.get("/Users/kaporter84/Downloads/test.txt")));
    }

    private static void recursiveMethod(int counter)
    {
        if(counter <= 3)
        {
            System.out.println(counter);
            recursiveMethod(++counter);
        }
    }
}


