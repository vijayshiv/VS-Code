n = int(input("Input the number of disks : "))
a = input("Enter the name of tower : ")
b = input("Enter the name of tower : ")
c = input("Enter the name of tower : ")

def toh(n , td1, td2, td3):
    if(n == 0):
        return
    toh(n - 1, td1, td3, td2)
    print(f'{n} [ {td1} -> {td2} ]')
    toh(n - 1, td3, td2, td1)

toh(n,a,b,c)
