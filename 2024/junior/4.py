i = input()
d = input()

s1 = ""
s2 = ""
q = "-"

if len(i) == len(d):
  for z in range(len(i)):
    if i[z] != d[z]:
      s1 = i[z]
      s2 = d[z]
      break

if len(i) != len(d):
  for z in range(len(i)):
    x = i
    r = x.replace(i[z],"")
    if len(r) == len(d):
      q = i[z]
      break

  r = i.replace(q,"")
  for v in range(len(r)):
    if r[v] != d[v]:
      s1 = r[v]
      s2 = d[v]
      break

print(s1,s2)
print(q);
