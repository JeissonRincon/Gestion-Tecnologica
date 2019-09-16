from flask import Flask
from flask import render_template,request,make_response
import requests

app = Flask(__name__)

@app.route('/gateway', methods=['POST', 'GET'])
def gateway():
	if request.form['action'] == '+':
	    
	    	s1 = request.form["s1"]
		s2 = request.form["s2"]
		resultado=requests.get('http://suma:5000/'+s1+'/'+s2).text
		return resultado
	elif request.form['action'] == '-':
                s1 = request.form["s1"]
		s2 = request.form["s2"]
		resultado=request.get('http://resta:5001'+s1+'/'+s2).text
		return resultado
	   
	elif request.form['action'] == '*':
                s1 = request.form["s1"]
		s2 = request.form["s2"]
		resultado=request.get('http://multiplicacion:5002'+s1+'/'+s2).text
		return resultado
	    
	elif request.form['action'] == '/':
                s1 = request.form["s1"]
		s2 = request.form["s2"]
	    	resultado=request.get('http://division:5003'+s1+'/'+s2).text
		return resultado


@app.route('/cliente')
def show_all():
    	return render_template('cliente.html')

if __name__ == "__main__":
    	app.run(host="0.0.0.0", debug=True)
