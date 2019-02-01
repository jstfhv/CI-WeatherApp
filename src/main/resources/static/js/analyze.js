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
            url: "/analyze",
            type: "POST",
            data: {
                text: $('#analyzeText').val(),
                token: read('token')
            },
            success: function (response) {
                $('#confidence').text(response.confidence + "%");

                if (response.sentiment == 'Positive'){
                    $('#sentiment').attr('class', 'fa fa-smile-o');
                } else if (response.sentiment == 'Neutral'){
                    $('#sentiment').attr('class', 'fa fa-meh-o');
                } else {
                    $('#sentiment').attr('class', 'fa fa-frown-o');
                }
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