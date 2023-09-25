def get_middle_name(str):
    mid = len(str)//2
    return str[mid - 1] + str[mid] + str[mid + 1]

str = "jasonay"
print(get_middle_name(str))

    