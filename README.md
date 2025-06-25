# 🛡️ PasswordAnalyzer
A simple Java-based password analysis tool that checks how secure or predictable a password might be.

---

## ✅ Features
- Checks if the password contains:
   - A known first name (Namelist.txt)
   - A common dictionary word (Duden.txt)
   - A 4-digit year (e.g., 1999, 2024)
   - Special characters (Character.txt)
   - Uppercase letters (Letters.txt)
     
- Modular code design

- Uses external .txt files for scalable checks

- Console-based interface (CLI)

- Written in plain Java (no libraries)

---

## 📂 File Structure
- Main.java – Starts the analysis
- NameCheck.java – Checks against common names
- DudenCheck.java – Checks against dictionary words
- YearCheck.java – Detects years
- CharacterCheck.java – Scans for special characters
- BigLettersCheck.java – Detects uppercase characters
- src/Namelist.txt, Duden.txt, etc. – Contain word/char lists

---

## 📌 Example Output
Password: Julia2004!
Name Found: true
Found in Duden: false
Found Year: true
Has Special Character: true
Has big Letters: true

---

## 🚧 Planned Features
-  Password strength rating (e.g., 1–10)

- Suggestions for stronger passwords

- GUI (optional)

---

## 🙋‍♂️ About
This tool was developed by Jason Belzek as part of a personal learning project focused on password security and Java fundamentals.
It’s a work in progress — feel free to explore, test, or suggest ideas!

---

## 📦 Tech Stack
- Java 17+
- Console Input via Scanner
- File parsing with java.io.File
- Modular design
