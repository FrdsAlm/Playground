n=int(input())
lst=list(map(int,input().split()))
key=int(input())
if(key>n):
  print("No node found")
else:
  print(lst[key-1])