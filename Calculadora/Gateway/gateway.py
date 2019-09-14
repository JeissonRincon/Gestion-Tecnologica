from flask import Flask
from flask import render_template,request,make_response
import requests

app = Flask(__name__)

@app.route('/gateway', methods=['POST', 'GET'])
def gateway():
	if request.form['action'] == '+':
	    
	    	s1 = request.form["s1"]
		s2 = request.form["s2"]
		suma=requests.get('http://suma:5000/'+num1+'/'+num2).text
		return render_template('/cliente.html')
	elif request.form['action'] == '-':
                s1 = request.form["s1"]
		s2 = request.form["s2"]
		return render_template('/cliente.html')
	   
	elif request.form['action'] == '*':
                s1 = request.form["s1"]
		s2 = request.form["s2"]
		return render_template('/cliente.html')
	    
	elif request.form['action'] == '/':
                s1 = request.form["s1"]
		s2 = request.form["s2"]
	    
		return render_template('/cliente.html')


@app.route('/cliente')
def show_all():
    	return render_template('cliente.html')

if __name__ == "__main__":
    	app.run(host="0.0.0.0", debug=True)
