
# Fast-Food Nutrition Database Program
## Summary
This program allows users to interact with a fast-food nutrition database by executing commands from an input file. Users can list all menu items, insert or delete food items by brand and name, print the lowest-calorie option, and rank items from least to most caloric. The program uses a binary search tree (BST) to manage and search data efficiently.

## How It's Made
Concepts Used: Data structures (BST, ArrayLists), file I/O, method-driven design, encapsulation, and a simulated command interface.

### Classes Overview

Main: The Main class provides a setup for reading and initializing the dataset, displays command instructions, and then hands control to the Parser. If the "list" command was used, Main outputs all items in the database.

  setListWasCalled: A helper method that tracks if the user has requested to list the database.

Parser: Parser is responsible for interpreting commands from an input file, validating them, and calling the relevant database operations within the BST. It streamlines the command interpretation and checks for formatting.

  process: Reads each line in the input file, parses valid commands, and discards redundant or         incorrectly formatted lines.
 
  operate_BST: Maps each command to its corresponding BST operation and provides detailed feedback     based on success or failure, including duplicate insertion tracking and error reporting for non-     existent items.

BST (Binary Search Tree): This class is used to store the FastFoodNutritionInfo objects, enabling efficient insertions, deletions, and calorie-based ranking.

  rankedCaloricPrint: Lists all items in ascending order of calories by traversing the tree, which     is useful for ranking options in a health-conscious way.

  getMin: Quickly retrieves the item with the lowest calorie count in the database, optimizing the     “PrintBestOption” command.

FastFoodNutritionInfo:This class holds details about each menu item, such as brand, item name, calories, and other nutritional data. It includes helper methods to retrieve item details based on user input.

  getFFNFromItemAndCompany: A factory-like method that searches the dataset for an item based on       brand and name, supporting validation and error handling.

# Lessons Learned
1. Data Structures in Practice: Implementing a BST for managing food items emphasized the efficiency    of sorted data structures, especially for calorie-based ranking and searching.

2. Error Handling and Command Parsing: Parsing text commands reinforced the importance of validating    user input and accounting for common errors, ensuring a smooth user experience without failures      due to incorrect inputs.

3. File I/O and Persistence: Writing results to an output file taught practical aspects of file I/O,     including the importance of closing resources and handling exceptions to ensure data integrity
