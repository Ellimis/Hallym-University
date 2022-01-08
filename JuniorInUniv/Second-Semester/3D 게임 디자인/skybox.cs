using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class skybox : MonoBehaviour {

    public float sensitivity = 500.0f;
    public float rotationX;
    public float rotationY;
	// Update is called once per frame
	void Update () {
        float mouseMoveValueX = Input.GetAxis("Mouse X");
        float mouseMoveValueY = Input.GetAxis("Mouse Y");
        rotationX += mouseMoveValueX * sensitivity * Time.deltaTime;
        rotationY += mouseMoveValueY * sensitivity * Time.deltaTime;

        if (rotationY > 45.0f)
            rotationY = 45.0f;
        if (rotationY < -20.0f)
            rotationY = -20.0f;

        transform.eulerAngles = new Vector3(-rotationY, rotationX, 0.0f);    }
}
