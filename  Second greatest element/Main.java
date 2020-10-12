n=int(input())
x = list(map(int, input().split()))  
x.sort()
if len(x)<2:
  print("Invalid Input")
elif x[n-1]==x[n-2]:
  print("There is no second largest element")
else:
  print(x[n-2])