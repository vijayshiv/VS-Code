def last_position_of_substring(s1, s2):
    last_position = -1  # Initialize last_position to -1, indicating not found initially
    start = 0           # Initialize start index for searching

    while True:
        position = s1.find(s2, start)
        if position == -1:
            break  # Substring not found, exit the loop
        last_position = position
        start = position + 1

    return last_position

str1 = "This is my school and this is my name and what is this"
str2 = "and"
print(len(str1))
print(last_position_of_substring(str1, str2))