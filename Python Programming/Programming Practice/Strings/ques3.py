def insert_in_middle(s1, s2):
    mid = len(s1)//2
    x = s1[:mid]
    x = x + s2
    x = x + s1[mid:]
    return x
s1 = "pule"
s2 = "zz"

print(insert_in_middle(s1,s2))
