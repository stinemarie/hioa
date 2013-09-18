var Chess = {
 init : function () {
    $(".chessboard td .piece").draggable();
  }
};

$(document).ready(Chess.init);
