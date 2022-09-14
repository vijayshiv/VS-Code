from xml.dom.minidom import Element


n = int(input("Enter the length iof arrow : "))

sp = n // 2
st = 1

for i in range(1, n + 1):
    for j in range(1, sp + 1):
        if(i == n // 2 + 1):
            print("*", end=" ")
        else:
            print(" ", end=" ")

    for j in range(1, st + 1):
        print("*", end=" ")
    if(i <= n // 2):
        st = st + 1
    else:
        st = st - 1
    
    print()