def separate_lower_upper(str):
    l = list(str)

    resupper = []
    reslower = []
    for i in range(len(l)):
        if 'A' <= l[i] <= 'Z':
            resupper.append(l[i])
        else:
            reslower.append(l[i])
    result = reslower + resupper

    # Convert the list to a string
    result_str = ''.join(result)
    return result_str


def better_separate_lower_upper(input_str):
    reslower = [char for char in input_str if 'a' <= char <= 'z']
    resupper = [char for char in input_str if 'A' <= char <= 'Z']
    result_str = ''.join(reslower + resupper)
    return result_str


str = "baJKJbnJljkLBNMbHmnsJKsd"

print(separate_lower_upper(str))