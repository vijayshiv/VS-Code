def reversing_a_string(str):
    reverse_str = ""

    for char in str:
        reverse_str = char + reverse_str

    return reverse_str

str = input("Enter the string here -> ")
print(f'The string is {str} and the reverse is {reversing_a_string(str)}')