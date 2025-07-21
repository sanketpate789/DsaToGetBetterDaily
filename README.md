# DsaToGetBetterDaily
21th july 2025 
question found deficult was of buildings 
## 📌 Problem Statement

Given an array of integers where each number represents the height of a building, print the buildings as a
 **vertical histogram** using stars (`*`). Each star represents one unit of height.

## ✅ Final Approach

1. **Find the maximum height** in the array.
2. **Loop down from that height** to 1 (think top to bottom).
3. For each row:
    - Check every element in the array:
        - If the value is **greater than or equal to the current level**, print `*`.
        - Otherwise, print spaces for alignment.
4. Move to the **next line** after each row.

---

