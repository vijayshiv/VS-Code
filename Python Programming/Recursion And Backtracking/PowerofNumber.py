from concurrent.futures.process import _process_worker
from ctypes.wintypes import PWORD
from traceback import print_tb


x = int(input("Input the number here : "))
n = int(input("input the power here : "))

def powerofnum(x ,n):
    if(n == 0):
        return 1
    return x * powerofnum(x , n -1)

print(f'The answer is {powerofnum(x,n)}')