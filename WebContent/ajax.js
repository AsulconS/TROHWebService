function getPlayer(name, score)
{
    alert('localhost:8080/player?name=' + name + '&score=' + score)
    $.ajax
    ({
        url: 'localhost:8080/player?name=' + name + '&score=' + score,
        timeout: 10000,
        dataType: 'json',
        type: "GET",
        
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
