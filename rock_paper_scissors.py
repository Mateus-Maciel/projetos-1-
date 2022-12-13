import random

user_points = 0
computer_points = 0

options = ["r", "t", "p"]

while True:
    user_choice = input("Escolha r(Pedra)/T(Tesoura)/P(Papel) ou Q para sair.").lower()

    if user_choice == 'q':
        break

    if user_choice not in options:
        continue
#0 : Pedra, 1: Tesoura, 2: Papel
    computer_choice = random.randint(0,2)
    computer_option = options[computer_choice]

    print("O computador escolheu " + computer_option)

    if user_choice == computer_option:
        print("Empate!")

    elif user_choice == "r" and computer_option == "t":
        print("Você ganhou!")
        user_points = user_points + 1

    elif user_choice == "p" and computer_option == "r":
        print("Você ganhou!")
        user_points = user_points + 1
    
    elif user_choice == "t" and computer_option == "p":
        print("Você ganhou!")
        user_points = user_points + 1

    else:
        print("Você perdeu!")
        computer_points = computer_points + 1

print("Sua pontuação: " + str(user_points))
print("Pontuação do Computador: " + str(computer_points))

if computer_points > user_points:
    print("Derrota!!!")
elif computer_points == user_points:
    print("Empate")
else:
    print("Vitória!!!")

print("Goodbye!!!")