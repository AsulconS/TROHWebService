function getPlayer()
{
    var id = document.getElementById("fieldID").value;
    if(id == "")
    {
        alert("Campos Invalidos!");
        return;
    }

    alert('http://localhost:8080/players/' + id)
    $.ajax
    ({
        url: 'http://localhost:8080/players/' + id,
        timeout: 10000,
        dataType: 'json',
        type: 'GET',
        
        success: function(json)
        {
            $('<h2/>').text(json.title).appendTo('body');
            $('<div class="content"/>').html(json.html).appendTo('body');
        },
        
        error: function(xhr, status)
        {
            alert('Disculpe, existió un problema o el jugador no existe');
        },
        
        complete: function(xhr, status)
        {
            alert('Petición realizada');
        }
    });
}

function registerPlayer(p_name, p_score)
{
    alert("Registering");
    $.ajax
    ({
        url: 'http://localhost:8080/players',
        timeout: 10000,
        dataType: 'json',
        type: 'POST',

        data: 
        {
            username: p_name,
            score: p_score
        },
        
        success: function(json)
        {
            $('<h2/>').text(json.title).appendTo('body');
            $('<div class="content"/>').html(json.html).appendTo('body');
        },
        
        error: function(xhr, status)
        {
            alert('Disculpe, existió un problema');
        },
        
        complete: function(xhr, status)
        {
            alert('Petición realizada');
        }
    });
}
