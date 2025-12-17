a="hello good"
count=0
for i in range(len(a)-1,0,-1):
    if(a[i]==' '):
        break
    count+=1
print(count)