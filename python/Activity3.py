user1= input("Enter user name: ")
user2= input("Enter 2nd user name: ")
user_answer1=input(user1+" What do you want to choose between rock,paper,scissors").lower()
user_answer2=input(user2+" What do you want to choose between rock, paper,scissors").lower()
if user_answer1==user_answer2:
    print("the game is tied!")
elif user_answer1 =='rock':
        if user_answer2 =='scissors':
           print("user1 wins the game!")
        else: 
           print("user2 wins the game!")
elif user_answer1 =='paper':
        if user_answer2 =='rock':
            print("user1 wins the game!")
        else: 
            print("user2 wins the game!")
elif user_answer1 =='scissors':
        if user_answer2 =='paper':
            print("user1 wins the game!")
        else: 
            print("user2 wins the game!")
else:
    print("Invalid input please try again")             

