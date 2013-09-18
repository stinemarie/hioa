var Chess = {
 init : function() {
    $(".chessboard td .piece").draggable();
    $(".chessboard td").droppable({ over: Chess.over, out: Chess.out, drop: Chess.drop });
  },

 over: function( event, ui ) {
    $(event.target).addClass('over');
  },

 out: function( event, ui ) {
    $(event.target).removeClass('over');
  },

 drop: function( event, ui ) {
    $(event.target).removeClass('over');
  }
};

$(document).ready(Chess.init);
