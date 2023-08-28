# InvSys - Enhancing Business Efficiency through Effective Inventory Control.
---

## ABOUT:

```
So basically, it is a Desktop-Based Application that revolutionizes inventory control and sales management
 by merging Java, Swing, Jframe, and MySQL. It ensures efficient inventory management, real-time sales,
and insightful data analysis, boosting business efficiency and informed decision-making for lasting growth.
```

## NOTICE:

```
1. Positive change the path for storing the pdf. You will find it in the "Sales.java" inside "save order
and print Bill" button.
2. Databases need to be built for the same. Total tables used 5
```

## FEATURES & ADVANTAGES:

```
1. **Database Architecture:** The system operates on a foundation of four principal tables - Category,
Brand, Product, and Sales. These tables create an organized structure for efficient inventory data management.

2. **Category and Brand Control:** Users enjoy the ease of introducing new categories and brands,
providing structure to product organization and facilitating streamlined inventory handling.

3. **Product Oversight:** The Product module empowers users to seamlessly introduce new items,
 effectively associating categories and brands using JcomboBox. Essential details such as
 cost and selling prices, alongside stock quantities, are established.

4. **Product Enhancements and Deletions:** The system affords users the capacity to enhance
 product information, including cost price, selling price, and stock adjustments. The removal
 of products is also facilitated, preserving the accuracy of inventory records.

5. **Total Inventory Valuation:** Calculations provided by the system offer a comprehensive
 view of the entire inventory's financial value, enabling users to gauge the overall
significance of stocked items.

6. **Seamless Sales Transactions:** The Sales module furnishes a frictionless billing experience. Users have the
liberty to select items from the JcomboBox, input the desired quantity, and seamlessly incorporate these
 selections into the billing table.

7. **Quantity Validation:** The application implements rigorous validation of quantities, ensuring that values
are both positive and within the limits of available stock. Clear and informative messages are displayed for
items with zero stock.

8. **Prevention of Product Duplication:** To thwart inadvertent excess orders, the system implements
 a safeguard against the inclusion  of duplicate products in the sales table. Users receive prompts to
 modify quantities for existing entries.

9. **Data Persistence and Profit Calculation:** Upon activating the 'Save Order' functionality, the system
 dynamically updates stockquantities, records intricate sales specifics in the database, and generates an
 itemized bill. Additionally, the system incorporates profit calculation, providing a holistic
financial overview.

10. **Advanced Data Analytics:** The system's intuitive interface includes a range of comprehensive
 tables, presenting invaluable insights such as available stock levels, high-spending customers, repeat buyers,
and sales encompassing specific date ranges. This data empowers managers with informed decision-making tools.
```

## HOW TO RUN:

```
1. Download the Zip Folder
2. Extract the folder in your Preferred location
3. Open NetBeans IDE (Recommended)
4. Go to file and click on Open Project
5. Go to the path where you have extracted the project and then select the Extracted 
   Folder and double click it
6. Now, select the Project(InventoryMaster) and click Open
7. It wil be configured in your IDE
8. Now, just right-click the project and click on run file
9. Thats it! the Software Opens
```

## WHAT HAVE I LEARNT FROM THE PROJECT:

```
From the project, I learned several important skills and concepts including:

Technical Proficiency: You've acquired proficiency in Java programming, Java Swing, Jframe,
 and MySQL database management, enhancing your ability to create robust applications.

User Interface Design: Developing the user interface with Java Swing and Jframe has provided
you with hands-on experience in designing intuitive and user-friendly interfaces.

Database Integration: Working with MySQL has given you practical knowledge of database design,
 data storage, and retrieval, crucial for building data-driven applications.

Inventory Management Concepts: You've deepened your understanding of inventory management
principles, including categorization, stock control, product updates, and sales tracking.

Validation and Error Handling: Implementing quantity validation and error messages demonstrates
your skill in ensuring data accuracy and enhancing user experience.

Data Analysis: Creating tables for available stocks, high-spending buyers, and sales analysis
 showcases your ability to extract insights from data and present them visually.

Problem-Solving: Overcoming challenges like preventing duplicate product entries and handling
zero stock scenarios has honed your problem-solving abilities.

Project Management: Successfully completing this project signifies your capability to plan,
execute, and deliver a comprehensive software solution.

Business Implications: You've gained an appreciation for the impact of efficient inventory
management on business operations, efficiency, error reduction, and growth.

Decision-Making: Your project's reporting and analytics capabilities underscore the importance
of data-driven decision-making for business success.
```

## BUGS AND FIXES:

```
1. Product Name should be unique
2. Customer Name should be unique
3. No checkings are done for Phone Number
```

