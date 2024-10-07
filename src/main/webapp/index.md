<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Placement Interaction Tracker System</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        /* Global styles */
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            color: #333;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            background-color: #e0e0f0; /* A light grayish-blue color */
        }

        /* Navbar styles */
        nav {
            background-color: #1a1a2e;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        nav .logo {
            font-size: 1.5rem;
            color: #fff;
            font-weight: bold;
            text-transform: uppercase;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        nav ul li {
            margin-left: 20px;
        }

        nav ul li a {
            color: #fff;
            text-decoration: none;
            font-size: 1rem;
            padding: 10px 20px;
            border-radius: 8px;
            transition: background-color 0.3s ease;
        }

        nav ul li a:hover {
            background-color: #4b0082;
        }

        /* Main content */
        main {
            flex-grow: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            padding: 20px;
        }

        .intro {
            background-color: rgba(255, 255, 255, 0.9); /* Slight transparency */
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.15);
            max-width: 600px;
            width: 100%;
            margin: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .intro img {
            width: 300px; /* Reduced width for the image */
            border-radius: 10px;
            margin-right: 20px;
        }

        .intro h2 {
            font-size: 2rem;
            margin-bottom: 10px;
            color: #4b0082;
        }

        .intro p {
            font-size: 1.1rem;
            color: #555;
            line-height: 1.6;
            margin-bottom: 20px;
        }

        .features {
            margin-top: 40px;
        }

        .features h2 {
            color: #4b0082;
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        .features ul {
            list-style: none;
            padding: 0;
        }

        .features ul li {
            font-size: 1.1rem;
            color: #333;
            margin-bottom: 10px;
            padding-left: 30px;
            position: relative;
        }

        .features ul li:before {
            content: "✔";
            color: #4b0082;
            font-weight: bold;
            position: absolute;
            left: 0;
        }

        /* Scrolling Message */
        .scrolling-message {
            color: #000; /* Font color set to black */
            padding: 10px 0;
            white-space: nowrap;
            overflow: hidden;
            position: relative;
            animation: scroll 15s linear infinite; /* Scroll animation */
        }

        @keyframes scroll {
            0% {
                transform: translateX(100%);
            }
            100% {
                transform: translateX(-100%);
            }
        }

        /* Footer */
        footer {
            background-color: #1a1a2e;
            color: #bbb;
            padding: 20px 0;
            text-align: center;
        }

        footer p {
            margin: 0;
            font-size: 0.9rem;
        }
    </style>
</head>
<body>

    <nav>
        <div class="logo">Placement Tracker</div>
        <ul>
            <li><a href="login.html">Login</a></li>
            <li><a href="register.html">Register</a></li>
            <li><a href="about.html">About Us</a></li>
            <li><a href="contact.html">Contact Us</a></li>
        </ul>
    </nav>

    <main>
        <section class="intro">
            <img src="images/img2.jpg" alt="Placement Interaction Tracker Image"> <!-- Ensure your image path is correct -->
            <div>
                <h2>Welcome to the Placement Interaction Tracker System!</h2>
                <p>Your all-in-one platform to manage placement interactions. Whether you're a student looking for your dream job, an employer seeking top talent, or a placement officer managing recruitment records, we have you covered!</p>
            </div>
        </section>

        <section class="features">
            <h2>Our Key Features</h2>
            <ul>
                <li>Explore job opportunities posted by top employers</li>
                <li>Seamless job application tracking for students</li>
                <li>Post job openings and review applications as an employer</li>
                <li>Monitor and track placement data as a placement officer</li>
            </ul>
        </section>
    </main>

    <!-- Scrolling message above the footer -->
    <div class="scrolling-message">
        Welcome to the Placement Interaction Tracker System! Stay updated with the latest job opportunities and placement records.
    </div>

    <footer>
        <p>&copy; 2024 Placement Interaction Tracker System. All rights reserved.</p>
    </footer>

</body>
</html>
