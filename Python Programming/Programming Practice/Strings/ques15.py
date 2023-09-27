def removeDuplicate(str):
    t=""
    for i in str:
        if(i in t):
            pass
        else:
            t=t+i
    return t

str = "aaaaccccaaaabbab"
print(removeDuplicate(str))