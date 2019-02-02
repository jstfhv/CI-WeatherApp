$(document).ready(function () {
    var token = read('token');
    console.log(token);
    if (!token){
        window.location.replace("index.html");
    }
});

$(function() {
    $('#analyzeBtn').on('click', function (e) {
        e.preventDefault(); // disable the default form submit event

        // disable button until data is loaded
        $('#analyzeBtn').prop("disabled",true);
        $('#analyzeBtn').html('Loading...');

        $.ajax({
            url: "/getWeather",
            type: "POST",
            data: {
                text: $('#locationSearch').val(),
                token: read('token')
            },


            success: function (response) {
                $('#weather').text(response.weather);
                $('#location').text(response.location);
            },
            error: function (response) {
                alert('error loading data');
            },
            complete: function(data) {
                $('#analyzeBtn').prop("disabled",false);
                $('#analyzeBtn').html('Analyze');
            }
        });
    });
});