
/* Project: Online Grocery Store
* File: Main.java
* Author: Matthew Hui, Jordon Medeiros, Ryan Luo
* Description: This is the main class of the grocery store this connect and run all the funcition of each class
* Date: Nov. 24, 2021
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    // variable and constants
    final int MAX_ACC = 1000;
    final int INTIAL_ACCOUNT = 0;
    boolean login = true;
    boolean keyCorrect = false;
    boolean usernameFound = false;
    boolean passwordC = false;
    boolean shopping = true;
    boolean costService = true;
    boolean shopMenu = true;
    int accountAmount = INTIAL_ACCOUNT;
    int accountNum = 0;
    double asset = 0;
    final String TEST_KEY = "d";
    final String NEW_ACCOUNT_KEY = "n";
    final String LOGIN_KEY = "c";
    final String SHOPPING_KEY = "s";
    final String ADD_ORDER_KEY = "a";
    final String CANCEL_ORDER_KEY = "r";
    final String STATUS_KEY = "s";
    final String CONFIRM_ORDER_KEY = "c";
    final String CUSTOMER_SERVICE_KEY = "c";
    final String CUSTOMER_STATUS_KEY = "a";
    final String ADMIN_KEY = "m";
    final String LOGOUT_KEYS = "e";
    final String FIND_PROCUCT_KEY = "f";
    Account[] accounts = new Account[MAX_ACC];
    ArrayList<Double> buy = new ArrayList<Double>();
    ArrayList<Double> sell = new ArrayList<Double>();
    double assetStore;
    Scanner sc = new Scanner(System.in);
    Employee employees[] = new Employee[MAX_ACC];
    employees[0] = new Employee("Cryptkiller", "334096005", "railing matthew", 14.69, 8, "Hire");
    CustomerService customerService = new CustomerService();
    // intial value
    buy.add(99.9);
    sell.add(99.9);
    int amountOfItem = 0;

    // Intial account
    accounts[0] = new Account("1234", "M2J3B5", "MRJ", 123456789, "1234", new Cart(),
        new Profit(sell, buy, 1000000000, amountOfItem));

    // fill all employee slot
    for (int i = 1; i < MAX_ACC; i++) {
      employees[i] = new Employee("", "", "", 0, 0, "");
    }

    // String name, String id, String role, double wage, int hoursWorked, char
    // employeeStatus

    // Grocery store
    // While loop that keep user in the store
    while (login) {

      // While loop that check for correct input
      keyCorrect = false;
      boolean admin = false;
      admin = false;
      while (!keyCorrect) {

        // Promt user for decision
        lineSeperate();
        System.out.println("Press " + NEW_ACCOUNT_KEY + " to create a new account");
        System.out.println("Press " + LOGIN_KEY + " to login to exist account");
        System.out.println("Press " + ADMIN_KEY + " to login as admin.");
        System.out.println("Enter key:");
        String key = sc.nextLine();

        // If statement that check user's decision
        // This if statement is to create new acount
        if (key.equals(NEW_ACCOUNT_KEY)) {
          // Update the amount of account
          accountAmount++;
          accountNum = accountAmount;

          // Create new account and promt user for info
          lineSeperate();
          System.out.println("Enter username:");
          String accountName = sc.nextLine();
          System.out.println("Enter postal code:");
          String postalCode = sc.nextLine();
          System.out.println("Enter address:");
          String address = sc.nextLine();
          System.out.println("Enter credit card number:");
          int creditCardNum = sc.nextInt();
          System.out.println("Enter password:");
          String password = sc.nextLine();
          password = sc.nextLine();
          System.out.println("Enter budget:");
          asset = sc.nextDouble();

          // declare new account
          accounts[accountAmount] = new Account(accountName, postalCode, address, creditCardNum, password, new Cart(),
              new Profit(sell, buy, asset, amountOfItem));

          // Display succesful message to user
          lineSeperate();
          System.out.println("Account have been created");

          // exist loop
          keyCorrect = true;

          // Testing if statement
        } else if (key.equals(TEST_KEY)) {
          accounts[0].d();
          shopMenu = false;

          // This if statement is to login to existing accounting
        } else if (key.equals(LOGIN_KEY)) {

          // While loop that will run till existing username is inputted
          usernameFound = false;
          while (!usernameFound) {
            // Promt user for account name
            lineSeperate();
            System.out.println("Enter Username:");
            String username = sc.nextLine();

            // This will check is ther exist username that match user input
            for (int i = 0; i <= accountAmount; i++) {

              // Received stored username
              String usernameC = accounts[i].getAccountName();

              // Check does username match
              if (username.equals(usernameC)) {

                // store array number for match username
                accountNum = i;
                usernameFound = true;
              }
            }
          }

          // method to check is password keyCorrect
          passwordC = false;
          while (!passwordC) {
            System.out.println("Enter password:");
            String password = sc.nextLine();
            passwordC = accounts[accountNum].password(password);
          }
          System.out.println("");
          passwordC = false;

          // exist loop
          keyCorrect = true;
        } else if (key.equals(ADMIN_KEY)) {
          usernameFound = false;
          while (!usernameFound) {
            // Admin login
            System.out.println("Enter admin username:");
            String username = sc.nextLine();

            // This will check is ther exist username that match user input

            // Received stored username
            String usernameC = accounts[0].getAccountName();

            // Check does username match
            if (username.equals(usernameC)) {

              // store array number for match username
              usernameFound = true;
            } else {
              System.out.println("Username does not exist.");
            }

          }
          // method to check is password keyCorrect
          passwordC = false;
          while (!passwordC) {
            System.out.println("Enter password:");
            String password = sc.nextLine();
            passwordC = accounts[0].password(password);
          }
          System.out.println("");
          passwordC = false;
          boolean exit = false;
          while (!exit) {

            // Admin command
            lineSeperate();
            System.out.println("What do u want to do:");
            System.out.println("Press 1 to find employee");
            System.out.println("Press 2 to fire employee");
            System.out.println("Press 3 to hire employee");
            System.out.println("Press 4 to look employee");
            System.out.println("Press 5 to exit");
            String cmd = sc.nextLine();
            String id;
            if (cmd.equals("1")) {
              lineSeperate();
              System.out.println("give id");
              id = sc.nextLine();
              if (employees[0].findEmployee(employees, id)) {
                System.out.println("Employee exists");
              } else {
                System.out.println("Employee does not exists");
              }
            } else if (cmd.equals("2")) {
              lineSeperate();
              System.out.println("give id");
              id = sc.nextLine();
              if (employees[0].findEmployee(employees, id)) {
                employees[0].fire(employees, id);
              System.out.println("Employee been fired");
              }else{
                System.out.println("Employee does not exist");
              }
            } else if (cmd.equals("3")) {
              lineSeperate();
              System.out.println("Enter name of employee to be hired");
              String name = sc.nextLine();
              System.out.println("Enter id:");
              id = sc.nextLine();
              System.out.println("Enter  role:");
              String role = sc.nextLine();
              System.out.println("Enter wage:");
              double wage = sc.nextDouble();
              System.out.println("Enter  hours worked:");
              int hourWorked = sc.nextInt();

              // declare employee
              employees[0].hire(employees, name, id, role, wage, hourWorked, "hire");
              System.out.println("Employee been hired"); 
            } else if (cmd.equals("4")) {
              lineSeperate();
              employees[0].listEmployees(employees);
            }else if (cmd.equals("5")) {
              lineSeperate();
              exit = true;
            }
          }

          admin = true;
        }

        if (!admin) {
          // Reset boolean so while loop will check for correct key

          // While loop that will run till user wants to exist
          shopMenu = true;
          while (shopMenu) {

            // Prompt user for decistion
            lineSeperate();
            System.out.println("Press " + SHOPPING_KEY + " for shop");
            System.out.println("Press " + CUSTOMER_SERVICE_KEY + " for customer service");
            System.out.println("Press " + CUSTOMER_STATUS_KEY + " for asset status");
            System.out.println("Press " + LOGOUT_KEYS + " to logout");
            System.out.println("Enter key:");
            key = sc.nextLine();

            // If statement that checks user decision
            // If statement if user want to shop
            if (key.equals(SHOPPING_KEY)) {

              // set boolean for shopping to true so user can order till they ordered enough
              shopping = true;

              // while loop that will keep user shopping till exist
              while (shopping) {

                // Prompt and tell user the function possible
                lineSeperate();
                System.out.println("Press " + ADD_ORDER_KEY + " to add order.");
                System.out.println("Press " + CANCEL_ORDER_KEY + " to remove order");
                System.out.println("Press " + STATUS_KEY + " to see order");
                System.out.println("Press " + FIND_PROCUCT_KEY + " for find product");
                System.out.println("Press " + CONFIRM_ORDER_KEY + " to confirm order");
                System.out.println("Enter key:");
                key = sc.nextLine();

                // If statement that check user's decision
                // If statement for user add order
                if (key.equals(ADD_ORDER_KEY)) {
                  lineSeperate();
                  accounts[accountNum].addOrder();

                  // If statement for cancel orders
                } else if (key.equals(CANCEL_ORDER_KEY)) {
                  lineSeperate();
                  accounts[accountNum].cancelOrder();

                  // If statement for user to see orders
                } else if (key.equals(STATUS_KEY)) {
                  lineSeperate();
                  accounts[accountNum].status();

                  // If statement for user to confirm and submit their order
                } else if (key.equals(CONFIRM_ORDER_KEY)) {
                  lineSeperate();
                  // store both stock and sell price
                  buy = accounts[accountNum].getItemBuyCost();
                  sell = accounts[accountNum].getItemSellCost();
                  assetStore = accounts[accountNum].getAsset();
                  System.out.println(assetStore);
                  amountOfItem = accounts[accountNum].getNumberOfItems();

                  // create a array for profit to store stock and sell price
                  accounts[accountNum].setRevenue(sell);
                  accounts[accountNum].setCostOfGoods(buy);
                  accounts[accountNum].setAsset(assetStore);
                  accounts[accountNum].setNumOfCOG(amountOfItem);

                  // let user exist the shopping section
                  shopping = false;
                
                //If statement for user to find product
                }else if(key.equals(FIND_PROCUCT_KEY)){
                  accounts[accountNum].productFind();
                
                  // Testing if statement
                } else if (key.equals(TEST_KEY)) {
                  accounts[0].d();
                }
              }

              // If statement for customer service
            } else if (key.equals(CUSTOMER_SERVICE_KEY)) {

              // While loop run till user finish their request at customer service
              costService = true;
              while (costService) {
                // RYAN EDIT THIS STUFF++++++++++++++++++++++++++++++++++++ ^^^^'
                lineSeperate();
                System.out.println("Enter r to return item");
                System.out.println("Enter c to file a complain");
                System.out.println("Enter e to report employee");
                System.out.println("Enter n to change user profile");
                System.out.println("Enter o to recyle clothing");
                System.out.println("Enter f to check food expire or not");
                System.out.println("Enter l to exit customer service");
                System.out.println("Enter command:");
                String command = sc.nextLine();
                lineSeperate();
                if(command.equals("r")){
                    customerService.returnItem();
                }else if(command.equals("c")){  
                    customerService.fileComplaint();
                }else if(command.equals("e")){
                    customerService.reportEmployee(employees);
                }else if(command.equals("n")){
                    customerService.changeUserProfile(accounts, accountNum);
                }else if(command.equals("l")){
                  costService = false;
                }else if(command.equals("o")){
                  customerService.recycle();
                }else if(command.equals("f")){
                  customerService.expired();
                }
              }

              // If statement that shows the asset status of the user
            } else if (key.equals(CUSTOMER_STATUS_KEY)) {
              accounts[accountNum].cStatus();

              // If statement that login admin account to check profit gain form customer
              // purchase

            } else if (key.equals(ADMIN_KEY)) {
              usernameFound = false;
              while (!usernameFound) {
                // Admin login
                lineSeperate();
                System.out.println("Enter admin username:");
                String username = sc.nextLine();

                // This will check is ther exist username that match user input

                // Received stored username
                String usernameC = accounts[0].getAccountName();

                // Check does username match
                if (username.equals(usernameC)) {

                  // store array number for match username
                  usernameFound = true;
                } else {
                  System.out.println("Username does not exist.");
                }

              }
              // method to check is password keyCorrect
              passwordC = false;
              while (!passwordC) {
                System.out.println("Enter password:");
                String password = sc.nextLine();
                passwordC = accounts[0].password(password);
              }
              System.out.println("");
              passwordC = false;
              accounts[accountNum].oStatus(employees, MAX_ACC);
            } else if (key.equals(LOGOUT_KEYS)) {
              shopMenu = false;
              lineSeperate();
              System.out.println("Logout successful");
              lineSeperate();

              // Testing if Statement
            } else if (key.equals(TEST_KEY)) {
              accounts[0].d();
            }

          }
        }

      }
    }

  }

  public static void lineSeperate() {
    System.out
        .println("\n-----------------------------------------------------------------------------------------------\n");
  }
}