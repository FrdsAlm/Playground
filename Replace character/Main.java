str,ch1,ch2=input().split()
for x in range(0,len(str)):
  if str[x]==ch1:
    print(ch2,end="")
  elif str[x]==ch2:
    print(ch1,end="")
  else:
    print(str[x],end="")