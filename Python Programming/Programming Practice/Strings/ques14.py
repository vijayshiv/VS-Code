def even_length_words_in_string(str):
    str_in_list = list(str.split(" "))
    new_str = ""

    for word in str_in_list:
        if(len(word) % 2 == 0):
            new_str = new_str + " " + word

    return new_str

str = input("Enter the string -> ")
print(f'The new string is -> {even_length_words_in_string(str)}')