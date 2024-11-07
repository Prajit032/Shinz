// Get elements from the DOM
const loveButton = document.getElementById("loveButton");
const hiddenMessage = document.getElementById("hiddenMessage");
const resetButton = document.getElementById("resetButton");
//const backgroundAudio = document.getElementById("backgroundAudio");  // Access the audio element

// Optional: Adjust audio properties (you can skip this if you don't need to modify them)
//backgroundAudio.volume = 30;  // Set volume to 30%
//backgroundAudio.play();  // Start playing audio immediately when the page loads

// Show hidden love message when "Click Me" is clicked
loveButton.addEventListener("click", () => {
    hiddenMessage.style.display = "block";
    loveButton.style.display = "none"; // Hide the initial button
    // If you want to pause the audio when the love message appears, use:
    // backgroundAudio.pause();
});

// Go back to the main message when "Go back" is clicked
resetButton.addEventListener("click", () => {
    hiddenMessage.style.display = "none";
    loveButton.style.display = "block"; // Show the initial button again
    // You can also resume the audio when going back:
    // backgroundAudio.play();

});
