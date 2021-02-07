numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
p=len(numbers)
print(p)
print((numbers[p-1]))
if numbers[0]==numbers[p-1]:
    print("True")
else:
    print("False")