def count_char_num_specialchr(str):
    str_to_list = list(str)
    digit = 0
    special_symbol = 0
    string = 0

    for character in str_to_list:
        if ord(character) < 48 or (57 < ord(character) < 65) or (90 < ord(character) < 97) or ord(character) > 122:
            special_symbol = special_symbol + 1
        elif ord(character) >= 48 and ord(character) < 58:
            digit = digit + 1
        else:
            string = string + 1
    dict = {'Number of character' : string, 'Number of digits': digit, 'Number of special symbols' : special_symbol}
    return dict

str = input("Enter the mixed string -> ")
ans_dict = count_char_num_specialchr(str)

for keys, values in ans_dict.items():
    print(f'{keys} -> {values}')