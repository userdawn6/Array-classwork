#Array-classwork
Algorithm for the code


1. Define a constant maxSize to limit the size of the array to 6.
2. Calculate the effective length n of the array as the minimum of the length of a and maxSize.
3. Create a new array truncatedArray with a length of n.
4. Copy the first n elements from a to truncatedArray.
5. Calculate the effective rotation distance d as d % n.
6. Create a new array rotatedArray with a length of n.
7. Copy elements from truncatedArray starting from index d to the end into rotatedArray starting from the beginning.
8. Copy the first d elements from truncatedArray to the remaining positions in rotatedArray.
9. Define a function arrayToString to convert the integer array to a string representation.
10. Print the string representation of the rotated array.
