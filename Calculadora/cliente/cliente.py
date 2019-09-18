from flask import Flask
from flask import render_template,request,make_response
import requests

app = Flask(__name__)


@app.route('/calcula')
def calcula():
    	return render_template('calcula.html')


@app.route('/calcular', methods=['POST', 'GET'])
def calcular():
	operacion = request.form['action']	
	s1 = request.form["s1"]
	s2 = request.form["s2"]
	resultado=requests.get('http://gateway:5000/'+s1+'/'+s2+'/'+operacion).text
	return render_template('/calcula.html', string_variable=resultado)

if __name__ == "__main__":
    	app.run(host="0.0.0.0", debug=True)
