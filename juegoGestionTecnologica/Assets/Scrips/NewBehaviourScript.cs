using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
      if(Input.GetKey(KeyCode.D)){
        GetComponent<Animator>().SetBool ("derecha",true);
        transform.Translate(0.2f,0,0);

      }
      if(Input.GetKey(KeyCode.A)){
        GetComponent<Animator>().SetBool ("izquierda",true);
        transform.Translate(-0.2f,0,0);
      }
      if(Input.GetKey(KeyCode.W)){
        GetComponent<Animator>().SetBool ("arriba",true);
        transform.Translate(0,0.2f,0);
      }
      if(Input.GetKey(KeyCode.S)){
        transform.Translate(0,-0.2f,0);
      }
      if(Input.GetKeyUp (KeyCode.D) || Input.GetKeyUp (KeyCode.W) || Input.GetKeyUp (KeyCode.S) || Input.GetKeyUp (KeyCode.A) ){
        GetComponent<Animator>().SetBool ("derecha",false);
        GetComponent<Animator>().SetBool ("izquierda",false);
        GetComponent<Animator>().SetBool ("arriba",false);
      }
    }
}
