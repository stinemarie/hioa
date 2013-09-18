var Chess = {
 colors: {
  white: ["\u2654", "\u2655", "\u2656", "\u2657", "\u2658", "\u2659"],
  black: ["\u265A", "\u265B", "\u265C", "\u265D", "\u265E", "\u265F"],
  },

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

    // Remove old piece
    $(event.target).children().each(function(i) {
        Chess.discard($(this));
      });

    $(event.target).append(ui.draggable.detach()); // Insert new piece
    ui.draggable.css("top", "0px");
    ui.draggable.css("left", "0px");
  },

 discard: function( piece ) {
    piece.draggable("destroy"); // Discarded pieces can't be moved
    piece.detach(); // Remove from board
    $('.discarded.' + Chess.color(piece)).append(piece); // Add to discarded pile
  },

 color: function( piece ) {
    piece = piece.text();
    if (jQuery.inArray(piece, Chess.colors.white) >= 0)
      return "white";
    else if (jQuery.inArray(piece, Chess.colors.black) >= 0)
      return "black";
  }
};

$(document).ready(Chess.init);
