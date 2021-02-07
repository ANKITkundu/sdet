example_dict ={"apple":15,"pineapple":20,"orange":25,"mango":30}
keytovalue=input("What are you looking for?").lower()
if keytovalue in example_dict:
    print("Present in example dict")

else:
    print("Not present in example_dict")