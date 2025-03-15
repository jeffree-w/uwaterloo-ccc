bc = 0
b = 0

i = input()
i = int(i)

tb = []

c = 0
while c < i:
    c += 1
    n = input()
    n = int(n)
    
    tb.append(n)
    tb.sort(reverse = True)
    
l = {}
for x in tb:
    if l.get(x):
        l[x] += 1
    else:
        l[x] = 1
    
k = []
for z in l:
    k.append(z)
        
print(k[2], l.get(k[2]))