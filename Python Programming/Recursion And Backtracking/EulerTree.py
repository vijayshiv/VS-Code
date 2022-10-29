n = int(input("Input the number here : "))

def pz(n):
    if(n == 0):
        return
    print(n, end=" ")
    pz(n - 1)
    print(n, end=" ")
    pz(n - 1)
    print(n, end=" ")

pz(n)