# 203. Remove Linked List Elements
Easy

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example :
![](https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg)
```java
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
```

Example :
```java
Input: head = [], val = 1
Output: []
```

Example :
```java
Input: head = [7,7,7,7], val = 7
Output: []
```

Constraints:
- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50
