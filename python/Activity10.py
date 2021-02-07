numbers = tuple(input("Enter a sequence of comma separated values: ").split(","))
for i in numbers:
    if (int(i)%5==0):
       print(i)
