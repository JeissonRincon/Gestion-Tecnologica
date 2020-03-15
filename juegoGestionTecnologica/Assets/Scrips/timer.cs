using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class timer : MonoBehaviour
{
    float tiempo = 0f;
    float inicioTiempo = 200f;
    [SerializeField] Text contador;
    [SerializeField] Text over;
    // Start is called before the first frame update
    void Start()
    {
        over.enabled = false;
        tiempo = inicioTiempo;
    }

    // Update is called once per frame
    void Update()
    {
        tiempo -= 1* Time.deltaTime;

        contador.text = tiempo.ToString("0.00");

        if(tiempo <= 0){
          contador.text = "0.0";
          over.enabled = true;
          Time.timeScale = 0;
        }

    }
}
