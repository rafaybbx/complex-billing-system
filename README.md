# Complex Billing System  

A robust **Java-based utility billing management system** that handles multiple utilities (**electricity, water, gas, internet, and phone services**) using **file handling** and **file-based data persistence**. Built with a **procedural programming approach**, this system efficiently manages billing operations through structured functions, ensuring **comprehensive billing management** and **detailed reporting capabilities**.
  



## 🚀 Features  

### ✅ Bill Management  
- Generate **new monthly utility bills**  
- Update existing bills for previous months  
- **Automatic bill calculations** based on meter readings  
- Multi-utility support: **Electricity, Water, Gas, Phone, Internet**  

### 🔍 Search and View Capabilities  
- View **complete consumer records** for specific months/years  
- **Search functionality:**  
  - By **Consumer ID**  
  - By **Address** (Block/Sector/Street/House/Floor)  
- Flexible viewing options:  
  - **Single month view**  
  - **Yearly view**  
  - **Custom date range view**  

### 📊 Analysis and Reporting  
- Maximum/Minimum bill analysis for:  
  - **Individual utilities**  
  - **Blocks/Sectors**  
  - **Streets**  
  - **Houses**  
- **Detailed monthly billing reports**  
- **Yearly and half-yearly summaries**  
- **Utility-specific consumption patterns**  

### 🏠 Address System Structure  
- **Hierarchical organization:**  
  - Sectors (**A-J**)  
  - Sub-sectors (**1-4**)  
  - Streets (**1-10**)  
  - Houses (**1-20**)  
  - Floors (**Ground, First, Second**)  



## 🛠 Installation  

### 1️⃣ Clone the Repository  
```bash  
 git clone https://github.com/yourusername/complex-billing-system.git  
```
### 2️⃣ Configure File Paths  
- Locate all file handling paths in the code  
- **Default path pattern:**  
```plaintext  
 Z:\Uni\S2\cbs\records\  
```
- Update these paths to match your system’s directory structure:  
```plaintext  
 C:\YourDirectory\billing-system\records\  
```


## 🚀 Initial Setup  

### 🏗 Automatic Record Creation  
The system includes an **automated data generation** feature:  

1. Launch the application  
2. Select **Option 7**: `"Auto file creation and random data entry loop"`  
3. Configure:  
   - Number of **Sectors** (A-J)  
   - Number of **Sub-sectors** (1-4)  
   - Number of **Streets** (1-10)  
   - Number of **Houses** (1-20)  
   - Number of **Floors**  

The system will **automatically generate records** based on your specifications, saving setup time.  

### 📂 Default Data Structure  
The default files include:  
✅ **4 Sectors** (A-D)  
✅ **4 Sub-sectors**  
✅ **4 Streets**  
✅ **4 Houses**  
✅ **2 Floors**  



## 📌 Requirements  
- **Java Development Kit (JDK) 8+**  
- **Sufficient disk space** for record storage  



## ▶️ Usage  

### 1️⃣ Compile the Java Files  
```bash  
javac practice.java  
```
### 2️⃣ Run the Application  
```bash  
java EmployeeDemo  
```
### 3️⃣ Navigate the **Menu-Driven Interface**  



## ⚠️ Important Notes  
- Ensure **file paths** are properly configured before running  
- Use the **automatic record creation** for initial setup  
- **Backup existing records** before making major changes  
- Maintain the **directory structure** for smooth file handling  



## 🤝 Contributing  
Want to contribute? **Fork this repository**, make changes, and submit a pull request!  



## 📜 License  

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.  


For any **issues or queries**, feel free to **open an issue** in the repository! 🚀  
