# Remote Joystick Android App

**Introduction:**

This project is an android application which demonstrates a remote joystick to control flights.

The application uses draggable joystick and seek bar - we can control the aircraft's aileron and elevator using draggable joystick and control the aircraft's rudder and throttle using seek bars.

The connection to the flight simulator is established via conntection to the FlightGear server.


![uml](https://lh3.googleusercontent.com/ZboZYH5ZJF25J4rK7BVp5pPcJiJ_aXkwO-H1p1vMqTMcVtRt-8Rs6PV3axLJD0xRl1an3rs7Pnnvt8D46pXf1luXOcpT3ZTBdWyp0OSrQx-Y5Jro5cecuEifirIKlT9FVZ3keHSpmSXhwZ0ecnaq-OOR6I5Yp7abLmPQWq5ap4YZ-fR8Fjmj7VHgqluCWwhu5zi22P0nfvPRvA3f2kIawGNV2CNVcjTjdcydZ5KUVGcGPLhPZfn2mvi60qUPPzOqofq6kxbnEiQYxrOx7DAxUBtix77zb53kJE0sA4hKmCve9TtvQYKYH75gjMMaM5pcU__cS2oA_8ZAGHda77iAgpG3T8h1VX495spEQ2fDNFgpoBxm6yCUEootnlRD8FcJVWTylWsS4xV2RmtJB0HJQpoOubPbF4BRSqkJGpLV7FWI-SnPG3lD2O0mZpFkOJiTA6o06UxtUkOzQPMA2cyKH8W9APLlU8c1kYUqayZD1WXK1meLUQq_Na83agLrxOhvhc3EeijbboFjnXsqY7x8O1U3gH4DxAghOgSFp7UA8eca2YRzWeqjdd6Ydr3ZJqtHh5-eFgLcYz-NEvSRwCNeTgt6f_tviGLRapGyFu7ea6JbHBBi_9heQRSTm-Kb8mBCa_H3EM4y3GOXOhRGJ1BElYA-r5SDFf-Tgno2Z77AD5y5KInqV_gE5INSJmSh3WDjO9sCfhsvs7QdxekBob7iLxaa2g=w412-h830-no?authuser=0)




**Installation Instructions - FlightGear**

At the settings section insert:
--telnet=socket,in,10,127.0.0.1,6400,tcp

**Installation Instructions - Android Studio**

For proper visual representation of the app please follow:
1. Go to AVD manger 
2. click on "Create virtual decive" 
3. Choose a device defention "Pixel 3 XL" 
4. select a system image - the recommended is R. 
5. verify configuration and finish.

**When application opens**
1. insert your local IPV4 address
2. insert port 6400
3. press connect




**UML Class Diagram:**

![uml](https://lh3.googleusercontent.com/HI6n5T41G0gWJJ8qhW5WhzwqQdhdjtLbVf055qQ42VxQd2EfXEZSkIoy9-GAwOUZ24ubXHVJ07mpxn-dhyASKp5vzDeVF5VzH7H0DuFVn6cHAg8IkYWGcAeA9LAK22MWSmVlgCIWtaQ8kIcbDR1lHTKisvHNcmmfgnezeizko36bMSQvrFClPdZ-XBNcuExQ4uqdzZ-03KZc-Qii9nXlFDRIEQEl0rkJ--M6qX2zhdXJh6LdjgSTXVEX9mrVoMbhDJ4iXq7U38eAr33Wc7VYdLvhb5I3XTMOZ4tbjlplL9djmqrlYADWsKq05GsCdTfdT4Vt0q42Bn6w4SzUOXfS16EKu4VhyddAL5Q6UofRh0YemHr_h8xGZ3sGDjzloxbkTD2Zor6p3QynwP1zk64GGusZRlVBSN7f5EBD51a7cWWNo-Qrah9O0C0E0-6imiklse3bWaX6zEP3Y0lK5-sU2VOpOQRCWwGyQQKEVpem_mk3B60ghf46hLaNBMkZpooBVb4rXwhrjdS7j-dwsqXyPh0kAhHvzY0sfWtW5IXqgI4dVLZ5HkPxefWZIUun71tY2Im8IHYFItFXRrXWFp_r3ALZXDqRMdyWQa63uSvBPKRqFJZRW1vXZJ_PqsjQnJ9x5K4pgGAEQlB2k0C3dZeO8j9XFkvBsHDGb10P40MnbQh_APbSgxYi3-NKRRUIirbKKb0sAmitVVkpt68R9wTVGJ7g7A=w1255-h673-no?authuser=0)






