from flask import Flask
app = Flask(__name__)

@app.route("/<int:s1>/<int:s2>")

def default(s1,s2):
    return str(s1*s2)

if __name__ == "__main__":
    app.run(host="0.0.0.0")
