# Connect-4-Game
A console based Connect 4 game implemented in Java with clean game logic , board handling and win detection . 

---

## Features

- Two player local gameplay
- Customizable board size (rows and columns n>0)
- Text based grid rendered in the console
- Column based move input
- Automatic win detection:
  - Horizontal
  - Vertical
  - Diagonal (both directions)
- Uses only standard Java utilities (`java.util.Scanner`)

---

## Requirements

- Java JDK 8 or higher

---

## How to Run

- Start a new game from the menu.
- Enter the names of Player A and Player B.
- Choose the number of rows and columns for the board .
- Players take turns entering the column number where they want to drop their piece.
- The first player to connect four pieces in a row (horizontal, vertical, or diagonal) wins the game.
- Player Symbols
   - Player A → A ( Along with Name ) 
   - Player B → B ( Along with Name ) 
---

## Implementation Details

- The game board is implemented using a 2D String array to visually represent the grid.

- Rows and columns are scaled internally to display a structured Connect 4 arena in the console.

- After every move, the program checks all possible win conditions.

- User input is handled using Scanner from java.util.

---

## What I Learned

- Working with 2D arrays to model grid based games

- Implementing turn based game logic in Java

- Designing win detection algorithms for multiple directions

- Handling user input and managing game flow in a single program

---

### Compile
```bash
javac src/connect4.java
