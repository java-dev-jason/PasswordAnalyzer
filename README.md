# 🔐 Java Password Strength Analyzer
A console-based Java program that analyzes the strength of a given password using common-sense heuristics and wordlists. The program checks if the password contains names, dictionary words, years, special characters, and capital letters, then rates it from 1 to 5.

---

## 🚀 Features
🔍 Name Detection — Checks if the password contains a common name (from Namelist.txt)

📖 Dictionary Check — Searches for German words (via Duden.txt)

📅 Year Pattern Matching — Detects if a year (e.g. 1989, 2003) is used

✨ Special Character Detection — Boosts strength if special symbols are used

🔠 Capital Letter Check — Rewards use of uppercase letters

📊 Password Strength Rating — Final score from 1 (weak) to 5 (strong)

---
## 🧠 How it works

| Criteria                    | Effect on Rating |
| --------------------------- | ---------------- |
| Name found in list          | −1               |
| Word found in dictionary    | −1               |
| Year (e.g. 1989) found      | −1               |
| Contains special characters | +1               |
| Contains uppercase letters  | +1               |

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
Name Found: false
Found in Duden: false
Found Year: false
Has Special Character: true
Has big Letters: true
Your password is a: 5/5

---

## 🛠 Getting Started
Clone the repository

Place the wordlist .txt files in the src/ directory

Compile and run the program:

bash
Kopieren
javac Main.java
java Main
Enter a password when prompted and see the analysis.

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
