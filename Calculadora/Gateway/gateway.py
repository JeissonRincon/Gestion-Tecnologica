from flask import Flask
from flask import render_template,request,make_response
import requests

app = Flask(__name__)


@app.route('/')
def inicio():
    return('<p>Hola, Mundo.</p>')

@app.route("/<s1>/<s2>/<operacion>")
def default(s1,s2,operacion):
    
    if operacion == '+':
	resultado=requests.get('http://suma:5000/'+s1+'/'+s2).text
    elif operacion == '-':
	resultado=request.get('http://resta:5000'+s1+'/'+s2).text	   
    elif operacion == '*':
	resultado=request.get('http://multiplicacion:5000'+s1+'/'+s2).text
    elif operacion == '/':
        resultado=request.get('http://division:5000'+s1+'/'+s2).text
        return resultado


if __name__ == "__main__":
    	app.run(host="0.0.0.0", debug=True)
