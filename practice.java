import java.io.*;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.sql.SQLOutput;
import java.util.*;

class Employeee implements Serializable {
    String empno;
    String ename;
    int ereading;
    int preading;
    int greading;
    int wreading;
    int ireading;
    int ebill;
    int gbill;
    int wbill;
    int pbill;
    int ibill;

    Employeee(String empno, String ename, int ereading, int preading, int wreading, int greading, int ireading,
            int ebill, int gbill, int wbill, int pbill, int ibill) {
        this.empno = empno;
        this.ename = ename;
        this.ereading = ereading;
        this.preading = preading;
        this.wreading = wreading;
        this.greading = greading;
        this.ireading = ireading;
        this.ebill = ebill;
        this.gbill = gbill;
        this.wbill = wbill;
        this.pbill = pbill;
        this.ibill = ibill;
    }

    // empno+" "+ename+" "+ereading+" "+preading+" "+wreading+" "+greading+"
    // "+ireading+" "+ebill+" "+gbill+" "+wbill+" "+pbill+" "+ibill;
    public String toString() {
        return String.format("%9s   %12s   %12d   %12d   %12d   %12d   %12d   %12d   %12d   %12d   %12d   %12d", empno,
                ename, ereading, preading, wreading, greading, ireading, ebill, gbill, wbill, pbill, ibill);
    }
}

