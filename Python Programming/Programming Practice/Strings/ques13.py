def reverse_word_in_string(str):
    str_list = list(str.split(" "))
    reverse_str = ""

    for word in str_list:
        reverse_str = word +" "+ reverse_str

    return reverse_str

str = input("Enter the sentence -> ")
print(f'The reverse is -> {reverse_word_in_string(str)}')


