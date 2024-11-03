 // Initial load setup
        document.getElementById("initial").style.display = "block";

        function loveConfirmation(isLove) {
            if (isLove) {
                document.getElementById("initial").style.display = "none";
                showApology();
            } else {
                alert("Oh, okay...");
            }
        }

        function showApology() {
            document.getElementById("apology").style.display = "block";
            let sorryText = document.getElementById("sorry-text");
            sorryText.innerHTML = ""; // clear any previous content
            for (let i = 0; i < 20000; i++) {
                sorryText.innerHTML += "Sorry! ";
            }
        }

        function askForgiveness() {
            document.getElementById("apology").style.display = "none";
            document.getElementById("forgiveness").style.display = "block";
        }

        function forgivenessConfirmation(isForgiven) {
            if (isForgiven) {
                showFinalMessage();
            } else {
                alert("Oh no! I’ll keep trying...");
            }
        }

        function showFinalMessage() {
            document.getElementById("forgiveness").style.display = "none";
            document.body.style.backgroundImage = "url('your-background-image.jpg')";
            document.body.style.backgroundSize = "cover";
            document.getElementById("final-message").style.display = "block";
        }