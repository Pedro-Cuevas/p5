const putContactData = async () => {
    let inputName = document.getElementById("name").value;
    let inputSurname = document.getElementById("surname").value;
    let inputEmail = document.getElementById("email").value;
    let inputGender = document.getElementById("gender").value;
    let inputDataPolicyCheck = document.getElementById("dataPolicyCheck").checked; //boolean
    let inputTextProblem = document.getElementById("textProblem").value;

    let request = await fetch("/contacto", {
        method: 'POST',
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({
            name: inputName,
            surname: inputSurname,
            email: inputEmail,
            gender: inputGender,
            dataPolicyCheck: inputDataPolicyCheck,
            textProblem: inputTextProblem,
        }),
    });

}

const displayLastContact = async () => {
    
    let request = await fetch("/contacto", {
        method: 'GET',
    });

    if(request.ok) {
        console.log(await request.json());
    }
    document.getElementById("getMessage")
}

document.getElementById("btnContact").addEventListener("click", putContactData)