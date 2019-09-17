from flask import Flask
from flask import render_template,request,make_response
import requests

app = Flask(__name__)

@app.route("/<s1>/<s2>/<operacion>")
@app.route('/')
def inicio():
    return('<p>Hola, Mundo.</p>')

def gateway(s1,s2,operacion):
    
    if operacion == '+':
	resultado=requests.get('http://suma:4000/'+s1+'/'+s2).text
    elif operacion == '-':
	resultado=request.get('http://resta:3000'+s1+'/'+s2).text	   
    elif operacion == '*':
	resultado=request.get('http://multiplicacion:2000'+s1+'/'+s2).text
    elif operacion == '/':
        resultado=request.get('http://division:1000'+s1+'/'+s2).text
        return resultado


if __name__ == "__main__":
    	app.run(host="0.0.0.0", debug=True)
