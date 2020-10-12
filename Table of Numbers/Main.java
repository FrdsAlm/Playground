num=int(input())
sum=0
for i in range(1, 11):
   print(num * i,end=" ")
for i in range(1, 11):
   sum=sum+num*i
print("\n"+str(sum))