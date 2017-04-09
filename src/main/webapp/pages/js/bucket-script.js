/**
 * Created by jekss on 08.04.17.
 */

function addProductInBucket(idProduct, count){
    var icount;
    if(count === null || count === NaN || count === undefined){
        icount = 1;
    } else icount = count;


    $.ajax({
        url: '/bucket/' + idProduct + '/' + icount,
        type: 'GET',
        dataType: 'json',
        success: function (data) {

        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(textStatus + " " + errorThrown)
        }
    });
}