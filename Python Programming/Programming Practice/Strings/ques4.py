def custom_sort_string(input_str):
    # Convert the string to a list of characters
    char_list = list(input_str)

    # Sort the list based on custom comparison
    char_list.sort(key=lambda x: (ord(x) >= ord('A'), x))

    # Convert the sorted list back to a string
    sorted_str = ''.join(char_list)

    return sorted_str


# Example usage:
input_string = "AbCdefGhIjK"
result = custom_sort_string(input_string)
print(result)
