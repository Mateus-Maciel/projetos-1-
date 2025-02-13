from flask import Flask, render_template, request, jsonify
import google.generativeai as genai
import os

# Configuração inicial do Flask
app = Flask(__name__)

# Configuração da API do Gemini
# GOOGLE_API_KEY = os.getenv("GEMINI_API_KEY") # Se você quiser usar variável de ambiente (mais seguro)
GOOGLE_API_KEY = ""  # **SUBSTITUA ISSO PELA SUA CHAVE API DO GEMINI!**
if not GOOGLE_API_KEY:
    raise ValueError("Erro: Chave da API não encontrada. Configure a chave no código.")
genai.configure(api_key=GOOGLE_API_KEY)

# Inicializando o modelo Gemini (versão mais rápida e leve)
model = genai.GenerativeModel("gemini-1.5-flash")
chat = model.start_chat(history=[])

# Rota principal para exibir a interface (página inicial)
@app.route("/")
def home():
    return render_template("index.html")

# Rota para processar as solicitações do usuário (quando você clica em "Enviar")
@app.route("/query", methods=["POST"])
def query():
    user_input = request.json.get("user_input") # Pega a pergunta do usuário enviada pelo site
    if not user_input:
        return jsonify({"error": "Comando SQL ou dúvida não fornecido"}), 400 # Retorna erro se a pergunta estiver vazia

    try:
        # Enviar a consulta para a API do Gemini
        response = chat.send_message(user_input) # Envia a pergunta para o Gemini
        return jsonify({"response": response.text}) # Retorna a resposta do Gemini em formato JSON
    except Exception as e:
        return jsonify({"error": str(e)}), 500 # Retorna erro se algo der errado na comunicação com a API

if __name__ == "__main__":
    app.run(debug=True) # Inicia o servidor Flask em modo de desenvolvimento