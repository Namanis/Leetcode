# Leetcode
Leetcode problem solutions

## Running Java solutions

- **Compile & run a problem folder:** run the PowerShell helper which compiles all `.java` files in a folder and runs the `Main` class.

	```powershell
	powershell -ExecutionPolicy Bypass -File .\scripts\run-java.ps1 "Leetcode/arrays/Two Sum"
	```

- **Templates:** Copy the files from `Leetcode/Leetcode/template/` into a new problem folder as a starting point (`Main.java` and `Solution.java`).

If your `Main.java` uses a package statement, the helper will detect it and run the correct fully-qualified `Main` class.
