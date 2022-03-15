const getData = async () => {
    let name = document.getElementById("name").value;
    let surname = document.getElementById("surname").value;
    let email = document.getElementById("email").value;
    let gender = document.getElementById("gender").value;
    let dataPolicyCheck = document.getElementById("dataPolicyCheck").checked;
    let textProblem = document.getElementById("textProblem").value;

    console.log(gender + ", " + dataPolicyCheck + ", " + textProblem);
}

document.getElementById("btnContact").addEventListener("click", getData)