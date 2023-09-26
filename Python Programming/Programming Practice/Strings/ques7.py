# Given two strings, s1 and s2. Write a program to create a new string s3 made of the first char of s1, 
# then the last char of s2, Next, the second char of s1 and second last char of s2, and so on. 
# Any leftover chars go at the end of the result.

def concat_first_last_from_two_string(s1, s2):
    s1_length = len(s1)
    s2_length = len(s2)
    length = s1_length + s2_length
    result = ""

    # reverse s2
    s2 = s2[::-1]

    for i in range(length):
        if i < s1_length:
            result = result + s1[i]
        if i < s2_length:
            result = result + s2[i]
    return result


str1 = "abc"
str2 = "xyz"

print(f'The mixed string is {concat_first_last_from_two_string(str1, str2)}')