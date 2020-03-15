using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class recoger : MonoBehaviour
{
    void OnTiggerEnter2D(Collider2D otro){
        print("entro");
        Destroy (otro.gameObject);
    }

    // Update is called once per frame
    void Update()
    {

    }
}
