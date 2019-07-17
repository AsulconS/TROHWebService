var eMailPattern = /^\w+@[a-zA-Z]+\.[a-z]{3}$/;
var namePattern  = /^[A-Za-z]+\s*([A-Za-z]+)?$/;
var numPattern   = /(0|[1-9][0-9]*)/;

function validate(elem)
{
    switch(elem.id)
    {
        case "field0":
            if(namePattern.test(elem.value))
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "Campo Correcto";
                return true;
            }
            else
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "Ingrese un Texto valido!";
                return false;
            }

        case "field1":
            if(eMailPattern.test(elem.value))
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "E-Mail Correcto";
                return true;
            }
            else
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "Ingrese un E-Mail valido!";
                return false;
            }
        
        case "field2":
            if(numPattern.test(elem.value))
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "Score Correcto";
                return true;
            }
            else
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "Ingrese un Score valido!";
                return false;
            }

        case "fieldID":
            if(numPattern.test(elem.value))
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "ID Correcto";
                return true;
            }
            else
            {
                document.getElementById("invalid_" + elem.id).innerHTML = "Ingrese un ID valido!";
                return false;
            }
        
        default:
            break;
    }
}

function validateSubmit()
{
    var valid = true;

    for(var i = 0; i < 3; ++i)
        if(!validate(document.getElementById("field" + i)))
            valid = false;
    
    if(!valid) alert("Campos Invalidos!");
    
    if(document.getElementById("contract-ID").checked == false)
    {
        alert("Debe aceptar el contrato!");
        valid = false;
    }
    
    if(valid) registerPlayer(document.getElementById("field0").value, document.getElementById("field2").value);
    
    return valid;
}

function resetFields()
{
    for(var i = 0; i < 3; ++i)
        document.getElementById("invalid_field" + i).innerHTML = "";
}

function fun()
{
    
}
