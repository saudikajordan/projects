import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



public class OnlineBillingSystem extends JFrame implements ActionListener {

    // Define the variables for storing the customer and product data
    private static List<Customer> customers = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    
    // Define the GUI components
    private JLabel titleLabel;
    private JTabbedPane tabbedPane;
    private JPanel customerPanel, productPanel, orderPanel;
    private JTable customerTable, productTable, orderTable;
    private JButton addCustomerButton, addProductButton, createOrderButton;

    // Constructor to create the GUI components
    public OnlineBillingSystem() {
        // Set the frame properties
        setTitle("Online Billing System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the title label
        titleLabel = new JLabel("Welcome to the Online Billing System!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Create the tabbed pane
        tabbedPane = new JTabbedPane();
        customerPanel = new JPanel();
        productPanel = new JPanel();
        orderPanel = new JPanel();
        tabbedPane.addTab("Customers", customerPanel);
        tabbedPane.addTab("Products", productPanel);
        tabbedPane.addTab("Orders", orderPanel);

        // Create the customer panel
        String[] customerColumns = {"ID", "Name", "Address", "Email"};
        Object[][] customerData = {};
        customerTable = new JTable(customerData, customerColumns);
        JScrollPane customerScrollPane = new JScrollPane(customerTable);
        customerPanel.setLayout(new BorderLayout());
        customerPanel.add(customerScrollPane, BorderLayout.CENTER);
        addCustomerButton = new JButton("Add Customer");
        addCustomerButton.addActionListener(this);
        customerPanel.add(addCustomerButton, BorderLayout.SOUTH);

        // Create the product panel
        String[] productColumns = {"ID", "Name", "Price"};
        Object[][] productData = {};
        productTable = new JTable(productData, productColumns);
        JScrollPane productScrollPane = new JScrollPane(productTable);
        productPanel.setLayout(new BorderLayout());
        productPanel.add(productScrollPane, BorderLayout.CENTER);
        addProductButton = new JButton("Add Product");
        addProductButton.addActionListener(this);
        productPanel.add(addProductButton, BorderLayout.SOUTH);

        // Create the order panel
        String[] orderColumns = {"ID", "Customer", "Product", "Quantity", "Total"};
        Object[][] orderData = {};
        orderTable = new JTable(orderData, orderColumns);
        JScrollPane orderScrollPane = new JScrollPane(orderTable);
        orderPanel.setLayout(new BorderLayout());
        orderPanel.add(orderScrollPane, BorderLayout.CENTER);
        createOrderButton = new JButton("Create Order");
        createOrderButton.addActionListener(this);
        orderPanel.add(createOrderButton, BorderLayout.SOUTH);

        // Add the title label and tabbed pane to the frame
        setLayout(new BorderLayout());
        add(titleLabel, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);

        // Load some initial data for testing purposes
        loadInitialData();

        // Display the frame
        setVisible(true);
    }

    // Main method to start the application
    public static void main(String[] args) {
        new OnlineBillingSystem();
    }

    // Method to load some initial customer and product data
    private static void loadInitialData() {
        customers.add(new Customer(1, "John Doe", "123 Main St", "johndoe@example.com" )
 }

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

public class OnlineBillingSystemGUI extends JFrame implements ActionListener {

    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    private JTable customerTable;
    private JTable productTable;
    private JTable orderTable;
    private JButton addCustomerButton;
    private JButton addProductButton;
    private JButton createOrderButton;

    public OnlineBillingSystemGUI() {
        // Initialize the customer, product, and order data
        customers = new ArrayList<Customer>();
        products = new ArrayList<Product>();
        orders = new ArrayList<Order>();

        // Set up the GUI
        setTitle("Online Billing System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create a tabbed pane to hold the customer, product, and order panels
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create the customer panel
        JPanel customerPanel = new JPanel(new BorderLayout());

        // Create the customer table
        customerTable = new JTable();
        customerPanel.add(new JScrollPane(customerTable), BorderLayout.CENTER);

        // Create the add customer button
        addCustomerButton = new JButton("Add Customer");
        addCustomerButton.addActionListener(this);
        customerPanel.add(addCustomerButton, BorderLayout.SOUTH);

        // Add the customer panel to the tabbed pane
        tabbedPane.addTab("Customers", customerPanel);

        // Create the product panel
        JPanel productPanel = new JPanel(new BorderLayout());

        // Create the product table
        productTable = new JTable();
        productPanel.add(new JScrollPane(productTable), BorderLayout.CENTER);

        // Create the add product button
        addProductButton = new JButton("Add Product");
        addProductButton.addActionListener(this);
        productPanel.add(addProductButton, BorderLayout.SOUTH);

        // Add the product panel to the tabbed pane
        tabbedPane.addTab("Products", productPanel);

        // Create the order panel
        JPanel orderPanel = new JPanel(new BorderLayout());

        // Create the order table
        orderTable = new JTable();
        orderPanel.add(new JScrollPane(orderTable), BorderLayout.CENTER);

        // Create the create order button
        createOrderButton = new JButton("Create Order");
        createOrderButton.addActionListener(this);
        orderPanel.add(createOrderButton, BorderLayout.SOUTH);

        // Add the order panel to the tabbed pane
        tabbedPane.addTab("Orders", orderPanel);

        // Add the tabbed pane to the main window
        getContentPane().add(tabbedPane);

        // Display the main window
        setVisible(true);
    }

    public static void main(String[] args) {
        new OnlineBillingSystemGUI();
    }

    // Customer class for storing customer data
    private class Customer {
        private int id;
        private String name;
        private String address;
        private String email;

        public Customer(int id, String name, String address, String email) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }
    // extended functionality//
//Allow customers to place orders through the GUI//
      import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OnlineBillingSystem extends JFrame implements ActionListener {
    // declare variables for GUI components
    private JLabel nameLabel, addressLabel, productLabel, quantityLabel, priceLabel;
    private JTextField nameField, addressField, productField, quantityField, priceField;
    private JButton orderButton;

    public OnlineBillingSystem() {
        // set up GUI components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        addressLabel = new JLabel("Address:");
        addressField = new JTextField(20);
        productLabel = new JLabel("Product:");
        productField = new JTextField(20);
        quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField(20);
        priceLabel = new JLabel("Price:");
        priceField = new JTextField(20);
        orderButton = new JButton("Place Order");

        // add GUI components to panel
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(productLabel);
        panel.add(productField);
        panel.add(quantityLabel);
        panel.add(quantityField);
        panel.add(priceLabel);
        panel.add(priceField);

        // add order button to panel and register action listener
        panel.add(orderButton);
        orderButton.addActionListener(this);

        // set up frame
        setTitle("Online Billing System");
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // get information from form fields
        String name = nameField.getText();
        String address = addressField.getText();
        String product = productField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        double price = Double.parseDouble(priceField.getText());

        // calculate total cost of order
        double total = quantity * price;

        // create new order object and add it to database
        Order order = new Order(name, address, product, quantity, price, total);
        Database.addOrder(order);

        // show confirmation dialog
        JOptionPane.showMessageDialog(this, "Order placed successfully!");
    }

    public static void main(String[] args) {
        new OnlineBillingSystem();
    }
}

               

                                   
