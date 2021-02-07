numbers = list(input("Enter a sequence of comma separated values: ").split(","))
divisors= list(input("Enter a sequence of comma separated values:").split(","))
p=len(numbers)
p1= len(divisors)
google=[]
for i in numbers:
    if (int(i)%2!=0):
        google.append(i)
        
for i in divisors:
    if (int(i)%2==0):
        google.append(i)
    

print(google)        
        