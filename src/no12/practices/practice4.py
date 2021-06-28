l = []
s = "null"
while True:
    s = input("Enter a data: ")
    if len(s) == 0:
        break
    l.append(float(s))

print("Average =", sum(l) / len(l))
