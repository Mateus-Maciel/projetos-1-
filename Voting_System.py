candidate1 = input('Enter the 1st candidate name: ')
candidate2 =  input('Enter the 2nd candidate name: ')

c1_votes = 0
c2_votes = 0

voters_id = [0,1,2,3,4,5,6,7,8,9]
no_of_votes = len(voters_id)

while True:
    voters = int(input('Enter your Voter id: '))
    if voters in voters_id:
        print('You are a voter: ')
        voters_id.remove(voters)
    else:
        print('Sorry...You are not eligible to vote -_-')
        break

    print(f'To vote {candidate1}, press key 1...!!')
    print(f'To vote {candidate2}, press key 2...!!')
    vote = int(input('Enter your Valuable vote: '))
    if vote == 1:
        c1_votes +=1
        print(f'{candidate1}, Thank you for giving your important vote...')
        print('-------------------------------------------------')
    elif vote == 2:
        c2_votes +=1
        print(f'{candidate2}, Thank you for giving your important vote...')
        print('-------------------------------------------------')
    elif vote > 2:
        print('You are pressing wrong key...!!')
    else:
        print('Sorry...You are not eligible to vote -_-')

    if voters_id == []:
        print('Voting Session is Over -_-')

        if c1_votes > c2_votes:
            percent = (c1_votes/no_of_votes)*100
            print('****************************************************')
            print(f'Congragulation {candidate1} has win this election by {percent}%')
            print('****************************************************')
            break
        elif c2_votes > c1_votes:
            percent1 = (c2_votes/no_of_votes)*100
            print('****************************************************')
            print(f'Congragulation {candidate2} has win this election by {percent1}%')
            print('****************************************************')
            break