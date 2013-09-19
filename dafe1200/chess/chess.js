var Chess = {
 colors: {
  white: ["\u2654", "\u2655", "\u2656", "\u2657", "\u2658", "\u2659"],
  black: ["\u265A", "\u265B", "\u265C", "\u265D", "\u265E", "\u265F"],
  },

 types: {
  king: ["\u2654", "\u265A"],
  queen: ["\u2655", "\u265B"],
  rook: ["\u2656", "\u265C"],
  bishop: ["\u2657", "\u265D"],
  knight: ["\u2658", "\u265E"],
  pawn: ["\u2659", "\u265F"],
  },

 init : function() {
    $(".chessboard td .piece").draggable({start: Chess.start});
  },

 start: function( event, ui ) {
    var piece = $(event.element);
    Chess.legalMoves(piece).droppable({ over: Chess.over, out: Chess.out, drop: Chess.drop });
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
    $(".chessboard td").droppable("destroy");
  },

 discard: function( piece ) {
    piece.draggable("destroy"); // Discarded pieces can't be moved
    piece.detach(); // Remove from board
    $('.discarded.' + Chess.color(piece)).append(piece); // Add to discarded pile
  },

 color: function( piece ) {
    piece = piece.text();
    var color;
    jQuery.each(Chess.colors, function( c, pieces ) {
        if ( jQuery.inArray(piece, pieces) >= 0 )
          color = c;
      });
    return color;
  },

 type: function( piece ) {
    piece = piece.text();
    var type;
    jQuery.each(Chess.types, function( t, pieces ) {
        if ( jQuery.inArray(piece, pieces) >= 0 )
          type = t;
      });
    return type;
  },

 legalMoves: function( piece ) {
    var color = Chess.color( piece );

    switch ( Chess.type( piece ) ) {
    default:
      return $(".chessboard td");
    }
  },
};

$(document).ready(Chess.init);
