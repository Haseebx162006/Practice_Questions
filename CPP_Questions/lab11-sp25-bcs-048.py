print("lab Activity one and two")
x=4
if(x==3):
    print("Lion are the king of jungles")
    if(x==4):
        print("Bears eat honey")
        
        print("Activity no 3")
y=4
if(x==3):
    print("lions are the king of jungle")
elif(x==4):
    print("Canberra is the capital of Australia")
else:
    print("Bats Eat honey")
    if(x<2 and y <20):
        print("The numbers x and y falls under this criteria")
        sum=x+y
        if(sum<50):
            print("The sum of x and y is:",sum)
            
        else:
            print("The numbers x and y dont fall under this criteria!")
            
            
print("laB acivity 5")
            
year = eval(input("Enter a year: "))
zodiacYear = year % 12

if zodiacYear == 0:
    print("Monkey")
elif zodiacYear == 1:
    print("Rooster")
elif zodiacYear == 2:
    print("Dog")
elif zodiacYear == 3:
    print("Pig")
elif zodiacYear == 4:
    print("Rat")
elif zodiacYear == 5:
    print("Ox")
elif zodiacYear == 6:
    print("Tiger")
elif zodiacYear == 7:
    print("Rabbit")
elif zodiacYear == 8:
    print("Dragon")
elif zodiacYear == 9:
    print("Snake")
elif zodiacYear == 10:
    print("Horse")
else:
    print("Sheep")


print("lab task 1")
a=int(input("Please enter the marks of physics:"))
b=int(input("Please enter the marks of chemistry:"))
c=int(input("Please enter the marks of Math:"))
d=int(input("Please enter the marks of Islamiyat:"))
e=int(input("Please enter the marks of History:"))
sum=a+b+c+d+e
percentage=(sum/500)*100
if(percentage>=90):
    print("Grade A")
elif(percentage>=80 and percentage<90):
    print("B grade")
elif(percentage>=70 and percentage<80):
    print("C grade")
elif(percentage>=60 and percentage<70):
    print("D grade")
elif(percentage>=50 and percentage<60):
    print("E grade")
else:
    print("F grade")
    print("Lab Task 3 triangle type checker")
side1 = float(input("Enter the length of the first side: "))
side2 = float(input("Enter the length of the second side: "))
side3 = float(input("Enter the length of the third side: "))

if side1 == side2 == side3:
    print("The triangle is equilateral.")
elif side1 == side2 or side2 == side3 or side1 == side3:
    print("The triangle is isosceles.")
else:
    print("The triangle is scalene.")

print()    
print("Lab Task 4 Authentication system")
username = input("Enter your username: ")
password = input("Enter your password: ")
if username == "abc@gmail.com" and password == "abc":
    print("User Is Logged In.")
elif username != "abc@gmail.com" and password == "abc":
    print("Invalid Username.")
elif username == "abc@gmail.com" and password != "abc":
    print("Invalid Password.")
else:
    print("Invalid Username and Password.")
    
print()
print("Lab Task 5__Leap year checker")
year = int(input("Enter a year: "))
if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
    print(year, "is a leap year.")
else:
    print(year, "is not a leap year.")