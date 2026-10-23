/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
var arrAnimals = [];
var clicks = 0;
function init(){
    createStartupElements();
    getLocalStorage(); 
    walkThroughStorage();
      
}
function createStartupElements(){
    var h3 = document.createElement("h3");
    var temp = 0;
    h3.id = "Title";
    h3.innerHTML = "Welcome to the Image Generator!";
    document.getElementById("textArea").append(h3);
    var clicks = document.createElement("h3");
    clicks.innerHTML = "Number of Images: " + temp; 
    clicks.id = "numClicks";
    document.getElementById("textArea").append(clicks);
    var generateButton = document.createElement("button");
    generateButton.id = "Generate";
    generateButton.addEventListener("click", generateImage);
    generateButton.innerHTML = "Generate Imagine (Click Me)";
    var breaker = document.createElement("br");
    var breaker2 = document.createElement("br");
    var breaker3 = document.createElement("br");
    var breaker4 = document.createElement("br");
    var breaker5 = document.createElement("br");
    var breaker6 = document.createElement("br");
    var deleteButton = document.createElement("button");
    deleteButton.id = "Delete";
    deleteButton.innerHTML = "Delete Images";
    deleteButton.addEventListener("click", deleteImages);
    document.getElementById("textArea").append(generateButton);
    document.getElementById("textArea").append(breaker);
    document.getElementById("textArea").append(breaker2); 
    document.getElementById("textArea").append(deleteButton);
    document.getElementById("textArea").append(breaker3);
    document.getElementById("textArea").append(breaker4);
    var summarizeButton = document.createElement("button");
    summarizeButton.id = "Summarize";
    summarizeButton.innerHTML = "Summarize Images";
    summarizeButton.addEventListener("click", summarizeImages);
    document.getElementById("textArea").append(summarizeButton);
    document.getElementById("textArea").append(breaker5);
    document.getElementById("textArea").append(breaker6);
    
    
}
function getLocalStorage(){ 
    var animals = localStorage.getItem("Animals"); 
    if(animals !== null){
        arrCurrAnimalStorage = JSON.parse(animals);
        for(var i = 0; i<arrCurrAnimalStorage.length; i++){
            arrAnimals.push(arrCurrAnimalStorage[i]);
        }
        clicks = arrCurrAnimalStorage.length;
        document.getElementById("numClicks").innerHTML = "Number of Images: " + clicks;
    }
    else{
        arrAnimals = [];
    }
    shuffleArray();
}
function shuffleArray(){
    for (let i = arrAnimals.length-1; i > 0; i--)
          {
             const j = Math.floor(Math.random() * (i + 1));
             const temp = arrAnimals[i];
             arrAnimals[i] = arrAnimals[j];
             arrAnimals[j] = temp;
          } 
}
function summarizeImages(){
    if(document.querySelectorAll("img").length === 0){
        alert("Oops please generate some images!");
    }
    else{
        alert("Check the console for the summary!");
        var numCheetahs = 0;
        var numPeacocks = 0;
        var numFish = 0;
        var numPenguins = 0;
        var numRhinos = 0; 
        console.log("There are a total of " + clicks + " images. Here are the totals:");
        for(var i = 0; i<arrAnimals.length; i++){
            if(arrAnimals[i] === "Cheetah"){
                numCheetahs++;
            }
            else if(arrAnimals[i] === "Peacock"){
                numPeacocks++;
            }
            else if(arrAnimals[i] === "Fish"){
                numFish++;
            }
            else if(arrAnimals[i] === "Penguin"){
                numPenguins++;
            }else{
                numRhinos++;
            } 
        }
        console.log("Numbers were calculated as follows:");
        console.log("Number of cheetahs: " + numCheetahs);
        console.log("Number of peacocks: " + numPeacocks);
        console.log("Number of fish: " + numFish);
        console.log("Number of penguins: " + numPenguins);
        console.log("Number of rhinos: " + numRhinos);  
    }   
}
function deleteImages(){
   var images = document.querySelectorAll("img");
   images.forEach(image => {
      image.remove(); 
   });
   localStorage.removeItem("Animals");
   arrAnimals = [];
   clicks = 0;
   document.getElementById("numClicks").innerHTML = "Number of Images: " + clicks;
   console.clear();
}
function walkThroughStorage(){
    for(var i = 0; i<arrAnimals.length; i++){
        var animalImage = document.createElement("img");
        animalImage.src = "Images/" + arrAnimals[i] + ".jpg";
        animalImage.width = "150";
        animalImage.height = "150";
        document.getElementById("textArea").append(animalImage);
    }
}
function generateImage(){
    var images = ["Cheetah","Fish","Peacock", "Penguin", "Rhino"];
    var imageElement = document.createElement("img");
    var randomNum = Math.floor(Math.random() * (images.length));
    imageElement.src = "Images/" +  images[randomNum] + ".jpg";
    imageElement.name = images[randomNum];
    imageElement.width = "150";
    imageElement.height = "150";
    arrAnimals.push(images[randomNum]);
    document.getElementById("textArea").append(imageElement);
    clicks++;
    document.getElementById("numClicks").innerHTML = "Number of Images: " + clicks;
    localStorage.setItem("Animals", JSON.stringify(arrAnimals));
}


