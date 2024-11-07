document.getElementById("yesButton").addEventListener("click", function() {
    let responseDiv = document.getElementById("response");
    let apologies = "Sorry! ".repeat(20000).trim();
    responseDiv.innerHTML = apologies + "<br><br>Did you forgive me? 🥹";
    responseDiv.classList.remove("hidden");

    setTimeout(() => {
        let forgiveButton = document.createElement("button");
        forgiveButton.innerText = "Yes, I forgive you!";
        forgiveButton.onclick = function() {
            responseDiv.innerHTML = "I love you Shinz ♥️";
            responseDiv.style.textAlign = "center"; // Center the text
            forgiveButton.remove(); // Remove the button after clicking
        };
        responseDiv.appendChild(forgiveButton);
    }, 0);
});

document.getElementById("noButton").addEventListener("click", function() {
    let responseDiv = document.getElementById("response");
    responseDiv.innerHTML = "That's okay! 😊";
    responseDiv.classList.remove("hidden");
});