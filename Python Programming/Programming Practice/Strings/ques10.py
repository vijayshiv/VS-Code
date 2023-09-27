def count_occurance_of_characters(str):
    char_dict = dict()

    for char in str:
        count = str.count(char)
        char_dict[char] = count
    
    return char_dict

str = input("Enter the string -> ")
print(count_occurance_of_characters(str))