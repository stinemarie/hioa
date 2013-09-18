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
    $(event.target).append(ui.draggable.detach());
    ui.draggable.css("top", "0px");
    ui.draggable.css("left", "0px");
  }
};

$(document).ready(Chess.init);
