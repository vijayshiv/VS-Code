n = int(input("Enter the number - "))
sp = n -1
st = 1

for i in range(0, n):
    for j in range(0, sp):
        print("  ", end=" ")

    sp = sp - 1
    for k in range(0,st):
        print("* " ,end=" ")
    st = st + 1

    print()
    
    