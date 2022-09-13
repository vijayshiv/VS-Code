from tkinter.tix import InputOnly


n = int(input("Entet the length of triangle : "))
val = 1

for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(val ,end=" ")
        val = val + 1
    print()