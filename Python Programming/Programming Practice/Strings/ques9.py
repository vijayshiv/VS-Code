def find_all_occurance(s1, s2):
    temp_s1 = s1.lower()
    s2_lower = s2.lower()

    count = 0  # Initialize a count variable to keep track of occurrences
    start = 0   # Initialize the starting index for searching

    while start < len(temp_s1):
        # Find the index of the first occurrence of the substring
        index = temp_s1.find(s2_lower, start)

        # If the substring is not found, break the loop
        if index == -1:
            break

        # If the substring is found, increment the count and update the starting index
        count += 1
        start = index + 1

    return count


s1 = input("Enter the string -> ")
s2 = input("Enter the string to be searched -> ")

print(f'The number of occurrences of "{s2}" in the sentence is {find_all_occurance(s1, s2)}')