class EmployeeDemo {
    public static void Stringdisplay() {
        String a = "CONSUMERID";
        String b = "NAMES";
        String c = "Ereading";
        String d = "Preading";
        String e = "Wreading";
        String f = "Greading";
        String g = "Ireading";
        String h = "Ebill";
        String i = "Gbill";
        String j = "Wbill";
        String k = "Pbill";
        String l = "Ibill";
        System.out.format("%10s  %12s  %15s  %13s  %13s  %13s  %13s  %12s  %12s  %14s  %13s  %13s", a, b, c, d, e, f, g,
                h, i, j, k, l);

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // auto file creation variables
        int fileyear = 2016;
        int filemonth;
        String tempofilemonth = "";
        String filename = "";

        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        // creating the collection
        ArrayList<Employeee> al = new ArrayList<Employeee>();
        ArrayList<Employeee> al2 = new ArrayList<Employeee>();

        // list iterator
        ListIterator<Employeee> li = null;

        // oos
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        int choice = -1;
        do {
            // System.out.println("1.Generate Bill");
            // System.out.println("2.Display");
            // System.out.println("3.Search");
            // System.out.println("0.Exit");
            // System.out.print("Enter your choice: ");

            System.out.println("");
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println(
                    "-----------------------------------------------------------Welcome to 002's Complex billing system----------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Select one of the following options:");
            System.out.println("");

            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");

            System.out.println("1. Generate new bill");
            // update of a previous month
            // generate of a new month

            System.out.println("2. View record of all the consumers in a month of a specific year");

            System.out.println("3. view bill of a specific consumer ");
            // view by id
            // view of a specific consumer in a single month of a specific year (enter
            // month, enter year, enter id )
            // view of a specific consumer in a specific year (enter year , enter id )
            // view by adress
            // view of a specific consumer in a single month (enter month, enter year, enter
            // adress)
            // view of a specific consumer in a specific year (enter year , enter adress)
            System.out.println("4. Find Maximum or Minimum Bill");// the maximum and/or minimum bill for a specific
                                                                  // utility or house or street or sub-block,or block
            // 1.find the maximum bill of a specific utility
            // this will loop in each customer of each file and check for the maximum util
            System.out.println("5. Find Detailed Month wise billing reports");
            // 1. Month wise billing reports of a specific utility in a specific period
            // 2. Month wise billing reports of all the utilities in a specific period
            System.out.println("6. Find yearly and half yearly reports based on the total bill of each customer");// finds
                                                                                                                  // total
                                                                                                                  // bill
                                                                                                                  // for
                                                                                                                  // half
                                                                                                                  // the
                                                                                                                  // year
                                                                                                                  // ...gets
                                                                                                                  // input
                                                                                                                  // of
                                                                                                                  // the
                                                                                                                  // start
                                                                                                                  // and
                                                                                                                  // end
                                                                                                                  // of
                                                                                                                  // months
                                                                                                                  // //gets
                                                                                                                  // year
                                                                                                                  // and
                                                                                                                  // gives
                                                                                                                  // total
                                                                                                                  // bill
                                                                                                                  // in
                                                                                                                  // a
                                                                                                                  // single
                                                                                                                  // line
            System.out.println("7. Auto file creation and random data entry loop ");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            System.out.println("");
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");

            choice = s.nextInt();
            System.out.println("");
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");

            switch (choice) {

                // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                case 1: // 1. Generate new bill
                        // 1. update of a previous month
                        // 2. generate of a new month

                    int option = -1;
                    do {
                        Scanner inputint = new Scanner(System.in);
                        Scanner inputstring = new Scanner(System.in);

                        System.out.println("");
                        System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("Select one of the following choices: ");
                        System.out.println(" ");
                        System.out.println("1. Update record of a previous month");
                        System.out.println("2. Create new month bill");
                        System.out.println("0. Go Back");
                        System.out.print("Option: ");
                        option = inputint.nextInt();
                        System.out.println("");
                        System.out.println(
                                "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        switch (option) {
                            case 1:
                                String ename = "";
                                int previousEreading = 0;
                                int previousPreading = 0;
                                int previousGreading = 0;
                                int previousWreading = 0;
                                int previousIreading = 0;
                                String month = "";
                                String year = "";
                                String path2 = "";
                                String path = "";
                                boolean found2 = false;
                                boolean found = false;
                                boolean check = true;
                                System.out.println("");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter the month of the record to be updated:");
                                int newmonth = inputint.nextInt();
                                System.out.println("Enter the year of the record to be updated:");
                                int newyear = inputint.nextInt();
                                System.out.println(
                                        "Enter the consumerid of the consumer you want to update the data for: ");
                                String consumerid = inputstring.nextLine();
                                System.out.println("");
                                System.out.println(
                                        "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("");
                                int previousmonth = newmonth;
                                int previousyear = newyear;

                                if (previousmonth == 1) {
                                    previousmonth = 12;
                                    previousyear = previousyear - 1;
                                } else {
                                    previousmonth = previousmonth - 1;
                                }
                                if (previousmonth <= 9) {
                                    month = "0" + String.valueOf(previousmonth);
                                } else {
                                    month = String.valueOf(previousmonth);
                                }
                                year = String.valueOf(previousyear);

                                filename = month + " " + year + ".txt";
                                System.out.println(filename);
                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                try {
                                    File file = new File(path);
                                    if (file.isFile()) {
                                        ois = new ObjectInputStream(new FileInputStream(file));
                                        al = (ArrayList<Employeee>) ois.readObject();
                                        ois.close();
                                        li = al.listIterator();
                                        while (li.hasNext()) {
                                            Employeee e = (Employeee) li.next();
                                            if (Objects.equals(e.empno, consumerid)) {
                                                System.out.println(" ");
                                                System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                System.out.println("Data from the record of the previous month file : "
                                                        + filename + " is as follows: ");
                                                System.out.println("");
                                                Stringdisplay();
                                                System.out.println(" ");
                                                System.out.println(e);
                                                System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                ename = e.ename;
                                                previousEreading = e.ereading;
                                                previousPreading = e.preading;
                                                previousGreading = e.greading;
                                                previousWreading = e.wreading;
                                                previousIreading = e.ireading;

                                                found = true;
                                            }
                                        }
                                        if (false == found) {
                                            System.out.println("");
                                            System.out.println(
                                                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("");
                                            System.out.println(
                                                    "Record of the consumer id entered doesnot exist in the Previous month file!");
                                            System.out.println("");
                                            System.out.println(
                                                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("");
                                        }
                                        if (true == found) {

                                            if (newmonth <= 9) {
                                                month = "0" + String.valueOf(newmonth);
                                            } else {
                                                month = String.valueOf(newmonth);
                                            }

                                            year = String.valueOf(newyear);

                                            filename = month + " " + year + ".txt";
                                            path2 = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                            try {
                                                File file2 = new File(path2);
                                                if (file2.isFile()) {
                                                    al2.clear();
                                                    ois = new ObjectInputStream(new FileInputStream(file2));
                                                    al2 = (ArrayList<Employeee>) ois.readObject();
                                                    ois.close();
                                                    li = al2.listIterator();
                                                    while (li.hasNext()) {
                                                        Employeee e2 = (Employeee) li.next();
                                                        if (Objects.equals(e2.empno, consumerid)) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            System.out
                                                                    .println("Your data from the record to be updated: "
                                                                            + filename + " is as follows: ");
                                                            System.out.println(" ");
                                                            Stringdisplay();
                                                            System.out.println(" ");
                                                            System.out.println(e2);
                                                            System.out.println("  ");
                                                            System.out.println(
                                                                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                            System.out.println("");
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("Enter the new Ereading");
                                                            int ereading = inputint.nextInt();
                                                            int eunits = ereading - previousEreading;
                                                            int ebill = ebill_generator(eunits);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("This is the ereading: " + ereading);
                                                            System.out.println(
                                                                    "This is the preereading: " + previousEreading);
                                                            System.out.println("This is the eunits: " + eunits);
                                                            System.out.println("This is the ebill: " + ebill);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("Enter the new Preading");
                                                            int preading = inputint.nextInt();
                                                            int punits = preading - previousPreading;
                                                            int pbill = pbill_generator(punits);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("This is the Preading: " + preading);
                                                            System.out.println(
                                                                    "This is the previousreading: " + previousPreading);
                                                            System.out.println("This is the punits: " + punits);
                                                            System.out.println("This is the pbill: " + pbill);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("Enter the new Wreading");
                                                            int wreading = inputint.nextInt();
                                                            int wunits = wreading - previousWreading;
                                                            int wbill = wbill_generator(wunits);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("This is the Wreading: " + wreading);
                                                            System.out.println("This is the previousWreading: "
                                                                    + previousWreading);
                                                            System.out.println("This is the Wunits: " + wunits);
                                                            System.out.println("This is the Wbill: " + wbill);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("Enter the new Greading");
                                                            int greading = inputint.nextInt();
                                                            int gunits = greading - previousGreading;
                                                            int gbill = gbill_generator(gunits);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("This is the Greading: " + greading);
                                                            System.out.println("This is the previousGreading: "
                                                                    + previousGreading);
                                                            System.out.println("This is the gunits: " + gunits);
                                                            System.out.println("This is the gbill: " + gbill);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("Enter the new Ireading");
                                                            int ireading = inputint.nextInt();
                                                            int iunits = ireading - previousIreading;
                                                            int ibill = ibill_generator(iunits);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("This is the Ireading: " + ireading);
                                                            System.out.println("This is the previousIreading: "
                                                                    + previousIreading);
                                                            System.out.println("This is the Iunits: " + iunits);
                                                            System.out.println("This is the Ibill: " + ibill);
                                                            System.out.println(
                                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                            li.set(new Employeee(consumerid, ename, ereading, preading,
                                                                    wreading, greading, ireading, ebill, gbill, wbill,
                                                                    pbill, ibill));

                                                            found2 = true;

                                                        }
                                                    }
                                                    if (false == found2) {
                                                        System.out.println(
                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        System.out.println(
                                                                "Record of the entered consumerid doesnot exist in the file to be updated!");
                                                        System.out.println(" ");
                                                        System.out.println(
                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                    }
                                                    if (found2 == true) {
                                                        oos = new ObjectOutputStream(new FileOutputStream(file2));
                                                        oos.writeObject(al2);
                                                        oos.close();
                                                        System.out.println(
                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(" ");
                                                        System.out.println("Record Updated Sucessfully!");
                                                        System.out.println(" ");
                                                        System.out.println(
                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                    }
                                                } else {
                                                    System.out.println(
                                                            "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println(" ");
                                                    System.out.println("File to be updated not found!");
                                                    System.out.println(" ");
                                                    System.out.println(
                                                            "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                }

                                            } catch (FileNotFoundException e) {
                                                System.out.println("No Record Found Exception! ");
                                                e.printStackTrace();
                                            } catch (ClassNotFoundException e) {
                                                System.out.println("Class not found exception");
                                                e.printStackTrace();
                                            }

                                        }
                                        al.clear();
                                    } else {
                                        System.out.println("");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("File of the Previous Month doesnot exist!");
                                        System.out.println("");
                                        System.out.println(
                                                "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                    }

                                } catch (FileNotFoundException e) {
                                    System.out.println("No Record Found Exception! ");
                                    e.printStackTrace();
                                } catch (ClassNotFoundException e) {
                                    System.out.println("Class not found exception");
                                    e.printStackTrace();
                                }

                                break;
                            case 2:
                                path2 = "";
                                found2 = false;
                                found = false;
                                System.out.println("");
                                System.out.println(
                                        "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("Enter the month of the new bill:");
                                newmonth = inputint.nextInt();
                                System.out.println("Enter the year of the new bill:");
                                newyear = inputint.nextInt();
                                System.out.println(
                                        "Enter the consumerid of the consumer you want to generate the new bill for: ");
                                consumerid = inputstring.nextLine();
                                System.out.println(
                                        "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("");
                                previousmonth = newmonth;
                                previousyear = newyear;

                                if (previousmonth == 1) {
                                    previousmonth = 12;
                                    previousyear = previousyear - 1;
                                } else {
                                    previousmonth = previousmonth - 1;
                                }
                                if (previousmonth <= 9) {
                                    month = "0" + String.valueOf(previousmonth);
                                } else {
                                    month = String.valueOf(previousmonth);
                                }
                                year = String.valueOf(previousyear);

                                filename = month + " " + year + ".txt";
                                System.out.println(filename);
                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                try {
                                    File file = new File(path);
                                    if (file.isFile()) {
                                        ois = new ObjectInputStream(new FileInputStream(file));
                                        al = (ArrayList<Employeee>) ois.readObject();
                                        ois.close();
                                        li = al.listIterator();
                                        while (li.hasNext()) {
                                            Employeee e = (Employeee) li.next();
                                            if (Objects.equals(e.empno, consumerid)) {
                                                System.out.println("");
                                                System.out.println(
                                                        "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println(" ");
                                                System.out.println("Data from the record of the previous month file : "
                                                        + filename + " is as follows: ");
                                                Stringdisplay();
                                                System.out.println(" ");
                                                System.out.println(e);
                                                System.out.println(" ");
                                                System.out.println(
                                                        "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println("");

                                                found2 = true;
                                                found = true;
                                            }
                                        }
                                        if (false == found) {
                                            System.out.println("");
                                            System.out.println(
                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println(" ");
                                            System.out.println(
                                                    "Record of the consumer id entered doesnot exist in the Previous month file!");
                                            System.out.println(" ");
                                            System.out.println(
                                                    "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("");

                                        } else {

                                            if (newmonth <= 9) {
                                                month = "0" + String.valueOf(newmonth);
                                            } else {
                                                month = String.valueOf(newmonth);
                                            }

                                            year = String.valueOf(newyear);

                                            filename = month + " " + year + ".txt";
                                            path2 = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                            try {
                                                File file2 = new File(path2);
                                                if (file2.isFile()) {

                                                    al2.clear();
                                                    ois = new ObjectInputStream(new FileInputStream(file2));
                                                    al2 = (ArrayList<Employeee>) ois.readObject();
                                                    ois.close();
                                                    li = al2.listIterator();
                                                    while (li.hasNext()) {

                                                        Employeee e2 = (Employeee) li.next();

                                                        if (Objects.equals(e2.empno, consumerid)) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println(" ");
                                                            System.out.println(
                                                                    "Record for the entered values already Exists! Please go to the update section to update it");
                                                            System.out.println("Your data from the record " + filename
                                                                    + " is as follows: ");
                                                            System.out.println(
                                                                    "CONSUMERID    NAME        Ereading     Preading    Wreading      Greading     Ireading     Ebill     Gbill       Wbill      Pbill      Ibill");
                                                            System.out.println(" ");
                                                            System.out.println(e2);
                                                            System.out.println("  ");
                                                            System.out.println(
                                                                    "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            found2 = false;

                                                        }

                                                    }
                                                    if (true == found2) {
                                                        al.clear();
                                                        ois = new ObjectInputStream(new FileInputStream(file));
                                                        ois.close();
                                                        al = (ArrayList<Employeee>) ois.readObject();

                                                        al2.clear();
                                                        ois = new ObjectInputStream((new FileInputStream(file2)));
                                                        al2 = (ArrayList<Employeee>) ois.readObject();

                                                        li = al.listIterator();
                                                        while (li.hasNext()) {
                                                            Employeee e = (Employeee) li.next();
                                                            if (Objects.equals(e.empno, consumerid)) {
                                                                ename = e.ename;
                                                                previousEreading = e.ereading;
                                                                previousPreading = e.preading;
                                                                previousGreading = e.greading;
                                                                previousWreading = e.wreading;
                                                                previousIreading = e.ireading;

                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("Enter the new Ereading");
                                                                int ereading = inputint.nextInt();
                                                                int eunits = ereading - previousEreading;
                                                                int ebill = ebill_generator(eunits);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("This is the ereading: " + ereading);
                                                                System.out.println(
                                                                        "This is the preereading: " + previousEreading);
                                                                System.out.println("This is the eunits: " + eunits);
                                                                System.out.println("This is the ebill: " + ebill);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("Enter the new Preading");
                                                                int preading = inputint.nextInt();
                                                                int punits = preading - previousPreading;
                                                                int pbill = pbill_generator(punits);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("This is the Preading: " + preading);
                                                                System.out.println("This is the previousreading: "
                                                                        + previousPreading);
                                                                System.out.println("This is the punits: " + punits);
                                                                System.out.println("This is the pbill: " + pbill);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("Enter the new Wreading");
                                                                int wreading = inputint.nextInt();
                                                                int wunits = wreading - previousWreading;
                                                                int wbill = wbill_generator(wunits);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("This is the Wreading: " + wreading);
                                                                System.out.println("This is the previousWreading: "
                                                                        + previousWreading);
                                                                System.out.println("This is the Wunits: " + wunits);
                                                                System.out.println("This is the Wbill: " + wbill);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("Enter the new Greading");
                                                                int greading = inputint.nextInt();
                                                                int gunits = greading - previousGreading;
                                                                int gbill = gbill_generator(gunits);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("This is the Greading: " + greading);
                                                                System.out.println("This is the previousGreading: "
                                                                        + previousGreading);
                                                                System.out.println("This is the gunits: " + gunits);
                                                                System.out.println("This is the gbill: " + gbill);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("Enter the new Ireading");
                                                                int ireading = inputint.nextInt();
                                                                int iunits = ireading - previousIreading;
                                                                int ibill = ibill_generator(iunits);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("This is the Ireading: " + ireading);
                                                                System.out.println("This is the previousIreading: "
                                                                        + previousIreading);
                                                                System.out.println("This is the Iunits: " + iunits);
                                                                System.out.println("This is the Ibill: " + ibill);
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                                al2.add(new Employeee(consumerid, ename, ereading,
                                                                        preading, wreading, greading, ireading, ebill,
                                                                        gbill, wbill, pbill, ibill));
                                                                oos = new ObjectOutputStream(
                                                                        new FileOutputStream(file2));
                                                                oos.writeObject(al2);
                                                                al2.clear();
                                                                oos.close();
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println("New bill generated successfully!");
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                            }
                                                        }
                                                    }
                                                    al2.clear();
                                                } else {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    System.out.println("New file not found!");
                                                    System.out.println("1.Would you like to create a new file?");
                                                    System.out.println("2. Go back");
                                                    System.out.println("Option: ");
                                                    System.out.println("");
                                                    System.out.println(
                                                            "------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    int optioninfinity = inputint.nextInt();
                                                    if (optioninfinity == 2) {
                                                        option = 0;
                                                    }
                                                    if (optioninfinity == 1) {
                                                        try {
                                                            File myObj = new File(path2);
                                                            if (myObj.createNewFile()) {
                                                                System.out.println("File created: " + myObj.getName());
                                                                System.out.println(" ");
                                                                al.clear();
                                                                ois = new ObjectInputStream(new FileInputStream(file));
                                                                ois.close();
                                                                al = (ArrayList<Employeee>) ois.readObject();

                                                                al2.clear();
                                                                ois = new ObjectInputStream(
                                                                        (new FileInputStream(file2)));
                                                                al2 = (ArrayList<Employeee>) ois.readObject();

                                                                li = al.listIterator();
                                                                while (li.hasNext()) {
                                                                    Employeee e = (Employeee) li.next();
                                                                    if (Objects.equals(e.empno, consumerid)) {
                                                                        ename = e.ename;
                                                                        previousEreading = e.ereading;
                                                                        previousPreading = e.preading;
                                                                        previousGreading = e.greading;
                                                                        previousWreading = e.wreading;
                                                                        previousIreading = e.ireading;

                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("Enter the new Ereading");
                                                                        int ereading = inputint.nextInt();
                                                                        int eunits = ereading - previousEreading;
                                                                        int ebill = ebill_generator(eunits);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                "This is the ereading: " + ereading);
                                                                        System.out.println("This is the preereading: "
                                                                                + previousEreading);
                                                                        System.out.println(
                                                                                "This is the eunits: " + eunits);
                                                                        System.out
                                                                                .println("This is the ebill: " + ebill);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("Enter the new Preading");
                                                                        int preading = inputint.nextInt();
                                                                        int punits = preading - previousPreading;
                                                                        int pbill = pbill_generator(punits);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                "This is the Preading: " + preading);
                                                                        System.out
                                                                                .println("This is the previousreading: "
                                                                                        + previousPreading);
                                                                        System.out.println(
                                                                                "This is the punits: " + punits);
                                                                        System.out
                                                                                .println("This is the pbill: " + pbill);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("Enter the new Wreading");
                                                                        int wreading = inputint.nextInt();
                                                                        int wunits = wreading - previousWreading;
                                                                        int wbill = wbill_generator(wunits);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                "This is the Wreading: " + wreading);
                                                                        System.out.println(
                                                                                "This is the previousWreading: "
                                                                                        + previousWreading);
                                                                        System.out.println(
                                                                                "This is the Wunits: " + wunits);
                                                                        System.out
                                                                                .println("This is the Wbill: " + wbill);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("Enter the new Greading");
                                                                        int greading = inputint.nextInt();
                                                                        int gunits = greading - previousGreading;
                                                                        int gbill = gbill_generator(gunits);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                "This is the Greading: " + greading);
                                                                        System.out.println(
                                                                                "This is the previousGreading: "
                                                                                        + previousGreading);
                                                                        System.out.println(
                                                                                "This is the gunits: " + gunits);
                                                                        System.out
                                                                                .println("This is the gbill: " + gbill);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("Enter the new Ireading");
                                                                        int ireading = inputint.nextInt();
                                                                        int iunits = ireading - previousIreading;
                                                                        int ibill = ibill_generator(iunits);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                "This is the Ireading: " + ireading);
                                                                        System.out.println(
                                                                                "This is the previousIreading: "
                                                                                        + previousIreading);
                                                                        System.out.println(
                                                                                "This is the Iunits: " + iunits);
                                                                        System.out
                                                                                .println("This is the Ibill: " + ibill);
                                                                        System.out.println(
                                                                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                                        al2.add(new Employeee(consumerid, ename,
                                                                                ereading, preading, wreading, greading,
                                                                                ireading, ebill, gbill, wbill, pbill,
                                                                                ibill));
                                                                        oos = new ObjectOutputStream(
                                                                                new FileOutputStream(file2));
                                                                        oos.writeObject(al2);
                                                                        al2.clear();
                                                                        oos.close();
                                                                        System.out.println("");
                                                                        System.out.println(
                                                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("");
                                                                        System.out.println(
                                                                                "New bill generated successfully!");
                                                                        System.out.println("");
                                                                        System.out.println(
                                                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("");

                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println("File already exists.");
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                            }

                                                        } catch (IOException e) {
                                                            System.out.println("An error occurred.");
                                                            e.printStackTrace();
                                                        }
                                                    }

                                                }

                                            } catch (FileNotFoundException e) {
                                                System.out.println("No Record Found Exception! ");
                                                e.printStackTrace();
                                            } catch (ClassNotFoundException e) {
                                                System.out.println("Class not found exception");
                                                e.printStackTrace();
                                            }

                                        }
                                        al.clear();
                                    } else {
                                        System.out.println("");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("File of the Previous Month doesnot exist!");
                                        System.out.println("");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                    }

                                } catch (FileNotFoundException e) {
                                    System.out.println("No Record Found Exception! ");
                                    e.printStackTrace();
                                } catch (ClassNotFoundException e) {
                                    System.out.println("Class not found exception");
                                    e.printStackTrace();
                                }

                                break;

                        }

                    } while (option != 0);

                    break;

                // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                case 2: // 2. View record of all the consumers in a month of a specific yea

                    Scanner sc1 = new Scanner(System.in);
                    Scanner scc1 = new Scanner(System.in);

                    System.out.println("Enter  month of the record you want to view: ");
                    int tempmonth = sc1.nextInt();
                    String month = "";
                    if (tempmonth <= 9) {
                        month = "0" + String.valueOf(tempmonth);
                    } else {
                        month = String.valueOf(tempmonth);
                    }

                    System.out.println("Enter  Year of the record you want to view: ");
                    String year = scc1.nextLine();

                    filename = month + " " + year + ".txt";
                    String path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                    try {
                        File file = new File(path);
                        if (file.isFile()) {
                            System.out.println("Your data from the record " + filename + " is as follows: ");
                            System.out.println("");
                            System.out.println(
                                    "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                            Stringdisplay();
                            System.out.println(" ");
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<Employeee>) ois.readObject();
                            ois.close();
                            li = al.listIterator();
                            while (li.hasNext()) {
                                System.out.println(li.next());
                            }
                            System.out.println("");
                            System.out.println(
                                    "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                            al.clear();
                        } else {
                            System.out.println("");
                            System.out.println(
                                    "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                            System.out.println("File not found! ");
                            System.out.println("");
                            System.out.println(
                                    "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("No Record Found Exception! ");
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        System.out.println("Class not found exception");
                        e.printStackTrace();
                    }

                    break;

                // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                case 3: // 3. view bill of a specific consumer
                        // 1.view by id
                        // 1.view of a specific consumer in a single month of a specific year (enter
                        // month, enter year, enter id ) DONE
                        // 2.view of a specific consumer in a specific year (enter year , enter id )
                        // 0.goback
                        // 2.view by adress
                        // 1.view of a specific consumer in a single month (enter month, enter year,
                        // enter adress)
                        // 2.view of a specific consumer in a specific year (enter year , enter adress)
                        // 0.goback
                        // 0.goback

                    Scanner scint = new Scanner(System.in);
                    Scanner scstring = new Scanner(System.in);

                    String consumerid = "";

                    String string_sector = "";
                    String string_subsector = "";
                    String string_street = "";
                    String string_house = "";
                    String string_floor = "";
                    char char_sector = 'A';
                    int intsector = 0;
                    int int_subsector = 0;
                    int int_street = 0;
                    int int_house = 0;
                    char char_floor = 'A';
                    int intfloor = 0;
                    boolean found = false;

                    int alpha1 = -1;
                    do {
                        // 1.view by id
                        // 2.view by adress
                        // 0.goback
                        System.out.println("");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("1. View by id");
                        System.out.println("2. View by adress");
                        System.out.println("0. Go back");
                        System.out.println("Choice: ");
                        alpha1 = scint.nextInt();
                        System.out.println("");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");

                        switch (alpha1) {
                            // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                            case 1: // 1.view by id
                                int alpha2 = -1;
                                do {

                                    // 1.view of a specific consumer in a single month of a specific year (enter
                                    // month, enter year, enter id ) DONE
                                    // 2.view of a specific consumer in a specific year (enter year , enter id )
                                    // 0.goback
                                    System.out.println("");
                                    System.out.println(
                                            "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println(
                                            "1. View of a specific consumer in a single month of a specific year");
                                    System.out.println("2. View of a specific consumer in a specific year");
                                    System.out.println("0. Go back");
                                    System.out.println("Choice: ");
                                    alpha2 = scint.nextInt();
                                    System.out.println("");
                                    System.out.println(
                                            "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");

                                    year = "";
                                    month = "";

                                    Scanner scc = new Scanner(System.in);
                                    Scanner yearrr = new Scanner(System.in);

                                    switch (alpha2) {
                                        case 1: // 1.view of a specific consumer in a single month of a specific year
                                                // (enter month, enter year, enter id ) DONE
                                            System.out.println("Enter  month of the record you want to search: ");
                                            tempmonth = scc.nextInt();

                                            if (tempmonth <= 9) {
                                                month = "0" + String.valueOf(tempmonth);
                                            } else {
                                                month = String.valueOf(tempmonth);
                                            }

                                            System.out.println("Enter  Year of the record you want to search: ");
                                            year = yearrr.nextLine();

                                            filename = month + " " + year + ".txt";
                                            path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;
                                            System.out.println("Enter consumer Id: ");
                                            consumerid = yearrr.nextLine();

                                            try {
                                                File file = new File(path);
                                                if (file.isFile()) {
                                                    ois = new ObjectInputStream(new FileInputStream(file));
                                                    al = (ArrayList<Employeee>) ois.readObject();
                                                    ois.close();
                                                    li = al.listIterator();
                                                    while (li.hasNext()) {
                                                        Employeee e = (Employeee) li.next();
                                                        if (Objects.equals(e.empno, consumerid)) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println("Your data from the record " + filename
                                                                    + " is as follows: ");
                                                            System.out.println(" ");
                                                            Stringdisplay();
                                                            System.out.println(" ");
                                                            System.out.println(e);
                                                            System.out.println(" ");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                            found = true;
                                                        }
                                                    }
                                                    if (found == false) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println("No record for the consumer id entered! ");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");

                                                    }
                                                    al.clear();
                                                } else {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    System.out
                                                            .println("File not found for the entered month and year! ");
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                }

                                            } catch (FileNotFoundException e) {
                                                System.out.println("No Record Found Exception! ");
                                                e.printStackTrace();
                                            } catch (ClassNotFoundException e) {
                                                System.out.println("Class not found exception");
                                                e.printStackTrace();
                                            }

                                            break;
                                        case 2: // 2.view of a specific consumer in a specific year (enter year , enter
                                                // id )

                                            System.out.println("Enter  Year of the record you want to search: ");
                                            year = yearrr.nextLine();
                                            System.out.println("Enter consumer Id: ");
                                            consumerid = yearrr.nextLine();
                                            tempmonth = 1;

                                            for (int i = 1; i <= 12; i++) {

                                                if (tempmonth <= 9) {
                                                    month = "0" + String.valueOf(tempmonth);
                                                } else {
                                                    month = String.valueOf(tempmonth);
                                                } // adding zero to month

                                                filename = month + " " + year + ".txt";
                                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                                try {
                                                    File file = new File(path);
                                                    if (file.isFile()) {
                                                        ois = new ObjectInputStream(new FileInputStream(file));
                                                        al = (ArrayList<Employeee>) ois.readObject();
                                                        ois.close();
                                                        li = al.listIterator();
                                                        while (li.hasNext()) {
                                                            Employeee e = (Employeee) li.next();
                                                            if (Objects.equals(e.empno, consumerid)) {
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println("Data of the consumer: " + consumerid
                                                                        + " of the month: " + month + " of the year: "
                                                                        + year + " is as follows: ");
                                                                System.out.println(" ");
                                                                Stringdisplay();
                                                                System.out.println(" ");
                                                                System.out.println(e);
                                                                System.out.println(" ");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");

                                                                found = true;
                                                            }
                                                        }
                                                        if (found == false) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println("No record for the consumer id: "
                                                                    + consumerid + " in the month: " + month
                                                                    + " of the year: " + year + " !");
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                        }
                                                        al.clear();
                                                    } else {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println("File not found for the month: " + month
                                                                + " of the year: " + year + " !");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                    }

                                                } catch (FileNotFoundException e) {
                                                    System.out.println("No Record Found Exception! ");
                                                    e.printStackTrace();
                                                } catch (ClassNotFoundException e) {
                                                    System.out.println("Class not found exception");
                                                    e.printStackTrace();
                                                }
                                                tempmonth++;
                                            } // month wali loop

                                            break;
                                    }
                                } while (alpha2 != 0);
                                break;
                            // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                            case 2: // 2.view by adress

                                int alpha3 = -1;
                                do {
                                    // 1.view of a specific consumer in a single month (enter month, enter year,
                                    // enter adress)
                                    // 2.view of a specific consumer in a specific year (enter year , enter adress)
                                    // 0.goback
                                    System.out.println("");
                                    System.out.println(
                                            "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("1. View of a specific consumer in a single month ");
                                    System.out.println("2. View of a specific consumer in a specific year");
                                    System.out.println("0. Go back");
                                    System.out.println("Choice: ");
                                    alpha3 = scint.nextInt();
                                    System.out.println("");
                                    System.out.println(
                                            "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");

                                    switch (alpha3) {
                                        case 1: // 1.view of a specific consumer in a single month (enter month, enter
                                                // year, enter adress)
                                            System.out.println("Enter the sector (A-J in Capital): ");
                                            string_sector = scstring.nextLine();
                                            char_sector = string_sector.charAt(0);
                                            switch (char_sector) {
                                                case 'A':
                                                    string_sector = "01";
                                                    break;
                                                case 'B':
                                                    string_sector = "02";
                                                    break;
                                                case 'C':
                                                    string_sector = "03";
                                                    break;
                                                case 'D':
                                                    string_sector = "04";
                                                    break;
                                                case 'E':
                                                    string_sector = "05";
                                                    break;
                                                case 'F':
                                                    string_sector = "06";
                                                    break;
                                                case 'G':
                                                    string_sector = "07";
                                                    break;
                                                case 'H':
                                                    string_sector = "08";
                                                    break;
                                                case 'I':
                                                    string_sector = "09";
                                                    break;
                                                case 'J':
                                                    string_sector = "10";
                                                    break;
                                            }

                                            System.out.println("Enter the subsector (1-4): ");
                                            string_subsector = scstring.nextLine();

                                            System.out.println("Enter the street (1-10): ");
                                            int_street = scint.nextInt();
                                            if (int_street <= 9) {
                                                string_street = "0" + String.valueOf(int_street);
                                            } else {
                                                string_street = String.valueOf(int_street);
                                            }
                                            System.out.println("Enter the house (1-20): ");
                                            int_house = scint.nextInt();
                                            if (int_house <= 9) {
                                                string_house = "0" + String.valueOf(int_house);
                                            } else {
                                                string_house = String.valueOf(int_house);
                                            }
                                            System.out.println("Enter the floor (ground,first,second): ");
                                            string_floor = scstring.nextLine();
                                            if (string_floor.equals("ground")) {
                                                string_floor = "0";
                                            }
                                            if (string_floor.equals("first")) {
                                                string_floor = "1";
                                            }
                                            if (string_floor.equals("second")) {
                                                string_floor = "2";
                                            }

                                            consumerid = string_sector + string_subsector + string_street + string_house
                                                    + string_floor;

                                            System.out.println("Enter  month of the record you want to search: ");
                                            tempmonth = scint.nextInt();

                                            if (tempmonth <= 9) {
                                                month = "0" + String.valueOf(tempmonth);
                                            } else {
                                                month = String.valueOf(tempmonth);
                                            }

                                            System.out.println("Enter  Year of the record you want to search: ");
                                            year = scstring.nextLine();

                                            filename = month + " " + year + ".txt";
                                            path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                            try {
                                                File file = new File(path);
                                                if (file.isFile()) {
                                                    ois = new ObjectInputStream(new FileInputStream(file));
                                                    al = (ArrayList<Employeee>) ois.readObject();
                                                    ois.close();
                                                    li = al.listIterator();
                                                    while (li.hasNext()) {
                                                        Employeee e = (Employeee) li.next();
                                                        if (Objects.equals(e.empno, consumerid)) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println("Your data from the record " + filename
                                                                    + " is as follows: ");
                                                            System.out.println(" ");
                                                            Stringdisplay();
                                                            System.out.println(" ");
                                                            System.out.println(e);
                                                            System.out.println(" ");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                            found = true;
                                                        }
                                                    }
                                                    if (found == false) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println("Invalid Adress!");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");

                                                    }
                                                    al.clear();
                                                } else {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    System.out
                                                            .println("File not found for the entered month and year! ");
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                }

                                            } catch (FileNotFoundException e) {
                                                System.out.println("No Record Found Exception! ");
                                                e.printStackTrace();
                                            } catch (ClassNotFoundException e) {
                                                System.out.println("Class not found exception");
                                                e.printStackTrace();
                                            }

                                            break;
                                        case 2: // 2.view of a specific consumer in a specific year (enter year , enter
                                                // adress)
                                            System.out.println("Enter the sector (A-J in Capital): ");
                                            string_sector = scstring.nextLine();
                                            char_sector = string_sector.charAt(0);
                                            switch (char_sector) {
                                                case 'A':
                                                    string_sector = "01";
                                                    break;
                                                case 'B':
                                                    string_sector = "02";
                                                    break;
                                                case 'C':
                                                    string_sector = "03";
                                                    break;
                                                case 'D':
                                                    string_sector = "04";
                                                    break;
                                                case 'E':
                                                    string_sector = "05";
                                                    break;
                                                case 'F':
                                                    string_sector = "06";
                                                    break;
                                                case 'G':
                                                    string_sector = "07";
                                                    break;
                                                case 'H':
                                                    string_sector = "08";
                                                    break;
                                                case 'I':
                                                    string_sector = "09";
                                                    break;
                                                case 'J':
                                                    string_sector = "10";
                                                    break;
                                            }

                                            System.out.println("Enter the subsector (1-4): ");
                                            string_subsector = scstring.nextLine();

                                            System.out.println("Enter the street (1-10): ");
                                            int_street = scint.nextInt();
                                            if (int_street <= 9) {
                                                string_street = "0" + String.valueOf(int_street);
                                            } else {
                                                string_street = String.valueOf(int_street);
                                            }
                                            System.out.println("Enter the house (1-20): ");
                                            int_house = scint.nextInt();
                                            if (int_house <= 9) {
                                                string_house = "0" + String.valueOf(int_house);
                                            } else {
                                                string_house = String.valueOf(int_house);
                                            }
                                            System.out.println("Enter the floor (ground,first,second): ");
                                            string_floor = scstring.nextLine();
                                            if (string_floor.equals("ground")) {
                                                string_floor = "0";
                                            }
                                            if (string_floor.equals("first")) {
                                                string_floor = "1";
                                            }
                                            if (string_floor.equals("second")) {
                                                string_floor = "2";
                                            }

                                            consumerid = string_sector + string_subsector + string_street + string_house
                                                    + string_floor;

                                            System.out.println("Enter  Year of the record you want to search: ");
                                            year = scstring.nextLine();

                                            tempmonth = 1;

                                            for (int i = 1; i <= 12; i++) {

                                                if (tempmonth <= 9) {
                                                    month = "0" + String.valueOf(tempmonth);
                                                } else {
                                                    month = String.valueOf(tempmonth);
                                                } // adding zero to month

                                                filename = month + " " + year + ".txt";
                                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                                try {
                                                    File file = new File(path);
                                                    if (file.isFile()) {
                                                        ois = new ObjectInputStream(new FileInputStream(file));
                                                        al = (ArrayList<Employeee>) ois.readObject();
                                                        ois.close();
                                                        li = al.listIterator();
                                                        while (li.hasNext()) {
                                                            Employeee e = (Employeee) li.next();
                                                            if (Objects.equals(e.empno, consumerid)) {
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "Data of the required consumer of the month: "
                                                                                + month + " of the year: " + year
                                                                                + " is as follows: ");
                                                                System.out.println(" ");
                                                                Stringdisplay();
                                                                System.out.println(" ");
                                                                System.out.println(e);
                                                                System.out.println(" ");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");

                                                                found = true;
                                                            }
                                                        }
                                                        if (found == false) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "No record for the entered address in the month: "
                                                                            + month + " of the year: " + year + " !");
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                        }
                                                        al.clear();
                                                    } else {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println("File not found for the month: " + month
                                                                + " of the year: " + year + " !");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                    }

                                                } catch (FileNotFoundException e) {
                                                    System.out.println("No Record Found Exception! ");
                                                    e.printStackTrace();
                                                } catch (ClassNotFoundException e) {
                                                    System.out.println("Class not found exception");
                                                    e.printStackTrace();
                                                }
                                                tempmonth++;
                                            } // month wali loop

                                            break;
                                    }
                                } while (alpha3 != 0);
                                break;
                        }
                    } while (alpha1 != 0);

                    break;
                // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 4:
                    int lmao = 2;
                    String block = "";
                    String subblock = "";
                    String street = "";
                    String house = "";
                    int alpha4 = -1;
                    found = true;
                    boolean check = true;
                    int startingmonth = 0;
                    int endingmonth = 0;
                    int startingyear = 0;
                    int endingyear = 0;
                    int maxbill = 0;
                    int minbill = 0;
                    Scanner intsc = new Scanner(System.in);
                    Scanner strsc = new Scanner(System.in);
                    System.out.println("");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Enter the starting year of the report you want: ");
                    System.out.println("");
                    startingyear = intsc.nextInt();
                    System.out.println("");
                    System.out.println("Enter the ending year of the report you want: ");
                    System.out.println("");
                    endingyear = intsc.nextInt();
                    System.out.println(" ");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" ");
                    if (startingyear < 2017) {
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("The entered year cannot be less than 2017!");
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");

                        check = false;
                    }
                    if (endingyear < startingyear) {
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("The starting year cannot be greater than the ending year! ");
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");

                        check = false;
                    }

                    System.out.println("1. maximum or minimum bill of a specific utility");
                    System.out.println("1. maximum or minimum bill of a specific utility");
                    System.out.println("1. maximum or minimum bill of a specific utility");
                    System.out.println("1. maximum or minimum bill of a specific utility");
                    System.out.println("1. maximum or minimum bill of a specific utility");
                    alpha4 = intsc.nextInt();

                    if (true == check) {
                        do {
                            switch (alpha4) {
                                case 1:// maximum or minimum of a specific utility
                                    break;
                                case 2: // maximum or minimum of a specific block
                                    System.out.println("");
                                    System.out.println(
                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Enter The Block (A-J): ");
                                    block = strsc.nextLine();
                                    boolean authenticity = blockauthentication(block);
                                    System.out.println(authenticity);
                                    if (true == authenticity) {

                                        char_sector = block.charAt(0);
                                        switch (char_sector) {
                                            case 'A':
                                                block = "01";
                                                break;
                                            case 'a':
                                                block = "01";
                                                break;
                                            case 'B':
                                                block = "02";
                                                break;
                                            case 'b':
                                                block = "02";
                                                break;
                                            case 'C':
                                                block = "03";
                                                break;
                                            case 'c':
                                                block = "03";
                                                break;

                                            case 'D':
                                                block = "04";
                                                break;
                                            case 'd':
                                                block = "04";
                                                break;
                                            case 'E':
                                                block = "05";
                                                break;
                                            case 'e':
                                                block = "05";
                                                break;
                                            case 'F':
                                                block = "06";
                                                break;
                                            case 'f':
                                                block = "06";
                                                break;
                                            case 'G':
                                                block = "07";
                                                break;
                                            case 'g':
                                                block = "07";
                                                break;
                                            case 'H':
                                                block = "08";
                                                break;
                                            case 'h':
                                                block = "08";
                                                break;
                                            case 'I':
                                                block = "09";
                                                break;
                                            case 'i':
                                                block = "09";
                                                break;
                                            case 'J':
                                                block = "10";
                                                break;
                                            case 'j':
                                                block = "10";
                                                break;
                                        }

                                        month = "01";
                                        filename = month + " " + String.valueOf(startingyear) + ".txt";
                                        path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                        try {
                                            File file = new File(path);
                                            if (file.isFile()) {
                                                ois = new ObjectInputStream(new FileInputStream(file));
                                                al = (ArrayList<Employeee>) ois.readObject();
                                                ois.close();
                                                li = al.listIterator();
                                                while (li.hasNext()) {
                                                    Employeee e = (Employeee) li.next();
                                                    consumerid = e.empno;
                                                    String subconsumerid = consumerid.substring(0, 2);

                                                    if (subconsumerid.equals(block)) {
                                                        for (int i = startingyear; i <= endingyear; i++) {
                                                            for (int k = 1; k <= 12; k++) {
                                                                if (k <= 9) {
                                                                    month = "0" + String.valueOf(k);
                                                                } else {
                                                                    month = String.valueOf(k);
                                                                }
                                                                filename = month + " " + String.valueOf(i) + ".txt";
                                                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;
                                                                year = String.valueOf(i);

                                                                try {
                                                                    File file2 = new File(path);
                                                                    if (file2.isFile()) {
                                                                        ListIterator<Employeee> li2 = null;
                                                                        ois = new ObjectInputStream(
                                                                                new FileInputStream(file2));
                                                                        al2 = (ArrayList<Employeee>) ois.readObject();
                                                                        ois.close();
                                                                        li2 = al2.listIterator();
                                                                        while (li2.hasNext()) {
                                                                            Employeee e2 = (Employeee) li2.next();

                                                                            if (lmao != 2) {
                                                                                minbill = e2.ebill;
                                                                            }
                                                                            if (e2.ebill < minbill) {
                                                                                minbill = e2.ebill;
                                                                            }
                                                                            if (e2.gbill < minbill) {
                                                                                minbill = e2.gbill;
                                                                            }
                                                                            if (e2.wbill < minbill) {
                                                                                minbill = e2.wbill;
                                                                            }
                                                                            if (e2.ibill < minbill) {
                                                                                minbill = e2.ibill;
                                                                            }
                                                                            if (e2.pbill < minbill) {
                                                                                minbill = e2.pbill;
                                                                            }
                                                                            if (e2.ebill > maxbill) {
                                                                                maxbill = e2.ebill;
                                                                            }
                                                                            if (e2.wbill > maxbill) {
                                                                                maxbill = e2.wbill;
                                                                            }
                                                                            if (e2.gbill > maxbill) {
                                                                                maxbill = e.gbill;
                                                                            }
                                                                            if (e2.ibill > maxbill) {
                                                                                maxbill = e.ibill;
                                                                            }
                                                                            if (e2.ibill > maxbill) {
                                                                                maxbill = e.ibill;
                                                                            }

                                                                            found = false;

                                                                            lmao++;
                                                                        }
                                                                        if (found == true) {
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "No record for the consumer id: "
                                                                                            + consumerid
                                                                                            + " In the record: "
                                                                                            + filename);
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println("");

                                                                        }

                                                                    } else {
                                                                        System.out.println("");
                                                                        System.out.println(
                                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("");
                                                                        System.out.println(
                                                                                "File not found for the month: " + month
                                                                                        + "  of the year: "
                                                                                        + String.valueOf(i));
                                                                        System.out.println("");
                                                                        System.out.println(
                                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                        System.out.println("");
                                                                    }

                                                                } catch (FileNotFoundException e2) {
                                                                    System.out.println("No Record Found Exception! ");
                                                                    e2.printStackTrace();
                                                                } catch (ClassNotFoundException e2) {
                                                                    System.out.println("Class not found exception");
                                                                    e2.printStackTrace();
                                                                }

                                                            }
                                                            // write answer here

                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println("The maximum bill in the block: "
                                                                    + char_sector + " for year " + String.valueOf(i)
                                                                    + " is : " + maxbill);
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println("The minimum bill in the block: "
                                                                    + char_sector + " for the year " + String.valueOf(i)
                                                                    + " is : " + minbill);
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                            found = false;
                                                            al2.clear();

                                                        }

                                                    }
                                                }
                                            } else {
                                                System.out.println("");
                                                System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println("");
                                                System.out.println("File of the month: " + month + " of the year: "
                                                        + startingyear + " not found!");
                                                System.out.println("");
                                                System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println("");
                                            }

                                        } catch (FileNotFoundException e) {
                                            System.out.println("No Record Found Exception! ");
                                            e.printStackTrace();
                                        } catch (ClassNotFoundException e) {
                                            System.out.println("Class not found exception");
                                            e.printStackTrace();
                                        }

                                    } else {

                                        System.out.println("Enter the sector in between A and J! ");

                                    }

                                    break;
                                case 3: // maximum or minimum of a specific sub-block
                                    break;
                                case 4: // maximum or minimum of a street
                                    break;
                                case 5: // maximum or minimum of a house
                                    break;
                            }

                        } while (alpha4 != 0);

                    }

                    check = true;
                    break;

                // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 5:
                    String lmaopath = "";
                    String lmaopath2 = "";
                    Scanner intobj = new Scanner(System.in);
                    Scanner strobj = new Scanner(System.in);

                    int a = 0;
                    int b = 0;
                    int utility = 0;
                    String stringstartingmonth = "";
                    String stringstartingyear = "";
                    found = false;
                    String utilityname = "";
                    check = true;
                    boolean check2 = true;

                    int beta = -1;
                    do {
                        System.out.println("");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("1. Month wise billing reports of a specific utility in a specific period");
                        System.out.println("2. Month wise billing reports of all the utilities in a specific period");
                        System.out.println("0. Go back");
                        System.out.println("");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("Option: ");
                        beta = intobj.nextInt();
                        System.out.println("");

                        switch (beta) {
                            case 1:
                                // Month wise billing reports of a specific utility in a specific period
                                System.out.println("Enter the starting month of the period: ");
                                startingmonth = intobj.nextInt();
                                System.out.println("Enter the starting year of the period: ");
                                startingyear = intobj.nextInt();
                                System.out.println("Enter the ending month of the period ");
                                endingmonth = intobj.nextInt();
                                System.out.println("Enter the ending year of the period: ");
                                endingyear = intobj.nextInt();
                                if (startingmonth > 12 || startingmonth < 1 || endingmonth < 1 || endingmonth > 12) {
                                    check = false;
                                }
                                if (startingyear < 2017 || endingyear < 2017 || startingyear > endingyear) {
                                    check2 = false;

                                }

                                System.out.println("Enter the consumerid: ");
                                consumerid = strobj.nextLine();
                                System.out.println("");
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Select the utility: ");
                                System.out.println("1. Electricity");
                                System.out.println("2. Water");
                                System.out.println("3. Gas");
                                System.out.println("4. Phone");
                                System.out.println("5. Internet");
                                System.out.println("Option: ");
                                utility = intobj.nextInt();
                                System.out.println("");
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("");

                                if (utility == 1 || utility == 2 || utility == 3 || utility == 4 || utility == 5) {
                                    switch (utility) {
                                        case 1:
                                            utilityname = "Electricity";
                                            break;
                                        case 2:
                                            utilityname = "Water";
                                            break;
                                        case 3:
                                            utilityname = "Gas";
                                            break;
                                        case 4:
                                            utilityname = "Phone";
                                            break;
                                        case 5:
                                            utilityname = "Net";
                                            break;
                                    }
                                    if (check == true) {
                                        for (int i = startingyear; i <= endingyear; i++) {

                                            if (i == endingyear) {
                                                a = endingmonth;
                                            } else {
                                                a = 12;
                                            }
                                            if (b != 0 && i != endingyear) {
                                                startingmonth = 1;
                                            }
                                            for (int k = startingmonth; k <= a; k++) {

                                                if (k <= 9) {
                                                    stringstartingmonth = "0" + String.valueOf(k);
                                                } else {
                                                    stringstartingmonth = String.valueOf(k);
                                                }
                                                filename = stringstartingmonth + " " + String.valueOf(i) + ".txt";
                                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                                try {
                                                    File file = new File(path);
                                                    if (file.isFile()) {
                                                        al.clear();
                                                        ois = new ObjectInputStream(new FileInputStream(file));
                                                        al = (ArrayList<Employeee>) ois.readObject();
                                                        ois.close();
                                                        li = al.listIterator();
                                                        while (li.hasNext()) {
                                                            Employeee e = (Employeee) li.next();
                                                            if (Objects.equals(e.empno, consumerid)) {
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println("Data for the consumer id: "
                                                                        + consumerid + " In the month: "
                                                                        + stringstartingmonth + " for the year: "
                                                                        + String.valueOf(i) + " for the utility: "
                                                                        + utilityname + " is as follows: ");
                                                                System.out.println(" ");
                                                                switch (utility) {
                                                                    case 1:
                                                                        System.out.println(
                                                                                "The reading of your " + utilityname
                                                                                        + " meter is: " + e.ereading);
                                                                        System.out.println(
                                                                                "The bill generated of the utility: "
                                                                                        + utilityname + " is: "
                                                                                        + e.ebill);
                                                                        break;
                                                                    case 2:
                                                                        System.out.println(
                                                                                "The reading of your " + utilityname
                                                                                        + " meter is: " + e.wreading);
                                                                        System.out.println(
                                                                                "The bill generated of the utility: "
                                                                                        + utilityname + " is: "
                                                                                        + e.wbill);
                                                                        break;
                                                                    case 3:
                                                                        System.out.println(
                                                                                "The reading of your " + utilityname
                                                                                        + " meter is: " + e.greading);
                                                                        System.out.println(
                                                                                "The bill generated of the utility: "
                                                                                        + utilityname + " is: "
                                                                                        + e.gbill);
                                                                        break;
                                                                    case 4:
                                                                        System.out.println(
                                                                                "The reading of your " + utilityname
                                                                                        + " meter is: " + e.preading);
                                                                        System.out.println(
                                                                                "The bill generated of the utility: "
                                                                                        + utilityname + " is: "
                                                                                        + e.pbill);
                                                                        break;
                                                                    case 5:
                                                                        System.out.println(
                                                                                "The reading of your " + utilityname
                                                                                        + " meter is: " + e.ireading);
                                                                        System.out.println(
                                                                                "The bill generated of the utility: "
                                                                                        + utilityname + " is: "
                                                                                        + e.ibill);
                                                                        break;
                                                                }
                                                                System.out.println(" ");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");

                                                                found = true;
                                                            }
                                                        }
                                                        if (found == false) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "No record for the consumer id entered in the file "
                                                                            + filename);
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                        }
                                                        al.clear();
                                                    } else {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "File not found for the month: " + stringstartingmonth
                                                                        + " of the year: " + String.valueOf(i) + "! ");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                    }

                                                } catch (FileNotFoundException e) {
                                                    System.out.println("No Record Found Exception! ");
                                                    e.printStackTrace();
                                                } catch (ClassNotFoundException e) {
                                                    System.out.println("Class not found exception");
                                                    e.printStackTrace();
                                                }

                                            }
                                            b++;
                                        }
                                    }
                                    if (check2 == false) {
                                        System.out.println("");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("The starting year cannot be greater than the ending year");
                                        System.out.println("");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        check2 = true;
                                    }
                                    if (check == false) {
                                        System.out.println("");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("Invalid range of months!");
                                        System.out.println("");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        check = true;
                                    }

                                } else {
                                    System.out.println("");
                                    System.out.println(
                                            "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Invalid utility selected");
                                    System.out.println("");
                                    System.out.println(
                                            "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                }

                                break;
                            case 2:
                                // Month wise billing reports in a specific period
                                System.out.println("Enter the starting month of the period: ");
                                startingmonth = intobj.nextInt();
                                System.out.println("Enter the starting year of the period: ");
                                startingyear = intobj.nextInt();
                                System.out.println("Enter the ending month of the period ");
                                endingmonth = intobj.nextInt();
                                System.out.println("Enter the ending year of the period: ");
                                endingyear = intobj.nextInt();
                                if (startingmonth > 12 || startingmonth < 1 || endingmonth < 1 || endingmonth > 12) {
                                    check = false;
                                }
                                if (startingyear < 2017 || endingyear < 2017 || startingyear > endingyear) {
                                    check2 = false;

                                }

                                System.out.println("Enter the consumerid: ");
                                consumerid = strobj.nextLine();

                                if (check == true) {
                                    for (int i = startingyear; i <= endingyear; i++) {

                                        if (i == endingyear) {
                                            a = endingmonth;
                                        } else {
                                            a = 12;
                                        }
                                        if (b != 0 && i != endingyear) {
                                            startingmonth = 1;
                                        }
                                        for (int k = startingmonth; k <= a; k++) {

                                            if (k <= 9) {
                                                stringstartingmonth = "0" + String.valueOf(k);
                                            } else {
                                                stringstartingmonth = String.valueOf(k);
                                            }
                                            filename = stringstartingmonth + " " + String.valueOf(i) + ".txt";
                                            path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                            try {
                                                File file = new File(path);
                                                if (file.isFile()) {
                                                    al.clear();
                                                    ois = new ObjectInputStream(new FileInputStream(file));
                                                    al = (ArrayList<Employeee>) ois.readObject();
                                                    ois.close();
                                                    li = al.listIterator();
                                                    while (li.hasNext()) {
                                                        Employeee e = (Employeee) li.next();
                                                        if (Objects.equals(e.empno, consumerid)) {
                                                            System.out.println("");
                                                            System.out.println(
                                                                    "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");
                                                            System.out.println("Data for the consumer id: " + consumerid
                                                                    + " In the month: " + stringstartingmonth
                                                                    + " for the year: " + String.valueOf(i)
                                                                    + " is as follows: ");
                                                            System.out.println(" ");
                                                            Stringdisplay();
                                                            System.out.println(" ");
                                                            System.out.println(e);
                                                            System.out.println(" ");
                                                            System.out.println(
                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("");

                                                            found = true;
                                                        }
                                                    }
                                                    if (found == false) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "No record for the consumer id entered! in the file "
                                                                        + filename);
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");

                                                    }
                                                    al.clear();
                                                } else {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    System.out.println(
                                                            "File not found for the month: " + stringstartingmonth
                                                                    + " of the year: " + String.valueOf(i) + "! ");
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                }

                                            } catch (FileNotFoundException e) {
                                                System.out.println("No Record Found Exception! ");
                                                e.printStackTrace();
                                            } catch (ClassNotFoundException e) {
                                                System.out.println("Class not found exception");
                                                e.printStackTrace();
                                            }

                                        }
                                        b++;
                                    }
                                }
                                if (check2 == false) {
                                    System.out.println("");
                                    System.out.println(
                                            "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("The starting year cannot be greater than the ending year");
                                    System.out.println("");
                                    System.out.println(
                                            "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    check2 = true;
                                }
                                if (check == false) {
                                    System.out.println("");
                                    System.out.println(
                                            "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Invalid range of months!");
                                    System.out.println("");
                                    System.out.println(
                                            "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    check = true;
                                }

                                break;

                        }
                    } while (beta != 0);

                    break;

                // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 6:
                    consumerid = "";
                    int choice6 = -1;
                    check = true;
                    found = false;
                    int totalebill = 0;
                    int totalpbill = 0;
                    int totalwbill = 0;
                    int totalgbill = 0;
                    int totalibill = 0;

                    int ebilll = 0;
                    int gbilll = 0;
                    int ibilll = 0;
                    int wbilll = 0;
                    int pbilll = 0;
                    Scanner intsix = new Scanner(System.in);
                    Scanner strsix = new Scanner(System.in);
                    System.out.println("");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Enter the starting year of the report you want: ");
                    System.out.println("");
                    startingyear = intsix.nextInt();
                    System.out.println("");
                    System.out.println("Enter the ending year of the report you want: ");
                    System.out.println("");
                    endingyear = intsix.nextInt();
                    System.out.println(" ");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" ");
                    if (startingyear < 2017) {
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("The entered year cannot be less than 2017!");
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");

                        check = false;
                    }
                    if (endingyear < startingyear) {
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("The starting year cannot be greater than the ending year! ");
                        System.out.println("");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("");

                        check = false;
                    }
                    if (true == check) {
                        do {
                            System.out.println("");
                            System.out.println(
                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                            System.out.println("1. Get yearly report of the total bill of each customer");
                            System.out.println("2. Get half yearly report of the total bill of each customer");
                            System.out.println("0. Go Back");
                            System.out.println("");
                            System.out.println(
                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("");
                            System.out.println("Option: ");
                            choice6 = intsix.nextInt();

                            switch (choice6) {
                                case 1:
                                    System.out.println("");
                                    System.out.println(
                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");

                                    month = "01";
                                    filename = month + " " + String.valueOf(startingyear) + ".txt";
                                    path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                    try {
                                        File file = new File(path);
                                        if (file.isFile()) {
                                            ois = new ObjectInputStream(new FileInputStream(file));
                                            al = (ArrayList<Employeee>) ois.readObject();
                                            ois.close();
                                            li = al.listIterator();
                                            while (li.hasNext()) {
                                                Employeee e = (Employeee) li.next();
                                                consumerid = e.empno;

                                                for (int i = startingyear; i <= endingyear; i++) {
                                                    for (int k = 1; k <= 12; k++) {
                                                        if (k <= 9) {
                                                            month = "0" + String.valueOf(k);
                                                        } else {
                                                            month = String.valueOf(k);
                                                        }
                                                        filename = month + " " + String.valueOf(i) + ".txt";
                                                        path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;
                                                        year = String.valueOf(i);

                                                        try {
                                                            File file2 = new File(path);
                                                            if (file2.isFile()) {
                                                                ListIterator<Employeee> li2 = null;
                                                                ois = new ObjectInputStream(new FileInputStream(file2));
                                                                al2 = (ArrayList<Employeee>) ois.readObject();
                                                                ois.close();
                                                                li2 = al2.listIterator();
                                                                while (li2.hasNext()) {
                                                                    Employeee e2 = (Employeee) li2.next();
                                                                    if (Objects.equals(e2.empno, consumerid)) {
                                                                        ebilll = e2.ebill;
                                                                        gbilll = e2.gbill;
                                                                        ibilll = e2.ibill;
                                                                        pbilll = e2.pbill;
                                                                        wbilll = e2.wbill;

                                                                        totalebill = totalebill + ebilll;
                                                                        totalgbill = totalgbill + gbilll;
                                                                        totalibill = totalibill + ibilll;
                                                                        totalwbill = totalwbill + wbilll;
                                                                        totalpbill = totalpbill + pbilll;

                                                                        found = true;
                                                                    }
                                                                }
                                                                if (found == false) {
                                                                    System.out.println("");
                                                                    System.out.println(
                                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                    System.out.println("");
                                                                    System.out.println("No record for the consumer id: "
                                                                            + consumerid + " In the record: "
                                                                            + filename);
                                                                    System.out.println("");
                                                                    System.out.println(
                                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                    System.out.println("");

                                                                }

                                                            } else {
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println("File not found for the month: "
                                                                        + month + "  of the year: "
                                                                        + String.valueOf(i));
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                            }

                                                        } catch (FileNotFoundException e2) {
                                                            System.out.println("No Record Found Exception! ");
                                                            e2.printStackTrace();
                                                        } catch (ClassNotFoundException e2) {
                                                            System.out.println("Class not found exception");
                                                            e2.printStackTrace();
                                                        }

                                                    }
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    System.out.println("The yearly total bill of the consumer: "
                                                            + consumerid + " for the period " + startingyear + "-"
                                                            + endingyear + " is:");
                                                    System.out.println("");
                                                    System.out.println("Year: " + String.valueOf(i));
                                                    System.out.println("");
                                                    System.out.println("Total Electricity bill: " + totalebill);
                                                    System.out.println("Total Water bill: " + totalwbill);
                                                    System.out.println("Total Gas bill: " + totalgbill);
                                                    System.out.println("Total Phone bill: " + totalpbill);
                                                    System.out.println("Total Internet bill: " + totalibill);
                                                    System.out.println("");
                                                    System.out.println(
                                                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                    System.out.println("");
                                                    totalebill = 0;
                                                    totalpbill = 0;
                                                    totalwbill = 0;
                                                    totalgbill = 0;
                                                    totalibill = 0;
                                                    al2.clear();
                                                }

                                            }

                                        } else {
                                            System.out.println("");
                                            System.out.println(
                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("");
                                            System.out.println("File of the month: " + month + " of the year: "
                                                    + startingyear + " not found!");
                                            System.out.println("");
                                            System.out.println(
                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("");
                                        }

                                    } catch (FileNotFoundException e) {
                                        System.out.println("No Record Found Exception! ");
                                        e.printStackTrace();
                                    } catch (ClassNotFoundException e) {
                                        System.out.println("Class not found exception");
                                        e.printStackTrace();
                                    }

                                    break;
                                case 2:
                                    int alphacase2 = -1;
                                    do {
                                        System.out.println("");
                                        System.out.println(
                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("1. Get half Yearly reports of the first half of the years");
                                        System.out
                                                .println("2. Get half Yearly reports of the seccond half of the years");
                                        System.out.println("0. Go Back!");
                                        System.out.println("");
                                        System.out.println(
                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("Option: ");
                                        alphacase2 = intsix.nextInt();
                                        switch (alphacase2) {
                                            case 1:
                                                System.out.println("");
                                                System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println("");

                                                month = "01";
                                                filename = month + " " + String.valueOf(startingyear) + ".txt";
                                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                                try {
                                                    File file = new File(path);
                                                    if (file.isFile()) {
                                                        ois = new ObjectInputStream(new FileInputStream(file));
                                                        al = (ArrayList<Employeee>) ois.readObject();
                                                        ois.close();
                                                        li = al.listIterator();
                                                        while (li.hasNext()) {
                                                            Employeee e = (Employeee) li.next();
                                                            consumerid = e.empno;
                                                            for (int i = startingyear; i <= endingyear; i++) {
                                                                for (int k = 1; k <= 6; k++) {
                                                                    if (k <= 9) {
                                                                        month = "0" + String.valueOf(k);
                                                                    } else {
                                                                        month = String.valueOf(k);
                                                                    }
                                                                    filename = month + " " + String.valueOf(i) + ".txt";
                                                                    path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;
                                                                    year = String.valueOf(i);

                                                                    try {
                                                                        File file2 = new File(path);
                                                                        if (file2.isFile()) {
                                                                            ListIterator<Employeee> li2 = null;
                                                                            ois = new ObjectInputStream(
                                                                                    new FileInputStream(file2));
                                                                            al2 = (ArrayList<Employeee>) ois
                                                                                    .readObject();
                                                                            ois.close();
                                                                            li2 = al2.listIterator();
                                                                            while (li2.hasNext()) {
                                                                                Employeee e2 = (Employeee) li2.next();
                                                                                if (Objects.equals(e2.empno,
                                                                                        consumerid)) {
                                                                                    ebilll = e2.ebill;
                                                                                    gbilll = e2.gbill;
                                                                                    ibilll = e2.ibill;
                                                                                    pbilll = e2.pbill;
                                                                                    wbilll = e2.wbill;

                                                                                    totalebill = totalebill + ebilll;
                                                                                    totalgbill = totalgbill + gbilll;
                                                                                    totalibill = totalibill + ibilll;
                                                                                    totalwbill = totalwbill + wbilll;
                                                                                    totalpbill = totalpbill + pbilll;

                                                                                    found = true;
                                                                                }
                                                                            }
                                                                            if (found == false) {
                                                                                System.out.println("");
                                                                                System.out.println(
                                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                                System.out.println("");
                                                                                System.out.println(
                                                                                        "No record for the consumer id: "
                                                                                                + consumerid
                                                                                                + " In the record: "
                                                                                                + filename);
                                                                                System.out.println("");
                                                                                System.out.println(
                                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                                System.out.println("");

                                                                            }

                                                                        } else {
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "File not found for the month: "
                                                                                            + month + "  of the year: "
                                                                                            + String.valueOf(i));
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println("");
                                                                        }

                                                                    } catch (FileNotFoundException e2) {
                                                                        System.out
                                                                                .println("No Record Found Exception! ");
                                                                        e2.printStackTrace();
                                                                    } catch (ClassNotFoundException e2) {
                                                                        System.out.println("Class not found exception");
                                                                        e2.printStackTrace();
                                                                    }

                                                                }
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "The first half yearly total bill of the consumer: "
                                                                                + consumerid + " for the period "
                                                                                + startingyear + "-" + endingyear
                                                                                + " is:");
                                                                System.out.println("");
                                                                System.out.println("Year: " + String.valueOf(i));
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "Total Electricity bill: " + totalebill);
                                                                System.out.println("Total Water bill: " + totalwbill);
                                                                System.out.println("Total Gas bill: " + totalgbill);
                                                                System.out.println("Total Phone bill: " + totalpbill);
                                                                System.out
                                                                        .println("Total Internet bill: " + totalibill);
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                totalebill = 0;
                                                                totalpbill = 0;
                                                                totalwbill = 0;
                                                                totalgbill = 0;
                                                                totalibill = 0;
                                                                al2.clear();
                                                            }

                                                        }

                                                    } else {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println("File of the month: " + month
                                                                + " of the year: " + startingyear + " not found!");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                    }

                                                } catch (FileNotFoundException e) {
                                                    System.out.println("No Record Found Exception! ");
                                                    e.printStackTrace();
                                                } catch (ClassNotFoundException e) {
                                                    System.out.println("Class not found exception");
                                                    e.printStackTrace();
                                                }
                                                break;
                                            case 2:
                                                System.out.println("");
                                                System.out.println(
                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println("");

                                                month = "01";
                                                filename = month + " " + String.valueOf(startingyear) + ".txt";
                                                path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                                try {
                                                    File file = new File(path);
                                                    if (file.isFile()) {
                                                        ois = new ObjectInputStream(new FileInputStream(file));
                                                        al = (ArrayList<Employeee>) ois.readObject();
                                                        ois.close();
                                                        li = al.listIterator();
                                                        while (li.hasNext()) {
                                                            Employeee e = (Employeee) li.next();
                                                            consumerid = e.empno;

                                                            for (int i = startingyear; i <= endingyear; i++) {
                                                                for (int k = 6; k <= 12; k++) {
                                                                    if (k <= 9) {
                                                                        month = "0" + String.valueOf(k);
                                                                    } else {
                                                                        month = String.valueOf(k);
                                                                    }
                                                                    filename = month + " " + String.valueOf(i) + ".txt";
                                                                    path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;
                                                                    year = String.valueOf(i);

                                                                    try {
                                                                        File file2 = new File(path);
                                                                        if (file2.isFile()) {
                                                                            ListIterator<Employeee> li2 = null;
                                                                            ois = new ObjectInputStream(
                                                                                    new FileInputStream(file2));
                                                                            al2 = (ArrayList<Employeee>) ois
                                                                                    .readObject();
                                                                            ois.close();
                                                                            li2 = al2.listIterator();
                                                                            while (li2.hasNext()) {
                                                                                Employeee e2 = (Employeee) li2.next();
                                                                                if (Objects.equals(e2.empno,
                                                                                        consumerid)) {
                                                                                    ebilll = e2.ebill;
                                                                                    gbilll = e2.gbill;
                                                                                    ibilll = e2.ibill;
                                                                                    pbilll = e2.pbill;
                                                                                    wbilll = e2.wbill;

                                                                                    totalebill = totalebill + ebilll;
                                                                                    totalgbill = totalgbill + gbilll;
                                                                                    totalibill = totalibill + ibilll;
                                                                                    totalwbill = totalwbill + wbilll;
                                                                                    totalpbill = totalpbill + pbilll;

                                                                                    found = true;
                                                                                }
                                                                            }
                                                                            if (found == false) {
                                                                                System.out.println("");
                                                                                System.out.println(
                                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                                System.out.println("");
                                                                                System.out.println(
                                                                                        "No record for the consumer id: "
                                                                                                + consumerid
                                                                                                + " In the record: "
                                                                                                + filename);
                                                                                System.out.println("");
                                                                                System.out.println(
                                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                                System.out.println("");

                                                                            }

                                                                        } else {
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "File not found for the month: "
                                                                                            + month + "  of the year: "
                                                                                            + String.valueOf(i));
                                                                            System.out.println("");
                                                                            System.out.println(
                                                                                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println("");
                                                                        }

                                                                    } catch (FileNotFoundException e2) {
                                                                        System.out
                                                                                .println("No Record Found Exception! ");
                                                                        e2.printStackTrace();
                                                                    } catch (ClassNotFoundException e2) {
                                                                        System.out.println("Class not found exception");
                                                                        e2.printStackTrace();
                                                                    }

                                                                }
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "The secondhalf yearly total bill of the consumer: "
                                                                                + consumerid + " for the period "
                                                                                + startingyear + "-" + endingyear
                                                                                + " is:");
                                                                System.out.println("");
                                                                System.out.println("Year: " + String.valueOf(i));
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "Total Electricity bill: " + totalebill);
                                                                System.out.println("Total Water bill: " + totalwbill);
                                                                System.out.println("Total Gas bill: " + totalgbill);
                                                                System.out.println("Total Phone bill: " + totalpbill);
                                                                System.out
                                                                        .println("Total Internet bill: " + totalibill);
                                                                System.out.println("");
                                                                System.out.println(
                                                                        "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println("");
                                                                totalebill = 0;
                                                                totalpbill = 0;
                                                                totalwbill = 0;
                                                                totalgbill = 0;
                                                                totalibill = 0;
                                                                al2.clear();
                                                            }

                                                        }

                                                    } else {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                        System.out.println("File of the month: " + month
                                                                + " of the year: " + startingyear + " not found!");
                                                        System.out.println("");
                                                        System.out.println(
                                                                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println("");
                                                    }

                                                } catch (FileNotFoundException e) {
                                                    System.out.println("No Record Found Exception! ");
                                                    e.printStackTrace();
                                                } catch (ClassNotFoundException e) {
                                                    System.out.println("Class not found exception");
                                                    e.printStackTrace();
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid Entry!");
                                                break;
                                        }

                                    } while (alphacase2 != 0);
                                    break;
                                default:
                                    System.out.println("Invalid input!");
                                    break;

                            }

                        } while (choice6 != 0);
                    }
                    check = true;
                    break;

                // ------------------------------------------------------------------------------below----------------------------------------------------------------------------------------------

                case 7:

                    Scanner answerr = new Scanner(System.in);
                    Scanner strans = new Scanner(System.in);
                    int blockk = 0;
                    int subblockk = 0;
                    int streett = 0;
                    int housee = 0;
                    int floorr = 0;
                    boolean pls = true;

                    int answer = -1;
                    System.out.println("");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("WARNING!!!");
                    System.out.println(
                            "This option is only to be used to create the datafiles with the use of nested forloops!");
                    System.out
                            .println("If you want to proceed....Make sure to empty the record folder of the project!!");
                    System.out.println(
                            "Then change the value of Blocks ,subblocks , streets , houses , floors to get the number of users in your file that you want!");
                    System.out.println("");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Are you sure you want to continue?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("Option: ");
                    answer = answerr.nextInt();

                    System.out.println("Enter the range of Blocks you want(A-J):");
                    string_sector = strans.nextLine();
                    char_sector = string_sector.charAt(0);
                    switch (char_sector) {
                        case 'A':
                            blockk = 1;
                            break;
                        case 'a':
                            blockk = 1;
                            break;
                        case 'B':
                            blockk = 2;
                            break;
                        case 'b':
                            blockk = 2;
                            break;
                        case 'C':
                            blockk = 3;
                            break;
                        case 'c':
                            blockk = 3;
                            break;
                        case 'D':
                            blockk = 4;
                            break;
                        case 'd':
                            blockk = 4;
                            break;
                        case 'E':
                            blockk = 5;
                            break;
                        case 'e':
                            blockk = 5;
                            break;
                        case 'F':
                            blockk = 6;
                            break;
                        case 'f':
                            blockk = 6;
                            break;
                        case 'G':
                            blockk = 7;
                            break;
                        case 'g':
                            blockk = 7;
                            break;
                        case 'H':
                            blockk = 8;
                            break;
                        case 'h':
                            blockk = 8;
                            break;
                        case 'I':
                            blockk = 9;
                            break;
                        case 'i':
                            blockk = 9;
                            break;
                        case 'J':
                            blockk = 10;
                            break;
                        case 'j':
                            blockk = 10;
                            break;
                        default:
                            System.out.println("Sector out of range!");
                            pls = false;
                            break;
                    }
                    System.out.println("Enter the number of sublocks (1-4): ");
                    subblockk = answerr.nextInt();
                    if (subblockk < 1 || subblockk > 4) {
                        pls = false;
                        System.out.println("hisubblock");
                    }
                    System.out.println("Enter the number of streets (1-10): ");
                    streett = answerr.nextInt();
                    if (streett < 1 || streett > 10) {
                        pls = false;
                        System.out.println("street");
                    }
                    System.out.println("Enter the number of houses");
                    housee = answerr.nextInt();
                    if (housee < 1 || housee > 20) {
                        pls = false;
                        System.out.println("house");
                    }
                    System.out.println("Enter the floors you want in each house(0-2): ");

                    floorr = answerr.nextInt();
                    if (floorr < 0 || floorr > 2) {
                        System.out.println("floor");
                        pls = false;
                    }
                    if (pls == true) {

                        // auto file creation variables
                        fileyear = 2016;
                        filemonth = 0;
                        tempofilemonth = "";
                        filename = "";
                        lmao = 0;
                        int ereading = 0;
                        int preading = 0;
                        int wreading = 0;
                        int greading = 0;
                        int ireading = 0;
                        int previousEreading = 0;
                        int previousPreading = 0;
                        int previousWreading = 0;
                        int previousGreading = 0;
                        int previousIreading = 0;
                        int tempomonth = 0;
                        int tempoyear = 2017;

                        int[][][][][] adress = new int[10][4][10][20][3];
                        for (int t = 1; t <= 5; t++) {

                            fileyear++;
                            filemonth = 1;
                            for (int tt = 1; tt <= 12; tt++) {
                                lmao++;

                                if (filemonth < 10) {
                                    tempofilemonth = "0" + String.valueOf(filemonth);
                                } else {
                                    tempofilemonth = String.valueOf(filemonth);
                                }

                                if (1 != lmao) {
                                    tempomonth++;
                                }
                                System.out.println(tempomonth);

                                filename = tempofilemonth + " " + String.valueOf(fileyear) + ".txt";

                                // file creation......

                                File file = null;
                                try {
                                    path = "Z:\\Uni\\S2\\cbs\\records\\" + filename;

                                    file = new File(path);
                                    if (file.createNewFile()) {
                                        System.out.println("File created: " + file.getName());
                                    } else {
                                        System.out.println("File already exists.");
                                    }
                                } catch (IOException e) {
                                    System.out.println("An error occurred.");
                                    e.printStackTrace();
                                }

                                for (int i = 0; i < blockk; i++) {
                                    for (int j = 0; j < subblockk; j++) {
                                        for (int k = 0; k < streett; k++) {
                                            for (int l = 0; l < housee; l++) {
                                                for (int m = 0; m < floorr; m++) {

                                                    a = i + 1;
                                                    b = j + 1;
                                                    int c = k + 1;
                                                    int d = l + 1;

                                                    found = false;
                                                    String subsector = String.valueOf(b);
                                                    String floor = String.valueOf(m);
                                                    String sector = "";
                                                    street = "";
                                                    house = "";

                                                    if (a < 10) {
                                                        sector = "0" + String.valueOf(a);
                                                    }
                                                    if (a == 10) {
                                                        sector = String.valueOf(a);
                                                    }
                                                    if (c < 10) {
                                                        street = "0" + String.valueOf(c);
                                                    }
                                                    if (c == 10) {
                                                        street = String.valueOf(c);
                                                    }
                                                    if (d < 10) {
                                                        house = "0" + String.valueOf(d);
                                                    }
                                                    if (d >= 10) {
                                                        house = String.valueOf(d);
                                                    }
                                                    String empno = sector + subsector + street + house + floor;

                                                    String ename = null;
                                                    int eunits = 0;
                                                    int punits = 0;
                                                    int wunits = 0;
                                                    int gunits = 0;
                                                    int iunits = 0;

                                                    if (lmao == 1) {
                                                        System.out.println("peeeeeeee");
                                                        ename = randomname();
                                                        System.out.println(ename);
                                                        eunits = rand.nextInt(500);
                                                        punits = rand.nextInt(500);
                                                        wunits = rand.nextInt(5000);
                                                        gunits = rand.nextInt(500);
                                                        iunits = rand.nextInt(100);

                                                    } else {
                                                        month = "";
                                                        year = "";

                                                        if (tempomonth >= 13) {
                                                            tempomonth = 1;
                                                            tempoyear++;
                                                        }

                                                        if (tempomonth < 10) {
                                                            month = 0 + String.valueOf(tempomonth);
                                                            year = String.valueOf(tempoyear);
                                                        } else {
                                                            month = String.valueOf(tempomonth);
                                                            year = String.valueOf(tempoyear);

                                                        }

                                                        try {

                                                            String tempofilename = month + " " + year + ".txt";
                                                            String path1 = "Z:\\Uni\\S2\\cbs\\records\\"
                                                                    + tempofilename;

                                                            File file2 = new File(path1);
                                                            if (file2.isFile()) {
                                                                System.out.println("bhaiiii");

                                                                System.out.println(" ");
                                                                ois = new ObjectInputStream(new FileInputStream(file2));
                                                                al2 = (ArrayList<Employeee>) ois.readObject();
                                                                ois.close();
                                                                li = al2.listIterator();
                                                                while (li.hasNext()) {
                                                                    Employeee e = (Employeee) li.next();
                                                                    if (Objects.equals(e.empno, empno)) {
                                                                        ename = e.ename;
                                                                        previousEreading = e.ereading;
                                                                        previousPreading = e.preading;
                                                                        previousGreading = e.greading;
                                                                        previousWreading = e.wreading;
                                                                        previousIreading = e.ireading;
                                                                        found = true;
                                                                    }
                                                                }
                                                                if (found == false) {
                                                                    System.out.println(
                                                                            "Consumer id didnot match....couldnt get name");
                                                                }
                                                            } else {
                                                                System.out.println(" previous File not found! ");
                                                            }

                                                        } catch (FileNotFoundException e) {
                                                            System.out.println("No Record Found Exception! ");
                                                            e.printStackTrace();
                                                        } catch (ClassNotFoundException e) {
                                                            System.out.println("Class not found exception");
                                                            e.printStackTrace();
                                                        }

                                                    }

                                                    if (lmao == 1) {
                                                        ereading = eunits;
                                                        preading = punits;
                                                        wreading = wunits;
                                                        greading = gunits;
                                                        ireading = iunits;
                                                    } else {
                                                        ereading = previousEreading + rand.nextInt(500);
                                                        preading = previousPreading + rand.nextInt(500);
                                                        wreading = previousWreading + rand.nextInt(5000);
                                                        greading = previousGreading + rand.nextInt(500);
                                                        ireading = previousIreading + rand.nextInt(100);

                                                        System.out.println("Thisis ereading" + ereading);
                                                        System.out.println("Thisis prereading" + previousEreading);
                                                        eunits = ereading - previousEreading;
                                                        punits = preading - previousPreading;
                                                        wunits = wreading - previousWreading;
                                                        gunits = greading - previousGreading;
                                                        iunits = ireading - previousIreading;

                                                    }
                                                    int ebill = ebill_generator(eunits);
                                                    int wbill = wbill_generator(wunits);
                                                    int pbill = pbill_generator(punits);
                                                    int ibill = ibill_generator(iunits);
                                                    int gbill = gbill_generator(gunits);

                                                    // adding everything in the arraylist

                                                    al.add(new Employeee(empno, ename, ereading, preading, wreading,
                                                            greading, ireading, ebill, gbill, wbill, pbill, ibill));

                                                    System.out.println(al);

                                                }
                                            }
                                        }
                                    }
                                }

                                oos = new ObjectOutputStream(new FileOutputStream(file));
                                oos.writeObject(al);
                                al.clear();
                                oos.close();

                                filemonth++;

                            }
                        }
                    } else {
                        System.out.println("Invalid input values!");
                        System.out.println(blockk);
                        System.out.println(subblockk);
                        System.out.println(streett);
                        System.out.println(housee);
                        System.out.println(floorr);
                    }
                    break;
            }
        } while (choice != 0);

    }

    public static String randomname() {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomstring = "";
        int length = 5;

        Random rand = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int i = 0; i < text.length; i++) {
            randomstring += text[i];
        }
        return randomstring;
    }

    public static int ebill_generator(int eunits) {
        int bill = 0;
        int units = eunits;
        if (units < 100) {
            bill = units * 10;
        } else if (units < 200) {
            bill = 1000 + (units - 100) * 15;
        } else if (units < 300) {
            bill = 3000 + (units - 200) * 18;
        } else if (units > 300) {
            bill = units * 25;
        }
        return bill;
    }

    public static int wbill_generator(int wunits) {
        int units = wunits;
        Double bill1 = Double.valueOf(0);
        if (units <= 1000) {
            bill1 = Double.valueOf(400);
        } else if (units <= 2000) {
            bill1 = Double.valueOf(1000);
        } else if (units > 2000) {
            bill1 = 1000 + units * 1.5;
        }
        int bill = (int) Math.round(bill1);
        return bill;
    }

    public static int pbill_generator(int punits) {
        int units = punits;
        int bill = 0;
        Random rand = new Random();
        int phoneType = 1 + (rand.nextInt(2));
        if (phoneType == 1) {
            bill = units * 5;
        } else if (phoneType == 2) {
            bill = units * 10;
        }
        return bill;
    }

    public static int ibill_generator(int iunits) {
        int bill = 0;
        int units = iunits;
        bill = units * 10;
        return bill;
    }

    public static int gbill_generator(int gunits) {
        double units = gunits;
        double bill = Double.valueOf(0);
        double mmbtu = 0;
        double cubicHM = Double.valueOf(units / 100.0);

        if (cubicHM <= 0.5) {
            mmbtu = cubicHM * 954 / 281.7385;
            bill = 121 * mmbtu;
        } else if (cubicHM <= 1.0) {
            bill = 121 * (0.5 * 954 / 281.7385);
            bill += 300 * ((cubicHM - 0.5) * 954 / 281.7385);
        } else if (cubicHM <= 2.0) {
            bill = 300 * (1 * 954 / 281.7385);
            bill += 553 * ((cubicHM - 1) * 954 / 281.7385);
        } else if (cubicHM <= 3.0) {
            bill = 553 * (2 * 954 / 281.7385);
            bill += 738 * ((cubicHM - 2) * 954 / 281.7385);

        } else if (cubicHM <= 4.0) {
            bill = 738 * (3 * 954 / 281.7385);
            bill += 1107 * ((cubicHM - 3) * 954 / 281.7385);
        } else if (cubicHM > 4.0) {
            bill = 1107 * (4 * 954 / 281.7385);
            bill += 1460 * ((cubicHM - 4) * 954 / 281.7385);
        }
        int bill1 = (int) Math.round(bill);
        return bill1;
    }

    public static boolean blockauthentication(String a) {
        boolean answer = false;

        if (a.equals("A")) {
            answer = true;
        }
        if (a.equals("a")) {

            answer = true;
        }
        if (a.equals("B")) {
            answer = true;

        }
        if (a.equals("b")) {
            answer = true;

        }
        if (a.equals("C")) {
            answer = true;

        }
        if (a.equals("c")) {
            answer = true;

        }
        if (a.equals("D")) {
            answer = true;

        }
        if (a.equals("d")) {
            answer = true;

        }
        if (a.equals("E")) {
            answer = true;

        }
        if (a.equals("e")) {
            answer = true;

        }
        if (a.equals("F")) {
            answer = true;

        }
        if (a.equals("f")) {
            answer = true;

        }
        if (a.equals("G")) {
            answer = true;

        }
        if (a.equals("g")) {
            answer = true;

        }
        if (a.equals("H")) {
            answer = true;

        }
        if (a.equals("h")) {
            answer = true;

        }
        if (a.equals("I")) {
            answer = true;

        }
        if (a.equals("i")) {
            answer = true;

        }
        if (a.equals("J")) {
            answer = true;

        }
        if (a.equals("j")) {
            answer = true;

        }

        return answer;
    }

}
