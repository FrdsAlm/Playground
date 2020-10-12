n = int(input()) 
lst =list(map(int,input().split()))
key=int(input())
try : 
    lst.index(key) 
    res = lst.index(key)
except ValueError : 
    res = -1
if res==-1:
  print(-1)
else:
  print("index = "+str(res))