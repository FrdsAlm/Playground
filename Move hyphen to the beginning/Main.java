str=input()
n=int(len(str))
nofhyf=0;
for x in range(0,n):
  if(str[x]=="-"):
    nofhyf+=1;
print("-" * nofhyf,end="")
for x in range(0,n):
  if(str[x]=="-"):
    continue
  else:
    print(str[x],end="")
  
