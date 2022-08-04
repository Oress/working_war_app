<!DOCTYPE HTML>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Good job!!! You've just deployed an app using TeamCity!</title>


    <link rel="stylesheet" href="resources/css/main.css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@1,500;1,900&display=swap" rel="stylesheet">

</head>

<body style="font-family: 'Montserrat', sans-serif; width: 100vw; height: 100vh">
    <main role="main" style="position: absolute; left: 50%; transform: translateX(-50%);">
        <div style="padding: 3rem 1.5rem; text-align: center;">
            <h1>Good job!!! You've just deployed an app using TeamCity!</h1>
            <img src="resources/clapclap.gif"></img>
        </div>
    </main>

    <script type="text/javascript" src="resources/index.umd.js"></script>
    <script type="text/javascript">
        const container = document.querySelector('body')
        const fireworks = new Fireworks.Fireworks(container, {
          autoresize: false,
          opacity: 0.5,
          acceleration: 1.05,
          friction: 0.97,
          gravity: 1.5,
          particles: 50,
          trace: 3,
          traceSpeed: 10,
          explosion: 5,
          intensity: 30,
          flickering: 50,
          lineStyle: 'round',
          hue: {
            min: 0,
            max: 360
          },
          delay: {
            min: 15,
            max: 30
          },
          rocketsPoint: {
            min: 50,
            max: 50
          },
          lineWidth: {
            explosion: {
              min: 1,
              max: 3
            },
            trace: {
              min: 1,
              max: 2
            }
          },
          brightness: {
            min: 50,
            max: 80
          },
          decay: {
            min: 0.015,
            max: 0.03
          },
          mouse: {
            click: false,
            move: false,
            max: 1
          }
        });
        fireworks.start()
    </script>
</body>
</html>