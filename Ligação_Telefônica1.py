#Crie sua conta no twilio
from twilio.rest import Client

#Insira (entre as aspas duplas) seu accound sid, auth token, seu número de celular e seu número do twilio
account_sid = ""
auth_token = ""
meu_numero = ""
numero_twilio = ""

cliente = Client(account_sid, auth_token)

#Exemplo de mensagem, você também pode criar a sua, basta seguir a mesma estrutura
mensagem = """
<Response>
<Say language="pt-BR">
Eae, Mateus. Estou passando aqui para avisar que o palmeiras não tem mundial.
</Say>
</Response>
"""


ligacao = cliente.calls.create(to=meu_numero,from_=numero_twilio,twiml=mensagem)